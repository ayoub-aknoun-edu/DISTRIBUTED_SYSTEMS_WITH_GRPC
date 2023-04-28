package me.grpc.client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import me.grpc.stubs.BanqueServiceGrpc;
import me.grpc.stubs.Ebank;

import java.io.IOException;

public class BankGrpcClient2 {
    public static void main(String[] args) throws IOException {
        ManagedChannel managedChannel = ManagedChannelBuilder.forAddress("localhost",5555)
                .usePlaintext()
                .build();
        BanqueServiceGrpc.BanqueServiceStub asyncStub =  BanqueServiceGrpc.newStub(managedChannel);
        Ebank.ConvertCurrencyRequest request= Ebank.ConvertCurrencyRequest.newBuilder()
                .setCurrencyFrom("MAD")
                .setCurrencyTo("EUR")
                .setAmount(12.45)
                .build();

        asyncStub.convert(request, new StreamObserver<Ebank.ConvertCurrencyResponse>() {
            @Override
            public void onNext(Ebank.ConvertCurrencyResponse convertCurrencyResponse) {
                System.out.println(convertCurrencyResponse);
            }

            @Override
            public void onError(Throwable throwable) {
                System.out.println(throwable.getMessage());
            }

            @Override
            public void onCompleted() {
                System.out.println("END .........");
            }
        });
        System.in.read();

    }
}
