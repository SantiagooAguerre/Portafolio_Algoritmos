package uy.edu.ucu.aed;

import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        TGrafoNoDirigido gd = UtilGrafos.cargarGrafo("./src/vertices.txt", "./src/aristas.txt",
                false, TGrafoNoDirigido.class);

        /* (AAM hecho para confirmar el resultado de Prim)
         *
         * Nairobi – Cairo
         * 
         * Cairo – Monrovia
         * 
         * Monrovia – Mekele
         * 
         * Mekele – Garoua
         * 
         * Mekele – Praia
         * Peso total: 14.0
         */

        gd.imprimirPrim(gd.Prim());
        System.out.println();

        /***** EJERCICIO 3 *****/

        TGrafoNoDirigido grafo_ejercicio3 = UtilGrafos.cargarGrafo("./src/Vertices_Ejercicio3.txt", "./src/Aristas_Ejercicio3.txt",
                false, TGrafoNoDirigido.class);

        /* RESULTADO ESPERADO: a → b → e → d → c → f → g */
        System.out.println("Recorrido BEA desde a:");
        for (TVertice vertice : grafo_ejercicio3.bea("a")) {
            System.out.print(vertice.getEtiqueta() + " ");
        }
    }
}
