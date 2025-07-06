/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Estudiante UCU
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TArbolBB arbol = new TArbolBB();
        String [] claves=ManejadorArchivosGenerico.leerArchivo("src/paquete/altasPrueba.txt");
        List<String> lineasSalida=new ArrayList<>();
        for (String clave:claves){
            TElementoAB<String> elementoAB=new TElementoAB<>(clave,clave);
            boolean insercionExit=arbol.insertar(elementoAB);
            int cont= insercionExit?1:0;
            String lineaSalida=clave + " " + cont;
            lineasSalida.add(lineaSalida);
        }
        System.out.println(lineasSalida);
    }
    
}
