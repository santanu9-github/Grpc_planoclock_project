package org.example;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: Notification.proto")
public final class NotifyServiceGrpc {

  private NotifyServiceGrpc() {}

  public static final String SERVICE_NAME = "NotifyService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.example.Notification.registrationMessage,
      org.example.Notification.APIResponse> getNotifyRegistrationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NotifyRegistration",
      requestType = org.example.Notification.registrationMessage.class,
      responseType = org.example.Notification.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.Notification.registrationMessage,
      org.example.Notification.APIResponse> getNotifyRegistrationMethod() {
    io.grpc.MethodDescriptor<org.example.Notification.registrationMessage, org.example.Notification.APIResponse> getNotifyRegistrationMethod;
    if ((getNotifyRegistrationMethod = NotifyServiceGrpc.getNotifyRegistrationMethod) == null) {
      synchronized (NotifyServiceGrpc.class) {
        if ((getNotifyRegistrationMethod = NotifyServiceGrpc.getNotifyRegistrationMethod) == null) {
          NotifyServiceGrpc.getNotifyRegistrationMethod = getNotifyRegistrationMethod = 
              io.grpc.MethodDescriptor.<org.example.Notification.registrationMessage, org.example.Notification.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "NotifyService", "NotifyRegistration"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.Notification.registrationMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.Notification.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new NotifyServiceMethodDescriptorSupplier("NotifyRegistration"))
                  .build();
          }
        }
     }
     return getNotifyRegistrationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.Notification.bookingMessage,
      org.example.Notification.APIResponse> getNotifyBookingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NotifyBooking",
      requestType = org.example.Notification.bookingMessage.class,
      responseType = org.example.Notification.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.Notification.bookingMessage,
      org.example.Notification.APIResponse> getNotifyBookingMethod() {
    io.grpc.MethodDescriptor<org.example.Notification.bookingMessage, org.example.Notification.APIResponse> getNotifyBookingMethod;
    if ((getNotifyBookingMethod = NotifyServiceGrpc.getNotifyBookingMethod) == null) {
      synchronized (NotifyServiceGrpc.class) {
        if ((getNotifyBookingMethod = NotifyServiceGrpc.getNotifyBookingMethod) == null) {
          NotifyServiceGrpc.getNotifyBookingMethod = getNotifyBookingMethod = 
              io.grpc.MethodDescriptor.<org.example.Notification.bookingMessage, org.example.Notification.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "NotifyService", "NotifyBooking"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.Notification.bookingMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.Notification.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new NotifyServiceMethodDescriptorSupplier("NotifyBooking"))
                  .build();
          }
        }
     }
     return getNotifyBookingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.Notification.bookingcancellation,
      org.example.Notification.APIResponse> getNotifyBookingCancellationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NotifyBookingCancellation",
      requestType = org.example.Notification.bookingcancellation.class,
      responseType = org.example.Notification.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.Notification.bookingcancellation,
      org.example.Notification.APIResponse> getNotifyBookingCancellationMethod() {
    io.grpc.MethodDescriptor<org.example.Notification.bookingcancellation, org.example.Notification.APIResponse> getNotifyBookingCancellationMethod;
    if ((getNotifyBookingCancellationMethod = NotifyServiceGrpc.getNotifyBookingCancellationMethod) == null) {
      synchronized (NotifyServiceGrpc.class) {
        if ((getNotifyBookingCancellationMethod = NotifyServiceGrpc.getNotifyBookingCancellationMethod) == null) {
          NotifyServiceGrpc.getNotifyBookingCancellationMethod = getNotifyBookingCancellationMethod = 
              io.grpc.MethodDescriptor.<org.example.Notification.bookingcancellation, org.example.Notification.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "NotifyService", "NotifyBookingCancellation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.Notification.bookingcancellation.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.Notification.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new NotifyServiceMethodDescriptorSupplier("NotifyBookingCancellation"))
                  .build();
          }
        }
     }
     return getNotifyBookingCancellationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.Notification.email,
      org.example.Notification.otpResponse> getGenerateOtpMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "generateOtp",
      requestType = org.example.Notification.email.class,
      responseType = org.example.Notification.otpResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.Notification.email,
      org.example.Notification.otpResponse> getGenerateOtpMethod() {
    io.grpc.MethodDescriptor<org.example.Notification.email, org.example.Notification.otpResponse> getGenerateOtpMethod;
    if ((getGenerateOtpMethod = NotifyServiceGrpc.getGenerateOtpMethod) == null) {
      synchronized (NotifyServiceGrpc.class) {
        if ((getGenerateOtpMethod = NotifyServiceGrpc.getGenerateOtpMethod) == null) {
          NotifyServiceGrpc.getGenerateOtpMethod = getGenerateOtpMethod = 
              io.grpc.MethodDescriptor.<org.example.Notification.email, org.example.Notification.otpResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "NotifyService", "generateOtp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.Notification.email.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.Notification.otpResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new NotifyServiceMethodDescriptorSupplier("generateOtp"))
                  .build();
          }
        }
     }
     return getGenerateOtpMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.Notification.userAction,
      org.example.Notification.APIResponse> getNotifyUserActionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NotifyUserAction",
      requestType = org.example.Notification.userAction.class,
      responseType = org.example.Notification.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.Notification.userAction,
      org.example.Notification.APIResponse> getNotifyUserActionMethod() {
    io.grpc.MethodDescriptor<org.example.Notification.userAction, org.example.Notification.APIResponse> getNotifyUserActionMethod;
    if ((getNotifyUserActionMethod = NotifyServiceGrpc.getNotifyUserActionMethod) == null) {
      synchronized (NotifyServiceGrpc.class) {
        if ((getNotifyUserActionMethod = NotifyServiceGrpc.getNotifyUserActionMethod) == null) {
          NotifyServiceGrpc.getNotifyUserActionMethod = getNotifyUserActionMethod = 
              io.grpc.MethodDescriptor.<org.example.Notification.userAction, org.example.Notification.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "NotifyService", "NotifyUserAction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.Notification.userAction.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.Notification.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new NotifyServiceMethodDescriptorSupplier("NotifyUserAction"))
                  .build();
          }
        }
     }
     return getNotifyUserActionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static NotifyServiceStub newStub(io.grpc.Channel channel) {
    return new NotifyServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static NotifyServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new NotifyServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static NotifyServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new NotifyServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class NotifyServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void notifyRegistration(org.example.Notification.registrationMessage request,
        io.grpc.stub.StreamObserver<org.example.Notification.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getNotifyRegistrationMethod(), responseObserver);
    }

    /**
     */
    public void notifyBooking(org.example.Notification.bookingMessage request,
        io.grpc.stub.StreamObserver<org.example.Notification.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getNotifyBookingMethod(), responseObserver);
    }

    /**
     */
    public void notifyBookingCancellation(org.example.Notification.bookingcancellation request,
        io.grpc.stub.StreamObserver<org.example.Notification.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getNotifyBookingCancellationMethod(), responseObserver);
    }

    /**
     */
    public void generateOtp(org.example.Notification.email request,
        io.grpc.stub.StreamObserver<org.example.Notification.otpResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGenerateOtpMethod(), responseObserver);
    }

