package paquete;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Union {
    ArrayList<Integer> listaA ;
    ArrayList<Integer> listaB ;
    ArrayList<Integer> conjunto = new ArrayList<>();

    public Union(ArrayList<Integer> listaA, ArrayList<Integer> listaB) {
        this.listaA = listaA;
        this.listaB = listaB;
    }
    
    public void mostrar() {
        conjunto.addAll(listaA);
        conjunto.addAll(listaB);
        ordenar();
        imprimir();
    }
    
    public void ordenar() {
        HashSet<Integer> set = new HashSet<>(conjunto);
        conjunto.clear();
        conjunto.addAll(set);
        Collections.sort(conjunto);
    }
    
    public ArrayList<Integer> getConjunto() {
        return conjunto;
    }

    public void imprimir() {
        System.out.println("La lista es " + conjunto);
    }

}
