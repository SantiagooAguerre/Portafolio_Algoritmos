package paquete;

import java.util.ArrayList;

public interface IConjunto<T> extends ILista<T> {
    public IConjunto<T> union(IConjunto<T> otroConjunto);
    public IConjunto<T> interseccion(IConjunto<T> otroConjunto);
    public  ArrayList<T> getConjunto();
}
