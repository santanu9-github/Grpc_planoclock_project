package org.example;

import io.grpc.ServerBuilder;
import org.example.service.Service;
import io.grpc.Server;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("Starting planOClock server!!!");
        Server server = ServerBuilder.forPort(8091).addService(new Service()).build();
        server.start();
        System.out.println("Server started on port number:"+ server.getPort());
        server.awaitTermination();
    }
}
