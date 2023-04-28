package me.grpc.stubs;

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
    comments = "Source: ebank.proto")
public final class BanqueServiceGrpc {

  private BanqueServiceGrpc() {}

  public static final String SERVICE_NAME = "BanqueService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<me.grpc.stubs.Ebank.ConvertCurrencyRequest,
      me.grpc.stubs.Ebank.ConvertCurrencyResponse> getConvertMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "convert",
      requestType = me.grpc.stubs.Ebank.ConvertCurrencyRequest.class,
      responseType = me.grpc.stubs.Ebank.ConvertCurrencyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<me.grpc.stubs.Ebank.ConvertCurrencyRequest,
      me.grpc.stubs.Ebank.ConvertCurrencyResponse> getConvertMethod() {
    io.grpc.MethodDescriptor<me.grpc.stubs.Ebank.ConvertCurrencyRequest, me.grpc.stubs.Ebank.ConvertCurrencyResponse> getConvertMethod;
    if ((getConvertMethod = BanqueServiceGrpc.getConvertMethod) == null) {
      synchronized (BanqueServiceGrpc.class) {
        if ((getConvertMethod = BanqueServiceGrpc.getConvertMethod) == null) {
          BanqueServiceGrpc.getConvertMethod = getConvertMethod = 
              io.grpc.MethodDescriptor.<me.grpc.stubs.Ebank.ConvertCurrencyRequest, me.grpc.stubs.Ebank.ConvertCurrencyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BanqueService", "convert"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  me.grpc.stubs.Ebank.ConvertCurrencyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  me.grpc.stubs.Ebank.ConvertCurrencyResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BanqueServiceMethodDescriptorSupplier("convert"))
                  .build();
          }
        }
     }
     return getConvertMethod;
  }

