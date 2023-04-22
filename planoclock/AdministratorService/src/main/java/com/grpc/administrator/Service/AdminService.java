package com.grpc.administrator.Service;


import com.grpc.administrator.Administrator;
import com.grpc.administrator.administratorGrpc;
import com.grpc.feedback.Feedback;
import com.grpc.feedback.feedbackGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import org.example.UserService;
import org.example.userServiceGrpc;

import java.sql.*;


public class AdminService extends administratorGrpc.administratorImplBase {
    static Connection conn;
    static Statement stm;

    final String url = "jdbc:postgresql://localhost:5432/postgres";
    final String user = "postgres";
    final String pass = "1304adeeb";
//    static String Url = "jdbc:postgresql://localhost:5432/plano_clock";
//    static String Username = "postgres";
//    static String Password = "Sai@832";

    @Override
    public void login(Administrator.AdminLogin request, StreamObserver<Administrator.APIResponse> responseObserver) {
        System.out.println("Inside login method");
        String username = request.getUsername();
        String password = request.getPassword();
        System.out.println("Username:" + username);
        System.out.println("Password:" + password);

        try {
            conn = DriverManager.getConnection(url, user, pass);
            System.out.println("connection established");
            String query = "insert into capstoneproject.login(name, password) values(?,?)";
            PreparedStatement stm = conn.prepareStatement(query);
            stm.setString(1, username);
            stm.setString(2, password);
            stm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        Administrator.APIResponse.Builder response = Administrator.APIResponse.newBuilder();
        if (username.equals(password)) {
            response.setResponseMessage("SUCCESS").setResponseCode(200);
        } else {
            response.setResponseMessage("Invalid username or password").setResponseCode(400);
        }

        responseObserver.onNext(response.build());
        responseObserver.onCompleted();


    }


    @Override
    public void getUserById(Administrator.UserId request, StreamObserver<Administrator.AllUserDetails> responseObserver) {
        int userId = request.getUserId();

        Administrator.AllUserDetails.Builder userDetails= Administrator.AllUserDetails.newBuilder();
        try {
            conn = DriverManager.getConnection(url, user, pass);
            System.out.println("connection established");
            String query = "Select user_id,usertype,username,first_name,last_name,email,mobileno,city,birthdate from capstoneproject.user_details where user_id=?";
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setInt(1, userId);
            ResultSet result = statement.executeQuery();
            Administrator.UserDetails.Builder response = Administrator.UserDetails.newBuilder();
            if (!result.isBeforeFirst()) {
                userDetails.setResponseMessage("fail");
                userDetails.setResponseCode(400);
            } else {

                result.next();
                int userid=result.getInt(1);
                String usertype= result.getString(2);
                String username = result.getString(3);
                String firstname = result.getString(4);
                String lastname = result.getString(5);
                String email = result.getString(6);
                String mobileno = result.getString(7);
                String city = result.getString(8);
                String birthdate= result.getString(9);

                response.setUserId(userid);
                response.setUsertype(usertype);
                response.setUsername(username);
                response.setFirstName(firstname);
                response.setLastName(lastname);
                response.setEmail(email);
                response.setMobileno(mobileno);
                response.setCity(city);
                response.setBirthDate(birthdate);
                userDetails.addUser(response.build());
                userDetails.setResponseMessage("success");
                userDetails.setResponseCode(200);

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        responseObserver.onNext(userDetails.build());
        responseObserver.onCompleted();


    }


    @Override
    public void getAllUser(Administrator.empty request, StreamObserver<Administrator.AllUserDetails> responseObserver) {
        ManagedChannel channel= ManagedChannelBuilder.forAddress("localhost",8091).usePlaintext().build();
        userServiceGrpc.userServiceBlockingStub userServiceBlockingStub=userServiceGrpc.newBlockingStub(channel);
        UserService.allUser userBuilder=UserService.allUser.newBuilder().build();
        UserService.allUserResponse userResponse= userServiceBlockingStub.getAllUser(userBuilder);
        Administrator.AllUserDetails.Builder allUserDetails=Administrator.AllUserDetails.newBuilder();

        for(UserService.allUserDetails userDetails:userResponse.getAllUserDetailList()){
            Administrator.UserDetails.Builder userDetailsBuilder=Administrator.UserDetails.newBuilder();
            userDetailsBuilder.setUserId(userDetails.getUserId());
            userDetailsBuilder.setUsertype(userDetails.getUsertype());
            userDetailsBuilder.setUsername(userDetails.getUsername());
            userDetailsBuilder.setFirstName(userDetails.getFirstName());
            userDetailsBuilder.setLastName(userDetails.getLastName());
            userDetailsBuilder.setEmail(userDetails.getEmail());
            userDetailsBuilder.setMobileno(userDetails.getMobileno());
            userDetailsBuilder.setCity(userDetails.getCity());
            userDetailsBuilder.setBirthDate(userDetails.getBirthDate());

            allUserDetails.addUser(userDetailsBuilder);
            allUserDetails.setResponseMessage("Success").setResponseCode(200);
        }
        responseObserver.onNext(allUserDetails.build());
        responseObserver.onCompleted();
    }

    @Override
    public void getUsersByUserType(Administrator.UserType request, StreamObserver<Administrator.AllUserDetails> responseObserver) {
        String userType = request.getUserType();
        Administrator.AllUserDetails.Builder userDetails= Administrator.AllUserDetails.newBuilder();
        try {
            conn = DriverManager.getConnection(url, user, pass);
            System.out.println("connection established");
            String query = "Select user_id,usertype,username,first_name,last_name,email,mobileno,city,birthdate from capstoneproject.user_details where usertype=?";
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setString(1, userType);
            ResultSet result = statement.executeQuery();
            if (!result.isBeforeFirst()) {
                userDetails.setResponseMessage("fail");
                userDetails.setResponseCode(400);
            } else {
                while (result.next()) {
                    Administrator.UserDetails.Builder response = Administrator.UserDetails.newBuilder();
                    int userid=result.getInt(1);
                    String usertype= result.getString(2);
                    String username = result.getString(3);
                    String firstname = result.getString(4);
                    String lastname = result.getString(5);
                    String email = result.getString(6);
                    String mobileno = result.getString(7);
                    String city = result.getString(8);
                    String birthdate= result.getString(9);

                    response.setUserId(userid);
                    response.setUsertype(usertype);
                    response.setUsername(username);
                    response.setFirstName(firstname);
                    response.setLastName(lastname);
                    response.setEmail(email);
                    response.setMobileno(mobileno);
                    response.setCity(city);
                    response.setBirthDate(birthdate);

                    userDetails.addUser(response.build());

                }
                userDetails.setResponseMessage("success");
                userDetails.setResponseCode(200);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        responseObserver.onNext(userDetails.build());
        responseObserver.onCompleted();

    }

    @Override
    public void deleteUser(Administrator.deleteByUserId request, StreamObserver<Administrator.APIResponse> responseObserver) {
        int userid=request.getUserId();

        try {
            conn = DriverManager.getConnection(url, user, pass);
            System.out.println("connection established");
            String query = "Delete From capstoneproject.user_details Where user_id=?";
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setInt(1,userid);
            statement.executeUpdate();
        }catch (SQLException e) {
            e.printStackTrace();
        }
        Administrator.APIResponse.Builder response = Administrator.APIResponse.newBuilder();
        response.setResponseMessage("SUCCESS").setResponseCode(200);

        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }

    @Override
    public void getFeedbackById(Administrator.UserId request, StreamObserver<Administrator.FeedbackDetails> responseObserver) {
        int userId = request.getUserId();
        Administrator.FeedbackDetails.Builder response = Administrator.FeedbackDetails.newBuilder();
        try {
            conn = DriverManager.getConnection(url, user, pass);
            System.out.println("connection established");
            String query = "Select userid,bookingid,name,email,datetime,writereview from capstoneproject.feedback where userid=?";
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setInt(1, userId);
            ResultSet result = statement.executeQuery();
            if (!result.isBeforeFirst()) {
                response.setResponseMessage("fail");
                response.setResponseCode(400);
            } else {
                result.next();
                int user_id = result.getInt(1);
                int booking_id = result.getInt(2);
                String name = result.getString(3);
                String email = result.getString(4);
                String datetime = result.getString(5);
                String write_review = result.getString(6);

                response.setUserId(user_id);
                response.setBookingId(booking_id);
                response.setName(name);
                response.setEmail(email);
                response.setDatetime(datetime);
                response.setWriteReview(write_review);
                response.setResponseMessage("success");
                response.setResponseCode(200);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        responseObserver.onNext(response.build());
        responseObserver.onCompleted();

    }

    @Override
    public void getAllFeedback(Administrator.empty request, StreamObserver<Administrator.AllFeedbackDetails> responseObserver) {
        ManagedChannel channel= ManagedChannelBuilder.forAddress("localhost",8084).usePlaintext().build();
        feedbackGrpc.feedbackBlockingStub feedback=feedbackGrpc.newBlockingStub(channel);
        Feedback.empty feedbackBuilder=Feedback.empty.newBuilder().build();
        Feedback.AllFeedbackResponse feedbackResponse= feedback.getAllFeedback(feedbackBuilder);
        Administrator.AllFeedbackDetails.Builder allFeedbackDetails=Administrator.AllFeedbackDetails.newBuilder();

        for(Feedback.FeedMessage1 feedbackDetails:feedbackResponse.getMessagesList()){
            Administrator.FeedbackDetails.Builder feedbackDetailsBuilder=Administrator.FeedbackDetails.newBuilder();
            feedbackDetailsBuilder.setUserId(feedbackDetails.getUserId());
            feedbackDetailsBuilder.setBookingId(feedbackDetails.getBookingId());
            feedbackDetailsBuilder.setName(feedbackDetails.getName());
            feedbackDetailsBuilder.setEmail(feedbackDetails.getEmail());
            feedbackDetailsBuilder.setDatetime(feedbackDetails.getDatetime());
            feedbackDetailsBuilder.setWriteReview(feedbackDetails.getWriteReview());

            allFeedbackDetails.addFeedback(feedbackDetailsBuilder);
            allFeedbackDetails.setResponseMessage("Success").setResponseCode(200);
        }
        responseObserver.onNext(allFeedbackDetails.build());
        responseObserver.onCompleted();
    }

    @Override
    public void deleteFeedbackById(Administrator.UserId request, StreamObserver<Administrator.APIResponse> responseObserver) {
        int userid=request.getUserId();

        try {
            conn = DriverManager.getConnection(url, user, pass);
            System.out.println("connection established");
            String query = "Delete From capstoneproject.feedback Where user_id=?";
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setInt(1,userid);
            statement.executeUpdate();
        }catch (SQLException e) {
            e.printStackTrace();
        }
        Administrator.APIResponse.Builder response = Administrator.APIResponse.newBuilder();
        response.setResponseMessage("SUCCESS").setResponseCode(200);

        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }


}
