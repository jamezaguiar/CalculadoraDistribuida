package calculator.client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class TCPClient {
    private DataInputStream in;
    private DataOutputStream out;
    private Socket client;

    public TCPClient(String addr, int port) {
        try {
            this.client = new Socket(addr, port);
            this.in = new DataInputStream(this.client.getInputStream());
            this.out = new DataOutputStream(this.client.getOutputStream());
        } catch (IOException e) {
            System.out.println("IO: " + e.getMessage());
        }
    }


    public void sendRequest(String request) throws IOException {
        this.out.writeUTF(request);
    }

    public String getResponse() throws IOException {
        return this.in.readUTF();
    }

    public void close() throws IOException {
        client.close();
    }
}
