/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uy.edu.ucu.aed.tas.ta1;

import uy.edu.ucu.aed.tdas.IHash;
import uy.edu.ucu.aed.tdas.THash;
import uy.edu.ucu.aed.utils.ManejadorArchivosGenerico;

import java.util.Arrays;

/**
 *
 * @author jechague
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] palabras = ManejadorArchivosGenerico.leerArchivo("src/main/java/uy/edu/ucu/aed/tas/ta1/claves_insertar.txt");

        int p = palabras.length;

        int tamanio = (int) Math.round(p / 0.9);



        THash <String, String> hash = new THash<String, String>(tamanio);

        for (String palabra : palabras) {
            hash.insertar(palabra, palabra);
        }


        String[] claves = ManejadorArchivosGenerico.leerArchivo("src/main/java/uy/edu/ucu/aed/tas/ta1/claves_buscar.txt");
        for (String clave : claves) {
            String valor = hash.buscar(clave);
            if (valor != null) {
                System.out.println("Clave: " + clave + " - Valor: " + valor);
            } else {
                System.out.println("Clave: " + clave + " no encontrada.");
            }
        }
        System.out.println("Estadísticas");
        System.out.println("Inserciones totales: " + p);
        System.out.println("Comparaciones totales en la inserción: " + hash.getComparacionesInsercion());
        if (hash.getCantidadBusquedasExitosas() > 0) {
            double promedioExito = (double) hash.getComparacionesBusquedaExitosa() / hash.getCantidadBusquedasExitosas();
            System.out.println("Comparaciones totales en búsquedas exitosas: " + hash.getComparacionesBusquedaExitosa());
            System.out.println("Promedio de comparaciones (éxito): " + promedioExito);
        }

        if (hash.getCantidadBusquedasNoExitosas() > 0) {
            double promedioFracaso = (double) hash.getComparacionesBusquedaNoExitosa() / hash.getCantidadBusquedasNoExitosas();
            System.out.println("Comparaciones totales en búsquedas fallidas: " + hash.getCantidadBusquedasNoExitosas());
            System.out.println("Promedio de comparaciones (fracaso): " + promedioFracaso);
        }

    }

}
