package paquete;

public interface ILista<T> {
    void insertar(T dato);
    void eliminar(T dato);
    boolean contiene(T dato);
    boolean estaVacia();
    void imprimir();
    INodo<T> getPrimero();
}
