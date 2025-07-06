/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete;

/**
 *
 * @author Estudiante UCU
 */
public class Principal {

    public static void main(String[] args) {

        TElementoABB x = new TElementoABB("x");
        TElementoABB tres = new TElementoABB(3);
        TElementoABB cinco = new TElementoABB(5);
        TElementoABB y = new TElementoABB("y");

        TElementoABB multiplicacion = new TElementoABB("*");
        multiplicacion.setIzquierda(x);
        multiplicacion.setDerecha(tres);

        TElementoABB division = new TElementoABB("/");
        division.setIzquierda(cinco);
        division.setDerecha(y);

        TElementoABB suma = new TElementoABB("+");
        suma.setIzquierda(multiplicacion);
        suma.setDerecha(division);

        TArbolABB arbol = new TArbolABB();
        arbol.setRaiz(suma);

        arbol.sustituirVariable("x", 4);
        arbol.sustituirVariable("y", 2);

        int resultado = arbol.evaluar();
        System.out.println("El resultado es: " + resultado);

        /**
         * * EJERCICIO 2 **
         */
        ArbolPrefijo constructor = new ArbolPrefijo();
        String[] expresion2 = ArbolPrefijo.convertirExpresion("+ 1 * 2 - 3 4");
        probarExpresion(constructor, expresion2);
        /* resultado -1*/

        String[] expresion3 = ArbolPrefijo.convertirExpresion("/ * + 1 2 - 3 4 5");
        probarExpresion(constructor, expresion3);
        /*resultado 0*/


    }

    private static void probarExpresion(ArbolPrefijo constructor, String[] expresion, String... variables) {
        System.out.println("Probando expresión: " + String.join(" ", expresion));

        TElementoABB raiz = constructor.construirArbol(expresion);
        if (raiz == null) {
            System.out.println("No se pudo construir el árbol");
            return;
        }

        TArbolABB arbol = new TArbolABB();
        arbol.setRaiz(raiz);
        arbol.imprimir();

        if (variables.length > 0) {
            for (int i = 0; i < variables.length; i += 2) {
                String var = variables[i];
                int valor = Integer.parseInt(variables[i + 1]);
                System.out.println("Sustituyendo " + var + " = " + valor);
                arbol.sustituirVariable(var, valor);
            }
        }

        int resultado = arbol.evaluar();
        System.out.println("Resultado: " + resultado);
    }
}
