package com.grpc.administrator;

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
    comments = "Source: administrator.proto")
public final class administratorGrpc {

  private administratorGrpc() {}

  public static final String SERVICE_NAME = "administrator";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.grpc.administrator.Administrator.AdminLogin,
      com.grpc.administrator.Administrator.APIResponse> getLoginMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "login",
      requestType = com.grpc.administrator.Administrator.AdminLogin.class,
      responseType = com.grpc.administrator.Administrator.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.administrator.Administrator.AdminLogin,
      com.grpc.administrator.Administrator.APIResponse> getLoginMethod() {
    io.grpc.MethodDescriptor<com.grpc.administrator.Administrator.AdminLogin, com.grpc.administrator.Administrator.APIResponse> getLoginMethod;
    if ((getLoginMethod = administratorGrpc.getLoginMethod) == null) {
      synchronized (administratorGrpc.class) {
        if ((getLoginMethod = administratorGrpc.getLoginMethod) == null) {
          administratorGrpc.getLoginMethod = getLoginMethod = 
              io.grpc.MethodDescriptor.<com.grpc.administrator.Administrator.AdminLogin, com.grpc.administrator.Administrator.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "administrator", "login"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.administrator.Administrator.AdminLogin.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.administrator.Administrator.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new administratorMethodDescriptorSupplier("login"))
                  .build();
          }
        }
     }
     return getLoginMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.administrator.Administrator.UserId,
      com.grpc.administrator.Administrator.AllUserDetails> getGetUserByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getUserById",
      requestType = com.grpc.administrator.Administrator.UserId.class,
      responseType = com.grpc.administrator.Administrator.AllUserDetails.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.administrator.Administrator.UserId,
      com.grpc.administrator.Administrator.AllUserDetails> getGetUserByIdMethod() {
    io.grpc.MethodDescriptor<com.grpc.administrator.Administrator.UserId, com.grpc.administrator.Administrator.AllUserDetails> getGetUserByIdMethod;
    if ((getGetUserByIdMethod = administratorGrpc.getGetUserByIdMethod) == null) {
      synchronized (administratorGrpc.class) {
        if ((getGetUserByIdMethod = administratorGrpc.getGetUserByIdMethod) == null) {
          administratorGrpc.getGetUserByIdMethod = getGetUserByIdMethod = 
              io.grpc.MethodDescriptor.<com.grpc.administrator.Administrator.UserId, com.grpc.administrator.Administrator.AllUserDetails>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "administrator", "getUserById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.administrator.Administrator.UserId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.administrator.Administrator.AllUserDetails.getDefaultInstance()))
                  .setSchemaDescriptor(new administratorMethodDescriptorSupplier("getUserById"))
                  .build();
          }
        }
     }
     return getGetUserByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.administrator.Administrator.empty,
      com.grpc.administrator.Administrator.AllUserDetails> getGetAllUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllUser",
      requestType = com.grpc.administrator.Administrator.empty.class,
      responseType = com.grpc.administrator.Administrator.AllUserDetails.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.administrator.Administrator.empty,
      com.grpc.administrator.Administrator.AllUserDetails> getGetAllUserMethod() {
    io.grpc.MethodDescriptor<com.grpc.administrator.Administrator.empty, com.grpc.administrator.Administrator.AllUserDetails> getGetAllUserMethod;
    if ((getGetAllUserMethod = administratorGrpc.getGetAllUserMethod) == null) {
      synchronized (administratorGrpc.class) {
        if ((getGetAllUserMethod = administratorGrpc.getGetAllUserMethod) == null) {
          administratorGrpc.getGetAllUserMethod = getGetAllUserMethod = 
              io.grpc.MethodDescriptor.<com.grpc.administrator.Administrator.empty, com.grpc.administrator.Administrator.AllUserDetails>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "administrator", "getAllUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.administrator.Administrator.empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.administrator.Administrator.AllUserDetails.getDefaultInstance()))
                  .setSchemaDescriptor(new administratorMethodDescriptorSupplier("getAllUser"))
                  .build();
          }
        }
     }
     return getGetAllUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.administrator.Administrator.UserType,
      com.grpc.administrator.Administrator.AllUserDetails> getGetUsersByUserTypeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getUsersByUserType",
      requestType = com.grpc.administrator.Administrator.UserType.class,
      responseType = com.grpc.administrator.Administrator.AllUserDetails.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.administrator.Administrator.UserType,
      com.grpc.administrator.Administrator.AllUserDetails> getGetUsersByUserTypeMethod() {
    io.grpc.MethodDescriptor<com.grpc.administrator.Administrator.UserType, com.grpc.administrator.Administrator.AllUserDetails> getGetUsersByUserTypeMethod;
    if ((getGetUsersByUserTypeMethod = administratorGrpc.getGetUsersByUserTypeMethod) == null) {
      synchronized (administratorGrpc.class) {
        if ((getGetUsersByUserTypeMethod = administratorGrpc.getGetUsersByUserTypeMethod) == null) {
          administratorGrpc.getGetUsersByUserTypeMethod = getGetUsersByUserTypeMethod = 
              io.grpc.MethodDescriptor.<com.grpc.administrator.Administrator.UserType, com.grpc.administrator.Administrator.AllUserDetails>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "administrator", "getUsersByUserType"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.administrator.Administrator.UserType.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.administrator.Administrator.AllUserDetails.getDefaultInstance()))
                  .setSchemaDescriptor(new administratorMethodDescriptorSupplier("getUsersByUserType"))
                  .build();
          }
        }
     }
     return getGetUsersByUserTypeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.administrator.Administrator.deleteByUserId,
      com.grpc.administrator.Administrator.APIResponse> getDeleteUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteUser",
      requestType = com.grpc.administrator.Administrator.deleteByUserId.class,
      responseType = com.grpc.administrator.Administrator.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.administrator.Administrator.deleteByUserId,
      com.grpc.administrator.Administrator.APIResponse> getDeleteUserMethod() {
    io.grpc.MethodDescriptor<com.grpc.administrator.Administrator.deleteByUserId, com.grpc.administrator.Administrator.APIResponse> getDeleteUserMethod;
    if ((getDeleteUserMethod = administratorGrpc.getDeleteUserMethod) == null) {
      synchronized (administratorGrpc.class) {
        if ((getDeleteUserMethod = administratorGrpc.getDeleteUserMethod) == null) {
          administratorGrpc.getDeleteUserMethod = getDeleteUserMethod = 
              io.grpc.MethodDescriptor.<com.grpc.administrator.Administrator.deleteByUserId, com.grpc.administrator.Administrator.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "administrator", "DeleteUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.administrator.Administrator.deleteByUserId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.administrator.Administrator.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new administratorMethodDescriptorSupplier("DeleteUser"))
                  .build();
          }
        }
     }
     return getDeleteUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.administrator.Administrator.UserId,
      com.grpc.administrator.Administrator.FeedbackDetails> getGetFeedbackByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getFeedbackById",
      requestType = com.grpc.administrator.Administrator.UserId.class,
      responseType = com.grpc.administrator.Administrator.FeedbackDetails.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.administrator.Administrator.UserId,
      com.grpc.administrator.Administrator.FeedbackDetails> getGetFeedbackByIdMethod() {
    io.grpc.MethodDescriptor<com.grpc.administrator.Administrator.UserId, com.grpc.administrator.Administrator.FeedbackDetails> getGetFeedbackByIdMethod;
    if ((getGetFeedbackByIdMethod = administratorGrpc.getGetFeedbackByIdMethod) == null) {
      synchronized (administratorGrpc.class) {
        if ((getGetFeedbackByIdMethod = administratorGrpc.getGetFeedbackByIdMethod) == null) {
          administratorGrpc.getGetFeedbackByIdMethod = getGetFeedbackByIdMethod = 
              io.grpc.MethodDescriptor.<com.grpc.administrator.Administrator.UserId, com.grpc.administrator.Administrator.FeedbackDetails>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "administrator", "getFeedbackById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.administrator.Administrator.UserId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.administrator.Administrator.FeedbackDetails.getDefaultInstance()))
                  .setSchemaDescriptor(new administratorMethodDescriptorSupplier("getFeedbackById"))
                  .build();
          }
        }
     }
     return getGetFeedbackByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.administrator.Administrator.empty,
      com.grpc.administrator.Administrator.AllFeedbackDetails> getGetAllFeedbackMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllFeedback",
      requestType = com.grpc.administrator.Administrator.empty.class,
      responseType = com.grpc.administrator.Administrator.AllFeedbackDetails.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.administrator.Administrator.empty,
      com.grpc.administrator.Administrator.AllFeedbackDetails> getGetAllFeedbackMethod() {
    io.grpc.MethodDescriptor<com.grpc.administrator.Administrator.empty, com.grpc.administrator.Administrator.AllFeedbackDetails> getGetAllFeedbackMethod;
    if ((getGetAllFeedbackMethod = administratorGrpc.getGetAllFeedbackMethod) == null) {
      synchronized (administratorGrpc.class) {
        if ((getGetAllFeedbackMethod = administratorGrpc.getGetAllFeedbackMethod) == null) {
          administratorGrpc.getGetAllFeedbackMethod = getGetAllFeedbackMethod = 
              io.grpc.MethodDescriptor.<com.grpc.administrator.Administrator.empty, com.grpc.administrator.Administrator.AllFeedbackDetails>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "administrator", "getAllFeedback"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.administrator.Administrator.empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.administrator.Administrator.AllFeedbackDetails.getDefaultInstance()))
                  .setSchemaDescriptor(new administratorMethodDescriptorSupplier("getAllFeedback"))
                  .build();
          }
        }
     }
     return getGetAllFeedbackMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.administrator.Administrator.UserId,
      com.grpc.administrator.Administrator.APIResponse> getDeleteFeedbackByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteFeedbackById",
      requestType = com.grpc.administrator.Administrator.UserId.class,
      responseType = com.grpc.administrator.Administrator.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.administrator.Administrator.UserId,
      com.grpc.administrator.Administrator.APIResponse> getDeleteFeedbackByIdMethod() {
    io.grpc.MethodDescriptor<com.grpc.administrator.Administrator.UserId, com.grpc.administrator.Administrator.APIResponse> getDeleteFeedbackByIdMethod;
    if ((getDeleteFeedbackByIdMethod = administratorGrpc.getDeleteFeedbackByIdMethod) == null) {
      synchronized (administratorGrpc.class) {
        if ((getDeleteFeedbackByIdMethod = administratorGrpc.getDeleteFeedbackByIdMethod) == null) {
          administratorGrpc.getDeleteFeedbackByIdMethod = getDeleteFeedbackByIdMethod = 
              io.grpc.MethodDescriptor.<com.grpc.administrator.Administrator.UserId, com.grpc.administrator.Administrator.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "administrator", "DeleteFeedbackById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.administrator.Administrator.UserId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.administrator.Administrator.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new administratorMethodDescriptorSupplier("DeleteFeedbackById"))
                  .build();
          }
        }
     }
     return getDeleteFeedbackByIdMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static administratorStub newStub(io.grpc.Channel channel) {
    return new administratorStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static administratorBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new administratorBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static administratorFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new administratorFutureStub(channel);
  }

  /**
   */
  public static abstract class administratorImplBase implements io.grpc.BindableService {

    /**
     */
    public void login(com.grpc.administrator.Administrator.AdminLogin request,
        io.grpc.stub.StreamObserver<com.grpc.administrator.Administrator.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLoginMethod(), responseObserver);
    }

    /**
     */
    public void getUserById(com.grpc.administrator.Administrator.UserId request,
        io.grpc.stub.StreamObserver<com.grpc.administrator.Administrator.AllUserDetails> responseObserver) {
      asyncUnimplementedUnaryCall(getGetUserByIdMethod(), responseObserver);
    }

    /**
     */
    public void getAllUser(com.grpc.administrator.Administrator.empty request,
        io.grpc.stub.StreamObserver<com.grpc.administrator.Administrator.AllUserDetails> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllUserMethod(), responseObserver);
    }

    /**
     */
    public void getUsersByUserType(com.grpc.administrator.Administrator.UserType request,
        io.grpc.stub.StreamObserver<com.grpc.administrator.Administrator.AllUserDetails> responseObserver) {
      asyncUnimplementedUnaryCall(getGetUsersByUserTypeMethod(), responseObserver);
    }

    /**
     */
    public void deleteUser(com.grpc.administrator.Administrator.deleteByUserId request,
        io.grpc.stub.StreamObserver<com.grpc.administrator.Administrator.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteUserMethod(), responseObserver);
    }

    /**
     */
    public void getFeedbackById(com.grpc.administrator.Administrator.UserId request,
        io.grpc.stub.StreamObserver<com.grpc.administrator.Administrator.FeedbackDetails> responseObserver) {
      asyncUnimplementedUnaryCall(getGetFeedbackByIdMethod(), responseObserver);
    }

    /**
     */
    public void getAllFeedback(com.grpc.administrator.Administrator.empty request,
        io.grpc.stub.StreamObserver<com.grpc.administrator.Administrator.AllFeedbackDetails> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllFeedbackMethod(), responseObserver);
    }

