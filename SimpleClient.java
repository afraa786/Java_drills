import java.io.*;
import java.net.*;
public class SimpleClient {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 1234)) {
            System.out.println("Connected to the server!");
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out.println("Hello from Client!");
            String serverResponse = in.readLine();
            System.out.println("Received from server: " + serverResponse);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
