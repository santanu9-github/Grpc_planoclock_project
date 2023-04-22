import io.grpc.Server;
import io.grpc.ServerBuilder;
import servicees.NotificationService;

import java.io.IOException;

public class NotificationServer {

    public static void main(String[] args) throws IOException, InterruptedException {

        System.out.println("GRPC Server Started");

        Server searchServer= ServerBuilder.forPort(9091).addService( new NotificationService()).build();
        searchServer.start();

        searchServer.awaitTermination();;

    }
}
