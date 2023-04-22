package com.stackroute.planoclock;

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
    comments = "Source: UserAuthentication.proto")
public final class userAuthGrpc {

  private userAuthGrpc() {}

  public static final String SERVICE_NAME = "userAuth";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.stackroute.planoclock.UserAuthentication.registration,
      com.stackroute.planoclock.UserAuthentication.apiResponse> getUserRegisterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "userRegister",
      requestType = com.stackroute.planoclock.UserAuthentication.registration.class,
      responseType = com.stackroute.planoclock.UserAuthentication.apiResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stackroute.planoclock.UserAuthentication.registration,
      com.stackroute.planoclock.UserAuthentication.apiResponse> getUserRegisterMethod() {
    io.grpc.MethodDescriptor<com.stackroute.planoclock.UserAuthentication.registration, com.stackroute.planoclock.UserAuthentication.apiResponse> getUserRegisterMethod;
    if ((getUserRegisterMethod = userAuthGrpc.getUserRegisterMethod) == null) {
      synchronized (userAuthGrpc.class) {
        if ((getUserRegisterMethod = userAuthGrpc.getUserRegisterMethod) == null) {
          userAuthGrpc.getUserRegisterMethod = getUserRegisterMethod = 
              io.grpc.MethodDescriptor.<com.stackroute.planoclock.UserAuthentication.registration, com.stackroute.planoclock.UserAuthentication.apiResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "userAuth", "userRegister"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stackroute.planoclock.UserAuthentication.registration.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stackroute.planoclock.UserAuthentication.apiResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new userAuthMethodDescriptorSupplier("userRegister"))
                  .build();
          }
        }
     }
     return getUserRegisterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stackroute.planoclock.UserAuthentication.validateLogin,
      com.stackroute.planoclock.UserAuthentication.apiResponse> getLoginMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "login",
      requestType = com.stackroute.planoclock.UserAuthentication.validateLogin.class,
      responseType = com.stackroute.planoclock.UserAuthentication.apiResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stackroute.planoclock.UserAuthentication.validateLogin,
      com.stackroute.planoclock.UserAuthentication.apiResponse> getLoginMethod() {
    io.grpc.MethodDescriptor<com.stackroute.planoclock.UserAuthentication.validateLogin, com.stackroute.planoclock.UserAuthentication.apiResponse> getLoginMethod;
    if ((getLoginMethod = userAuthGrpc.getLoginMethod) == null) {
      synchronized (userAuthGrpc.class) {
        if ((getLoginMethod = userAuthGrpc.getLoginMethod) == null) {
          userAuthGrpc.getLoginMethod = getLoginMethod = 
              io.grpc.MethodDescriptor.<com.stackroute.planoclock.UserAuthentication.validateLogin, com.stackroute.planoclock.UserAuthentication.apiResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "userAuth", "login"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stackroute.planoclock.UserAuthentication.validateLogin.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stackroute.planoclock.UserAuthentication.apiResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new userAuthMethodDescriptorSupplier("login"))
                  .build();
          }
        }
     }
     return getLoginMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stackroute.planoclock.UserAuthentication.forgetMessage,
      com.stackroute.planoclock.UserAuthentication.apiResponse> getForgetPasswordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "forgetPassword",
      requestType = com.stackroute.planoclock.UserAuthentication.forgetMessage.class,
      responseType = com.stackroute.planoclock.UserAuthentication.apiResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stackroute.planoclock.UserAuthentication.forgetMessage,
      com.stackroute.planoclock.UserAuthentication.apiResponse> getForgetPasswordMethod() {
    io.grpc.MethodDescriptor<com.stackroute.planoclock.UserAuthentication.forgetMessage, com.stackroute.planoclock.UserAuthentication.apiResponse> getForgetPasswordMethod;
    if ((getForgetPasswordMethod = userAuthGrpc.getForgetPasswordMethod) == null) {
      synchronized (userAuthGrpc.class) {
        if ((getForgetPasswordMethod = userAuthGrpc.getForgetPasswordMethod) == null) {
          userAuthGrpc.getForgetPasswordMethod = getForgetPasswordMethod = 
              io.grpc.MethodDescriptor.<com.stackroute.planoclock.UserAuthentication.forgetMessage, com.stackroute.planoclock.UserAuthentication.apiResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "userAuth", "forgetPassword"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stackroute.planoclock.UserAuthentication.forgetMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stackroute.planoclock.UserAuthentication.apiResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new userAuthMethodDescriptorSupplier("forgetPassword"))
                  .build();
          }
        }
     }
     return getForgetPasswordMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.stackroute.planoclock.UserAuthentication.resetMessage,
      com.stackroute.planoclock.UserAuthentication.apiResponse> getResetPasswordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "resetPassword",
      requestType = com.stackroute.planoclock.UserAuthentication.resetMessage.class,
      responseType = com.stackroute.planoclock.UserAuthentication.apiResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.stackroute.planoclock.UserAuthentication.resetMessage,
      com.stackroute.planoclock.UserAuthentication.apiResponse> getResetPasswordMethod() {
    io.grpc.MethodDescriptor<com.stackroute.planoclock.UserAuthentication.resetMessage, com.stackroute.planoclock.UserAuthentication.apiResponse> getResetPasswordMethod;
    if ((getResetPasswordMethod = userAuthGrpc.getResetPasswordMethod) == null) {
      synchronized (userAuthGrpc.class) {
        if ((getResetPasswordMethod = userAuthGrpc.getResetPasswordMethod) == null) {
          userAuthGrpc.getResetPasswordMethod = getResetPasswordMethod = 
              io.grpc.MethodDescriptor.<com.stackroute.planoclock.UserAuthentication.resetMessage, com.stackroute.planoclock.UserAuthentication.apiResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "userAuth", "resetPassword"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stackroute.planoclock.UserAuthentication.resetMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.stackroute.planoclock.UserAuthentication.apiResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new userAuthMethodDescriptorSupplier("resetPassword"))
                  .build();
          }
        }
     }
     return getResetPasswordMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static userAuthStub newStub(io.grpc.Channel channel) {
    return new userAuthStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static userAuthBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new userAuthBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static userAuthFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new userAuthFutureStub(channel);
  }

