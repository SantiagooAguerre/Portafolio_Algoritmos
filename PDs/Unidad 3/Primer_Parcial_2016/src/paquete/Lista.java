package paquete;

public class Lista<T> implements ILista<T> {
    private INodo<T> primero;

    public Lista() {
        primero = null;
    }

    @Override
    public void insertar(T dato) {
        INodo<T> nuevo = new Nodo<>(dato);
        if (primero == null) {
            primero = nuevo;
        } else {
            INodo<T> actual = primero;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevo);
        }
    }

    @Override
    public void eliminar(T dato) {
        if (primero == null) return;
        if (primero.getDato().equals(dato)) {
            primero = primero.getSiguiente();
            return;
        }
        INodo<T> actual = primero;
        while (actual.getSiguiente() != null) {
            if (actual.getSiguiente().getDato().equals(dato)) {
                actual.setSiguiente(actual.getSiguiente().getSiguiente());
                return;
            }
            actual = actual.getSiguiente();
        }
    }

    @Override
    public boolean contiene(T dato) {
        INodo<T> actual = primero;
        while (actual != null) {
            if (actual.getDato().equals(dato)) {
                return true;
            }
            actual = actual.getSiguiente();
        }
        return false;
    }

    @Override
    public boolean estaVacia() {
        return primero == null;
    }

    @Override
    public void imprimir() {
        INodo<T> actual = primero;
        while (actual != null) {
            System.out.println(actual.getDato());
            actual = actual.getSiguiente();
        }
    }

    @Override
    public INodo<T> getPrimero() {
        return primero;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        INodo<T> actual = this.getPrimero();
        sb.append("[");
        while (actual != null) {
            sb.append(actual.getDato());
            if (actual.getSiguiente() != null) {
                sb.append(", ");
            }
            actual = actual.getSiguiente();
        }
        sb.append("]");
        return sb.toString();
    }
}