    /**
     */
    public void notifyUserAction(org.example.Notification.userAction request,
        io.grpc.stub.StreamObserver<org.example.Notification.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getNotifyUserActionMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getNotifyRegistrationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.Notification.registrationMessage,
                org.example.Notification.APIResponse>(
                  this, METHODID_NOTIFY_REGISTRATION)))
          .addMethod(
            getNotifyBookingMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.Notification.bookingMessage,
                org.example.Notification.APIResponse>(
                  this, METHODID_NOTIFY_BOOKING)))
          .addMethod(
            getNotifyBookingCancellationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.Notification.bookingcancellation,
                org.example.Notification.APIResponse>(
                  this, METHODID_NOTIFY_BOOKING_CANCELLATION)))
          .addMethod(
            getGenerateOtpMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.Notification.email,
                org.example.Notification.otpResponse>(
                  this, METHODID_GENERATE_OTP)))
          .addMethod(
            getNotifyUserActionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.Notification.userAction,
                org.example.Notification.APIResponse>(
                  this, METHODID_NOTIFY_USER_ACTION)))
          .build();
    }
  }

  /**
   */
  public static final class NotifyServiceStub extends io.grpc.stub.AbstractStub<NotifyServiceStub> {
    private NotifyServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NotifyServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NotifyServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NotifyServiceStub(channel, callOptions);
    }

    /**
     */
    public void notifyRegistration(org.example.Notification.registrationMessage request,
        io.grpc.stub.StreamObserver<org.example.Notification.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getNotifyRegistrationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void notifyBooking(org.example.Notification.bookingMessage request,
        io.grpc.stub.StreamObserver<org.example.Notification.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getNotifyBookingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void notifyBookingCancellation(org.example.Notification.bookingcancellation request,
        io.grpc.stub.StreamObserver<org.example.Notification.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getNotifyBookingCancellationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void generateOtp(org.example.Notification.email request,
        io.grpc.stub.StreamObserver<org.example.Notification.otpResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGenerateOtpMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void notifyUserAction(org.example.Notification.userAction request,
        io.grpc.stub.StreamObserver<org.example.Notification.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getNotifyUserActionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class NotifyServiceBlockingStub extends io.grpc.stub.AbstractStub<NotifyServiceBlockingStub> {
    private NotifyServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NotifyServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NotifyServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NotifyServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.example.Notification.APIResponse notifyRegistration(org.example.Notification.registrationMessage request) {
      return blockingUnaryCall(
          getChannel(), getNotifyRegistrationMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.Notification.APIResponse notifyBooking(org.example.Notification.bookingMessage request) {
      return blockingUnaryCall(
          getChannel(), getNotifyBookingMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.Notification.APIResponse notifyBookingCancellation(org.example.Notification.bookingcancellation request) {
      return blockingUnaryCall(
          getChannel(), getNotifyBookingCancellationMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.Notification.otpResponse generateOtp(org.example.Notification.email request) {
      return blockingUnaryCall(
          getChannel(), getGenerateOtpMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.Notification.APIResponse notifyUserAction(org.example.Notification.userAction request) {
      return blockingUnaryCall(
          getChannel(), getNotifyUserActionMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class NotifyServiceFutureStub extends io.grpc.stub.AbstractStub<NotifyServiceFutureStub> {
    private NotifyServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NotifyServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NotifyServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NotifyServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.Notification.APIResponse> notifyRegistration(
        org.example.Notification.registrationMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getNotifyRegistrationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.Notification.APIResponse> notifyBooking(
        org.example.Notification.bookingMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getNotifyBookingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.Notification.APIResponse> notifyBookingCancellation(
        org.example.Notification.bookingcancellation request) {
      return futureUnaryCall(
          getChannel().newCall(getNotifyBookingCancellationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.Notification.otpResponse> generateOtp(
        org.example.Notification.email request) {
      return futureUnaryCall(
          getChannel().newCall(getGenerateOtpMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.Notification.APIResponse> notifyUserAction(
        org.example.Notification.userAction request) {
      return futureUnaryCall(
          getChannel().newCall(getNotifyUserActionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_NOTIFY_REGISTRATION = 0;
  private static final int METHODID_NOTIFY_BOOKING = 1;
  private static final int METHODID_NOTIFY_BOOKING_CANCELLATION = 2;
  private static final int METHODID_GENERATE_OTP = 3;
  private static final int METHODID_NOTIFY_USER_ACTION = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final NotifyServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(NotifyServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_NOTIFY_REGISTRATION:
          serviceImpl.notifyRegistration((org.example.Notification.registrationMessage) request,
              (io.grpc.stub.StreamObserver<org.example.Notification.APIResponse>) responseObserver);
          break;
        case METHODID_NOTIFY_BOOKING:
          serviceImpl.notifyBooking((org.example.Notification.bookingMessage) request,
              (io.grpc.stub.StreamObserver<org.example.Notification.APIResponse>) responseObserver);
          break;
        case METHODID_NOTIFY_BOOKING_CANCELLATION:
          serviceImpl.notifyBookingCancellation((org.example.Notification.bookingcancellation) request,
              (io.grpc.stub.StreamObserver<org.example.Notification.APIResponse>) responseObserver);
          break;
        case METHODID_GENERATE_OTP:
          serviceImpl.generateOtp((org.example.Notification.email) request,
              (io.grpc.stub.StreamObserver<org.example.Notification.otpResponse>) responseObserver);
          break;
        case METHODID_NOTIFY_USER_ACTION:
          serviceImpl.notifyUserAction((org.example.Notification.userAction) request,
              (io.grpc.stub.StreamObserver<org.example.Notification.APIResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class NotifyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    NotifyServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.example.Notification.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("NotifyService");
    }
  }

  private static final class NotifyServiceFileDescriptorSupplier
      extends NotifyServiceBaseDescriptorSupplier {
    NotifyServiceFileDescriptorSupplier() {}
  }

  private static final class NotifyServiceMethodDescriptorSupplier
      extends NotifyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    NotifyServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (NotifyServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new NotifyServiceFileDescriptorSupplier())
              .addMethod(getNotifyRegistrationMethod())
              .addMethod(getNotifyBookingMethod())
              .addMethod(getNotifyBookingCancellationMethod())
              .addMethod(getGenerateOtpMethod())
              .addMethod(getNotifyUserActionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
