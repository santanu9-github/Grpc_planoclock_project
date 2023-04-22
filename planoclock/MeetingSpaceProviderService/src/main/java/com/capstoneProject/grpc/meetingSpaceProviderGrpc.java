package com.capstoneProject.grpc;

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
    comments = "Source: spaceProvider.proto")
public final class meetingSpaceProviderGrpc {

  private meetingSpaceProviderGrpc() {}

  public static final String SERVICE_NAME = "meetingSpaceProvider";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.capstoneProject.grpc.SpaceProvider.AddingRoomRequest,
      com.capstoneProject.grpc.SpaceProvider.APIResponse> getAddRoomMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addRoom",
      requestType = com.capstoneProject.grpc.SpaceProvider.AddingRoomRequest.class,
      responseType = com.capstoneProject.grpc.SpaceProvider.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.capstoneProject.grpc.SpaceProvider.AddingRoomRequest,
      com.capstoneProject.grpc.SpaceProvider.APIResponse> getAddRoomMethod() {
    io.grpc.MethodDescriptor<com.capstoneProject.grpc.SpaceProvider.AddingRoomRequest, com.capstoneProject.grpc.SpaceProvider.APIResponse> getAddRoomMethod;
    if ((getAddRoomMethod = meetingSpaceProviderGrpc.getAddRoomMethod) == null) {
      synchronized (meetingSpaceProviderGrpc.class) {
        if ((getAddRoomMethod = meetingSpaceProviderGrpc.getAddRoomMethod) == null) {
          meetingSpaceProviderGrpc.getAddRoomMethod = getAddRoomMethod = 
              io.grpc.MethodDescriptor.<com.capstoneProject.grpc.SpaceProvider.AddingRoomRequest, com.capstoneProject.grpc.SpaceProvider.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "meetingSpaceProvider", "addRoom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.capstoneProject.grpc.SpaceProvider.AddingRoomRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.capstoneProject.grpc.SpaceProvider.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new meetingSpaceProviderMethodDescriptorSupplier("addRoom"))
                  .build();
          }
        }
     }
     return getAddRoomMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.capstoneProject.grpc.SpaceProvider.EditRoomRequest,
      com.capstoneProject.grpc.SpaceProvider.APIResponse> getEditRoomMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "editRoom",
      requestType = com.capstoneProject.grpc.SpaceProvider.EditRoomRequest.class,
      responseType = com.capstoneProject.grpc.SpaceProvider.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.capstoneProject.grpc.SpaceProvider.EditRoomRequest,
      com.capstoneProject.grpc.SpaceProvider.APIResponse> getEditRoomMethod() {
    io.grpc.MethodDescriptor<com.capstoneProject.grpc.SpaceProvider.EditRoomRequest, com.capstoneProject.grpc.SpaceProvider.APIResponse> getEditRoomMethod;
    if ((getEditRoomMethod = meetingSpaceProviderGrpc.getEditRoomMethod) == null) {
      synchronized (meetingSpaceProviderGrpc.class) {
        if ((getEditRoomMethod = meetingSpaceProviderGrpc.getEditRoomMethod) == null) {
          meetingSpaceProviderGrpc.getEditRoomMethod = getEditRoomMethod = 
              io.grpc.MethodDescriptor.<com.capstoneProject.grpc.SpaceProvider.EditRoomRequest, com.capstoneProject.grpc.SpaceProvider.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "meetingSpaceProvider", "editRoom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.capstoneProject.grpc.SpaceProvider.EditRoomRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.capstoneProject.grpc.SpaceProvider.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new meetingSpaceProviderMethodDescriptorSupplier("editRoom"))
                  .build();
          }
        }
     }
     return getEditRoomMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.capstoneProject.grpc.SpaceProvider.DeleteRoomRequest,
      com.capstoneProject.grpc.SpaceProvider.APIResponse> getDeleteRoomMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteRoom",
      requestType = com.capstoneProject.grpc.SpaceProvider.DeleteRoomRequest.class,
      responseType = com.capstoneProject.grpc.SpaceProvider.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.capstoneProject.grpc.SpaceProvider.DeleteRoomRequest,
      com.capstoneProject.grpc.SpaceProvider.APIResponse> getDeleteRoomMethod() {
    io.grpc.MethodDescriptor<com.capstoneProject.grpc.SpaceProvider.DeleteRoomRequest, com.capstoneProject.grpc.SpaceProvider.APIResponse> getDeleteRoomMethod;
    if ((getDeleteRoomMethod = meetingSpaceProviderGrpc.getDeleteRoomMethod) == null) {
      synchronized (meetingSpaceProviderGrpc.class) {
        if ((getDeleteRoomMethod = meetingSpaceProviderGrpc.getDeleteRoomMethod) == null) {
          meetingSpaceProviderGrpc.getDeleteRoomMethod = getDeleteRoomMethod = 
              io.grpc.MethodDescriptor.<com.capstoneProject.grpc.SpaceProvider.DeleteRoomRequest, com.capstoneProject.grpc.SpaceProvider.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "meetingSpaceProvider", "deleteRoom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.capstoneProject.grpc.SpaceProvider.DeleteRoomRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.capstoneProject.grpc.SpaceProvider.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new meetingSpaceProviderMethodDescriptorSupplier("deleteRoom"))
                  .build();
          }
        }
     }
     return getDeleteRoomMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.capstoneProject.grpc.SpaceProvider.ViewAllRoomRequest,
      com.capstoneProject.grpc.SpaceProvider.APIResponse> getGetAllRoomMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllRoom",
      requestType = com.capstoneProject.grpc.SpaceProvider.ViewAllRoomRequest.class,
      responseType = com.capstoneProject.grpc.SpaceProvider.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.capstoneProject.grpc.SpaceProvider.ViewAllRoomRequest,
      com.capstoneProject.grpc.SpaceProvider.APIResponse> getGetAllRoomMethod() {
    io.grpc.MethodDescriptor<com.capstoneProject.grpc.SpaceProvider.ViewAllRoomRequest, com.capstoneProject.grpc.SpaceProvider.APIResponse> getGetAllRoomMethod;
    if ((getGetAllRoomMethod = meetingSpaceProviderGrpc.getGetAllRoomMethod) == null) {
      synchronized (meetingSpaceProviderGrpc.class) {
        if ((getGetAllRoomMethod = meetingSpaceProviderGrpc.getGetAllRoomMethod) == null) {
          meetingSpaceProviderGrpc.getGetAllRoomMethod = getGetAllRoomMethod = 
              io.grpc.MethodDescriptor.<com.capstoneProject.grpc.SpaceProvider.ViewAllRoomRequest, com.capstoneProject.grpc.SpaceProvider.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "meetingSpaceProvider", "getAllRoom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.capstoneProject.grpc.SpaceProvider.ViewAllRoomRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.capstoneProject.grpc.SpaceProvider.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new meetingSpaceProviderMethodDescriptorSupplier("getAllRoom"))
                  .build();
          }
        }
     }
     return getGetAllRoomMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static meetingSpaceProviderStub newStub(io.grpc.Channel channel) {
    return new meetingSpaceProviderStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static meetingSpaceProviderBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new meetingSpaceProviderBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static meetingSpaceProviderFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new meetingSpaceProviderFutureStub(channel);
  }

  /**
   */
  public static abstract class meetingSpaceProviderImplBase implements io.grpc.BindableService {

    /**
     */
    public void addRoom(com.capstoneProject.grpc.SpaceProvider.AddingRoomRequest request,
        io.grpc.stub.StreamObserver<com.capstoneProject.grpc.SpaceProvider.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddRoomMethod(), responseObserver);
    }

    /**
     */
    public void editRoom(com.capstoneProject.grpc.SpaceProvider.EditRoomRequest request,
        io.grpc.stub.StreamObserver<com.capstoneProject.grpc.SpaceProvider.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getEditRoomMethod(), responseObserver);
    }

    /**
     */
    public void deleteRoom(com.capstoneProject.grpc.SpaceProvider.DeleteRoomRequest request,
        io.grpc.stub.StreamObserver<com.capstoneProject.grpc.SpaceProvider.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteRoomMethod(), responseObserver);
    }

    /**
     */
    public void getAllRoom(com.capstoneProject.grpc.SpaceProvider.ViewAllRoomRequest request,
        io.grpc.stub.StreamObserver<com.capstoneProject.grpc.SpaceProvider.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllRoomMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddRoomMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.capstoneProject.grpc.SpaceProvider.AddingRoomRequest,
                com.capstoneProject.grpc.SpaceProvider.APIResponse>(
                  this, METHODID_ADD_ROOM)))
          .addMethod(
            getEditRoomMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.capstoneProject.grpc.SpaceProvider.EditRoomRequest,
                com.capstoneProject.grpc.SpaceProvider.APIResponse>(
                  this, METHODID_EDIT_ROOM)))
          .addMethod(
            getDeleteRoomMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.capstoneProject.grpc.SpaceProvider.DeleteRoomRequest,
                com.capstoneProject.grpc.SpaceProvider.APIResponse>(
                  this, METHODID_DELETE_ROOM)))
          .addMethod(
            getGetAllRoomMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.capstoneProject.grpc.SpaceProvider.ViewAllRoomRequest,
                com.capstoneProject.grpc.SpaceProvider.APIResponse>(
                  this, METHODID_GET_ALL_ROOM)))
          .build();
    }
  }

  /**
   */
  public static final class meetingSpaceProviderStub extends io.grpc.stub.AbstractStub<meetingSpaceProviderStub> {
    private meetingSpaceProviderStub(io.grpc.Channel channel) {
      super(channel);
    }

    private meetingSpaceProviderStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected meetingSpaceProviderStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new meetingSpaceProviderStub(channel, callOptions);
    }

    /**
     */
    public void addRoom(com.capstoneProject.grpc.SpaceProvider.AddingRoomRequest request,
        io.grpc.stub.StreamObserver<com.capstoneProject.grpc.SpaceProvider.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddRoomMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void editRoom(com.capstoneProject.grpc.SpaceProvider.EditRoomRequest request,
        io.grpc.stub.StreamObserver<com.capstoneProject.grpc.SpaceProvider.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEditRoomMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteRoom(com.capstoneProject.grpc.SpaceProvider.DeleteRoomRequest request,
        io.grpc.stub.StreamObserver<com.capstoneProject.grpc.SpaceProvider.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteRoomMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllRoom(com.capstoneProject.grpc.SpaceProvider.ViewAllRoomRequest request,
        io.grpc.stub.StreamObserver<com.capstoneProject.grpc.SpaceProvider.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllRoomMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class meetingSpaceProviderBlockingStub extends io.grpc.stub.AbstractStub<meetingSpaceProviderBlockingStub> {
    private meetingSpaceProviderBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private meetingSpaceProviderBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected meetingSpaceProviderBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new meetingSpaceProviderBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.capstoneProject.grpc.SpaceProvider.APIResponse addRoom(com.capstoneProject.grpc.SpaceProvider.AddingRoomRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddRoomMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.capstoneProject.grpc.SpaceProvider.APIResponse editRoom(com.capstoneProject.grpc.SpaceProvider.EditRoomRequest request) {
      return blockingUnaryCall(
          getChannel(), getEditRoomMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.capstoneProject.grpc.SpaceProvider.APIResponse deleteRoom(com.capstoneProject.grpc.SpaceProvider.DeleteRoomRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteRoomMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.capstoneProject.grpc.SpaceProvider.APIResponse getAllRoom(com.capstoneProject.grpc.SpaceProvider.ViewAllRoomRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAllRoomMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class meetingSpaceProviderFutureStub extends io.grpc.stub.AbstractStub<meetingSpaceProviderFutureStub> {
    private meetingSpaceProviderFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private meetingSpaceProviderFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected meetingSpaceProviderFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new meetingSpaceProviderFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.capstoneProject.grpc.SpaceProvider.APIResponse> addRoom(
        com.capstoneProject.grpc.SpaceProvider.AddingRoomRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddRoomMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.capstoneProject.grpc.SpaceProvider.APIResponse> editRoom(
        com.capstoneProject.grpc.SpaceProvider.EditRoomRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getEditRoomMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.capstoneProject.grpc.SpaceProvider.APIResponse> deleteRoom(
        com.capstoneProject.grpc.SpaceProvider.DeleteRoomRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteRoomMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.capstoneProject.grpc.SpaceProvider.APIResponse> getAllRoom(
        com.capstoneProject.grpc.SpaceProvider.ViewAllRoomRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllRoomMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_ROOM = 0;
  private static final int METHODID_EDIT_ROOM = 1;
  private static final int METHODID_DELETE_ROOM = 2;
  private static final int METHODID_GET_ALL_ROOM = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final meetingSpaceProviderImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(meetingSpaceProviderImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_ROOM:
          serviceImpl.addRoom((com.capstoneProject.grpc.SpaceProvider.AddingRoomRequest) request,
              (io.grpc.stub.StreamObserver<com.capstoneProject.grpc.SpaceProvider.APIResponse>) responseObserver);
          break;
        case METHODID_EDIT_ROOM:
          serviceImpl.editRoom((com.capstoneProject.grpc.SpaceProvider.EditRoomRequest) request,
              (io.grpc.stub.StreamObserver<com.capstoneProject.grpc.SpaceProvider.APIResponse>) responseObserver);
          break;
        case METHODID_DELETE_ROOM:
          serviceImpl.deleteRoom((com.capstoneProject.grpc.SpaceProvider.DeleteRoomRequest) request,
              (io.grpc.stub.StreamObserver<com.capstoneProject.grpc.SpaceProvider.APIResponse>) responseObserver);
          break;
        case METHODID_GET_ALL_ROOM:
          serviceImpl.getAllRoom((com.capstoneProject.grpc.SpaceProvider.ViewAllRoomRequest) request,
              (io.grpc.stub.StreamObserver<com.capstoneProject.grpc.SpaceProvider.APIResponse>) responseObserver);
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

  private static abstract class meetingSpaceProviderBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    meetingSpaceProviderBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.capstoneProject.grpc.SpaceProvider.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("meetingSpaceProvider");
    }
  }

  private static final class meetingSpaceProviderFileDescriptorSupplier
      extends meetingSpaceProviderBaseDescriptorSupplier {
    meetingSpaceProviderFileDescriptorSupplier() {}
  }

  private static final class meetingSpaceProviderMethodDescriptorSupplier
      extends meetingSpaceProviderBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    meetingSpaceProviderMethodDescriptorSupplier(String methodName) {
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
      synchronized (meetingSpaceProviderGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new meetingSpaceProviderFileDescriptorSupplier())
              .addMethod(getAddRoomMethod())
              .addMethod(getEditRoomMethod())
              .addMethod(getDeleteRoomMethod())
              .addMethod(getGetAllRoomMethod())
              .build();
        }
      }
    }
    return result;
  }
}
