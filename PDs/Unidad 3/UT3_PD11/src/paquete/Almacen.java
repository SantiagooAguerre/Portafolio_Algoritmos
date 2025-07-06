package paquete;

import java.util.ArrayList;

public class Almacen {
    ArrayList<Integer> articulos = new ArrayList();
    public Almacen() {
        this.articulos=new ArrayList();
    }
    public void ordenarParesImpares(){
        ArrayList<Integer> nuevaListaImpares=new ArrayList();
        ArrayList<Integer> nuevaListaPares=new ArrayList();

        for(Integer num: articulos){
            if(num%2==0){
                nuevaListaPares.add(num);
            }
            else{
                nuevaListaImpares.add(num);
            }
        }
        
        ArrayList<Integer> nuevaListaOrdenadaImpares=new ArrayList();
        ArrayList<Integer> nuevaListaOrdenadaPares=new ArrayList();
        
        for(Integer num: nuevaListaImpares){
            insertarEnOrdenAscendente(nuevaListaOrdenadaImpares,num);
        }
        
        for(Integer num: nuevaListaPares){
            insertarEnOrdenAscendente(nuevaListaOrdenadaPares,num);
        }
        
        articulos.clear();
        articulos.addAll(nuevaListaOrdenadaImpares);
        articulos.addAll(nuevaListaOrdenadaPares);
        System.out.println(articulos.toString());

    }
    public void insertarEnOrdenAscendente(ArrayList<Integer> list, int elemento){
        if(list.isEmpty()){
            list.add(elemento);
        } else {
            int pos=0;
            while(pos<list.size() && list.get(pos)<elemento){
                pos++;
            }
            list.add(pos,elemento);
        }

    }
    public void mostrarArticulos(){
        System.out.println("Articulos: ");
        ordenarParesImpares();

    }
    public void agregarArticulo(int elemento){
        if(!articulos.contains(elemento)){
            articulos.add(elemento);
        }
    }
}
