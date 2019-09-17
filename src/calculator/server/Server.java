package calculator.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        int port = 33333;
        try {
            ServerSocket listenSocket = new ServerSocket(port);
            Socket clientSocket = listenSocket.accept();
            TCPServer c = new TCPServer(clientSocket);
        } catch (IOException e) {
            System.out.println("Listen: " + e.getMessage());
        }
    }
}
