package paquete;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Principal {
    ArrayList<String> sucursales;
    int cantidadSucursales;
    
    public Principal() {
        this.sucursales = new ArrayList<>();
        this.cantidadSucursales = 0;
    }
    
    public void agregarSucursal(String nombre) {
        if(!sucursales.contains(nombre)) {
            sucursales.add(nombre);
            cantidadSucursales++;
        }
    }
    
    public void eliminarSucursal(String nombre) {
        sucursales.remove(nombre);
        cantidadSucursales--;
    }
    
    public void buscarSucursal(String nombre) {
        if(sucursales.contains(nombre)) {
            System.out.println("SUCURSAL BUSCADA" + nombre);
        }
    }
    
    public void listarSucursales() {
        System.out.println("SUCURSALES:\n");
        for(String sucursal: sucursales) {
            System.out.println(sucursal);
        }
    }
    
    public void cantidadSucursales() {
        System.out.println("LA CANTIDAD DE SUCURSALES SON: " + cantidadSucursales);
    }
    
    public void estaVacia(){
        if(cantidadSucursales == 0) {
            System.out.println("La cantidad de sucursales es 0");
        }
        else {
            System.out.println("No esta vacia la cantidad de sucursales");
        }
    }
    
    public static void escribirArchivo(String nombreCompletoArchivo, String[] listaLineasArchivo) {
        FileWriter fw;
        try {
            fw = new FileWriter(nombreCompletoArchivo, true);
            BufferedWriter bw = new BufferedWriter(fw);
            for (int i = 0; i < listaLineasArchivo.length; i++) {
                String lineaActual = listaLineasArchivo[i];
                bw.write(lineaActual);
                bw.newLine();
            }
            bw.close();
            fw.close();
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo " + nombreCompletoArchivo);
            e.printStackTrace();
        }
    }

    public static String[] leerArchivo(String nombreCompletoArchivo) {
        FileReader fr;
        ArrayList<String> listaLineasArchivo = new ArrayList<String>();
        try {
            fr = new FileReader(nombreCompletoArchivo);
            BufferedReader br = new BufferedReader(fr);
            String lineaActual = br.readLine();
            while (lineaActual != null) {
                listaLineasArchivo.add(lineaActual);
                lineaActual = br.readLine();
            }
            br.close();
            fr.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error al leer el archivo " + nombreCompletoArchivo);
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Error al leer el archivo " + nombreCompletoArchivo);
            e.printStackTrace();
        }
        return listaLineasArchivo.toArray(new String[0]);
    }
    public static void main(String[] args) {
        // TODO code application logic here
    }
}
