package paquete;

import java.util.LinkedList;

public class ListaOrdenada<T> implements IListaOrdenada<T> {
    LinkedList listaOrdenada=new LinkedList();
    private INodo<T> primero;
    
    public ListaOrdenada()  {
        this.listaOrdenada = listaOrdenada;
        primero = null;
    }
    
    /** EL TIEMPO DE EJECUCION DE LA FUNCION ES O((n + m)^2) **/
    
    public IListaOrdenada<T> mezclarCon(ListaOrdenada<T> listaOrdenada){
        ListaOrdenada<T> listaOrdenadaAux = new ListaOrdenada();
        INodo<T> aux = this.primero;
        INodo<T> aux2=listaOrdenada.getPrimero();
        while(aux!=null){
            listaOrdenadaAux.insertar(aux.getDato());
            aux=aux.getSiguiente();
        }
        while(aux2!=null){
            listaOrdenadaAux.insertar(aux2.getDato());
            aux2=aux2.getSiguiente();
        }
        this.primero = null;
        listaOrdenada.primero = null;
        return listaOrdenadaAux;
    }
    
    /** EL TIEMPO DE EJECUCION DE LA FUNCION ES O(n^2) **/
    
    public IListaOrdenada<T> eliminarDuplicados(ListaOrdenada<T> listaOrdenada) { 
        ListaOrdenada<T> listaOrdenadaAux = new ListaOrdenada<>();
        INodo<T> aux = this.primero;
        INodo<T> aux2 = listaOrdenada.getPrimero();

        while (aux != null) {
            listaOrdenadaAux.insertar(aux.getDato());
            aux = aux.getSiguiente();
        }
        while (aux2 != null) {
            listaOrdenadaAux.insertar(aux2.getDato());
            aux2 = aux2.getSiguiente();
        }

        INodo<T> actual = listaOrdenadaAux.getPrimero();
        while (actual != null) {
            INodo<T> comparador = actual.getSiguiente();
            INodo<T>anterior = actual;
            while (comparador != null) {
                if (actual.getDato().equals(comparador.getDato())) {
                    anterior.setSiguiente(comparador.getSiguiente());
                    comparador=comparador.getSiguiente();
                } else {
                    anterior=comparador;
                    comparador = comparador.getSiguiente();
                }
            }
            actual = actual.getSiguiente();
        }

        this.primero = null;
        listaOrdenada.primero = null;
        return listaOrdenadaAux;
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
    public int tamano() {
        int tamano = 0;
        INodo<T> actual = primero;
        while (actual != null) {
            tamano++;
            actual = actual.getSiguiente();
        }
        return tamano;
    }
}