  private static volatile io.grpc.MethodDescriptor<me.grpc.stubs.Ebank.GetAccountRequest,
      me.grpc.stubs.Ebank.GetAccountResponse> getGetAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAccount",
      requestType = me.grpc.stubs.Ebank.GetAccountRequest.class,
      responseType = me.grpc.stubs.Ebank.GetAccountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<me.grpc.stubs.Ebank.GetAccountRequest,
      me.grpc.stubs.Ebank.GetAccountResponse> getGetAccountMethod() {
    io.grpc.MethodDescriptor<me.grpc.stubs.Ebank.GetAccountRequest, me.grpc.stubs.Ebank.GetAccountResponse> getGetAccountMethod;
    if ((getGetAccountMethod = BanqueServiceGrpc.getGetAccountMethod) == null) {
      synchronized (BanqueServiceGrpc.class) {
        if ((getGetAccountMethod = BanqueServiceGrpc.getGetAccountMethod) == null) {
          BanqueServiceGrpc.getGetAccountMethod = getGetAccountMethod = 
              io.grpc.MethodDescriptor.<me.grpc.stubs.Ebank.GetAccountRequest, me.grpc.stubs.Ebank.GetAccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BanqueService", "getAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  me.grpc.stubs.Ebank.GetAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  me.grpc.stubs.Ebank.GetAccountResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BanqueServiceMethodDescriptorSupplier("getAccount"))
                  .build();
          }
        }
     }
     return getGetAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<me.grpc.stubs.Ebank.GetListAccountsRequest,
      me.grpc.stubs.Ebank.GetListAccountsResponse> getGetListAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getListAccount",
      requestType = me.grpc.stubs.Ebank.GetListAccountsRequest.class,
      responseType = me.grpc.stubs.Ebank.GetListAccountsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<me.grpc.stubs.Ebank.GetListAccountsRequest,
      me.grpc.stubs.Ebank.GetListAccountsResponse> getGetListAccountMethod() {
    io.grpc.MethodDescriptor<me.grpc.stubs.Ebank.GetListAccountsRequest, me.grpc.stubs.Ebank.GetListAccountsResponse> getGetListAccountMethod;
    if ((getGetListAccountMethod = BanqueServiceGrpc.getGetListAccountMethod) == null) {
      synchronized (BanqueServiceGrpc.class) {
        if ((getGetListAccountMethod = BanqueServiceGrpc.getGetListAccountMethod) == null) {
          BanqueServiceGrpc.getGetListAccountMethod = getGetListAccountMethod = 
              io.grpc.MethodDescriptor.<me.grpc.stubs.Ebank.GetListAccountsRequest, me.grpc.stubs.Ebank.GetListAccountsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BanqueService", "getListAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  me.grpc.stubs.Ebank.GetListAccountsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  me.grpc.stubs.Ebank.GetListAccountsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BanqueServiceMethodDescriptorSupplier("getListAccount"))
                  .build();
          }
        }
     }
     return getGetListAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<me.grpc.stubs.Ebank.GetStreamOfAccountTransactionRequest,
      me.grpc.stubs.Ebank.AccountTransaction> getGetStreamOfAccountTransactionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getStreamOfAccountTransactions",
      requestType = me.grpc.stubs.Ebank.GetStreamOfAccountTransactionRequest.class,
      responseType = me.grpc.stubs.Ebank.AccountTransaction.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<me.grpc.stubs.Ebank.GetStreamOfAccountTransactionRequest,
      me.grpc.stubs.Ebank.AccountTransaction> getGetStreamOfAccountTransactionsMethod() {
    io.grpc.MethodDescriptor<me.grpc.stubs.Ebank.GetStreamOfAccountTransactionRequest, me.grpc.stubs.Ebank.AccountTransaction> getGetStreamOfAccountTransactionsMethod;
    if ((getGetStreamOfAccountTransactionsMethod = BanqueServiceGrpc.getGetStreamOfAccountTransactionsMethod) == null) {
      synchronized (BanqueServiceGrpc.class) {
        if ((getGetStreamOfAccountTransactionsMethod = BanqueServiceGrpc.getGetStreamOfAccountTransactionsMethod) == null) {
          BanqueServiceGrpc.getGetStreamOfAccountTransactionsMethod = getGetStreamOfAccountTransactionsMethod = 
              io.grpc.MethodDescriptor.<me.grpc.stubs.Ebank.GetStreamOfAccountTransactionRequest, me.grpc.stubs.Ebank.AccountTransaction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "BanqueService", "getStreamOfAccountTransactions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  me.grpc.stubs.Ebank.GetStreamOfAccountTransactionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  me.grpc.stubs.Ebank.AccountTransaction.getDefaultInstance()))
                  .setSchemaDescriptor(new BanqueServiceMethodDescriptorSupplier("getStreamOfAccountTransactions"))
                  .build();
          }
        }
     }
     return getGetStreamOfAccountTransactionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<me.grpc.stubs.Ebank.AccountTransaction,
      me.grpc.stubs.Ebank.PerformStreamOfTransactionsResponse> getSubmitStreamOfTransactionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "submitStreamOfTransaction",
      requestType = me.grpc.stubs.Ebank.AccountTransaction.class,
      responseType = me.grpc.stubs.Ebank.PerformStreamOfTransactionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<me.grpc.stubs.Ebank.AccountTransaction,
      me.grpc.stubs.Ebank.PerformStreamOfTransactionsResponse> getSubmitStreamOfTransactionMethod() {
    io.grpc.MethodDescriptor<me.grpc.stubs.Ebank.AccountTransaction, me.grpc.stubs.Ebank.PerformStreamOfTransactionsResponse> getSubmitStreamOfTransactionMethod;
    if ((getSubmitStreamOfTransactionMethod = BanqueServiceGrpc.getSubmitStreamOfTransactionMethod) == null) {
      synchronized (BanqueServiceGrpc.class) {
        if ((getSubmitStreamOfTransactionMethod = BanqueServiceGrpc.getSubmitStreamOfTransactionMethod) == null) {
          BanqueServiceGrpc.getSubmitStreamOfTransactionMethod = getSubmitStreamOfTransactionMethod = 
              io.grpc.MethodDescriptor.<me.grpc.stubs.Ebank.AccountTransaction, me.grpc.stubs.Ebank.PerformStreamOfTransactionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "BanqueService", "submitStreamOfTransaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  me.grpc.stubs.Ebank.AccountTransaction.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  me.grpc.stubs.Ebank.PerformStreamOfTransactionsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BanqueServiceMethodDescriptorSupplier("submitStreamOfTransaction"))
                  .build();
          }
        }
     }
     return getSubmitStreamOfTransactionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<me.grpc.stubs.Ebank.AccountTransaction,
      me.grpc.stubs.Ebank.AccountTransaction> getExecuteStreamOfTransactionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "executeStreamOfTransaction",
      requestType = me.grpc.stubs.Ebank.AccountTransaction.class,
      responseType = me.grpc.stubs.Ebank.AccountTransaction.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<me.grpc.stubs.Ebank.AccountTransaction,
      me.grpc.stubs.Ebank.AccountTransaction> getExecuteStreamOfTransactionMethod() {
    io.grpc.MethodDescriptor<me.grpc.stubs.Ebank.AccountTransaction, me.grpc.stubs.Ebank.AccountTransaction> getExecuteStreamOfTransactionMethod;
    if ((getExecuteStreamOfTransactionMethod = BanqueServiceGrpc.getExecuteStreamOfTransactionMethod) == null) {
      synchronized (BanqueServiceGrpc.class) {
        if ((getExecuteStreamOfTransactionMethod = BanqueServiceGrpc.getExecuteStreamOfTransactionMethod) == null) {
          BanqueServiceGrpc.getExecuteStreamOfTransactionMethod = getExecuteStreamOfTransactionMethod = 
              io.grpc.MethodDescriptor.<me.grpc.stubs.Ebank.AccountTransaction, me.grpc.stubs.Ebank.AccountTransaction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "BanqueService", "executeStreamOfTransaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  me.grpc.stubs.Ebank.AccountTransaction.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  me.grpc.stubs.Ebank.AccountTransaction.getDefaultInstance()))
                  .setSchemaDescriptor(new BanqueServiceMethodDescriptorSupplier("executeStreamOfTransaction"))
                  .build();
          }
        }
     }
     return getExecuteStreamOfTransactionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<me.grpc.stubs.Ebank.AccountTransaction,
      com.google.protobuf.Empty> getSubmitTransactionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "submitTransaction",
      requestType = me.grpc.stubs.Ebank.AccountTransaction.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<me.grpc.stubs.Ebank.AccountTransaction,
      com.google.protobuf.Empty> getSubmitTransactionMethod() {
    io.grpc.MethodDescriptor<me.grpc.stubs.Ebank.AccountTransaction, com.google.protobuf.Empty> getSubmitTransactionMethod;
    if ((getSubmitTransactionMethod = BanqueServiceGrpc.getSubmitTransactionMethod) == null) {
      synchronized (BanqueServiceGrpc.class) {
        if ((getSubmitTransactionMethod = BanqueServiceGrpc.getSubmitTransactionMethod) == null) {
          BanqueServiceGrpc.getSubmitTransactionMethod = getSubmitTransactionMethod = 
              io.grpc.MethodDescriptor.<me.grpc.stubs.Ebank.AccountTransaction, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BanqueService", "submitTransaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  me.grpc.stubs.Ebank.AccountTransaction.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new BanqueServiceMethodDescriptorSupplier("submitTransaction"))
                  .build();
          }
        }
     }
     return getSubmitTransactionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BanqueServiceStub newStub(io.grpc.Channel channel) {
    return new BanqueServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BanqueServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new BanqueServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BanqueServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new BanqueServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class BanqueServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * unary model
     * </pre>
     */
    public void convert(me.grpc.stubs.Ebank.ConvertCurrencyRequest request,
        io.grpc.stub.StreamObserver<me.grpc.stubs.Ebank.ConvertCurrencyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getConvertMethod(), responseObserver);
    }

    /**
     */
    public void getAccount(me.grpc.stubs.Ebank.GetAccountRequest request,
        io.grpc.stub.StreamObserver<me.grpc.stubs.Ebank.GetAccountResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAccountMethod(), responseObserver);
    }

    /**
     */
    public void getListAccount(me.grpc.stubs.Ebank.GetListAccountsRequest request,
        io.grpc.stub.StreamObserver<me.grpc.stubs.Ebank.GetListAccountsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetListAccountMethod(), responseObserver);
    }

    /**
     * <pre>
     * Server Streaming model
     * </pre>
     */
    public void getStreamOfAccountTransactions(me.grpc.stubs.Ebank.GetStreamOfAccountTransactionRequest request,
        io.grpc.stub.StreamObserver<me.grpc.stubs.Ebank.AccountTransaction> responseObserver) {
      asyncUnimplementedUnaryCall(getGetStreamOfAccountTransactionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Client Streaming model
     * </pre>
     */
    public io.grpc.stub.StreamObserver<me.grpc.stubs.Ebank.AccountTransaction> submitStreamOfTransaction(
        io.grpc.stub.StreamObserver<me.grpc.stubs.Ebank.PerformStreamOfTransactionsResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getSubmitStreamOfTransactionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Bidirectional Streaming model
     * </pre>
     */
    public io.grpc.stub.StreamObserver<me.grpc.stubs.Ebank.AccountTransaction> executeStreamOfTransaction(
        io.grpc.stub.StreamObserver<me.grpc.stubs.Ebank.AccountTransaction> responseObserver) {
      return asyncUnimplementedStreamingCall(getExecuteStreamOfTransactionMethod(), responseObserver);
    }

    /**
     */
    public void submitTransaction(me.grpc.stubs.Ebank.AccountTransaction request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getSubmitTransactionMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getConvertMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                me.grpc.stubs.Ebank.ConvertCurrencyRequest,
                me.grpc.stubs.Ebank.ConvertCurrencyResponse>(
                  this, METHODID_CONVERT)))
          .addMethod(
            getGetAccountMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                me.grpc.stubs.Ebank.GetAccountRequest,
                me.grpc.stubs.Ebank.GetAccountResponse>(
                  this, METHODID_GET_ACCOUNT)))
          .addMethod(
            getGetListAccountMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                me.grpc.stubs.Ebank.GetListAccountsRequest,
                me.grpc.stubs.Ebank.GetListAccountsResponse>(
                  this, METHODID_GET_LIST_ACCOUNT)))
          .addMethod(
            getGetStreamOfAccountTransactionsMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                me.grpc.stubs.Ebank.GetStreamOfAccountTransactionRequest,
                me.grpc.stubs.Ebank.AccountTransaction>(
                  this, METHODID_GET_STREAM_OF_ACCOUNT_TRANSACTIONS)))
          .addMethod(
            getSubmitStreamOfTransactionMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                me.grpc.stubs.Ebank.AccountTransaction,
                me.grpc.stubs.Ebank.PerformStreamOfTransactionsResponse>(
                  this, METHODID_SUBMIT_STREAM_OF_TRANSACTION)))
          .addMethod(
            getExecuteStreamOfTransactionMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                me.grpc.stubs.Ebank.AccountTransaction,
                me.grpc.stubs.Ebank.AccountTransaction>(
                  this, METHODID_EXECUTE_STREAM_OF_TRANSACTION)))
          .addMethod(
            getSubmitTransactionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                me.grpc.stubs.Ebank.AccountTransaction,
                com.google.protobuf.Empty>(
                  this, METHODID_SUBMIT_TRANSACTION)))
          .build();
    }
  }

  /**
   */
  public static final class BanqueServiceStub extends io.grpc.stub.AbstractStub<BanqueServiceStub> {
    private BanqueServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BanqueServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BanqueServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BanqueServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * unary model
     * </pre>
     */
    public void convert(me.grpc.stubs.Ebank.ConvertCurrencyRequest request,
        io.grpc.stub.StreamObserver<me.grpc.stubs.Ebank.ConvertCurrencyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getConvertMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAccount(me.grpc.stubs.Ebank.GetAccountRequest request,
        io.grpc.stub.StreamObserver<me.grpc.stubs.Ebank.GetAccountResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getListAccount(me.grpc.stubs.Ebank.GetListAccountsRequest request,
        io.grpc.stub.StreamObserver<me.grpc.stubs.Ebank.GetListAccountsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetListAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Server Streaming model
     * </pre>
     */
    public void getStreamOfAccountTransactions(me.grpc.stubs.Ebank.GetStreamOfAccountTransactionRequest request,
        io.grpc.stub.StreamObserver<me.grpc.stubs.Ebank.AccountTransaction> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetStreamOfAccountTransactionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Client Streaming model
     * </pre>
     */
    public io.grpc.stub.StreamObserver<me.grpc.stubs.Ebank.AccountTransaction> submitStreamOfTransaction(
        io.grpc.stub.StreamObserver<me.grpc.stubs.Ebank.PerformStreamOfTransactionsResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getSubmitStreamOfTransactionMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * Bidirectional Streaming model
     * </pre>
     */
    public io.grpc.stub.StreamObserver<me.grpc.stubs.Ebank.AccountTransaction> executeStreamOfTransaction(
        io.grpc.stub.StreamObserver<me.grpc.stubs.Ebank.AccountTransaction> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getExecuteStreamOfTransactionMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void submitTransaction(me.grpc.stubs.Ebank.AccountTransaction request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSubmitTransactionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class BanqueServiceBlockingStub extends io.grpc.stub.AbstractStub<BanqueServiceBlockingStub> {
    private BanqueServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BanqueServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BanqueServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BanqueServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * unary model
     * </pre>
     */
    public me.grpc.stubs.Ebank.ConvertCurrencyResponse convert(me.grpc.stubs.Ebank.ConvertCurrencyRequest request) {
      return blockingUnaryCall(
          getChannel(), getConvertMethod(), getCallOptions(), request);
    }

    /**
     */
    public me.grpc.stubs.Ebank.GetAccountResponse getAccount(me.grpc.stubs.Ebank.GetAccountRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAccountMethod(), getCallOptions(), request);
    }

    /**
     */
    public me.grpc.stubs.Ebank.GetListAccountsResponse getListAccount(me.grpc.stubs.Ebank.GetListAccountsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetListAccountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Server Streaming model
     * </pre>
     */
    public java.util.Iterator<me.grpc.stubs.Ebank.AccountTransaction> getStreamOfAccountTransactions(
        me.grpc.stubs.Ebank.GetStreamOfAccountTransactionRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetStreamOfAccountTransactionsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty submitTransaction(me.grpc.stubs.Ebank.AccountTransaction request) {
      return blockingUnaryCall(
          getChannel(), getSubmitTransactionMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class BanqueServiceFutureStub extends io.grpc.stub.AbstractStub<BanqueServiceFutureStub> {
    private BanqueServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BanqueServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BanqueServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BanqueServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * unary model
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<me.grpc.stubs.Ebank.ConvertCurrencyResponse> convert(
        me.grpc.stubs.Ebank.ConvertCurrencyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getConvertMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<me.grpc.stubs.Ebank.GetAccountResponse> getAccount(
        me.grpc.stubs.Ebank.GetAccountRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAccountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<me.grpc.stubs.Ebank.GetListAccountsResponse> getListAccount(
        me.grpc.stubs.Ebank.GetListAccountsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetListAccountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> submitTransaction(
        me.grpc.stubs.Ebank.AccountTransaction request) {
      return futureUnaryCall(
          getChannel().newCall(getSubmitTransactionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CONVERT = 0;
  private static final int METHODID_GET_ACCOUNT = 1;
  private static final int METHODID_GET_LIST_ACCOUNT = 2;
  private static final int METHODID_GET_STREAM_OF_ACCOUNT_TRANSACTIONS = 3;
  private static final int METHODID_SUBMIT_TRANSACTION = 4;
  private static final int METHODID_SUBMIT_STREAM_OF_TRANSACTION = 5;
  private static final int METHODID_EXECUTE_STREAM_OF_TRANSACTION = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BanqueServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BanqueServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CONVERT:
          serviceImpl.convert((me.grpc.stubs.Ebank.ConvertCurrencyRequest) request,
              (io.grpc.stub.StreamObserver<me.grpc.stubs.Ebank.ConvertCurrencyResponse>) responseObserver);
          break;
        case METHODID_GET_ACCOUNT:
          serviceImpl.getAccount((me.grpc.stubs.Ebank.GetAccountRequest) request,
              (io.grpc.stub.StreamObserver<me.grpc.stubs.Ebank.GetAccountResponse>) responseObserver);
          break;
        case METHODID_GET_LIST_ACCOUNT:
          serviceImpl.getListAccount((me.grpc.stubs.Ebank.GetListAccountsRequest) request,
              (io.grpc.stub.StreamObserver<me.grpc.stubs.Ebank.GetListAccountsResponse>) responseObserver);
          break;
        case METHODID_GET_STREAM_OF_ACCOUNT_TRANSACTIONS:
          serviceImpl.getStreamOfAccountTransactions((me.grpc.stubs.Ebank.GetStreamOfAccountTransactionRequest) request,
              (io.grpc.stub.StreamObserver<me.grpc.stubs.Ebank.AccountTransaction>) responseObserver);
          break;
        case METHODID_SUBMIT_TRANSACTION:
          serviceImpl.submitTransaction((me.grpc.stubs.Ebank.AccountTransaction) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
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
        case METHODID_SUBMIT_STREAM_OF_TRANSACTION:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.submitStreamOfTransaction(
              (io.grpc.stub.StreamObserver<me.grpc.stubs.Ebank.PerformStreamOfTransactionsResponse>) responseObserver);
        case METHODID_EXECUTE_STREAM_OF_TRANSACTION:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.executeStreamOfTransaction(
              (io.grpc.stub.StreamObserver<me.grpc.stubs.Ebank.AccountTransaction>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class BanqueServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BanqueServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return me.grpc.stubs.Ebank.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BanqueService");
    }
  }

  private static final class BanqueServiceFileDescriptorSupplier
      extends BanqueServiceBaseDescriptorSupplier {
    BanqueServiceFileDescriptorSupplier() {}
  }

  private static final class BanqueServiceMethodDescriptorSupplier
      extends BanqueServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BanqueServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (BanqueServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BanqueServiceFileDescriptorSupplier())
              .addMethod(getConvertMethod())
              .addMethod(getGetAccountMethod())
              .addMethod(getGetListAccountMethod())
              .addMethod(getGetStreamOfAccountTransactionsMethod())
              .addMethod(getSubmitStreamOfTransactionMethod())
              .addMethod(getExecuteStreamOfTransactionMethod())
              .addMethod(getSubmitTransactionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
