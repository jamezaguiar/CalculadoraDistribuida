package calculator.server;

import java.util.Arrays;

public class EsqueletoCalc {
    private Calc c = new Calc();

    public String add(String args) {
        String[] argsFormated = args.split(",");
        return Double.toString(c.add(Double.parseDouble(argsFormated[1]), Double.parseDouble(argsFormated[2])));
    }

    public String sub(String args) {
        String[] argsFormated = args.split(",");
        return Double.toString(c.sub(Double.parseDouble(argsFormated[1]), Double.parseDouble(argsFormated[2])));
    }

    public String mult(String args) {
        String[] argsFormated = args.split(",");
        return Double.toString(c.mult(Double.parseDouble(argsFormated[1]), Double.parseDouble(argsFormated[2])));
    }

    public String div(String args) {
        String[] argsFormated = args.split(",");
        return Double.toString(c.div(Double.parseDouble(argsFormated[1]), Double.parseDouble(argsFormated[2])));
    }
}
