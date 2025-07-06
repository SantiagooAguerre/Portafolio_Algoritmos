package paquete;

import java.util.ArrayList;

public interface IConjunto<T>  {
    void insertar(T elemento);
    void eliminar(T elemento);
    boolean contiene(T elemento);
    boolean estaVacio();
    IConjunto<T> union(IConjunto<T> otro);
    IConjunto<T> interseccion(IConjunto<T> otro);
    void imprimir();

}
