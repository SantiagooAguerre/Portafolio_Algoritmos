package paquete;

import java.io.BufferedReader;
import java.io.FileReader;

public class Conjunto<T> implements IConjunto<T> {

    private ILista<T> lista;

    public Conjunto() {
        lista = new Lista<>();
    }

    @Override
    public void insertar(T elemento) {
        if (!lista.contiene(elemento)) {
            lista.insertar(elemento);
        }
    }

    @Override
    public void eliminar(T elemento) {
        lista.eliminar(elemento);
    }

    @Override
    public boolean contiene(T elemento) {
        return lista.contiene(elemento);
    }

    @Override
    public boolean estaVacio() {
        return lista.estaVacia();
    }

    @Override
    public IConjunto<T> union(IConjunto<T> otro) {
        if (otro.estaVacio() && lista.estaVacia()) {
            return null;
        }
        Conjunto<T> resultado = new Conjunto<>();

        INodo<T> actual = lista.getPrimero();
        while (actual != null) {
            resultado.insertar(actual.getDato());
            actual = actual.getSiguiente();
        }

        INodo<T> actualOtro = ((Conjunto<T>) otro).lista.getPrimero();
        while (actualOtro != null) {
            resultado.insertar(actualOtro.getDato());
            actualOtro = actualOtro.getSiguiente();
        }

        return resultado;
    }

    @Override
    public IConjunto<T> interseccion(IConjunto<T> otro) {
        Conjunto<T> resultado = new Conjunto<>();
        INodo<T> actual = lista.getPrimero();
        while (actual != null) {
            if (otro.contiene(actual.getDato())) {
                resultado.insertar(actual.getDato());
            }
            actual = actual.getSiguiente();
        }
        return resultado;
    }

    @Override
    public void imprimir() {
        lista.imprimir();
    }

    public void cargarDesdeBasicoEmp(String archivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                if (datos.length == 2) {
                    int id = Integer.parseInt(datos[0]);
                    String nombre = datos[1];
                    T alumno = (T) new Alumno(id, nombre);
                    lista.insertar(alumno);
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void cargarDesdeIng(String archivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                if (datos.length == 2) {
                    int id = Integer.parseInt(datos[0]);
                    String nombre = datos[1];
                    T alumno = (T) new Alumno(id, nombre);
                    lista.insertar(alumno);
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
