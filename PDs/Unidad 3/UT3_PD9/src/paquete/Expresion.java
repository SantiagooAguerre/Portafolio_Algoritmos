package paquete;

import java.util.List;
import java.util.Stack;

public class Expresion {

    public static boolean controlCorchetes(List<Character> listaDeEntrada) {
        if (listaDeEntrada == null || listaDeEntrada.isEmpty()) {
            return false;
        }

        Stack<Character> pila = new Stack<>();

        for (char c : listaDeEntrada) {
            if (c == '{') {
                pila.push(c);
            } else if (c == '}') {
                if (pila.isEmpty()) {
                    return false;
                }
                pila.pop();
            }
        }

        return pila.isEmpty();
    }
}
