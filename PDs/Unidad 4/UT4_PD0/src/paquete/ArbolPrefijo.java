/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete;

import java.util.Stack;

public class ArbolPrefijo {
    public TElementoABB construirArbol(String[] prefijo) {
        if (prefijo == null || prefijo.length == 0) {
            System.err.println("Error: Expresión prefija vacía");
            return null;
        }

        Stack<TElementoABB> pila = new Stack<>();

        for (int i = prefijo.length - 1; i >= 0; i--) {
            String token = prefijo[i];

            if (esOperador(token)) {
                if (pila.size() < 2) {
                    System.err.println("Error: Faltan operandos para '" + token + "'");
                    return null;
                }
                TElementoABB nodo = new TElementoABB(token);
                nodo.setIzquierda(pila.pop());
                nodo.setDerecha(pila.pop());
                pila.push(nodo);
            } else {
                try {
                    int valor = Integer.parseInt(token);
                    pila.push(new TElementoABB(valor));
                } catch (NumberFormatException e) {
                    pila.push(new TElementoABB(token));
                }
            }
        }

        if (pila.size() != 1) {
            System.err.println("Error: Expresión mal formada");
            return null;
        }

        return pila.pop();
    }

    private boolean esOperador(String token) {
        return token.equals("+") || token.equals("-") ||
                token.equals("*") || token.equals("/");
    }

    public static String[] convertirExpresion(String expresion) {
        return expresion.trim().split("\\s+");
    }
}
