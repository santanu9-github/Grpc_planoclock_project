package servicees;

import io.grpc.stub.StreamObserver;
import org.example.Notification;
import org.example.NotifyServiceGrpc;

import java.security.Timestamp;
import java.util.Date;
import java.util.Random;

public class NotificationService extends NotifyServiceGrpc.NotifyServiceImplBase {

    @Override
    public void notifyRegistration(Notification.registrationMessage request, StreamObserver<Notification.APIResponse> responseObserver) {

        String main=request.getRecipientsMailId();
        String Username = request.getUsername();
        String Mobilenumber = request.getMobilenumber();


        String subject="Thank you for completing your registration with PlanOClock";
        String body="Dear "+Username+",\n\n"+subject+"\n\nThis email serves as a confirmation that your account is activated and that you are officially a part of the PlanOClock family.\n"+"\n\n Regards"+"\n PlanOClock" ;



        Notification.APIResponse.Builder sahil = Notification.APIResponse.newBuilder();

        if ( SendMailService.sendMail(main,subject,body))
            sahil.setResponseMessage("Success").setResponseCode("0");
        else
            sahil.setResponseMessage("Fails").setResponseCode("-1");

        responseObserver.onNext(sahil.build());
        responseObserver.onCompleted();
    }

    @Override
    public void notifyBooking(Notification.bookingMessage request, StreamObserver<Notification.APIResponse> responseObserver) {

        String username = request.getUsername();
        String main = request.getUserEmailId();
        String Description = request.getDescription();
        String CheckInDate = request.getCheckInDate();
        String CheckOutDate = request.getCheckOutDate();
        String StartTime = request.getStratTime();
        String EndTime = request.getEndTime();


        String subject="Your Booking At PlanOClock is Confirmed.";
        String body="Dear" +" "+username +","+"\n"+" "+
                " "+"\n\n"+subject+"\n\n Thank you for booking  with us.  \n\n" +" Booking details: \n\n "+"Description : "+Description+"\n\nFrom"+ " "+CheckInDate +" "+"At"+" "+ StartTime+" "+"To"+" "+ CheckOutDate +" "+"At"+" "+EndTime+"\n"+" "+
                "\n" +
                " "+ "If you need to get in touch, you can email or phone us directly. We look forward to welcoming you soon!\n "+"\n"+" "+"Thanks"+
                "\n" +
                "\n" +
                "" ;

        Notification.APIResponse.Builder sahil = Notification.APIResponse.newBuilder();

        if ( SendMailService.sendMail(main,subject,body))
            sahil.setResponseMessage("Success").setResponseCode("0");
        else
            sahil.setResponseMessage("Fails").setResponseCode("-1");

        responseObserver.onNext(sahil.build());
        responseObserver.onCompleted();

    }

    @Override
    public void notifyBookingCancellation(Notification.bookingcancellation request, StreamObserver<Notification.APIResponse> responseObserver) {

        String Username = request.getUsername();
        String main = request.getUserEmailId();
        String BookingId = request.getBookingId();

        String subject="As Per Your Request Your Booking At PlanOClock is Cancelled..!";

        String body="Hello "+Username+",\n\n"+subject+"\n\n Thanks for being part of the PlanOCLock community. As requested, your Booking has been successfully canceled, and your card will no longer be charged.\n\n We’d love to hear about your experience and how you think we can improve PlanOClock for other members (and you, if you decide to come back!) \n\n We hope to see you around! \n\n PlanOClok";

        Notification.APIResponse.Builder sahil = Notification.APIResponse.newBuilder();


        if ( SendMailService.sendMail(main,subject,body))
            sahil.setResponseMessage("Success").setResponseCode("0");
        else
            sahil.setResponseMessage("Fails").setResponseCode("-1");

        responseObserver.onNext(sahil.build());
        responseObserver.onCompleted();
    }

    @Override
    public void generateOtp(Notification.email request, StreamObserver<Notification.otpResponse> responseObserver) {

        Random random=new Random();
        int otp=random.nextInt(999999);
        String otpString=String.format("%06d",otp);

        String mailId=request.getUserEmail();
        String username = request.getUsername();
        String subject="Reset Password Request";
        String body="Dear"+" "+username+" \n\n Please enter below OTP to reset your password to your PlanOClock account  \n\n"+otpString+"\nNote: This OTP is valid for the next 2 hours only. if you did not make this request please write at planoclockk@gmail.com\n\n Regards\n Team PlanOClock";

        Notification.otpResponse.Builder builder=Notification.otpResponse.newBuilder();
        SendMailService.sendMail(mailId,subject,body);
        builder.setOtp(otpString).setGeneratedTimeStamp(new Date().toString());

        responseObserver.onNext(builder.build());
        responseObserver.onCompleted();
    }

    @Override
    public void notifyUserAction(Notification.userAction request, StreamObserver<Notification.APIResponse> responseObserver) {

        int actionType=request.getActionType();
        String mailId=request.getUserEmail();
        String username=request.getUsername();
        String subject,body;

        if(actionType==1) {
            subject="Your PlanOClock account password has changed";
            body="Dear "+username+",\n\n Please note that you have changed your password successfully. \n\n The password is case sensitive. \n\n Regards, \n Team PlanOClock \n\n ";
        }
        else if( actionType==2) {
            subject="Your PlanOClock account has been updated";
            body=" Dear "+username+",\n\n We're confirming that your PlanOClock account  details has been updated successfully  \n\n Regards, \n Team PlanOClock" ;
        } else if(actionType==3) {
            subject="Your PlanOClock account has been created";
            body="Dear "+username+",\n\nWe're confirming that your PlanOClock account has been created successfully \n\n Regards, \n Team PlanOClock";
        } else if(actionType==4) {
            subject ="Your Feedback For PlanOClock account has been submitted";
            body ="Dear "+username+",\n\nWe're confirming that your Feedback has been submitted successfully \n\n Regards, \n Team PlanOClock";
        } else if (actionType==5) {
            subject ="Your Given Feedback For PlanOClock Is Deleted Successfully ";
            body ="Dear "+username+",\n\nWe're confirming that your Feedback has been Deleted Successfully \n\n Regards, \n Team PlanOClock";
        }

        else {
            responseObserver.onNext(Notification.APIResponse.newBuilder().setResponseMessage("Invalid action type").setResponseCode("-1").build());
            responseObserver.onCompleted();
            return;
        }

        if ( SendMailService.sendMail(mailId,subject,body))
            responseObserver.onNext(Notification.APIResponse.newBuilder().setResponseMessage("Success").setResponseCode("0").build());
        else
            responseObserver.onNext(Notification.APIResponse.newBuilder().setResponseMessage("Failed").setResponseCode("-1").build());

        responseObserver.onCompleted();
    }
}
