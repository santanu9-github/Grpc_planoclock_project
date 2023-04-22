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
    comments = "Source: bookRoom.proto")
public final class bookRoomGrpc {

  private bookRoomGrpc() {}

  public static final String SERVICE_NAME = "bookRoom";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.example.BookRoom.empty,
      org.example.BookRoom.APIResponse> getViewRoomDetailsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "viewRoomDetails",
      requestType = org.example.BookRoom.empty.class,
      responseType = org.example.BookRoom.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.BookRoom.empty,
      org.example.BookRoom.APIResponse> getViewRoomDetailsMethod() {
    io.grpc.MethodDescriptor<org.example.BookRoom.empty, org.example.BookRoom.APIResponse> getViewRoomDetailsMethod;
    if ((getViewRoomDetailsMethod = bookRoomGrpc.getViewRoomDetailsMethod) == null) {
      synchronized (bookRoomGrpc.class) {
        if ((getViewRoomDetailsMethod = bookRoomGrpc.getViewRoomDetailsMethod) == null) {
          bookRoomGrpc.getViewRoomDetailsMethod = getViewRoomDetailsMethod = 
              io.grpc.MethodDescriptor.<org.example.BookRoom.empty, org.example.BookRoom.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bookRoom", "viewRoomDetails"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.BookRoom.empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.BookRoom.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new bookRoomMethodDescriptorSupplier("viewRoomDetails"))
                  .build();
          }
        }
     }
     return getViewRoomDetailsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.BookRoom.roomBook,
      org.example.BookRoom.roomBookResponse> getBookRoomMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "bookRoom",
      requestType = org.example.BookRoom.roomBook.class,
      responseType = org.example.BookRoom.roomBookResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.BookRoom.roomBook,
      org.example.BookRoom.roomBookResponse> getBookRoomMethod() {
    io.grpc.MethodDescriptor<org.example.BookRoom.roomBook, org.example.BookRoom.roomBookResponse> getBookRoomMethod;
    if ((getBookRoomMethod = bookRoomGrpc.getBookRoomMethod) == null) {
      synchronized (bookRoomGrpc.class) {
        if ((getBookRoomMethod = bookRoomGrpc.getBookRoomMethod) == null) {
          bookRoomGrpc.getBookRoomMethod = getBookRoomMethod = 
              io.grpc.MethodDescriptor.<org.example.BookRoom.roomBook, org.example.BookRoom.roomBookResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bookRoom", "bookRoom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.BookRoom.roomBook.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.BookRoom.roomBookResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new bookRoomMethodDescriptorSupplier("bookRoom"))
                  .build();
          }
        }
     }
     return getBookRoomMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.BookRoom.roomCancel,
      org.example.BookRoom.roomBookResponse> getCancelRoomMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "cancelRoom",
      requestType = org.example.BookRoom.roomCancel.class,
      responseType = org.example.BookRoom.roomBookResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.BookRoom.roomCancel,
      org.example.BookRoom.roomBookResponse> getCancelRoomMethod() {
    io.grpc.MethodDescriptor<org.example.BookRoom.roomCancel, org.example.BookRoom.roomBookResponse> getCancelRoomMethod;
    if ((getCancelRoomMethod = bookRoomGrpc.getCancelRoomMethod) == null) {
      synchronized (bookRoomGrpc.class) {
        if ((getCancelRoomMethod = bookRoomGrpc.getCancelRoomMethod) == null) {
          bookRoomGrpc.getCancelRoomMethod = getCancelRoomMethod = 
              io.grpc.MethodDescriptor.<org.example.BookRoom.roomCancel, org.example.BookRoom.roomBookResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bookRoom", "cancelRoom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.BookRoom.roomCancel.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.BookRoom.roomBookResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new bookRoomMethodDescriptorSupplier("cancelRoom"))
                  .build();
          }
        }
     }
     return getCancelRoomMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.BookRoom.userId,
      org.example.BookRoom.getAllRoomResponse> getGetAllRoomsByUserIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllRoomsByUserId",
      requestType = org.example.BookRoom.userId.class,
      responseType = org.example.BookRoom.getAllRoomResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.BookRoom.userId,
      org.example.BookRoom.getAllRoomResponse> getGetAllRoomsByUserIdMethod() {
    io.grpc.MethodDescriptor<org.example.BookRoom.userId, org.example.BookRoom.getAllRoomResponse> getGetAllRoomsByUserIdMethod;
    if ((getGetAllRoomsByUserIdMethod = bookRoomGrpc.getGetAllRoomsByUserIdMethod) == null) {
      synchronized (bookRoomGrpc.class) {
        if ((getGetAllRoomsByUserIdMethod = bookRoomGrpc.getGetAllRoomsByUserIdMethod) == null) {
          bookRoomGrpc.getGetAllRoomsByUserIdMethod = getGetAllRoomsByUserIdMethod = 
              io.grpc.MethodDescriptor.<org.example.BookRoom.userId, org.example.BookRoom.getAllRoomResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bookRoom", "getAllRoomsByUserId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.BookRoom.userId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.BookRoom.getAllRoomResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new bookRoomMethodDescriptorSupplier("getAllRoomsByUserId"))
                  .build();
          }
        }
     }
     return getGetAllRoomsByUserIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.BookRoom.rescheduleBook,
      org.example.BookRoom.roomBookResponse> getRescheduleBookingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "rescheduleBooking",
      requestType = org.example.BookRoom.rescheduleBook.class,
      responseType = org.example.BookRoom.roomBookResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.BookRoom.rescheduleBook,
      org.example.BookRoom.roomBookResponse> getRescheduleBookingMethod() {
    io.grpc.MethodDescriptor<org.example.BookRoom.rescheduleBook, org.example.BookRoom.roomBookResponse> getRescheduleBookingMethod;
    if ((getRescheduleBookingMethod = bookRoomGrpc.getRescheduleBookingMethod) == null) {
      synchronized (bookRoomGrpc.class) {
        if ((getRescheduleBookingMethod = bookRoomGrpc.getRescheduleBookingMethod) == null) {
          bookRoomGrpc.getRescheduleBookingMethod = getRescheduleBookingMethod = 
              io.grpc.MethodDescriptor.<org.example.BookRoom.rescheduleBook, org.example.BookRoom.roomBookResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bookRoom", "rescheduleBooking"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.BookRoom.rescheduleBook.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.BookRoom.roomBookResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new bookRoomMethodDescriptorSupplier("rescheduleBooking"))
                  .build();
          }
        }
     }
     return getRescheduleBookingMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static bookRoomStub newStub(io.grpc.Channel channel) {
    return new bookRoomStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static bookRoomBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new bookRoomBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static bookRoomFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new bookRoomFutureStub(channel);
  }

  /**
   */
  public static abstract class bookRoomImplBase implements io.grpc.BindableService {

    /**
     */
    public void viewRoomDetails(org.example.BookRoom.empty request,
        io.grpc.stub.StreamObserver<org.example.BookRoom.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getViewRoomDetailsMethod(), responseObserver);
    }

    /**
     */
    public void bookRoom(org.example.BookRoom.roomBook request,
        io.grpc.stub.StreamObserver<org.example.BookRoom.roomBookResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getBookRoomMethod(), responseObserver);
    }

    /**
     */
    public void cancelRoom(org.example.BookRoom.roomCancel request,
        io.grpc.stub.StreamObserver<org.example.BookRoom.roomBookResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCancelRoomMethod(), responseObserver);
    }

