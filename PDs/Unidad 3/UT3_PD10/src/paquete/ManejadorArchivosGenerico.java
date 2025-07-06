package paquete;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class ManejadorArchivosGenerico {

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
        } catch (FileNotFoundException e) {
            System.out.println("Error al leer el archivo " + nombreCompletoArchivo);
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Error al leer el archivo " + nombreCompletoArchivo);
            e.printStackTrace();
        }

        return listaLineasArchivo.toArray(new String[0]);
    }

    public static String filtrarPalabra(String unaPalabra) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < unaPalabra.length(); i++) {
            char caracter = unaPalabra.charAt(i);
            if ((caracter >= 'A' && caracter <= 'Z')
                    || (caracter >= 'a' && caracter <= 'z')) {
                sb.append(caracter);
            }
        }
        return sb.toString();
    }
    
    public static Lista<Suero> cargarSueros(String ruta) {
        Lista<Suero> sueros = new Lista<>();
        String[] lineas = ManejadorArchivosGenerico.leerArchivo(ruta);
        for (String linea : lineas) {
            String[] partes = linea.split(",");
            int id = Integer.parseInt(partes[0].trim());
            String descripcion = partes[1].trim();
            sueros.insertar(id, new Suero(id, descripcion));
        }
        return sueros;
    }

    public static Lista<Farmaco> cargarFarmacos(String ruta) {
        Lista<Farmaco> farmacos = new Lista<>();
        String[] lineas = ManejadorArchivosGenerico.leerArchivo(ruta);
        for (String linea : lineas) {
            String[] partes = linea.split(",");
            int id = Integer.parseInt(partes[0].trim());
            String descripcion = partes[1].trim();
            farmacos.insertar(id, new Farmaco(id, descripcion));
        }
        return farmacos;
    }

    public static Lista<Integer> cargarListaBlanca(String ruta) {
        Lista<Integer> listaBlanca = new Lista<>();
        String[] lineas = ManejadorArchivosGenerico.leerArchivo(ruta);
        for (String linea : lineas) {
            int id = Integer.parseInt(linea.trim());
            listaBlanca.insertar(id, id);
        }
        return listaBlanca;
    }

    public static Lista<ListaNegra> cargarListaNegra(String ruta) {
        Lista<ListaNegra> listaNegra = new Lista<>();
        String[] lineas = ManejadorArchivosGenerico.leerArchivo(ruta);
        for (String linea : lineas) {
            String[] partes = linea.split(",");
            if (partes.length >= 2) {
                int idSuero = Integer.parseInt(partes[0].trim());
                int idFarmaco = Integer.parseInt(partes[1].trim());
                ListaNegra entrada = new ListaNegra(idSuero, idFarmaco);
                listaNegra.insertar(idSuero + " / " + idFarmaco, entrada);
            }
        }
        return listaNegra;
    }
}
