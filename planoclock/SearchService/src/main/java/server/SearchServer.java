package server;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import services.SearchService;

import static properties.Properties.*;
import java.io.IOException;

public class SearchServer {

    public static void main(String[] args) throws IOException, InterruptedException {

        Server searchServer= ServerBuilder.forPort(9090).addService(new SearchService()).build();
        searchServer.start();

        logger.info(" SearchService started, listening on "+searchServer.getPort());

        searchServer.awaitTermination();
    }
}
