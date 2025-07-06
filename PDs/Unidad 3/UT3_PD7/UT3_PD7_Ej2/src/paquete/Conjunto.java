package paquete;
import java.util.ArrayList;

public class Conjunto<T> implements IConjunto<T> {
    public ArrayList<T> conjunto;
    public Conjunto(){
        conjunto = new ArrayList<>();
    }

    public ArrayList<T> getConjunto(){
        return conjunto;
    }
    
    @Override
    public void insertar(T elemento){
    if(!conjunto.contains(elemento)){
        conjunto.add(elemento);}
    }
    
    @Override
    public void eliminar(T elemento){
        conjunto.remove(elemento);
    }
    
    @Override
    public boolean contiene(T elemento) {
        if (conjunto.contains(elemento)) {
            return true;
        }
        return false;
    }

    @Override
    public IConjunto<T> union(IConjunto<T> otroConjunto) {
        Conjunto<T> nuevoConjunto = new Conjunto<>();
        for(T elemento : conjunto){
            nuevoConjunto.insertar(elemento);
        }
        for(T elemento : otroConjunto.getConjunto()){
            nuevoConjunto.insertar(elemento);

        }
        return nuevoConjunto;
    }

    @Override
    public IConjunto<T> interseccion(IConjunto<T> otroConjunto) {
        Conjunto<T> nuevoConjunto = new Conjunto<>();
        for(T elemento : conjunto){
            if(otroConjunto.contiene(elemento)){
                nuevoConjunto.insertar(elemento);
            }
        }
        return nuevoConjunto;
    }

    @Override
    public void imprimir(){
        System.out.println("Los conjuntos son " + conjunto);
    }

    @Override
    public ArrayList<Integer> procesarConjunto(String elemento) {
        ArrayList<Integer> lista = new ArrayList<>();
        String[] elementos = elemento.split(",");

        for (String num : elementos) {
            lista.add(Integer.parseInt(num.trim()));
        }
        return lista;
    }
}
