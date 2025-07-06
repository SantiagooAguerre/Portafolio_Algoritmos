package paquete;

public interface IConjunto<T>{
    void insertar(T elemento);
    void eliminar(T elemento);
    boolean contiene(T elemento);
    boolean estaVacio();
    void imprimir();
    IConjunto<T> diferenciaSimetrica(IConjunto<T> otro);
    int contador();
    int tamano(IConjunto<T> otro);
    INodo<T> getPrimero();
}
