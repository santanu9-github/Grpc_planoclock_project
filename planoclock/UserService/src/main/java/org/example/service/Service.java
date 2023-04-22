package org.example.service;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import org.example.Notification;
import org.example.NotifyServiceGrpc;
import org.example.UserService;
import org.example.userServiceGrpc;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Service extends userServiceGrpc.userServiceImplBase {
    static Connection con;
    static String url = "jdbc:postgresql://localhost:5432/postgres";
    static String username = "postgres";
    static String password = "1304adeeb";

    @Override
    public void userUpdateProfile(UserService.userUpdateProfileMessage request, StreamObserver<UserService.APIResponse> responseObserver) {
        String usertype=request.getUsertype();
         String firstName = request.getFirstName();
         String lastName=request.getLastName();
        String birthDate = request.getBirthDate();
        String email = request.getEmail();
        String city = request.getCity();
        String mobileno = request.getMobileno();
        try {
            con = DriverManager.getConnection(url, username, password);
            System.out.println("connection established");
            String query ="update capstoneproject.user_details set usertype=?,first_name=?,last_name=?,birthDate=?,email=?,city=?,mobileno=? where email=?";
            PreparedStatement statement = con.prepareStatement(query);
          statement.setString(1,usertype);
            statement.setString(2,firstName);
            statement.setString(3,lastName);
            statement.setString(4, birthDate);
            statement.setString(5,email);
            statement.setString(6, city);
            statement.setString(7,mobileno);
            statement.setString(8,email);
            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        UserService.APIResponse.Builder response = UserService.APIResponse.newBuilder();
        response.setResponseMessage("SUCCESS").setResponseCode(200);

        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
       notifyUser(firstName, email,2);
    }

    @Override
    public void updatePassword(UserService.userUpdatePasswordMessage request, StreamObserver<UserService.APIResponse> responseObserver) {
        int userid = request.getUserid();
        String currentPassword=request.getCurrentPassword();
        String newPassword = request.getNewPassword();
        String reTypeNewPassword = request.getReTypeNewPassword();
        UserService.APIResponse.Builder response = UserService.APIResponse.newBuilder();
        if (!newPassword.equals(reTypeNewPassword)) {
            response.setResponseMessage("password not match").setResponseCode(400);
        } else {
            try {
                con = DriverManager.getConnection(url, username, password);
                System.out.println("connection established");
                String query = "update capstoneproject.user_details set password=? where user_id=? and password=?";
                PreparedStatement statement = con.prepareStatement(query);
                statement.setString(1, newPassword);
                statement.setInt(2, userid);
                statement.setString(3,currentPassword);

                statement.executeUpdate();
                String selectQuery="select first_name,email from capstoneproject.user_details where user_id=?";
                PreparedStatement statement2 = con.prepareStatement(selectQuery);
                statement2.setInt(1,userid);
                ResultSet result=statement2.executeQuery();
                String first_name="",email="";
                while (result.next()){
                    first_name=result.getString(1);
                    email=result.getString(2);
                }
                notifyUser(first_name, email,3);
            } catch (SQLException e) {
                e.printStackTrace();
            }
            response.setResponseMessage("password updated").setResponseCode(200);
        }

        responseObserver.onNext(response.build());
        responseObserver.onCompleted();

    }

    @Override
    public void createProfile(UserService.createProfileMessage request, StreamObserver<UserService.APIResponse> responseObserver) {
        String usertype=request.getUsertype();
       String first_name = request.getFirstName();
        String last_name = request.getLastName();
        String birthDate = request.getBirthDate();
        String city = request.getCity();
        String email = request.getEmail();

        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(url, username, password);
            System.out.println("connection established");
            String query = "update capstoneproject.user_details set usertype=?,first_name=?,last_name=?,birthdate=?,email=?,city=? where email=?";
            PreparedStatement stm = con.prepareStatement(query);
            stm.setString(1, usertype);
            stm.setString(2, first_name);
          stm.setString(3, last_name);
            stm.setString(4, birthDate);
          stm.setString(5, email);
          stm.setString(6,city);
          stm.setString(7,email);
            stm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException f) {
            f.printStackTrace();
        }

        UserService.APIResponse.Builder response = UserService.APIResponse.newBuilder();
        response.setResponseMessage("SUCCESS").setResponseCode(200);

        responseObserver.onNext(response.build());
        responseObserver.onCompleted();

       notifyUser(first_name, email,3);
    }

    private static void notifyUser(String first_name, String email,int actionType) {
        ManagedChannel channel= ManagedChannelBuilder.forAddress("localhost",9091).usePlaintext().build();
        NotifyServiceGrpc.NotifyServiceBlockingStub notification=NotifyServiceGrpc.newBlockingStub(channel);
        Notification.userAction.Builder notificationBuilder=Notification.userAction.newBuilder();
        notificationBuilder.setActionType(actionType).setUserEmail(email).setUsername(first_name);
        notification.notifyUserAction(notificationBuilder.build());
    }

    @Override
    public void getUserByEmail(UserService.getUserByEmailMessage request, StreamObserver<UserService.userDetails> responseObserver) {
        String email = request.getEmail();
        UserService.userDetails.Builder response = UserService.userDetails.newBuilder();
        try {
            con = DriverManager.getConnection(url, username, password);
            System.out.println("connection established");
            String query = "Select user_id,usertype,username,first_name,last_name,email,mobileno,city,birthdate from capstoneproject.user_details where email=?";
            PreparedStatement statement = con.prepareStatement(query);
            statement.setString(1, email);

            UserService.allUserDetails.Builder builder = extracted(statement);
            if (builder == null) {
                response.setResponseMessage("fail").setResponseCode(400);
            } else {
                response.setUserDetail(builder);
                response.setResponseMessage("success").setResponseCode(200);
            }
        }catch(SQLException e){
            e.printStackTrace();
            }
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();

    }

    private static  UserService.allUserDetails.Builder extracted(PreparedStatement statement) throws SQLException {

        ResultSet result = statement.executeQuery();
        UserService.allUserDetails.Builder userDetails= UserService.allUserDetails.newBuilder();
        if(!result.isBeforeFirst()){
            return null;
        }
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

            userDetails.setUserId(userid);
            userDetails.setUsertype(usertype);
            userDetails.setUsername(username);
            userDetails.setFirstName(firstname);
            userDetails.setLastName(lastname);
            userDetails.setEmail(email);
            userDetails.setMobileno(mobileno);
            userDetails.setCity(city);
            userDetails.setBirthDate(birthdate);
           return userDetails;

    }

    @Override
    public void getUserByNumber(UserService.getUserByNumberMessage request, StreamObserver<UserService.userDetails> responseObserver) {
        String number = request.getNumber();
        UserService.userDetails.Builder response = UserService.userDetails.newBuilder();
        try {
            con = DriverManager.getConnection(url, username, password);
            System.out.println("connection established");
            String query = "Select user_id,usertype,username,first_name,last_name,email,mobileno,city,birthdate from capstoneproject.user_details where mobileno=?";
            PreparedStatement statement = con.prepareStatement(query);
            statement.setString(1, number);
            ResultSet result = statement.executeQuery();
            UserService.allUserDetails.Builder userDetails= UserService.allUserDetails.newBuilder();
            if (!result.isBeforeFirst()) {
                response.setResponseMessage("fail");
                response.setResponseCode(400);
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

                userDetails.setUserId(userid);
                userDetails.setUsertype(usertype);
                userDetails.setUsername(username);
                userDetails.setFirstName(firstname);
                userDetails.setLastName(lastname);
                userDetails.setEmail(email);
                userDetails.setMobileno(mobileno);
                userDetails.setCity(city);
                userDetails.setBirthDate(birthdate);

                response.setResponseMessage("success");
                response.setResponseCode(200);
                response.setUserDetail(userDetails);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }

    @Override
    public void getAllUser(UserService.allUser request, StreamObserver<UserService.allUserResponse> responseObserver) {
        UserService.allUserResponse.Builder response = UserService.allUserResponse.newBuilder();
        try {
            con = DriverManager.getConnection(url, username, password);
            System.out.println("connection established");
            String query = "Select user_id,usertype,username,first_name,last_name,email,mobileno,city,birthdate from capstoneproject.user_details";
            PreparedStatement statement = con.prepareStatement(query);

            ResultSet result = statement.executeQuery();
            while (result.next()) {
                UserService.allUserDetails.Builder userDetailsResponse = UserService.allUserDetails.newBuilder();
                int userid=result.getInt(1);
                String usertype= result.getString(2);
                String username = result.getString(3);
                String firstname = result.getString(4);
                String lastname = result.getString(5);
                String email = result.getString(6);
                String mobileno = result.getString(7);
                String city = result.getString(8);
                String birthdate= result.getString(9);
               userDetailsResponse.setUserId(userid).setUsertype(usertype).setUsername(username).setFirstName(firstname).setLastName(lastname).setEmail(email).setMobileno(mobileno).setCity(city).setBirthDate(birthdate);
                response.addAllUserDetail(userDetailsResponse);
            }
          response.setResponseMessage("success").setResponseCode(200);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }
    }