    /**
     */
    public void deleteFeedbackById(com.grpc.administrator.Administrator.UserId request,
        io.grpc.stub.StreamObserver<com.grpc.administrator.Administrator.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteFeedbackByIdMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getLoginMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.administrator.Administrator.AdminLogin,
                com.grpc.administrator.Administrator.APIResponse>(
                  this, METHODID_LOGIN)))
          .addMethod(
            getGetUserByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.administrator.Administrator.UserId,
                com.grpc.administrator.Administrator.AllUserDetails>(
                  this, METHODID_GET_USER_BY_ID)))
          .addMethod(
            getGetAllUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.administrator.Administrator.empty,
                com.grpc.administrator.Administrator.AllUserDetails>(
                  this, METHODID_GET_ALL_USER)))
          .addMethod(
            getGetUsersByUserTypeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.administrator.Administrator.UserType,
                com.grpc.administrator.Administrator.AllUserDetails>(
                  this, METHODID_GET_USERS_BY_USER_TYPE)))
          .addMethod(
            getDeleteUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.administrator.Administrator.deleteByUserId,
                com.grpc.administrator.Administrator.APIResponse>(
                  this, METHODID_DELETE_USER)))
          .addMethod(
            getGetFeedbackByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.administrator.Administrator.UserId,
                com.grpc.administrator.Administrator.FeedbackDetails>(
                  this, METHODID_GET_FEEDBACK_BY_ID)))
          .addMethod(
            getGetAllFeedbackMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.administrator.Administrator.empty,
                com.grpc.administrator.Administrator.AllFeedbackDetails>(
                  this, METHODID_GET_ALL_FEEDBACK)))
          .addMethod(
            getDeleteFeedbackByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.administrator.Administrator.UserId,
                com.grpc.administrator.Administrator.APIResponse>(
                  this, METHODID_DELETE_FEEDBACK_BY_ID)))
          .build();
    }
  }

  /**
   */
  public static final class administratorStub extends io.grpc.stub.AbstractStub<administratorStub> {
    private administratorStub(io.grpc.Channel channel) {
      super(channel);
    }

    private administratorStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected administratorStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new administratorStub(channel, callOptions);
    }

    /**
     */
    public void login(com.grpc.administrator.Administrator.AdminLogin request,
        io.grpc.stub.StreamObserver<com.grpc.administrator.Administrator.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUserById(com.grpc.administrator.Administrator.UserId request,
        io.grpc.stub.StreamObserver<com.grpc.administrator.Administrator.AllUserDetails> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetUserByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllUser(com.grpc.administrator.Administrator.empty request,
        io.grpc.stub.StreamObserver<com.grpc.administrator.Administrator.AllUserDetails> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUsersByUserType(com.grpc.administrator.Administrator.UserType request,
        io.grpc.stub.StreamObserver<com.grpc.administrator.Administrator.AllUserDetails> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetUsersByUserTypeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteUser(com.grpc.administrator.Administrator.deleteByUserId request,
        io.grpc.stub.StreamObserver<com.grpc.administrator.Administrator.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getFeedbackById(com.grpc.administrator.Administrator.UserId request,
        io.grpc.stub.StreamObserver<com.grpc.administrator.Administrator.FeedbackDetails> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetFeedbackByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllFeedback(com.grpc.administrator.Administrator.empty request,
        io.grpc.stub.StreamObserver<com.grpc.administrator.Administrator.AllFeedbackDetails> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllFeedbackMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteFeedbackById(com.grpc.administrator.Administrator.UserId request,
        io.grpc.stub.StreamObserver<com.grpc.administrator.Administrator.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteFeedbackByIdMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class administratorBlockingStub extends io.grpc.stub.AbstractStub<administratorBlockingStub> {
    private administratorBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private administratorBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected administratorBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new administratorBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.grpc.administrator.Administrator.APIResponse login(com.grpc.administrator.Administrator.AdminLogin request) {
      return blockingUnaryCall(
          getChannel(), getLoginMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.administrator.Administrator.AllUserDetails getUserById(com.grpc.administrator.Administrator.UserId request) {
      return blockingUnaryCall(
          getChannel(), getGetUserByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.administrator.Administrator.AllUserDetails getAllUser(com.grpc.administrator.Administrator.empty request) {
      return blockingUnaryCall(
          getChannel(), getGetAllUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.administrator.Administrator.AllUserDetails getUsersByUserType(com.grpc.administrator.Administrator.UserType request) {
      return blockingUnaryCall(
          getChannel(), getGetUsersByUserTypeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.administrator.Administrator.APIResponse deleteUser(com.grpc.administrator.Administrator.deleteByUserId request) {
      return blockingUnaryCall(
          getChannel(), getDeleteUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.administrator.Administrator.FeedbackDetails getFeedbackById(com.grpc.administrator.Administrator.UserId request) {
      return blockingUnaryCall(
          getChannel(), getGetFeedbackByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.administrator.Administrator.AllFeedbackDetails getAllFeedback(com.grpc.administrator.Administrator.empty request) {
      return blockingUnaryCall(
          getChannel(), getGetAllFeedbackMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.administrator.Administrator.APIResponse deleteFeedbackById(com.grpc.administrator.Administrator.UserId request) {
      return blockingUnaryCall(
          getChannel(), getDeleteFeedbackByIdMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class administratorFutureStub extends io.grpc.stub.AbstractStub<administratorFutureStub> {
    private administratorFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private administratorFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected administratorFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new administratorFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.administrator.Administrator.APIResponse> login(
        com.grpc.administrator.Administrator.AdminLogin request) {
      return futureUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.administrator.Administrator.AllUserDetails> getUserById(
        com.grpc.administrator.Administrator.UserId request) {
      return futureUnaryCall(
          getChannel().newCall(getGetUserByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.administrator.Administrator.AllUserDetails> getAllUser(
        com.grpc.administrator.Administrator.empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.administrator.Administrator.AllUserDetails> getUsersByUserType(
        com.grpc.administrator.Administrator.UserType request) {
      return futureUnaryCall(
          getChannel().newCall(getGetUsersByUserTypeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.administrator.Administrator.APIResponse> deleteUser(
        com.grpc.administrator.Administrator.deleteByUserId request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.administrator.Administrator.FeedbackDetails> getFeedbackById(
        com.grpc.administrator.Administrator.UserId request) {
      return futureUnaryCall(
          getChannel().newCall(getGetFeedbackByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.administrator.Administrator.AllFeedbackDetails> getAllFeedback(
        com.grpc.administrator.Administrator.empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllFeedbackMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.administrator.Administrator.APIResponse> deleteFeedbackById(
        com.grpc.administrator.Administrator.UserId request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteFeedbackByIdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LOGIN = 0;
  private static final int METHODID_GET_USER_BY_ID = 1;
  private static final int METHODID_GET_ALL_USER = 2;
  private static final int METHODID_GET_USERS_BY_USER_TYPE = 3;
  private static final int METHODID_DELETE_USER = 4;
  private static final int METHODID_GET_FEEDBACK_BY_ID = 5;
  private static final int METHODID_GET_ALL_FEEDBACK = 6;
  private static final int METHODID_DELETE_FEEDBACK_BY_ID = 7;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final administratorImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(administratorImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LOGIN:
          serviceImpl.login((com.grpc.administrator.Administrator.AdminLogin) request,
              (io.grpc.stub.StreamObserver<com.grpc.administrator.Administrator.APIResponse>) responseObserver);
          break;
        case METHODID_GET_USER_BY_ID:
          serviceImpl.getUserById((com.grpc.administrator.Administrator.UserId) request,
              (io.grpc.stub.StreamObserver<com.grpc.administrator.Administrator.AllUserDetails>) responseObserver);
          break;
        case METHODID_GET_ALL_USER:
          serviceImpl.getAllUser((com.grpc.administrator.Administrator.empty) request,
              (io.grpc.stub.StreamObserver<com.grpc.administrator.Administrator.AllUserDetails>) responseObserver);
          break;
        case METHODID_GET_USERS_BY_USER_TYPE:
          serviceImpl.getUsersByUserType((com.grpc.administrator.Administrator.UserType) request,
              (io.grpc.stub.StreamObserver<com.grpc.administrator.Administrator.AllUserDetails>) responseObserver);
          break;
        case METHODID_DELETE_USER:
          serviceImpl.deleteUser((com.grpc.administrator.Administrator.deleteByUserId) request,
              (io.grpc.stub.StreamObserver<com.grpc.administrator.Administrator.APIResponse>) responseObserver);
          break;
        case METHODID_GET_FEEDBACK_BY_ID:
          serviceImpl.getFeedbackById((com.grpc.administrator.Administrator.UserId) request,
              (io.grpc.stub.StreamObserver<com.grpc.administrator.Administrator.FeedbackDetails>) responseObserver);
          break;
        case METHODID_GET_ALL_FEEDBACK:
          serviceImpl.getAllFeedback((com.grpc.administrator.Administrator.empty) request,
              (io.grpc.stub.StreamObserver<com.grpc.administrator.Administrator.AllFeedbackDetails>) responseObserver);
          break;
        case METHODID_DELETE_FEEDBACK_BY_ID:
          serviceImpl.deleteFeedbackById((com.grpc.administrator.Administrator.UserId) request,
              (io.grpc.stub.StreamObserver<com.grpc.administrator.Administrator.APIResponse>) responseObserver);
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

  private static abstract class administratorBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    administratorBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.grpc.administrator.Administrator.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("administrator");
    }
  }

  private static final class administratorFileDescriptorSupplier
      extends administratorBaseDescriptorSupplier {
    administratorFileDescriptorSupplier() {}
  }

  private static final class administratorMethodDescriptorSupplier
      extends administratorBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    administratorMethodDescriptorSupplier(String methodName) {
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
      synchronized (administratorGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new administratorFileDescriptorSupplier())
              .addMethod(getLoginMethod())
              .addMethod(getGetUserByIdMethod())
              .addMethod(getGetAllUserMethod())
              .addMethod(getGetUsersByUserTypeMethod())
              .addMethod(getDeleteUserMethod())
              .addMethod(getGetFeedbackByIdMethod())
              .addMethod(getGetAllFeedbackMethod())
              .addMethod(getDeleteFeedbackByIdMethod())
              .build();
        }
      }
    }
    return result;
  }
}
