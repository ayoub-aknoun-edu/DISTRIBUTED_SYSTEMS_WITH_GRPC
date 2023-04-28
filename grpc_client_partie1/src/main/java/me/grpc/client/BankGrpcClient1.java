package me.grpc.client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import me.grpc.stubs.BanqueServiceGrpc;
import me.grpc.stubs.Ebank;

public class BankGrpcClient1 {
    public static void main(String[] args) {
        ManagedChannel managedChannel = ManagedChannelBuilder.forAddress("localhost",5555)
                .usePlaintext()
                .build();
        BanqueServiceGrpc.BanqueServiceBlockingStub blockingStub =  BanqueServiceGrpc.newBlockingStub(managedChannel);
        Ebank.ConvertCurrencyRequest request= Ebank.ConvertCurrencyRequest.newBuilder()
                .setCurrencyFrom("MAD")
                .setCurrencyTo("EUR")
                .setAmount(12.45)
                .build();
        Ebank.ConvertCurrencyResponse convertCurrencyResponse = blockingStub.convert(request);
        System.out.printf(convertCurrencyResponse.toString());
    }
}
