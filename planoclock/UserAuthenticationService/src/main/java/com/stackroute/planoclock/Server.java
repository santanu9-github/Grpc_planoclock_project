package com.stackroute.planoclock;

import io.grpc.ServerBuilder;

import java.io.IOException;

public class Server {
public static void main(String[]args) throws IOException, InterruptedException{
        System.out.println("Starting a GRPC server!!!");
        //starting server on port number 9095
        io.grpc.Server server = ServerBuilder.forPort(9095).addService(new AuthenticationService()).build();

        server.start();
        System.out.println("Server started on port number:"+ server.getPort());
        server.awaitTermination();
        }

}
