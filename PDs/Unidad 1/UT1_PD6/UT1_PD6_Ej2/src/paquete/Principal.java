package paquete;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Principal {

    public static void leerEntradaArchivo(String rutaArchivo) throws FileNotFoundException, IOException {
        File archivo = new File(rutaArchivo);
        FileReader fr = new FileReader(archivo);
        BufferedReader br = new BufferedReader (fr);
        String linea = br.readLine();
        String[] variables = new String[3];
        while (linea != null) {
            for(int i=0; i < 3; i++) {
                variables[i] = linea;
                linea = br.readLine();
            }
        }
        String nombre = variables[2];
        int valor1 = Integer.valueOf(variables[0]);
        double valor2 = Double.parseDouble(variables[1]);
        
        System.out.println("El entero leido es: " + valor1);
        System.out.println("El numero de punto flotante es: " + valor2);
        System.out.println("La cadena leida es " + nombre);
        System.out.println("¡Hola " + nombre + "! La suma de " + valor1 + " y " + valor2 + " es " + (valor1 + valor2));
        System.out.println("La division entera entre " + valor2 + " y " + valor1 + " es " + ( (int) valor2 / valor1) + " y su resto es " + (valor2 % valor1));
    }
    
    public static void leerEntradaStdin() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("");
        System.out.print("Escriba el radio de la circunferencia: ");
        double radio = entrada.nextDouble();
        
        double perimetro = 2 * radio * Math.PI;
        double area = Math.PI * radio;
        
        System.out.println("Perimetro: " + perimetro);
        System.out.println("Area: " + area);
    }

    public static void main(String[] args) throws IOException {
        Principal principal = new Principal();
        principal.leerEntradaArchivo("src\\paquete\\Texto.txt");
        principal.leerEntradaStdin();
    }

}
