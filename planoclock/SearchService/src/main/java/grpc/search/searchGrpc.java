package grpc.search;

import java.sql.SQLException;

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
    comments = "Source: search.proto")
public final class searchGrpc {

  private searchGrpc() {}

  public static final String SERVICE_NAME = "search";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.search.Search.SearchMessage,
      grpc.search.Search.APIResponse> getSearchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "search",
      requestType = grpc.search.Search.SearchMessage.class,
      responseType = grpc.search.Search.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.search.Search.SearchMessage,
      grpc.search.Search.APIResponse> getSearchMethod() {
    io.grpc.MethodDescriptor<grpc.search.Search.SearchMessage, grpc.search.Search.APIResponse> getSearchMethod;
    if ((getSearchMethod = searchGrpc.getSearchMethod) == null) {
      synchronized (searchGrpc.class) {
        if ((getSearchMethod = searchGrpc.getSearchMethod) == null) {
          searchGrpc.getSearchMethod = getSearchMethod = 
              io.grpc.MethodDescriptor.<grpc.search.Search.SearchMessage, grpc.search.Search.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "search", "search"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.search.Search.SearchMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.search.Search.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new searchMethodDescriptorSupplier("search"))
                  .build();
          }
        }
     }
     return getSearchMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static searchStub newStub(io.grpc.Channel channel) {
    return new searchStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static searchBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new searchBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static searchFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new searchFutureStub(channel);
  }

  /**
   */
  public static abstract class searchImplBase implements io.grpc.BindableService {

    /**
     */
    public void search(grpc.search.Search.SearchMessage request,
        io.grpc.stub.StreamObserver<grpc.search.Search.APIResponse> responseObserver) throws SQLException {
      asyncUnimplementedUnaryCall(getSearchMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSearchMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.search.Search.SearchMessage,
                grpc.search.Search.APIResponse>(
                  this, METHODID_SEARCH)))
          .build();
    }
  }

  /**
   */
  public static final class searchStub extends io.grpc.stub.AbstractStub<searchStub> {
    private searchStub(io.grpc.Channel channel) {
      super(channel);
    }

    private searchStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected searchStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new searchStub(channel, callOptions);
    }

    /**
     */
    public void search(grpc.search.Search.SearchMessage request,
        io.grpc.stub.StreamObserver<grpc.search.Search.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSearchMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class searchBlockingStub extends io.grpc.stub.AbstractStub<searchBlockingStub> {
    private searchBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private searchBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected searchBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new searchBlockingStub(channel, callOptions);
    }

    /**
     */
    public grpc.search.Search.APIResponse search(grpc.search.Search.SearchMessage request) {
      return blockingUnaryCall(
          getChannel(), getSearchMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class searchFutureStub extends io.grpc.stub.AbstractStub<searchFutureStub> {
    private searchFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private searchFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected searchFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new searchFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.search.Search.APIResponse> search(
        grpc.search.Search.SearchMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getSearchMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEARCH = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final searchImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(searchImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEARCH:
          try {
            serviceImpl.search((Search.SearchMessage) request,
                (io.grpc.stub.StreamObserver<Search.APIResponse>) responseObserver);
          } catch (SQLException e) {
            throw new RuntimeException(e);
          }
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

  private static abstract class searchBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    searchBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.search.Search.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("search");
    }
  }

  private static final class searchFileDescriptorSupplier
      extends searchBaseDescriptorSupplier {
    searchFileDescriptorSupplier() {}
  }

  private static final class searchMethodDescriptorSupplier
      extends searchBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    searchMethodDescriptorSupplier(String methodName) {
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
      synchronized (searchGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new searchFileDescriptorSupplier())
              .addMethod(getSearchMethod())
              .build();
        }
      }
    }
    return result;
  }
}
