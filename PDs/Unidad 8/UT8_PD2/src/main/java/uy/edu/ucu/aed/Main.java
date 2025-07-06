package uy.edu.ucu.aed;

import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        TGrafoNoDirigido gd = UtilGrafos.cargarGrafo("./src/vertices.txt", "./src/aristas.txt",
                false, TGrafoNoDirigido.class);

        /*
         * (AAM hecho para confirmar el resultado de Prim)
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

        System.out.println("(PRIM)");
        gd.imprimirArbolesGeneradoresMinimos(gd.Prim());
        System.out.println();
        System.out.println("(KRUSKAL)");
        gd.imprimirArbolesGeneradoresMinimos(gd.Kruskal());

    }
}
