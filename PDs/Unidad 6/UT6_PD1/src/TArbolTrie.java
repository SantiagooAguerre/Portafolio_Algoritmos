import java.util.LinkedList;

public class TArbolTrie implements IArbolTrie {

    private TNodoTrie raiz;

    @Override
    public void insertar(String palabra) {
        if (raiz == null) {
            raiz = new TNodoTrie();
        }
        raiz.insertar(palabra);
    }

    @Override
    public void imprimir() {
        if (raiz != null) {
            raiz.imprimir();
        }
    }

    @Override
    public int buscar(String palabra) {
        return raiz != null ? raiz.buscar(palabra) : 0;
    }

    @Override
    public LinkedList<String> predecir(String prefijo) {
        LinkedList<String> palabras = new LinkedList<>();
        if (raiz != null) {
            TNodoTrie nodoPrefijo = raiz.buscarNodo(prefijo);
            if (nodoPrefijo != null) {
                nodoPrefijo.predecir(prefijo, palabras);
            }
        }
        return palabras;
    }

    public void medirTiempoBusquedas(String[] palabrasABuscar, int repeticiones) {
        long inicio = System.nanoTime();

        for (int i = 0; i < repeticiones; i++) {
            for (String palabra : palabrasABuscar) {
                this.buscar(palabra);
            }
        }

        long fin = System.nanoTime();
        double tiempoTotal = (fin - inicio) / 1_000_000.0;
        System.out.printf("Tiempo total para %,d búsquedas: %.3f ms%n",
                palabrasABuscar.length * repeticiones, tiempoTotal);
    }
}