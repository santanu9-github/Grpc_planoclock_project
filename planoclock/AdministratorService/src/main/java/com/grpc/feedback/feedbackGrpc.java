package com.grpc.feedback;

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
    comments = "Source: feedback.proto")
public final class feedbackGrpc {

  private feedbackGrpc() {}

  public static final String SERVICE_NAME = "feedback";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.grpc.feedback.Feedback.feedMessage,
      com.grpc.feedback.Feedback.APIResponse> getAddFeedbackMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addFeedback",
      requestType = com.grpc.feedback.Feedback.feedMessage.class,
      responseType = com.grpc.feedback.Feedback.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.feedback.Feedback.feedMessage,
      com.grpc.feedback.Feedback.APIResponse> getAddFeedbackMethod() {
    io.grpc.MethodDescriptor<com.grpc.feedback.Feedback.feedMessage, com.grpc.feedback.Feedback.APIResponse> getAddFeedbackMethod;
    if ((getAddFeedbackMethod = feedbackGrpc.getAddFeedbackMethod) == null) {
      synchronized (feedbackGrpc.class) {
        if ((getAddFeedbackMethod = feedbackGrpc.getAddFeedbackMethod) == null) {
          feedbackGrpc.getAddFeedbackMethod = getAddFeedbackMethod = 
              io.grpc.MethodDescriptor.<com.grpc.feedback.Feedback.feedMessage, com.grpc.feedback.Feedback.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "feedback", "addFeedback"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.feedback.Feedback.feedMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.feedback.Feedback.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new feedbackMethodDescriptorSupplier("addFeedback"))
                  .build();
          }
        }
     }
     return getAddFeedbackMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.feedback.Feedback.updateFeedback,
      com.grpc.feedback.Feedback.APIResponse> getUpdateFeedbackByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateFeedbackById",
      requestType = com.grpc.feedback.Feedback.updateFeedback.class,
      responseType = com.grpc.feedback.Feedback.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.feedback.Feedback.updateFeedback,
      com.grpc.feedback.Feedback.APIResponse> getUpdateFeedbackByIdMethod() {
    io.grpc.MethodDescriptor<com.grpc.feedback.Feedback.updateFeedback, com.grpc.feedback.Feedback.APIResponse> getUpdateFeedbackByIdMethod;
    if ((getUpdateFeedbackByIdMethod = feedbackGrpc.getUpdateFeedbackByIdMethod) == null) {
      synchronized (feedbackGrpc.class) {
        if ((getUpdateFeedbackByIdMethod = feedbackGrpc.getUpdateFeedbackByIdMethod) == null) {
          feedbackGrpc.getUpdateFeedbackByIdMethod = getUpdateFeedbackByIdMethod = 
              io.grpc.MethodDescriptor.<com.grpc.feedback.Feedback.updateFeedback, com.grpc.feedback.Feedback.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "feedback", "updateFeedbackById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.feedback.Feedback.updateFeedback.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.feedback.Feedback.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new feedbackMethodDescriptorSupplier("updateFeedbackById"))
                  .build();
          }
        }
     }
     return getUpdateFeedbackByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.feedback.Feedback.FeedbackID,
      com.grpc.feedback.Feedback.APIResponse> getDeleteFeedbackByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteFeedbackById",
      requestType = com.grpc.feedback.Feedback.FeedbackID.class,
      responseType = com.grpc.feedback.Feedback.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.feedback.Feedback.FeedbackID,
      com.grpc.feedback.Feedback.APIResponse> getDeleteFeedbackByIdMethod() {
    io.grpc.MethodDescriptor<com.grpc.feedback.Feedback.FeedbackID, com.grpc.feedback.Feedback.APIResponse> getDeleteFeedbackByIdMethod;
    if ((getDeleteFeedbackByIdMethod = feedbackGrpc.getDeleteFeedbackByIdMethod) == null) {
      synchronized (feedbackGrpc.class) {
        if ((getDeleteFeedbackByIdMethod = feedbackGrpc.getDeleteFeedbackByIdMethod) == null) {
          feedbackGrpc.getDeleteFeedbackByIdMethod = getDeleteFeedbackByIdMethod = 
              io.grpc.MethodDescriptor.<com.grpc.feedback.Feedback.FeedbackID, com.grpc.feedback.Feedback.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "feedback", "deleteFeedbackById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.feedback.Feedback.FeedbackID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.feedback.Feedback.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new feedbackMethodDescriptorSupplier("deleteFeedbackById"))
                  .build();
          }
        }
     }
     return getDeleteFeedbackByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.feedback.Feedback.empty,
      com.grpc.feedback.Feedback.AllFeedbackResponse> getGetAllFeedbackMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllFeedback",
      requestType = com.grpc.feedback.Feedback.empty.class,
      responseType = com.grpc.feedback.Feedback.AllFeedbackResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.feedback.Feedback.empty,
      com.grpc.feedback.Feedback.AllFeedbackResponse> getGetAllFeedbackMethod() {
    io.grpc.MethodDescriptor<com.grpc.feedback.Feedback.empty, com.grpc.feedback.Feedback.AllFeedbackResponse> getGetAllFeedbackMethod;
    if ((getGetAllFeedbackMethod = feedbackGrpc.getGetAllFeedbackMethod) == null) {
      synchronized (feedbackGrpc.class) {
        if ((getGetAllFeedbackMethod = feedbackGrpc.getGetAllFeedbackMethod) == null) {
          feedbackGrpc.getGetAllFeedbackMethod = getGetAllFeedbackMethod = 
              io.grpc.MethodDescriptor.<com.grpc.feedback.Feedback.empty, com.grpc.feedback.Feedback.AllFeedbackResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "feedback", "getAllFeedback"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.feedback.Feedback.empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.feedback.Feedback.AllFeedbackResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new feedbackMethodDescriptorSupplier("getAllFeedback"))
                  .build();
          }
        }
     }
     return getGetAllFeedbackMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static feedbackStub newStub(io.grpc.Channel channel) {
    return new feedbackStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static feedbackBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new feedbackBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static feedbackFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new feedbackFutureStub(channel);
  }

  /**
   */
  public static abstract class feedbackImplBase implements io.grpc.BindableService {

    /**
     */
    public void addFeedback(com.grpc.feedback.Feedback.feedMessage request,
        io.grpc.stub.StreamObserver<com.grpc.feedback.Feedback.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddFeedbackMethod(), responseObserver);
    }

    /**
     */
    public void updateFeedbackById(com.grpc.feedback.Feedback.updateFeedback request,
        io.grpc.stub.StreamObserver<com.grpc.feedback.Feedback.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateFeedbackByIdMethod(), responseObserver);
    }

    /**
     */
    public void deleteFeedbackById(com.grpc.feedback.Feedback.FeedbackID request,
        io.grpc.stub.StreamObserver<com.grpc.feedback.Feedback.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteFeedbackByIdMethod(), responseObserver);
    }

