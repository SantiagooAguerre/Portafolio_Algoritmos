package paquete;

import java.util.ArrayList;
import java.util.Collections;

public class Interseccion {
    ArrayList<Integer> listaA;
    ArrayList<Integer> listaB;
    public ArrayList<Integer> conjunto = new ArrayList<>();
    
    public Interseccion(ArrayList<Integer> listaA, ArrayList<Integer> listaB) {
        this.listaA = listaA;
        this.listaB = listaB;
        this.conjunto = conjunto;
    }
    
    public void imprimir(){
        System.out.println("Los conjuntos son " + conjunto);
    }
    
    public void ordenar(){
        Collections.sort(conjunto);
        }

    public void unir(){
        if(listaA.size() == listaB.size()){
            for(int i=0; i<listaA.size(); i++){
                for(int j=0; j<listaB.size(); j++){
                    if(listaA.get(i).equals(listaB.get(j))){
                        if (!conjunto.contains(listaA.get(i))){
                            conjunto.add(listaA.get(i));
                        }
                    }
                }
            }
        }
        
        if(listaB.size() > listaA.size()){
            for(int i=0; i<listaB.size(); i++){
                for(int j=0; j<listaA.size(); j++){
                    if(listaB.get(j).equals(listaA.get(i))){
                        if (!conjunto.contains(listaB.get(j))){
                            conjunto.add(listaB.get(j));
                        }
                    }
                }
            }
        }
        
        if(listaA.size() > listaB.size()){
            for(int i=0; i<listaA.size(); i++){
                for(int j=0; j<listaB.size(); j++){
                    if(listaA.get(i).equals(listaB.get(j))){
                        if(!conjunto.contains(listaA.get(i))){
                            conjunto.add(listaA.get(i));
                        }
                    }
                }
            }
        }
        
        ordenar();
        imprimir();
    }
    
}
