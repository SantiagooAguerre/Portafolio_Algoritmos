package paquete;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Ejercicio 1:
 * En este algoritmo el orden de tiempo es de O(N^2), ya que tiene dos bucles 
 * anidados donde el número total de comparaciones e intercambios en el peor caso 
 * es proporcional a N(N-1)/2, ya que aunque los limites de los bucles no son exactamente N, 
 * la complejidad sigue siendo cuadrática porque la cantidad de iteraciones crece 
 * como una función cuadrática respecto a N.
 */

public class Principal {

    public static void main(String[] args) {
        String archivo = "src/paquete/numeros.txt";
        try {
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);

            int N = Integer.parseInt(br.readLine());
            int[] arreglo = new int[N];

            for (int i = 0; i < N; i++) {
                arreglo[i] = Integer.parseInt(br.readLine());
            }
            
            int contadorIf = 0;
            for (int i = 1; i < N; i++) {
                for (int j = N - 1; j >= i; j--) {
                    contadorIf++;
                    if (arreglo[j] < arreglo[j - 1]) {
                        int temp = arreglo[j];
                        arreglo[j] = arreglo[j - 1];
                        arreglo[j - 1] = temp;
                    }
                }
            }
            
            System.out.println("N = " + N);
            System.out.println("Contador de if = " + contadorIf);
            System.out.println("Primer numero del arreglo = " + arreglo[0]);
            System.out.println("Ultimo numero del arreglo = " + arreglo[N - 1]);
            
        } catch (IOException e) {
            System.out.println("Error al leer el archivo " + archivo);
            e.printStackTrace();
        }
    }
    
}
