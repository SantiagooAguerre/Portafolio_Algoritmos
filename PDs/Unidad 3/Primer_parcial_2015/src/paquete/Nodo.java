package paquete;
public class Nodo <T> implements INodo<T>{
    private T dato;
    private INodo<T> siguiente;

    public Nodo(T dato) {
        this.dato = dato;
        this.siguiente = null;
    }

    @Override
    public T getDato() {
        return dato;
    }
    public void setDato(T dato) {
        this.dato = dato;
    }

    @Override
    public INodo<T> getSiguiente() {
        return siguiente;
    }

    @Override
    public void setSiguiente(INodo<T> siguiente) {
        this.siguiente = siguiente;
    }

}