    /**
     */
    public void getAllFeedback(com.grpc.feedback.Feedback.empty request,
        io.grpc.stub.StreamObserver<com.grpc.feedback.Feedback.AllFeedbackResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllFeedbackMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddFeedbackMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.feedback.Feedback.feedMessage,
                com.grpc.feedback.Feedback.APIResponse>(
                  this, METHODID_ADD_FEEDBACK)))
          .addMethod(
            getUpdateFeedbackByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.feedback.Feedback.updateFeedback,
                com.grpc.feedback.Feedback.APIResponse>(
                  this, METHODID_UPDATE_FEEDBACK_BY_ID)))
          .addMethod(
            getDeleteFeedbackByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.feedback.Feedback.FeedbackID,
                com.grpc.feedback.Feedback.APIResponse>(
                  this, METHODID_DELETE_FEEDBACK_BY_ID)))
          .addMethod(
            getGetAllFeedbackMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.feedback.Feedback.empty,
                com.grpc.feedback.Feedback.AllFeedbackResponse>(
                  this, METHODID_GET_ALL_FEEDBACK)))
          .build();
    }
  }

  /**
   */
  public static final class feedbackStub extends io.grpc.stub.AbstractStub<feedbackStub> {
    private feedbackStub(io.grpc.Channel channel) {
      super(channel);
    }

    private feedbackStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected feedbackStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new feedbackStub(channel, callOptions);
    }

    /**
     */
    public void addFeedback(com.grpc.feedback.Feedback.feedMessage request,
        io.grpc.stub.StreamObserver<com.grpc.feedback.Feedback.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddFeedbackMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateFeedbackById(com.grpc.feedback.Feedback.updateFeedback request,
        io.grpc.stub.StreamObserver<com.grpc.feedback.Feedback.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateFeedbackByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteFeedbackById(com.grpc.feedback.Feedback.FeedbackID request,
        io.grpc.stub.StreamObserver<com.grpc.feedback.Feedback.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteFeedbackByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllFeedback(com.grpc.feedback.Feedback.empty request,
        io.grpc.stub.StreamObserver<com.grpc.feedback.Feedback.AllFeedbackResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllFeedbackMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class feedbackBlockingStub extends io.grpc.stub.AbstractStub<feedbackBlockingStub> {
    private feedbackBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private feedbackBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected feedbackBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new feedbackBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.grpc.feedback.Feedback.APIResponse addFeedback(com.grpc.feedback.Feedback.feedMessage request) {
      return blockingUnaryCall(
          getChannel(), getAddFeedbackMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.feedback.Feedback.APIResponse updateFeedbackById(com.grpc.feedback.Feedback.updateFeedback request) {
      return blockingUnaryCall(
          getChannel(), getUpdateFeedbackByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.feedback.Feedback.APIResponse deleteFeedbackById(com.grpc.feedback.Feedback.FeedbackID request) {
      return blockingUnaryCall(
          getChannel(), getDeleteFeedbackByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.feedback.Feedback.AllFeedbackResponse getAllFeedback(com.grpc.feedback.Feedback.empty request) {
      return blockingUnaryCall(
          getChannel(), getGetAllFeedbackMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class feedbackFutureStub extends io.grpc.stub.AbstractStub<feedbackFutureStub> {
    private feedbackFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private feedbackFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected feedbackFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new feedbackFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.feedback.Feedback.APIResponse> addFeedback(
        com.grpc.feedback.Feedback.feedMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getAddFeedbackMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.feedback.Feedback.APIResponse> updateFeedbackById(
        com.grpc.feedback.Feedback.updateFeedback request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateFeedbackByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.feedback.Feedback.APIResponse> deleteFeedbackById(
        com.grpc.feedback.Feedback.FeedbackID request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteFeedbackByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.feedback.Feedback.AllFeedbackResponse> getAllFeedback(
        com.grpc.feedback.Feedback.empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllFeedbackMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_FEEDBACK = 0;
  private static final int METHODID_UPDATE_FEEDBACK_BY_ID = 1;
  private static final int METHODID_DELETE_FEEDBACK_BY_ID = 2;
  private static final int METHODID_GET_ALL_FEEDBACK = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final feedbackImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(feedbackImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_FEEDBACK:
          serviceImpl.addFeedback((com.grpc.feedback.Feedback.feedMessage) request,
              (io.grpc.stub.StreamObserver<com.grpc.feedback.Feedback.APIResponse>) responseObserver);
          break;
        case METHODID_UPDATE_FEEDBACK_BY_ID:
          serviceImpl.updateFeedbackById((com.grpc.feedback.Feedback.updateFeedback) request,
              (io.grpc.stub.StreamObserver<com.grpc.feedback.Feedback.APIResponse>) responseObserver);
          break;
        case METHODID_DELETE_FEEDBACK_BY_ID:
          serviceImpl.deleteFeedbackById((com.grpc.feedback.Feedback.FeedbackID) request,
              (io.grpc.stub.StreamObserver<com.grpc.feedback.Feedback.APIResponse>) responseObserver);
          break;
        case METHODID_GET_ALL_FEEDBACK:
          serviceImpl.getAllFeedback((com.grpc.feedback.Feedback.empty) request,
              (io.grpc.stub.StreamObserver<com.grpc.feedback.Feedback.AllFeedbackResponse>) responseObserver);
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

  private static abstract class feedbackBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    feedbackBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.grpc.feedback.Feedback.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("feedback");
    }
  }

  private static final class feedbackFileDescriptorSupplier
      extends feedbackBaseDescriptorSupplier {
    feedbackFileDescriptorSupplier() {}
  }

  private static final class feedbackMethodDescriptorSupplier
      extends feedbackBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    feedbackMethodDescriptorSupplier(String methodName) {
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
      synchronized (feedbackGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new feedbackFileDescriptorSupplier())
              .addMethod(getAddFeedbackMethod())
              .addMethod(getUpdateFeedbackByIdMethod())
              .addMethod(getDeleteFeedbackByIdMethod())
              .addMethod(getGetAllFeedbackMethod())
              .build();
        }
      }
    }
    return result;
  }
}
