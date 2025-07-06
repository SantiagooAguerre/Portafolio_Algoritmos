/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete;

public class Lista<T> implements ILista<T> {

    private Nodo<T> primero;

    public Lista() {
        primero = null;
    }

    @Override
    public void insertar(Nodo nodo) {
        if (primero == null) {
            primero = nodo;
        } else {
            Nodo<T> nodos = primero;
            while (nodos != null) {
                nodos = nodos.getSiguiente();
            }
            nodos.setSiguiente(nodo);
        }
    }

    @Override
    public void insertar(Comparable etiqueta, T dato) {
        Nodo<T> nodoNuevo = new Nodo<>(dato, etiqueta);
        insertar(nodoNuevo);
    }

    @Override
    public Nodo buscar(Comparable clave) {
        Nodo<T> nodo = primero;
        while (nodo != null) {
            if (nodo.getEtiqueta().equals(clave)) {
                return nodo;
            }
            nodo = nodo.getSiguiente();
        }
        return null;

    }

    @Override
    public boolean eliminar(Comparable clave) {
        Nodo<T> nodo = primero;
        Nodo<T> anterior = null;
        while (nodo != null) {
            if (nodo.getEtiqueta().equals(clave)) {
                if (anterior == null) {
                    primero = nodo.getSiguiente();
                } else {
                    anterior.setSiguiente(nodo.getSiguiente());
                }
                return true;
            }
            anterior = nodo;
            nodo = nodo.getSiguiente();
        }
        return false;
    }

    @Override
    public String imprimir() {
        if (primero == null) {
            return "";
        }
        StringBuilder info = new StringBuilder();
        Nodo<T> nodo = primero;
        while (nodo != null) {
            info.append(nodo.getEtiqueta()).append(" -> ");
            nodo = nodo.getSiguiente();
        }
        return info.toString();
    }

    @Override
    public String imprimir(String separador) {
        if (primero == null) {
            return "";
        }
        StringBuilder info = new StringBuilder();
        Nodo<T> nodo = primero;
        while (nodo != null) {
            info.append(nodo.getEtiqueta());
            if (nodo.getEtiqueta() != null) {
                info.append(separador);
            }
            nodo = nodo.getSiguiente();
        }
        return info.toString();
    }

    @Override
    public int cantElementos() {
        Nodo<T> nodo = primero;
        int contador = 0;
        while (nodo != null) {
            contador++;
            nodo = nodo.getSiguiente();
        }
        return contador;
    }

    @Override
    public boolean esVacia() {
        return primero == null;
    }

    @Override
    public void setPrimero(Nodo unNodo) {
        primero = unNodo;
    }

}
