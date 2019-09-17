package calculator.server;

public class Despachante {
    EsqueletoCalc ec = new EsqueletoCalc();

    public String invoke(String message) {
        String[] verify = message.split(",");
        switch (verify[0]) {
            case "ADD":
                return ec.add(message);
            case "SUB":
                return ec.sub(message);
            case "MULT":
                return ec.mult(message);
            case "DIV":
                return ec.div(message);
        }
        return "";
    }
}
