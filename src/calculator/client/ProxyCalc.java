package calculator.client;

import java.io.IOException;

public class ProxyCalc {

    int port = 33333;
    TCPClient client = new TCPClient("localhost", port);

    public double add(double op1, double op2) throws IOException {
        String request = "Calc,add,";
        request += op1 + "," + op2;
        client.sendRequest(request);
        return Double.parseDouble(client.getResponse());
    }

    public double sub(double op1, double op2) throws IOException {
        String request = "Calc,sub,";
        request += op1 + "," + op2;
        client.sendRequest(request);
        return Double.parseDouble(client.getResponse());
    }

    public double mult(double op1, double op2) throws IOException {
        String request = "Calc,mult,";
        request += op1 + "," + op2;
        client.sendRequest(request);
        return Double.parseDouble(client.getResponse());
    }

    public double div(double op1, double op2) throws IOException {
        String request = "Calc,div,";
        request += op1 + "," + op2;
        client.sendRequest(request);
        return Double.parseDouble(client.getResponse());
    }

    public void close() throws IOException {
        client.close();
    }
}
