import com.capstoneProject.grpc.service.meetingSpaceProvider;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class Server {
    public static void main(String[] args) throws IOException, InterruptedException {

        System.out.println("GRPC Server");
        io.grpc.Server server = ServerBuilder.forPort(8090).addService(new meetingSpaceProvider()).build();

        server.start();
        System.out.println("Server Started");
        server.awaitTermination();
    }
}
