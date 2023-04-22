
import com.grpc.feedback.feedbackService.FeedBackService;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class Server {

    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("Starting server....!");
        io.grpc.Server server = ServerBuilder.forPort(8084).addService(new FeedBackService()).build();

        server.start();
        System.out.println("Server has started at port ="+server.getPort());
        server.awaitTermination();

    }
}
