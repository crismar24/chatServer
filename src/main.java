import java.io.IOException;

public class main {
    public static void main(String[] args) {
        Server server = null;
        try {
            server = new Server();
            server.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
