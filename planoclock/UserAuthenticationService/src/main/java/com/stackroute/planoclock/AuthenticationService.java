package com.stackroute.planoclock;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import com.stackroute.notification.Notification;
import com.stackroute.notification.NotifyServiceGrpc;

import java.security.SecureRandom;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AuthenticationService extends userAuthGrpc.userAuthImplBase{
    static String otp="";
    @Override

    //user registration function
    public void userRegister(UserAuthentication.registration request, StreamObserver<UserAuthentication.apiResponse> responseObserver) {
       //storing all the request from client in local variable
        String userType=request.getUserType();
        String  username=request.getUsername();
        String email=request.getEmail();
        String password=request.getPassword();
        String reTypePassword=request.getReTypePassword();
        String mobileNo=request.getMobileNo();
        UserAuthentication.apiResponse.Builder response= UserAuthentication.apiResponse.newBuilder();
        //checking if username field is empty or not
       if(username=="")
           response.setResponseMessage("Username field can not be null !! ").setResponseCode(400);
           //checking if email field is empty or not
       else if(email=="")
           response.setResponseMessage("Email field can not be null !! ").setResponseCode(400);
           //checking if password field is empty or not
       else if(password=="")
           response.setResponseMessage("Password field can not be null !! ").setResponseCode(400);
           //checking if ReType password field is empty or not
       else if(reTypePassword=="")
           response.setResponseMessage("RetypePassword field can not be null !! ").setResponseCode(400);
        //checking if mobile number field is empty or not
       else if(mobileNo=="")
           response.setResponseMessage("Mobile no field can not be null !! ").setResponseCode(400);
       //checking if password and reType password field is equal or not
       else if (!password.equals(reTypePassword)){
            response.setResponseMessage("Please reType same password!!").setResponseCode(400);
        }
       //checking if username is already existed
       else if(Implementation.isUsernameExist(username)  ){
           response.setResponseMessage("Username  already exist").setResponseCode(406);
        }
       //checking if email is already existed
       else if (Implementation.isEmailExist(email)) {
           response.setResponseMessage("User is already registered. Please login!!").setResponseCode(400);

        }
       //adding user details
       else {
           Implementation.addDetails(userType,username,email,password,mobileNo);
           ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9091).usePlaintext().build();
           Notification.registrationMessage registrationReq= Notification.registrationMessage.newBuilder().setUsername(username).setMobilenumber(mobileNo).setRecipientsMailId(email).build();
           NotifyServiceGrpc.NotifyServiceBlockingStub registerStub= NotifyServiceGrpc.newBlockingStub(channel);
           Notification.APIResponse serverResponse=registerStub.notifyRegistration(registrationReq);
           if(serverResponse.getResponseMessage().equals("Success")){
               response.setResponseMessage("Registered Successfully").setResponseCode(200);
           }
           else
               response.setResponseMessage("Something went wrong").setResponseCode(400);

        }

        responseObserver.onNext(response.build());
        responseObserver.onCompleted();

    }


    @Override
    //login function
    public void login(UserAuthentication.validateLogin request, StreamObserver<UserAuthentication.apiResponse> responseObserver) {
        //storing client request in local variable
        String userName = request.getUserName();
        String password = request.getPassword();
        //building response message
        UserAuthentication.apiResponse.Builder response = UserAuthentication.apiResponse.newBuilder();
        //checking username is empty and sending response to client
        if (userName=="")
            response.setResponseMessage("Username cannot be empty").setResponseCode(400);
        //checking password is empty and sending response to client
        else if (password == "") {
            response.setResponseMessage("Password cannot be empty").setResponseCode(400);
        }
        //checking username is present in database  and sending response to client
        else if (!Implementation.isUsernameExist(userName)) {
            response.setResponseMessage("User does not exist !! Please register").setResponseCode(400);
              }
        //checking username and password is present in database  and sending response to client
        else if ( !Implementation.isUserExist(userName,password)) {
                response.setResponseMessage(" UserName or Password is wrong ").setResponseCode(400);
            }
        // username and password is present in database  and sending response success response to client
        else{

//            SecureRandom random=new SecureRandom();
//            byte bytes[]=new byte[30];
//            random.nextBytes(bytes);
//            String token = bytes.toString();
//            response.setResponseMessage("token: "+token).setResponseCode(200);
            JWT jwt = new JWT();
            try {

              String token=  jwt.generateJWT(request);// calling jwt method

               response.setResponseMessage("Successfully logged in with token - "+ token).setResponseCode(200).build();
            } catch (Exception e) {
                response.setResponseMessage(e.getMessage()).setResponseCode(-1).build();
                System.out.println(e.getMessage());
            }


            }
            responseObserver.onNext(response.build());
            responseObserver.onCompleted();

        }

        @Override
        public void forgetPassword (UserAuthentication.forgetMessage
        request, StreamObserver < UserAuthentication.apiResponse > responseObserver){
            //storing client request in local variable
            String userType = request.getUserType();
            String email = request.getEmail();
            String username=request.getUserName();
            //building response message
            UserAuthentication.apiResponse.Builder response = UserAuthentication.apiResponse.newBuilder();
            //checking email is empty and sending response to client
            if (email == "")
                response.setResponseMessage("Email id field can not be empty").setResponseCode(400);
            //checking userType is empty and sending response to client
            else if (userType == "")
                response.setResponseMessage("UserType field can not be empty").setResponseCode(400);
            //checking username is empty and sending response to client
            else if (username == "")
                response.setResponseMessage("Username field can not be empty").setResponseCode(400);
            //checking email is present in database  and sending response to client
            else if (!Implementation.isEmailExist(email))
                response.setResponseMessage("Please check email id. It does not exist!!").setResponseCode(400);
            //checking username is present in database  and sending response to client
            else if (!Implementation.isUsernameExist(username)) {
                response.setResponseMessage("Please check username. It does not exist!!").setResponseCode(400);
            }
            //getting password and sending it to client
            else {
                ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9091).usePlaintext().build();
                Notification.email otpreq= Notification.email.newBuilder().setUserEmail(email).build();
                NotifyServiceGrpc.NotifyServiceBlockingStub otpstub= NotifyServiceGrpc.newBlockingStub(channel);
                Notification.otpResponse otpserverResponse=otpstub.generateOtp(otpreq);
                   otp=otpserverResponse.getOtp();
                 response.setResponseMessage("otp is sent successfully").setResponseCode(200);
            }
            responseObserver.onNext(response.build());
            responseObserver.onCompleted();
        }

    @Override
    public void resetPassword(UserAuthentication.resetMessage request, StreamObserver<UserAuthentication.apiResponse> responseObserver) {
        //storing client request in local variable
        String username= request.getUserName();
        String newPassword=request.getNewPassword();
        String reTypePassword=request.getReTypePassword();
        String otpResponse =request.getOtp();

        //building response message
        UserAuthentication.apiResponse.Builder response = UserAuthentication.apiResponse.newBuilder();
        //checking password with retype password
        if(!newPassword.equals(reTypePassword)){
            response.setResponseMessage("Please retype same password ").setResponseCode(400);
        }
        //checking username exists in DB
        else if(!Implementation.isUsernameExist(username)){
            response.setResponseMessage("username does not exist!!").setResponseCode(400);
        }
        else if (!otpResponse.equals(otp) ){
            response.setResponseMessage("Otp is wrong !!").setResponseCode(400);
        } else {
            //changing password
            otp="";
            Implementation.changePassword(username,newPassword);
            //setting response message and code
            response.setResponseMessage("password reset successfully").setResponseCode(200);
        }

        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }
}
