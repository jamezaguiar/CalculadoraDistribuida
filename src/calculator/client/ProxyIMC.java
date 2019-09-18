package calculator.client;

import java.io.IOException;

public class ProxyIMC {
    int port = 33333;
    TCPClient client = new TCPClient("localhost", port);

    public double imcCalc(double altura, double peso) throws IOException {
        String request = "IMC,imcCalc,";
        request += altura + "," + peso;
        client.sendRequest(request);
        return Double.parseDouble(client.getResponse());
    }

    public void close() throws IOException {
        client.close();
    }
}
