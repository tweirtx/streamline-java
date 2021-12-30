import java.io.IOException;

public class StreamlineDNSTester {
    public static void main(String[] args) throws IOException {
        StreamlineServer server = new StreamlineServer("test");
        System.out.println("starting server");
        server.run();
    }
}
