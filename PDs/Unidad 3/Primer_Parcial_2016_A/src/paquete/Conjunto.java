package paquete;

import java.io.BufferedReader;
import java.io.FileReader;

public class Conjunto<T> implements IConjunto<T> {

    private ILista<T> listaDeClase;
    private INodo<T> primero;

    public Conjunto() {
        listaDeClase = new Lista<>();
    }

    @Override
    public void insertar(T elemento) {
        if (!listaDeClase.contiene(elemento)) {
            listaDeClase.insertar(elemento);
        }
    }

    @Override
    public void eliminar(T elemento) {
        listaDeClase.eliminar(elemento);
    }

    @Override
    public boolean contiene(T elemento) {
        return listaDeClase.contiene(elemento);
    }

    @Override
    public boolean estaVacio() {
        return listaDeClase.estaVacia();
    }

    @Override
    public void imprimir() {
        listaDeClase.imprimir();
    }

    @Override
    public IConjunto<T> diferenciaSimetrica(IConjunto<T> otro) {
        Conjunto<T> cond = new Conjunto<>();
        INodo<T> actual = listaDeClase.getPrimero();
        while (actual != null) {
            if (!otro.contiene(actual.getDato())) {
                cond.insertar(actual.getDato());
            }
            actual = actual.getSiguiente();
        }
        INodo<T> actual1 = otro.getPrimero();
        while (actual1 != null) {
            if (this.contiene(actual1.getDato())) {
                cond.insertar(actual1.getDato());
            }
            actual1 = actual1.getSiguiente();
        }
        return cond;

    }

    @Override
    public int contador() {
        int contador = 0;
        INodo<T> actual = listaDeClase.getPrimero();
        while (actual != null) {
            contador++;
            actual = actual.getSiguiente();
        }
        return contador;
    }

    public int tamano(IConjunto<T> otro) {
        int tamanho = 0;
        INodo<T> actual = listaDeClase.getPrimero();
        while (actual != null) {
            tamanho++;
            actual = actual.getSiguiente();
        }
        return tamanho;
    }

    @Override
    public INodo<T> getPrimero() {
        return primero;
    }

    public void cargarDesdeArchivo(String archivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                if (datos.length == 2) {
                    int id = Integer.parseInt(datos[0]);
                    String nombre = datos[1];
                    T alumno = (T) new Alumno(id, nombre);
                    listaDeClase.insertar(alumno);
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String toString() {
        return listaDeClase.toString();
    }

}
