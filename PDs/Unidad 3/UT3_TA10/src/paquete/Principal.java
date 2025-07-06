package paquete;

import java.io.*;

public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Empresa mcDonalds = new Empresa("McDonald's");

        read(mcDonalds, "src/paquete/sucursales.txt");

        // prueba de programa
        // 1)
        Empresa suc1 = new Empresa("Sucursal 1");
        read(suc1, "src/paquete/suc1.txt");
        suc1.getSucursal();
        suc1.countSucursal(); 
        // la empresa suc1 tiene 107 sucursales

        // 2)
        suc1.removeSucursal("Chicago");
        suc1.getSucursal(); 
        // la que sigue en la lista es la ciudad Shenzhen

        Empresa suc2 = new Empresa("Sucursal 2");
        read(suc2, "src/paquete/suc2.txt");
        suc2.removeSucursal("Shenzhen");
        suc2.getSucursal();
        suc2.removeSucursal("Tokio");
        suc2.getSucursal(); 
        // d) ninguna de las anteriores

        Empresa suc3 = new Empresa("Sucursal 3");

        read(suc3, "src/paquete/suc3.txt");

        suc3.getSucursal(";_");
        // Montreal;_Caracas;_Tulsa;_Mobile;_Vancouver;_

    }
    
    public static void read(Empresa empresa, String Path){
        try {
            File archivo = new File (Path);
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader (fr);
            String linea = br.readLine();
            while (linea != null) {
                empresa.addSucursal(linea.trim());
                linea = br.readLine();

            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
