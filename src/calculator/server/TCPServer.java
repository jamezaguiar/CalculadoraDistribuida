package calculator.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.net.Socket;

public class TCPServer extends Thread {
    DataInputStream in;
    DataOutputStream out;
    Socket clientSocket;
    Despachante d;

    public TCPServer(Socket aClientSocket) {
        try {
            this.clientSocket = aClientSocket;
            this.d = new Despachante();
            in = new DataInputStream(clientSocket.getInputStream());
            out = new DataOutputStream(clientSocket.getOutputStream());
            this.start();
        } catch (IOException e) {
            System.out.println("Connection: " + e.getMessage());
        }
    }

    public String getRequest() throws IOException {
        String request = this.in.readUTF();
        return d.invoke(request);
    }

    public void sendResponse(String response) throws IOException {
        this.out.writeUTF(response);
    }

    public void run() {
        try {
            String request = this.getRequest();
            this.sendResponse(request);
        } catch (EOFException e) {
            System.out.println("EOF:" + e.getMessage());
        } catch (IOException e) {
            System.out.println("IO:" + e.getMessage());
        } finally {
            try {
                clientSocket.close();
            } catch (IOException ignored) {
            }
        }
    }
}
