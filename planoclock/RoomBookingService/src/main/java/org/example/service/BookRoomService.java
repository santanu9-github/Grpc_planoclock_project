package org.example.service;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import org.example.BookRoom;
import org.example.Notification;
import org.example.NotifyServiceGrpc;
import org.example.bookRoomGrpc;

import java.sql.*;

import static org.example.properties.Properties.*;

public class BookRoomService extends bookRoomGrpc.bookRoomImplBase {
    Connection conn;

    @Override
    public void viewRoomDetails(BookRoom.empty request, StreamObserver<BookRoom.APIResponse> responseObserver) {
//        super.viewRoomDetails(request, responseObserver);
        logger.info("view Room details method called");
        BookRoom.APIResponse.Builder response = BookRoom.APIResponse.newBuilder();
        try {
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);

            PreparedStatement preparedStatement = conn.prepareStatement(QUERY);
            ResultSet resultSet = preparedStatement.executeQuery();
//        preparedStatement.setString(1,city);
            BookRoom.roomDetails room ;
            while (resultSet.next()) {
                int roomId = resultSet.getInt(1);
                String roomName = resultSet.getString(2);
                String roomCategory = resultSet.getString(3);
                String roomSize = resultSet.getString(4);
                int capacity = resultSet.getInt(5);
                String buildingNo = resultSet.getString(6);
                String city = resultSet.getString(7);
                String state = resultSet.getString(8);
                double price = resultSet.getDouble(9);

                room = BookRoom.roomDetails.newBuilder().setRoomId(roomId).setRoomName(roomName).setRoomCategory(roomCategory)
                        .setSize(roomSize).setCapacity(capacity).setBuildingNo(buildingNo).setCity(city).setState(state).setPrice(price).setAvailability(true).build();

                System.out.println(room);

                response.addResponse(room);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        response.setResponseMessage("SUCCESS").setResponseCode(200);

        responseObserver.onNext(response.build());
        responseObserver.onCompleted();

    }

    @Override
    public void bookRoom(BookRoom.roomBook request, StreamObserver<BookRoom.roomBookResponse> responseObserver) {
//        super.bookRoom(request, responseObserver);
        logger.info("Book Room method called");
        String email = request.getUserEmailId();
        String roomName = request.getRoomName();
        String description = request.getDescription();
        String checkInDate= request.getCheckInDate();
        String checkOutDate = request.getCheckOutDate();
        String firstName = "";
        String lastName = "";
        int user_id = 0;
        int room_id = 0;
        BookRoom.roomBookResponse.Builder response = BookRoom.roomBookResponse.newBuilder();
        try {
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);

            if(email != "" && email !=null) {
                 user_id = fetchData(FETCH_USER_ID_BY_EMAIL_QUERY, email);
            } else {
                response.setResponseCode(400);
                response.setResponseMessage("Please enter email id.");
            }
            if(roomName != "" && roomName !=null) {
                room_id = fetchData(FETCH_ROOM_ID_BY_NAME_QUERY, roomName);
            } else {
                response.setResponseCode(400);
                response.setResponseMessage("Please enter room name.");
            }

            if(user_id == 0 || room_id == 0 ){
                if(user_id == 0) {
                    response.setResponseCode(400);
                    response.setResponseMessage("Email Id not found");
                } else {
                    response.setResponseCode(400);
                    response.setResponseMessage("This room does not exit !");
                }
            } else {
                boolean existing_id = checkAlreadyExist(room_id, checkInDate, checkOutDate);
                if (existing_id) {
                    response.setResponseCode(300);
                    response.setResponseMessage("This Room Slot is already booked !! Kindly enter other time slot.");
                } else {
                    int booking_id = insertRoomBookingDetails(room_id, user_id, description, checkInDate, checkOutDate);
                    PreparedStatement pst = conn.prepareStatement("select first_name, last_name from capstoneproject.user_details where user_id = "+ user_id+";");
                    ResultSet rs = pst.executeQuery();
                    while(rs.next()) {
                        firstName = rs.getString(1);
                        lastName = rs.getString(2);
                    }
                    String userName = firstName + " " + lastName;
                    String[] str1 = checkInDate.split(" ");
                    String InDate = str1[0];
                    String InTime = str1[1];

                    String[] str2 = checkOutDate.split(" ");
                    String OutDate = str2[0];
                    String OutTime = str2[1];

                    ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9091).usePlaintext().build();
                    Notification.bookingMessage registrationReq= Notification.bookingMessage.newBuilder()
                            .setUsername(userName).setUserEmailId(email).setCheckInDate(InDate).setStratTime(InTime).setCheckOutDate(OutDate)
                            .setEndTime(OutTime).setDescription(description).build();
                    NotifyServiceGrpc.NotifyServiceBlockingStub registerStub= NotifyServiceGrpc.newBlockingStub(channel);
                    Notification.APIResponse serverResponse=registerStub.notifyBooking(registrationReq);
                    response.setResponseCode(200);
                    response.setResponseMessage("Your Booking is confirmed !! Please check your registered mail for details.");
                }
            }

            responseObserver.onNext(response.build());
            responseObserver.onCompleted();
//            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void cancelRoom(BookRoom.roomCancel request, StreamObserver<BookRoom.roomBookResponse> responseObserver) {
        logger.info("Book cancel method called");
        int bookingId = request.getBookingId();
        String firstName = "";
        String lastName = "";
        String email = "";
        String roomName = "";
        String checkInDate= "";
        String checkOutdate = "";
        int booKingStatus = 0 ;
        String responseMsg = "";

        BookRoom.roomBookResponse.Builder response = BookRoom.roomBookResponse.newBuilder();
    try {
        conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        ResultSet rs = getBookingDetailsById(bookingId);
        if(rs.next()) {
            do {
                firstName = rs.getString(1);
                lastName = rs.getString(2);
                email = rs.getString(3);
                roomName = rs.getString(4);
                checkInDate = String.valueOf(rs.getTimestamp(5));
                checkOutdate = String.valueOf(rs.getTimestamp(6));
                booKingStatus = rs.getInt(7);
            } while (rs.next());
            if(booKingStatus == 1) {
                int update = updateBookingStatus(bookingId);
                responseMsg = "Hi " + firstName + " " + lastName + " your booking for " + roomName + " on " + checkInDate + " to " + checkOutdate + " has been cancelled ";
                response.setResponseCode(200);
                PreparedStatement pst = conn.prepareStatement(FETCH_BOOKING_DETAILS);
                pst.setInt(1, bookingId);
                ResultSet rst = pst.executeQuery();
                while(rst.next()) {
                    firstName = rst.getString(1);
                    lastName = rst.getString(2);
                }
                String userName = firstName + " " + lastName;
                String[] str1 = checkInDate.split(" ");
                String InDate = str1[0];
                String InTime = str1[1];

                String[] str2 = checkOutdate.split(" ");
                String OutDate = str2[0];
                String OutTime = str2[1];

                ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9091).usePlaintext().build();
                Notification.bookingcancellation bookingCancel= Notification.bookingcancellation.newBuilder()
                        .setUsername(userName).setUserEmailId(email).build();
                NotifyServiceGrpc.NotifyServiceBlockingStub registerStub= NotifyServiceGrpc.newBlockingStub(channel);
                Notification.APIResponse serverResponse=registerStub.notifyBookingCancellation(bookingCancel);
            } else {
                responseMsg = "Booking is already cancelled.";
                response.setResponseCode(400);
            }
        } else {
            responseMsg = "No meeting id exists !! Please check again.";
            response.setResponseCode(400);
        }

        response.setResponseMessage(responseMsg);

        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    } catch (Exception e) {
        e.printStackTrace();
    }
    }

    @Override
    public void getAllRoomsByUserId(BookRoom.userId request, StreamObserver<BookRoom.getAllRoomResponse> responseObserver) {
            logger.info("Get all rooms by userId method called");
            BookRoom.getAllRoomResponse.Builder response = BookRoom.getAllRoomResponse.newBuilder();
            int userId = request.getUserId();
            String userName = "";
            String email = "";
            try {
                conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
                ResultSet rs1 = getUserDetailsById(userId);
                while (rs1.next()) {
                    userName = rs1.getString(1) + " " + rs1.getString(2);
                    email = rs1.getString(3);
                }
                if (!userName.equals("") && !email.equals("")) {
                    response.setUserName(userName).setRegisteredMail(email);
                    PreparedStatement preparedStatement = conn.prepareStatement(GET_ALL_ROOMS_BY_USERID_QUERY);
                    preparedStatement.setInt(1, userId);
                    ResultSet resultSet = preparedStatement.executeQuery();

                    BookRoom.bookingDetails room;
                    while (resultSet.next()) {
                        int bookingId = resultSet.getInt(1);
                        int roomId = resultSet.getInt(2);
                        String roomName = resultSet.getString(3);
                        String roomCategory = resultSet.getString(4);
                        String roomSize = resultSet.getString(5);
                        int capacity = resultSet.getInt(6);
                        String buildingNo = resultSet.getString(7);
                        String city = resultSet.getString(8);
                        String state = resultSet.getString(9);
                        double price = resultSet.getDouble(10);
                        String description = resultSet.getString(11);
                        String checkInDate = String.valueOf(resultSet.getTimestamp(12));
                        String checkOutdate = String.valueOf(resultSet.getTimestamp(13));

                        room = BookRoom.bookingDetails.newBuilder().setBookingId(bookingId).setRoomId(roomId).setRoomName(roomName).setRoomCategory(roomCategory)
                                .setSize(roomSize).setCapacity(capacity).setBuildingNo(buildingNo).setCity(city).setState(state).setPrice(price)
                                .setDescription(description).setCheckInDate(checkInDate).setCheckOutDate(checkOutdate).build();

                        System.out.println(room);

                        response.addResponse(room);
                        response.setResponseMessage("SUCCESS").setResponseCode(200);
                    }
                } else
                {
                    response.setUserName("No user Exist with this ID.").setRegisteredMail("");
                    response.setResponseMessage("No Data Found !!").setResponseCode(300);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

            responseObserver.onNext(response.build());
            responseObserver.onCompleted();

        }

    @Override
    public void rescheduleBooking(BookRoom.rescheduleBook request, StreamObserver<BookRoom.roomBookResponse> responseObserver) {
        logger.info("Reschedule Booking method called");
        BookRoom.roomBookResponse.Builder response = BookRoom.roomBookResponse.newBuilder();
        int bookingId = request.getBookingId();
        int roomId = request.getRoomId();
        int userId = request.getUserId();
        String checkInDate = request.getCheckInDate();
        String checkOutDate = request.getCheckOutDate();
        try {
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            int booking_status = fetchBookingStatus(bookingId, roomId, userId);
            if(booking_status != 0) {
                boolean existing_id = checkAlreadyExist(roomId, checkInDate, checkOutDate);
                if (existing_id) {
                    response.setResponseCode(300);
                    response.setResponseMessage("This Room Slot is already booked !! Kindly enter other time slot.");
                } else {
                    int booking_id = rescheduleBooking(bookingId, checkInDate, checkOutDate);
                    response.setResponseCode(200);
                    response.setResponseMessage("Your Booking is rescheduled !! Please check your registered mail for details.");
                }
            } else {
                response.setResponseCode(300);
                response.setResponseMessage("No Booking exist !! Please book your slot first.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }

    private int fetchBookingStatus(int bookingId, int roomId, int userId) throws SQLException{
        PreparedStatement preparedStatement = conn.prepareStatement(FETCH_BOOKING_STATUS_QUERY);
        preparedStatement.setInt(1, bookingId);
        preparedStatement.setInt(2, roomId);
        preparedStatement.setInt(3, userId);
        ResultSet resultSet = preparedStatement.executeQuery();
        int id=0;
        while (resultSet.next()) {
            id = resultSet.getInt(1);
            System.out.println(id);
        }
        return  id;
    }

    private int rescheduleBooking(int bookingId, String checkInDate, String checkOutDate) throws SQLException {
        int booking_status_id = 1;
        PreparedStatement pstmt = conn.prepareStatement(RESCHEDULE_BOOKING_QUERY);
        pstmt.setTimestamp(1,Timestamp.valueOf(checkInDate));
        pstmt.setTimestamp(2,Timestamp.valueOf(checkOutDate));
        pstmt.setInt(3, bookingId);
        int updated = pstmt.executeUpdate();
        return updated;
    }

    public int fetchData(String query, String data) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement(query);
        preparedStatement.setString(1, data);
        ResultSet resultSet = preparedStatement.executeQuery();
        int id=0;
        while (resultSet.next()) {
            id = resultSet.getInt(1);
            System.out.println(id);
        }
        return  id;
    }

    private boolean checkAlreadyExist(int roomId, String checkInDate, String checkOutDate ) throws SQLException {
        boolean recordExist = false;
        int id = 0;
        PreparedStatement pstmt = conn.prepareStatement(CHECK_EXISTING_BOOKING);
        pstmt.setInt(1,roomId);
        pstmt.setTimestamp(2,Timestamp.valueOf(checkInDate));
        pstmt.setTimestamp(3,Timestamp.valueOf(checkInDate));
        pstmt.setTimestamp(4,Timestamp.valueOf(checkOutDate));
        pstmt.setTimestamp(5,Timestamp.valueOf(checkOutDate));
        pstmt.setTimestamp(6,Timestamp.valueOf(checkInDate));
        pstmt.setTimestamp(7,Timestamp.valueOf(checkOutDate));
        ResultSet resultSet = pstmt.executeQuery();
        while (resultSet.next()){
            id = resultSet.getInt(1);
            System.out.println(id);
            recordExist = true;
        }
        return recordExist;
    }

    public int insertRoomBookingDetails(int roomId, int userId, String description, String checkInDate, String checkOutDate ) throws SQLException {
        int booking_status_id = 1;
        PreparedStatement pstmt = conn.prepareStatement(INSERT_BOOKING_QUERY);
        pstmt.setInt(1,roomId);
        pstmt.setInt(2,userId);
        pstmt.setString(3,description);
        pstmt.setTimestamp(4,Timestamp.valueOf(checkInDate));
        pstmt.setTimestamp(5,Timestamp.valueOf(checkOutDate));
        pstmt.setInt(6, booking_status_id);
        int inserted = pstmt.executeUpdate();
        return inserted;
    }

    private int updateBookingStatus(int bookingId) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement(UPDATE_BOOKING_STATUS);
        preparedStatement.setInt(1, bookingId);
        int updated = preparedStatement.executeUpdate();
        return updated;
    }

    private ResultSet getBookingDetailsById(int bookingId) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement(FETCH_BOOKING_DETAILS);
        preparedStatement.setInt(1, bookingId);
        ResultSet resultSet = preparedStatement.executeQuery();
        return  resultSet;

    }

    private ResultSet getUserDetailsById(int userId) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement(GET_USER_DETAILS_BY_USERID_QUERY);
        preparedStatement.setInt(1, userId);
        ResultSet resultSet = preparedStatement.executeQuery();
        return  resultSet;

    }
}
