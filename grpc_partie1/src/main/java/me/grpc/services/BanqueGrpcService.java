package me.grpc.services;
import com.google.protobuf.Empty;
import io.grpc.stub.StreamObserver;
import me.grpc.stubs.BanqueServiceGrpc;
import me.grpc.stubs.Ebank;

import java.util.*;


public class BanqueGrpcService extends BanqueServiceGrpc.BanqueServiceImplBase  {
    private List<StreamObserver<Ebank.AccountTransaction>> globalResponseObservers=new ArrayList<>();

    @Override
    public void convert(Ebank.ConvertCurrencyRequest request, StreamObserver<Ebank.ConvertCurrencyResponse> responseObserver) {
        double amount = request.getAmount();
        String currencyFrom = request.getCurrencyFrom();
        String currencyTo = request.getCurrencyTo();
        double result = 0;
        Ebank.ConvertCurrencyResponse response = Ebank.ConvertCurrencyResponse.newBuilder()
                .setCurrencyFrom(currencyFrom)
                .setCurrencyTo(currencyTo)
                .setAmount(amount)
                .setResult(amount*0.11)
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getAccount(Ebank.GetAccountRequest request, StreamObserver<Ebank.GetAccountResponse> responseObserver) {
        String accountId = request.getId();
        Ebank.Account account = Ebank.Account.newBuilder()
                .setAccountId(accountId)
                .setBalance(Math.random()*1000)
                .setCreatedAt(System.currentTimeMillis())
                .setCurrency("MAD")
                .setType(Ebank.AccountType.CURRENT_ACCOUNT)
                .setStatus(Ebank.AccountStatus.ACCOUNT_STATUS_ACTIVATED)
                .build();
        Ebank.GetAccountResponse response = Ebank.GetAccountResponse.newBuilder()
                .setAccount(account)
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getListAccount(Ebank.GetListAccountsRequest request, StreamObserver<Ebank.GetListAccountsResponse> responseObserver) {
        Ebank.GetListAccountsResponse.Builder listAccountsBuilder = Ebank.GetListAccountsResponse.newBuilder();
        for (int i = 0; i < 5; i++) {
            Ebank.Account account= Ebank.Account.newBuilder()
                    .setAccountId(UUID.randomUUID().toString())
                    .setBalance(Math.random()*90000)
                    .setCreatedAt(System.currentTimeMillis())
                    .setCurrency("MAD")
                    .setType(Ebank.AccountType.CURRENT_ACCOUNT)
                    .setStatus(Ebank.AccountStatus.ACCOUNT_STATUS_ACTIVATED)
                    .build();
            listAccountsBuilder.addAccounts(account);
        }
        responseObserver.onNext(listAccountsBuilder.build());
        responseObserver.onCompleted();
    }

    @Override
    public void getStreamOfAccountTransactions(Ebank.GetStreamOfAccountTransactionRequest request, StreamObserver<Ebank.AccountTransaction> responseObserver) {
        this.globalResponseObservers.add(responseObserver);
        Timer timer=new Timer("Transactions Timer");


        timer.schedule(new TimerTask() {
            private int counter=0;
            @Override
            public void run() {
                Ebank.AccountTransaction accountTransaction=Ebank.AccountTransaction.newBuilder()
                        .setAccountId(request.getAccountId())
                        .setAmount(1000+Math.random()*9000)
                        .setTransactionDate(System.currentTimeMillis())
                        .setType(Math.random()>0.5?Ebank.TransactionType.CREDIT: Ebank.TransactionType.DEBIT)
                        .build();
                responseObserver.onNext(accountTransaction);
                ++counter;
                if(counter>20) {
                    responseObserver.onCompleted();
                    timer.cancel();
                }
            }
        }, 0, 1000);
 }

    @Override
    public StreamObserver<Ebank.AccountTransaction> submitStreamOfTransaction(StreamObserver<Ebank.PerformStreamOfTransactionsResponse> responseObserver) {
        List<Ebank.AccountTransaction> performedTransactions=new ArrayList<>();
        Ebank.PerformStreamOfTransactionsResponse response=Ebank.PerformStreamOfTransactionsResponse.getDefaultInstance();
        return new StreamObserver<Ebank.AccountTransaction>() {
            @Override
            public void onNext(Ebank.AccountTransaction accountTransaction) {
                Ebank.AccountTransaction performedTransaction;
                if(accountTransaction.getAmount()>100){
                    performedTransaction=Ebank.AccountTransaction.newBuilder(accountTransaction)
                            .setStatus(Ebank.TransactionStatus.EXECUTED).build();
                    performedTransactions.add(performedTransaction);
                }
            }
            @Override
            public void onError(Throwable throwable) {
                throwable.printStackTrace();
            }
            @Override
            public void onCompleted() {
                long numberOfPerformedTransactions=0;
                double totalAmountOfPerformedTransactions= 0;
                double totalAmountOfPerformedDebitTransactions=0;
                double totalAmountOfPerformedCreditTransactions=0;
                for (Ebank.AccountTransaction tx:performedTransactions){
                    totalAmountOfPerformedTransactions+=tx.getAmount();
                    if(tx.getType().equals(Ebank.TransactionType.CREDIT)){
                        totalAmountOfPerformedCreditTransactions+=tx.getAmount();
                    } else {
                        totalAmountOfPerformedDebitTransactions+=tx.getAmount();
                    }
                }
                numberOfPerformedTransactions=performedTransactions.size();
                Ebank.PerformStreamOfTransactionsResponse performStreamOfTransactionsResponse =
                        Ebank.PerformStreamOfTransactionsResponse.newBuilder()
                                .setNumberOfPerformedTransactions(numberOfPerformedTransactions)
                                .setTotalAmountOfPerformedCreditTransactions(totalAmountOfPerformedCreditTransactions)
                                .setTotalAmountOfPerformedDebitTransactions(totalAmountOfPerformedDebitTransactions)
                                .setTotalAmountOfPerformedTransactions(totalAmountOfPerformedTransactions)
                                .build();
                responseObserver.onNext(performStreamOfTransactionsResponse);
                responseObserver.onCompleted();
            }
    };
    }

    @Override
    public StreamObserver<Ebank.AccountTransaction> executeStreamOfTransaction(StreamObserver<Ebank.AccountTransaction> responseObserver) {
        return new StreamObserver<Ebank.AccountTransaction>() {
            @Override
            public void onNext(Ebank.AccountTransaction accountTransaction) {
                if(accountTransaction.getAmount()>100){
                    Ebank.AccountTransaction performedTransaction = Ebank.AccountTransaction.newBuilder(accountTransaction)
                            .setStatus(Ebank.TransactionStatus.EXECUTED)
                            .build();
                    responseObserver.onNext(performedTransaction);
                } else throw new RuntimeException("The transaction "+accountTransaction.getTransactionId()+" is rejected");
            }
            @Override
            public void onError(Throwable throwable) {
                throwable.printStackTrace();
            }
            @Override
            public void onCompleted() {
                responseObserver.onCompleted();
            }
        };
    }

    @Override
    public void submitTransaction(Ebank.AccountTransaction request, StreamObserver<Empty> responseObserver) {
        this.globalResponseObservers.forEach(obs->{
            obs.onNext(request);
        });
        responseObserver.onCompleted();
    }
}
