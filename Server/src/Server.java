import java.io.IOException;
import java.net.ServerSocket;

public class Server {
    public static void main(String[] args) throws IOException {

        ServerSocket server = new ServerSocket(8000);
        System.out.println("Server started!");
        server.accept();
        System.out.println("Client connected");
    }
}