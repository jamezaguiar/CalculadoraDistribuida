package calculator.server;

import java.util.Arrays;

public class EsqueletoIMC {
    private IMC imc = new IMC();

    public String imcCalc(String args) {
        String[] argsFormated = args.split(",");
        String result = "";
        return Double.toString(imc.imcCalc(Double.parseDouble(argsFormated[0]), Double.parseDouble(argsFormated[1])));
    }
}