    /**
     */
    public void getAllRoomsByUserId(org.example.BookRoom.userId request,
        io.grpc.stub.StreamObserver<org.example.BookRoom.getAllRoomResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllRoomsByUserIdMethod(), responseObserver);
    }

    /**
     * <pre>
     *  rpc logout(empty) returns (APIResponse);
     * </pre>
     */
    public void rescheduleBooking(org.example.BookRoom.rescheduleBook request,
        io.grpc.stub.StreamObserver<org.example.BookRoom.roomBookResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRescheduleBookingMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getViewRoomDetailsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.BookRoom.empty,
                org.example.BookRoom.APIResponse>(
                  this, METHODID_VIEW_ROOM_DETAILS)))
          .addMethod(
            getBookRoomMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.BookRoom.roomBook,
                org.example.BookRoom.roomBookResponse>(
                  this, METHODID_BOOK_ROOM)))
          .addMethod(
            getCancelRoomMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.BookRoom.roomCancel,
                org.example.BookRoom.roomBookResponse>(
                  this, METHODID_CANCEL_ROOM)))
          .addMethod(
            getGetAllRoomsByUserIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.BookRoom.userId,
                org.example.BookRoom.getAllRoomResponse>(
                  this, METHODID_GET_ALL_ROOMS_BY_USER_ID)))
          .addMethod(
            getRescheduleBookingMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.BookRoom.rescheduleBook,
                org.example.BookRoom.roomBookResponse>(
                  this, METHODID_RESCHEDULE_BOOKING)))
          .build();
    }
  }

  /**
   */
  public static final class bookRoomStub extends io.grpc.stub.AbstractStub<bookRoomStub> {
    private bookRoomStub(io.grpc.Channel channel) {
      super(channel);
    }

    private bookRoomStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected bookRoomStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new bookRoomStub(channel, callOptions);
    }

    /**
     */
    public void viewRoomDetails(org.example.BookRoom.empty request,
        io.grpc.stub.StreamObserver<org.example.BookRoom.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getViewRoomDetailsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void bookRoom(org.example.BookRoom.roomBook request,
        io.grpc.stub.StreamObserver<org.example.BookRoom.roomBookResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBookRoomMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void cancelRoom(org.example.BookRoom.roomCancel request,
        io.grpc.stub.StreamObserver<org.example.BookRoom.roomBookResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCancelRoomMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllRoomsByUserId(org.example.BookRoom.userId request,
        io.grpc.stub.StreamObserver<org.example.BookRoom.getAllRoomResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllRoomsByUserIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *  rpc logout(empty) returns (APIResponse);
     * </pre>
     */
    public void rescheduleBooking(org.example.BookRoom.rescheduleBook request,
        io.grpc.stub.StreamObserver<org.example.BookRoom.roomBookResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRescheduleBookingMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class bookRoomBlockingStub extends io.grpc.stub.AbstractStub<bookRoomBlockingStub> {
    private bookRoomBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private bookRoomBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected bookRoomBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new bookRoomBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.example.BookRoom.APIResponse viewRoomDetails(org.example.BookRoom.empty request) {
      return blockingUnaryCall(
          getChannel(), getViewRoomDetailsMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.BookRoom.roomBookResponse bookRoom(org.example.BookRoom.roomBook request) {
      return blockingUnaryCall(
          getChannel(), getBookRoomMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.BookRoom.roomBookResponse cancelRoom(org.example.BookRoom.roomCancel request) {
      return blockingUnaryCall(
          getChannel(), getCancelRoomMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.BookRoom.getAllRoomResponse getAllRoomsByUserId(org.example.BookRoom.userId request) {
      return blockingUnaryCall(
          getChannel(), getGetAllRoomsByUserIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *  rpc logout(empty) returns (APIResponse);
     * </pre>
     */
    public org.example.BookRoom.roomBookResponse rescheduleBooking(org.example.BookRoom.rescheduleBook request) {
      return blockingUnaryCall(
          getChannel(), getRescheduleBookingMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class bookRoomFutureStub extends io.grpc.stub.AbstractStub<bookRoomFutureStub> {
    private bookRoomFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private bookRoomFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected bookRoomFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new bookRoomFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.BookRoom.APIResponse> viewRoomDetails(
        org.example.BookRoom.empty request) {
      return futureUnaryCall(
          getChannel().newCall(getViewRoomDetailsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.BookRoom.roomBookResponse> bookRoom(
        org.example.BookRoom.roomBook request) {
      return futureUnaryCall(
          getChannel().newCall(getBookRoomMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.BookRoom.roomBookResponse> cancelRoom(
        org.example.BookRoom.roomCancel request) {
      return futureUnaryCall(
          getChannel().newCall(getCancelRoomMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.BookRoom.getAllRoomResponse> getAllRoomsByUserId(
        org.example.BookRoom.userId request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllRoomsByUserIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *  rpc logout(empty) returns (APIResponse);
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.BookRoom.roomBookResponse> rescheduleBooking(
        org.example.BookRoom.rescheduleBook request) {
      return futureUnaryCall(
          getChannel().newCall(getRescheduleBookingMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_VIEW_ROOM_DETAILS = 0;
  private static final int METHODID_BOOK_ROOM = 1;
  private static final int METHODID_CANCEL_ROOM = 2;
  private static final int METHODID_GET_ALL_ROOMS_BY_USER_ID = 3;
  private static final int METHODID_RESCHEDULE_BOOKING = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final bookRoomImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(bookRoomImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_VIEW_ROOM_DETAILS:
          serviceImpl.viewRoomDetails((org.example.BookRoom.empty) request,
              (io.grpc.stub.StreamObserver<org.example.BookRoom.APIResponse>) responseObserver);
          break;
        case METHODID_BOOK_ROOM:
          serviceImpl.bookRoom((org.example.BookRoom.roomBook) request,
              (io.grpc.stub.StreamObserver<org.example.BookRoom.roomBookResponse>) responseObserver);
          break;
        case METHODID_CANCEL_ROOM:
          serviceImpl.cancelRoom((org.example.BookRoom.roomCancel) request,
              (io.grpc.stub.StreamObserver<org.example.BookRoom.roomBookResponse>) responseObserver);
          break;
        case METHODID_GET_ALL_ROOMS_BY_USER_ID:
          serviceImpl.getAllRoomsByUserId((org.example.BookRoom.userId) request,
              (io.grpc.stub.StreamObserver<org.example.BookRoom.getAllRoomResponse>) responseObserver);
          break;
        case METHODID_RESCHEDULE_BOOKING:
          serviceImpl.rescheduleBooking((org.example.BookRoom.rescheduleBook) request,
              (io.grpc.stub.StreamObserver<org.example.BookRoom.roomBookResponse>) responseObserver);
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

  private static abstract class bookRoomBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    bookRoomBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.example.BookRoom.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("bookRoom");
    }
  }

  private static final class bookRoomFileDescriptorSupplier
      extends bookRoomBaseDescriptorSupplier {
    bookRoomFileDescriptorSupplier() {}
  }

  private static final class bookRoomMethodDescriptorSupplier
      extends bookRoomBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    bookRoomMethodDescriptorSupplier(String methodName) {
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
      synchronized (bookRoomGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new bookRoomFileDescriptorSupplier())
              .addMethod(getViewRoomDetailsMethod())
              .addMethod(getBookRoomMethod())
              .addMethod(getCancelRoomMethod())
              .addMethod(getGetAllRoomsByUserIdMethod())
              .addMethod(getRescheduleBookingMethod())
              .build();
        }
      }
    }
    return result;
  }
}
