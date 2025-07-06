package paquete;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ContadorPalabras {

    public String[] obtenerLineas(String archivo) {
        List<String> lineas = new ArrayList();

        try {
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);

            for (String lineaActual = br.readLine(); lineaActual != null; lineaActual = br.readLine()) {
                lineas.add(lineaActual);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo " + archivo);
            e.printStackTrace();
        }

        return (String[]) lineas.toArray(new String[0]);
    }

    public String[] palabrasComunes(String[] archivo1, String[] archivo2) {

        int linea1 = 1;
        int linea2 = 1;

        if (linea1 < 0 || linea1 >= archivo1.length || linea2 < 0 || linea2 >= archivo2.length) {
            System.out.println("Lineas inexistentes capo");
            return new String[0];
        }

        String[] palabras1 = archivo1[linea1].split("\\s+");
        String[] palabras2 = archivo2[linea2].split("\\s+");

        List<String> comunes = new ArrayList<>();

        for (int i = 0; i < palabras1.length; i++) {
            for (int j = 0; j < palabras2.length; j++) {
                if (palabras1[i].equals(palabras2[j])) {
                    boolean yaExiste = false;
                    for (int k = 0; k < comunes.size(); k++) {
                        if (comunes.get(k).equals(palabras1[i])) {
                            yaExiste = true;
                            break;
                        }
                    }
                    if (!yaExiste) {
                        comunes.add(palabras1[i]);
                    }
                    break;
                }
            }
        }
        return comunes.toArray(new String[0]);
    }
}
