package calculator.server;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Despachante {
    EsqueletoCalc ec = new EsqueletoCalc();

    public String invoke(String message) {
        String[] verify = message.split(",");
        String values = verify[2] + "," +verify[3];
        String resp = "";
        try {
            Class clazz = Class.forName("calculator.server.Esqueleto" + verify[0]);
            Object objeto = clazz.newInstance();
            Method m = clazz.getMethod(verify[1], String.class);
            resp = (String) m.invoke(objeto, values);
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }
        return resp;
    }
}
