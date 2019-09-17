package calculator.client;

import java.io.IOException;
import java.util.Scanner;

public class User {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        ProxyCalc calc = new ProxyCalc();
        String request = input.nextLine();
        String[] requestNew = request.split(",");
        switch (requestNew[0]) {
            case "ADD":
                System.out.println(calc.add(Double.parseDouble(requestNew[1]), Double.parseDouble(requestNew[2])));
                break;
            case "SUB":
                System.out.println(calc.sub(Double.parseDouble(requestNew[1]), Double.parseDouble(requestNew[2])));
                break;
            case "MULT":
                System.out.println(calc.mult(Double.parseDouble(requestNew[1]), Double.parseDouble(requestNew[2])));
                break;
            case "DIV":
                System.out.println(calc.div(Double.parseDouble(requestNew[1]), Double.parseDouble(requestNew[2])));
                break;
        }
    }
}
