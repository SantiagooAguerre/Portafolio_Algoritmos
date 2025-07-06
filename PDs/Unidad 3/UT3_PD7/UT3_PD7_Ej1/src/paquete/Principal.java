package paquete;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Valor de la lista 1 = ");
        String la_interseccion = entrada.nextLine();
        ArrayList<Integer> interseccionA = procesarConjunto(la_interseccion);
        
        System.out.println("Valor de la lista 2 = ");
        String la_interseccion2 = entrada.nextLine();
        ArrayList<Integer> interseccionB = procesarConjunto(la_interseccion2);
        
        Interseccion interseccion = new Interseccion(interseccionA, interseccionB);
        interseccion.unir();
        
        /***********************************/
        
        System.out.println("Valor de la lista 1 = ");
        String la_union = entrada.nextLine();
        ArrayList<Integer> unionA = procesarConjunto(la_union);
        
        System.out.println("Valor de la lista 2 = ");
        String la_union2 = entrada.nextLine();
        ArrayList<Integer> unionB = procesarConjunto(la_union2);
        
        Union union = new Union(unionA, unionB);
        union.mostrar();
    }
    
    protected static ArrayList<Integer> procesarConjunto(String entrada){
        ArrayList<Integer> lista = new ArrayList<>();
        String[] elementos = entrada.split(",");

        for (String num : elementos) {
            lista.add(Integer.parseInt(num.trim()));
        }
        return lista;
    }
    
}
