package paquete;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Principal {

    /**
     * *** PARTE A ****
     */
    public static void transformarTextoT9(String rutaArchivo) throws FileNotFoundException, IOException {
        String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz .";
        String numeros = "222333444555666777788899992223334445556667777888999001";

        File archivo = new File(rutaArchivo + "/entrada.txt");

        FileReader fr = new FileReader(archivo);
        BufferedReader br = new BufferedReader(fr);
        BufferedWriter bw = new BufferedWriter(new FileWriter(rutaArchivo + "/salida.txt"));

        int caracteres;
        while ((caracteres = br.read()) != -1) {
            char caracter = (char) caracteres;
            for (int i = 0; i < letras.length(); i++) {
                if (caracter == letras.charAt(i)) {
                    bw.write(numeros.charAt(i));
                    break;
                }
            }
        }

        System.out.println("Pronto.");

        br.close();
        fr.close();
        bw.close();

    }

    /**
     * *** PARTE B ****
     */
    public static void transformarT9Texto(String rutaArchivo) throws FileNotFoundException, IOException {
        String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz .";
        String numeros = "222333444555666777788899992223334445556667777888999001";

        File archivo = new File(rutaArchivo + "/entrada.txt");
        FileReader fr = new FileReader(archivo);
        BufferedReader br = new BufferedReader(fr);
        BufferedWriter bw = new BufferedWriter(new FileWriter(rutaArchivo + "/salida.txt"));

        StringBuilder contenido = new StringBuilder();
        int caracter;
        while ((caracter = br.read()) != -1) {
            contenido.append((char) caracter);
        }

        contenido.reverse();

        for (char j : contenido.toString().toCharArray()) {
            for (int i = 0; i < letras.length(); i++) {
                if (j == letras.charAt(i)) {
                    bw.write(numeros.charAt(i));
                    break;
                }
            }
        }
        System.out.println("Pronto.");

        br.close();
        fr.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        Principal principal = new Principal();
        //principal.transformarTextoT9("C:\\Users\\Estudiante UCU\\OneDrive - Universidad Católica del Uruguay\\Documentos\\NetBeansProjects\\UT1_PD6_Ej3\\src\\paquete");
        principal.transformarT9Texto("src\\paquete");
    }

}
