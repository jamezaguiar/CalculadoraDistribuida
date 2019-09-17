package calculator.client;

import java.io.IOException;

public class ProxyCalc {

    int port = 33333;
    TCPClient client = new TCPClient("localhost", port);

    public double add(double op1, double op2) throws IOException {
        String request = "ADD,";
        request += Double.toString(op1) + "," + Double.toString(op2);
        client.sendRequest(request);
        return Double.parseDouble(client.getResponse());
    }

    public double sub(double op1, double op2) throws IOException {
        String request = "SUB,";
        request += Double.toString(op1) + "," + Double.toString(op2);
        client.sendRequest(request);
        return Double.parseDouble(client.getResponse());
    }

    public double mult(double op1, double op2) throws IOException {
        String request = "MULT,";
        request += Double.toString(op1) + "," + Double.toString(op2);
        client.sendRequest(request);
        return Double.parseDouble(client.getResponse());
    }

    public double div(double op1, double op2) throws IOException {
        String request = "DIV,";
        request += Double.toString(op1) + "," + Double.toString(op2);
        client.sendRequest(request);
        return Double.parseDouble(client.getResponse());
    }

    public void close() throws IOException {
        client.close();
    }
}
