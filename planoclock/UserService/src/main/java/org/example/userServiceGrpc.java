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
    comments = "Source: userService.proto")
public final class userServiceGrpc {

  private userServiceGrpc() {}

  public static final String SERVICE_NAME = "userService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.example.UserService.userUpdateProfileMessage,
      org.example.UserService.APIResponse> getUserUpdateProfileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "userUpdateProfile",
      requestType = org.example.UserService.userUpdateProfileMessage.class,
      responseType = org.example.UserService.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.UserService.userUpdateProfileMessage,
      org.example.UserService.APIResponse> getUserUpdateProfileMethod() {
    io.grpc.MethodDescriptor<org.example.UserService.userUpdateProfileMessage, org.example.UserService.APIResponse> getUserUpdateProfileMethod;
    if ((getUserUpdateProfileMethod = userServiceGrpc.getUserUpdateProfileMethod) == null) {
      synchronized (userServiceGrpc.class) {
        if ((getUserUpdateProfileMethod = userServiceGrpc.getUserUpdateProfileMethod) == null) {
          userServiceGrpc.getUserUpdateProfileMethod = getUserUpdateProfileMethod = 
              io.grpc.MethodDescriptor.<org.example.UserService.userUpdateProfileMessage, org.example.UserService.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "userService", "userUpdateProfile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.UserService.userUpdateProfileMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.UserService.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new userServiceMethodDescriptorSupplier("userUpdateProfile"))
                  .build();
          }
        }
     }
     return getUserUpdateProfileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.UserService.userUpdatePasswordMessage,
      org.example.UserService.APIResponse> getUpdatePasswordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updatePassword",
      requestType = org.example.UserService.userUpdatePasswordMessage.class,
      responseType = org.example.UserService.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.UserService.userUpdatePasswordMessage,
      org.example.UserService.APIResponse> getUpdatePasswordMethod() {
    io.grpc.MethodDescriptor<org.example.UserService.userUpdatePasswordMessage, org.example.UserService.APIResponse> getUpdatePasswordMethod;
    if ((getUpdatePasswordMethod = userServiceGrpc.getUpdatePasswordMethod) == null) {
      synchronized (userServiceGrpc.class) {
        if ((getUpdatePasswordMethod = userServiceGrpc.getUpdatePasswordMethod) == null) {
          userServiceGrpc.getUpdatePasswordMethod = getUpdatePasswordMethod = 
              io.grpc.MethodDescriptor.<org.example.UserService.userUpdatePasswordMessage, org.example.UserService.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "userService", "updatePassword"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.UserService.userUpdatePasswordMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.UserService.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new userServiceMethodDescriptorSupplier("updatePassword"))
                  .build();
          }
        }
     }
     return getUpdatePasswordMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.UserService.createProfileMessage,
      org.example.UserService.APIResponse> getCreateProfileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createProfile",
      requestType = org.example.UserService.createProfileMessage.class,
      responseType = org.example.UserService.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.UserService.createProfileMessage,
      org.example.UserService.APIResponse> getCreateProfileMethod() {
    io.grpc.MethodDescriptor<org.example.UserService.createProfileMessage, org.example.UserService.APIResponse> getCreateProfileMethod;
    if ((getCreateProfileMethod = userServiceGrpc.getCreateProfileMethod) == null) {
      synchronized (userServiceGrpc.class) {
        if ((getCreateProfileMethod = userServiceGrpc.getCreateProfileMethod) == null) {
          userServiceGrpc.getCreateProfileMethod = getCreateProfileMethod = 
              io.grpc.MethodDescriptor.<org.example.UserService.createProfileMessage, org.example.UserService.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "userService", "createProfile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.UserService.createProfileMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.UserService.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new userServiceMethodDescriptorSupplier("createProfile"))
                  .build();
          }
        }
     }
     return getCreateProfileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.UserService.getUserByEmailMessage,
      org.example.UserService.userDetails> getGetUserByEmailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getUserByEmail",
      requestType = org.example.UserService.getUserByEmailMessage.class,
      responseType = org.example.UserService.userDetails.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.UserService.getUserByEmailMessage,
      org.example.UserService.userDetails> getGetUserByEmailMethod() {
    io.grpc.MethodDescriptor<org.example.UserService.getUserByEmailMessage, org.example.UserService.userDetails> getGetUserByEmailMethod;
    if ((getGetUserByEmailMethod = userServiceGrpc.getGetUserByEmailMethod) == null) {
      synchronized (userServiceGrpc.class) {
        if ((getGetUserByEmailMethod = userServiceGrpc.getGetUserByEmailMethod) == null) {
          userServiceGrpc.getGetUserByEmailMethod = getGetUserByEmailMethod = 
              io.grpc.MethodDescriptor.<org.example.UserService.getUserByEmailMessage, org.example.UserService.userDetails>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "userService", "getUserByEmail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.UserService.getUserByEmailMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.UserService.userDetails.getDefaultInstance()))
                  .setSchemaDescriptor(new userServiceMethodDescriptorSupplier("getUserByEmail"))
                  .build();
          }
        }
     }
     return getGetUserByEmailMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.UserService.getUserByNumberMessage,
      org.example.UserService.userDetails> getGetUserByNumberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getUserByNumber",
      requestType = org.example.UserService.getUserByNumberMessage.class,
      responseType = org.example.UserService.userDetails.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.UserService.getUserByNumberMessage,
      org.example.UserService.userDetails> getGetUserByNumberMethod() {
    io.grpc.MethodDescriptor<org.example.UserService.getUserByNumberMessage, org.example.UserService.userDetails> getGetUserByNumberMethod;
    if ((getGetUserByNumberMethod = userServiceGrpc.getGetUserByNumberMethod) == null) {
      synchronized (userServiceGrpc.class) {
        if ((getGetUserByNumberMethod = userServiceGrpc.getGetUserByNumberMethod) == null) {
          userServiceGrpc.getGetUserByNumberMethod = getGetUserByNumberMethod = 
              io.grpc.MethodDescriptor.<org.example.UserService.getUserByNumberMessage, org.example.UserService.userDetails>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "userService", "getUserByNumber"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.UserService.getUserByNumberMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.UserService.userDetails.getDefaultInstance()))
                  .setSchemaDescriptor(new userServiceMethodDescriptorSupplier("getUserByNumber"))
                  .build();
          }
        }
     }
     return getGetUserByNumberMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.UserService.allUser,
      org.example.UserService.allUserResponse> getGetAllUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllUser",
      requestType = org.example.UserService.allUser.class,
      responseType = org.example.UserService.allUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.UserService.allUser,
      org.example.UserService.allUserResponse> getGetAllUserMethod() {
    io.grpc.MethodDescriptor<org.example.UserService.allUser, org.example.UserService.allUserResponse> getGetAllUserMethod;
    if ((getGetAllUserMethod = userServiceGrpc.getGetAllUserMethod) == null) {
      synchronized (userServiceGrpc.class) {
        if ((getGetAllUserMethod = userServiceGrpc.getGetAllUserMethod) == null) {
          userServiceGrpc.getGetAllUserMethod = getGetAllUserMethod = 
              io.grpc.MethodDescriptor.<org.example.UserService.allUser, org.example.UserService.allUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "userService", "getAllUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.UserService.allUser.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.UserService.allUserResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new userServiceMethodDescriptorSupplier("getAllUser"))
                  .build();
          }
        }
     }
     return getGetAllUserMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static userServiceStub newStub(io.grpc.Channel channel) {
    return new userServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static userServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new userServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static userServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new userServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class userServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void userUpdateProfile(org.example.UserService.userUpdateProfileMessage request,
        io.grpc.stub.StreamObserver<org.example.UserService.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUserUpdateProfileMethod(), responseObserver);
    }

    /**
     */
    public void updatePassword(org.example.UserService.userUpdatePasswordMessage request,
        io.grpc.stub.StreamObserver<org.example.UserService.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdatePasswordMethod(), responseObserver);
    }

    /**
     */
    public void createProfile(org.example.UserService.createProfileMessage request,
        io.grpc.stub.StreamObserver<org.example.UserService.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateProfileMethod(), responseObserver);
    }

    /**
     */
    public void getUserByEmail(org.example.UserService.getUserByEmailMessage request,
        io.grpc.stub.StreamObserver<org.example.UserService.userDetails> responseObserver) {
      asyncUnimplementedUnaryCall(getGetUserByEmailMethod(), responseObserver);
    }

    /**
     */
    public void getUserByNumber(org.example.UserService.getUserByNumberMessage request,
        io.grpc.stub.StreamObserver<org.example.UserService.userDetails> responseObserver) {
      asyncUnimplementedUnaryCall(getGetUserByNumberMethod(), responseObserver);
    }

    /**
     */
    public void getAllUser(org.example.UserService.allUser request,
        io.grpc.stub.StreamObserver<org.example.UserService.allUserResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllUserMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getUserUpdateProfileMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.UserService.userUpdateProfileMessage,
                org.example.UserService.APIResponse>(
                  this, METHODID_USER_UPDATE_PROFILE)))
          .addMethod(
            getUpdatePasswordMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.UserService.userUpdatePasswordMessage,
                org.example.UserService.APIResponse>(
                  this, METHODID_UPDATE_PASSWORD)))
          .addMethod(
            getCreateProfileMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.UserService.createProfileMessage,
                org.example.UserService.APIResponse>(
                  this, METHODID_CREATE_PROFILE)))
          .addMethod(
            getGetUserByEmailMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.UserService.getUserByEmailMessage,
                org.example.UserService.userDetails>(
                  this, METHODID_GET_USER_BY_EMAIL)))
          .addMethod(
            getGetUserByNumberMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.UserService.getUserByNumberMessage,
                org.example.UserService.userDetails>(
                  this, METHODID_GET_USER_BY_NUMBER)))
          .addMethod(
            getGetAllUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.UserService.allUser,
                org.example.UserService.allUserResponse>(
                  this, METHODID_GET_ALL_USER)))
          .build();
    }
  }

  /**
   */
  public static final class userServiceStub extends io.grpc.stub.AbstractStub<userServiceStub> {
    private userServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private userServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected userServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new userServiceStub(channel, callOptions);
    }

    /**
     */
    public void userUpdateProfile(org.example.UserService.userUpdateProfileMessage request,
        io.grpc.stub.StreamObserver<org.example.UserService.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUserUpdateProfileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updatePassword(org.example.UserService.userUpdatePasswordMessage request,
        io.grpc.stub.StreamObserver<org.example.UserService.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdatePasswordMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createProfile(org.example.UserService.createProfileMessage request,
        io.grpc.stub.StreamObserver<org.example.UserService.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateProfileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUserByEmail(org.example.UserService.getUserByEmailMessage request,
        io.grpc.stub.StreamObserver<org.example.UserService.userDetails> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetUserByEmailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUserByNumber(org.example.UserService.getUserByNumberMessage request,
        io.grpc.stub.StreamObserver<org.example.UserService.userDetails> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetUserByNumberMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllUser(org.example.UserService.allUser request,
        io.grpc.stub.StreamObserver<org.example.UserService.allUserResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllUserMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class userServiceBlockingStub extends io.grpc.stub.AbstractStub<userServiceBlockingStub> {
    private userServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private userServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected userServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new userServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.example.UserService.APIResponse userUpdateProfile(org.example.UserService.userUpdateProfileMessage request) {
      return blockingUnaryCall(
          getChannel(), getUserUpdateProfileMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.UserService.APIResponse updatePassword(org.example.UserService.userUpdatePasswordMessage request) {
      return blockingUnaryCall(
          getChannel(), getUpdatePasswordMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.UserService.APIResponse createProfile(org.example.UserService.createProfileMessage request) {
      return blockingUnaryCall(
          getChannel(), getCreateProfileMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.UserService.userDetails getUserByEmail(org.example.UserService.getUserByEmailMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetUserByEmailMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.UserService.userDetails getUserByNumber(org.example.UserService.getUserByNumberMessage request) {
      return blockingUnaryCall(
          getChannel(), getGetUserByNumberMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.UserService.allUserResponse getAllUser(org.example.UserService.allUser request) {
      return blockingUnaryCall(
          getChannel(), getGetAllUserMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class userServiceFutureStub extends io.grpc.stub.AbstractStub<userServiceFutureStub> {
    private userServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private userServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected userServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new userServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.UserService.APIResponse> userUpdateProfile(
        org.example.UserService.userUpdateProfileMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getUserUpdateProfileMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.UserService.APIResponse> updatePassword(
        org.example.UserService.userUpdatePasswordMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdatePasswordMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.UserService.APIResponse> createProfile(
        org.example.UserService.createProfileMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateProfileMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.UserService.userDetails> getUserByEmail(
        org.example.UserService.getUserByEmailMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetUserByEmailMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.UserService.userDetails> getUserByNumber(
        org.example.UserService.getUserByNumberMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getGetUserByNumberMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.UserService.allUserResponse> getAllUser(
        org.example.UserService.allUser request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllUserMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_USER_UPDATE_PROFILE = 0;
  private static final int METHODID_UPDATE_PASSWORD = 1;
  private static final int METHODID_CREATE_PROFILE = 2;
  private static final int METHODID_GET_USER_BY_EMAIL = 3;
  private static final int METHODID_GET_USER_BY_NUMBER = 4;
  private static final int METHODID_GET_ALL_USER = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final userServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(userServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_USER_UPDATE_PROFILE:
          serviceImpl.userUpdateProfile((org.example.UserService.userUpdateProfileMessage) request,
              (io.grpc.stub.StreamObserver<org.example.UserService.APIResponse>) responseObserver);
          break;
        case METHODID_UPDATE_PASSWORD:
          serviceImpl.updatePassword((org.example.UserService.userUpdatePasswordMessage) request,
              (io.grpc.stub.StreamObserver<org.example.UserService.APIResponse>) responseObserver);
          break;
        case METHODID_CREATE_PROFILE:
          serviceImpl.createProfile((org.example.UserService.createProfileMessage) request,
              (io.grpc.stub.StreamObserver<org.example.UserService.APIResponse>) responseObserver);
          break;
        case METHODID_GET_USER_BY_EMAIL:
          serviceImpl.getUserByEmail((org.example.UserService.getUserByEmailMessage) request,
              (io.grpc.stub.StreamObserver<org.example.UserService.userDetails>) responseObserver);
          break;
        case METHODID_GET_USER_BY_NUMBER:
          serviceImpl.getUserByNumber((org.example.UserService.getUserByNumberMessage) request,
              (io.grpc.stub.StreamObserver<org.example.UserService.userDetails>) responseObserver);
          break;
        case METHODID_GET_ALL_USER:
          serviceImpl.getAllUser((org.example.UserService.allUser) request,
              (io.grpc.stub.StreamObserver<org.example.UserService.allUserResponse>) responseObserver);
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

  private static abstract class userServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    userServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.example.UserService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("userService");
    }
  }

  private static final class userServiceFileDescriptorSupplier
      extends userServiceBaseDescriptorSupplier {
    userServiceFileDescriptorSupplier() {}
  }

  private static final class userServiceMethodDescriptorSupplier
      extends userServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    userServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (userServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new userServiceFileDescriptorSupplier())
              .addMethod(getUserUpdateProfileMethod())
              .addMethod(getUpdatePasswordMethod())
              .addMethod(getCreateProfileMethod())
              .addMethod(getGetUserByEmailMethod())
              .addMethod(getGetUserByNumberMethod())
              .addMethod(getGetAllUserMethod())
              .build();
        }
      }
    }
    return result;
  }
}