  /**
   */
  public static abstract class userAuthImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *3 endpoint of user authentication service
     * </pre>
     */
    public void userRegister(com.stackroute.planoclock.UserAuthentication.registration request,
        io.grpc.stub.StreamObserver<com.stackroute.planoclock.UserAuthentication.apiResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUserRegisterMethod(), responseObserver);
    }

    /**
     */
    public void login(com.stackroute.planoclock.UserAuthentication.validateLogin request,
        io.grpc.stub.StreamObserver<com.stackroute.planoclock.UserAuthentication.apiResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLoginMethod(), responseObserver);
    }

    /**
     */
    public void forgetPassword(com.stackroute.planoclock.UserAuthentication.forgetMessage request,
        io.grpc.stub.StreamObserver<com.stackroute.planoclock.UserAuthentication.apiResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getForgetPasswordMethod(), responseObserver);
    }

    /**
     */
    public void resetPassword(com.stackroute.planoclock.UserAuthentication.resetMessage request,
        io.grpc.stub.StreamObserver<com.stackroute.planoclock.UserAuthentication.apiResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getResetPasswordMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getUserRegisterMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.stackroute.planoclock.UserAuthentication.registration,
                com.stackroute.planoclock.UserAuthentication.apiResponse>(
                  this, METHODID_USER_REGISTER)))
          .addMethod(
            getLoginMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.stackroute.planoclock.UserAuthentication.validateLogin,
                com.stackroute.planoclock.UserAuthentication.apiResponse>(
                  this, METHODID_LOGIN)))
          .addMethod(
            getForgetPasswordMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.stackroute.planoclock.UserAuthentication.forgetMessage,
                com.stackroute.planoclock.UserAuthentication.apiResponse>(
                  this, METHODID_FORGET_PASSWORD)))
          .addMethod(
            getResetPasswordMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.stackroute.planoclock.UserAuthentication.resetMessage,
                com.stackroute.planoclock.UserAuthentication.apiResponse>(
                  this, METHODID_RESET_PASSWORD)))
          .build();
    }
  }

  /**
   */
  public static final class userAuthStub extends io.grpc.stub.AbstractStub<userAuthStub> {
    private userAuthStub(io.grpc.Channel channel) {
      super(channel);
    }

    private userAuthStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected userAuthStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new userAuthStub(channel, callOptions);
    }

    /**
     * <pre>
     *3 endpoint of user authentication service
     * </pre>
     */
    public void userRegister(com.stackroute.planoclock.UserAuthentication.registration request,
        io.grpc.stub.StreamObserver<com.stackroute.planoclock.UserAuthentication.apiResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUserRegisterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void login(com.stackroute.planoclock.UserAuthentication.validateLogin request,
        io.grpc.stub.StreamObserver<com.stackroute.planoclock.UserAuthentication.apiResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void forgetPassword(com.stackroute.planoclock.UserAuthentication.forgetMessage request,
        io.grpc.stub.StreamObserver<com.stackroute.planoclock.UserAuthentication.apiResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getForgetPasswordMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void resetPassword(com.stackroute.planoclock.UserAuthentication.resetMessage request,
        io.grpc.stub.StreamObserver<com.stackroute.planoclock.UserAuthentication.apiResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getResetPasswordMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class userAuthBlockingStub extends io.grpc.stub.AbstractStub<userAuthBlockingStub> {
    private userAuthBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private userAuthBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected userAuthBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new userAuthBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *3 endpoint of user authentication service
     * </pre>
     */
    public com.stackroute.planoclock.UserAuthentication.apiResponse userRegister(com.stackroute.planoclock.UserAuthentication.registration request) {
      return blockingUnaryCall(
          getChannel(), getUserRegisterMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stackroute.planoclock.UserAuthentication.apiResponse login(com.stackroute.planoclock.UserAuthentication.validateLogin request) {
      return blockingUnaryCall(
          getChannel(), getLoginMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stackroute.planoclock.UserAuthentication.apiResponse forgetPassword(com.stackroute.planoclock.UserAuthentication.forgetMessage request) {
      return blockingUnaryCall(
          getChannel(), getForgetPasswordMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.stackroute.planoclock.UserAuthentication.apiResponse resetPassword(com.stackroute.planoclock.UserAuthentication.resetMessage request) {
      return blockingUnaryCall(
          getChannel(), getResetPasswordMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class userAuthFutureStub extends io.grpc.stub.AbstractStub<userAuthFutureStub> {
    private userAuthFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private userAuthFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected userAuthFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new userAuthFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *3 endpoint of user authentication service
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stackroute.planoclock.UserAuthentication.apiResponse> userRegister(
        com.stackroute.planoclock.UserAuthentication.registration request) {
      return futureUnaryCall(
          getChannel().newCall(getUserRegisterMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stackroute.planoclock.UserAuthentication.apiResponse> login(
        com.stackroute.planoclock.UserAuthentication.validateLogin request) {
      return futureUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stackroute.planoclock.UserAuthentication.apiResponse> forgetPassword(
        com.stackroute.planoclock.UserAuthentication.forgetMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getForgetPasswordMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.stackroute.planoclock.UserAuthentication.apiResponse> resetPassword(
        com.stackroute.planoclock.UserAuthentication.resetMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getResetPasswordMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_USER_REGISTER = 0;
  private static final int METHODID_LOGIN = 1;
  private static final int METHODID_FORGET_PASSWORD = 2;
  private static final int METHODID_RESET_PASSWORD = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final userAuthImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(userAuthImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_USER_REGISTER:
          serviceImpl.userRegister((com.stackroute.planoclock.UserAuthentication.registration) request,
              (io.grpc.stub.StreamObserver<com.stackroute.planoclock.UserAuthentication.apiResponse>) responseObserver);
          break;
        case METHODID_LOGIN:
          serviceImpl.login((com.stackroute.planoclock.UserAuthentication.validateLogin) request,
              (io.grpc.stub.StreamObserver<com.stackroute.planoclock.UserAuthentication.apiResponse>) responseObserver);
          break;
        case METHODID_FORGET_PASSWORD:
          serviceImpl.forgetPassword((com.stackroute.planoclock.UserAuthentication.forgetMessage) request,
              (io.grpc.stub.StreamObserver<com.stackroute.planoclock.UserAuthentication.apiResponse>) responseObserver);
          break;
        case METHODID_RESET_PASSWORD:
          serviceImpl.resetPassword((com.stackroute.planoclock.UserAuthentication.resetMessage) request,
              (io.grpc.stub.StreamObserver<com.stackroute.planoclock.UserAuthentication.apiResponse>) responseObserver);
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

  private static abstract class userAuthBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    userAuthBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.stackroute.planoclock.UserAuthentication.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("userAuth");
    }
  }

  private static final class userAuthFileDescriptorSupplier
      extends userAuthBaseDescriptorSupplier {
    userAuthFileDescriptorSupplier() {}
  }

  private static final class userAuthMethodDescriptorSupplier
      extends userAuthBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    userAuthMethodDescriptorSupplier(String methodName) {
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
      synchronized (userAuthGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new userAuthFileDescriptorSupplier())
              .addMethod(getUserRegisterMethod())
              .addMethod(getLoginMethod())
              .addMethod(getForgetPasswordMethod())
              .addMethod(getResetPasswordMethod())
              .build();
        }
      }
    }
    return result;
  }
}
