package paquete;

public interface INodo<T> {
    T getDato();
    INodo<T> getSiguiente();
    void setSiguiente(INodo<T> nodo);
}
