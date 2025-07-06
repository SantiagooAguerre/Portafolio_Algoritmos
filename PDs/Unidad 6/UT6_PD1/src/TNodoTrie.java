import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class TNodoTrie implements INodoTrie {

    private final Map<Character, TNodoTrie> hijos;
    private boolean esPalabra;

    public TNodoTrie() {
        this.hijos = new HashMap<>();
        this.esPalabra = false;
    }

    @Override
    public void insertar(String unaPalabra) {
        TNodoTrie nodoActual = this;
        for (int i = 0; i < unaPalabra.length(); i++) {
            char caracter = unaPalabra.charAt(i);
            TNodoTrie hijo = nodoActual.hijos.get(caracter);
            if (hijo == null) {
                hijo = new TNodoTrie();
                nodoActual.hijos.put(caracter, hijo);
            }
            nodoActual = hijo;
        }
        nodoActual.esPalabra = true;
    }

    @Override
    public int buscar(String s) {
        TNodoTrie nodoActual = this;
        int comparaciones = 0;
        
        for (int i = 0; i < s.length(); i++) {
            comparaciones++;
            char caracter = s.charAt(i);
            TNodoTrie hijo = nodoActual.hijos.get(caracter);
            if (hijo == null) {
                return comparaciones;
            }
            nodoActual = hijo;
        }
        
        return nodoActual.esPalabra ? comparaciones : -comparaciones;
    }

    @Override
    public void imprimir() {
        imprimirRecursivo("", this);
    }

    private void imprimirRecursivo(String prefijo, TNodoTrie nodo) {
        if (nodo.esPalabra) {
            System.out.println(prefijo);
        }
        for (Map.Entry<Character, TNodoTrie> entrada : nodo.hijos.entrySet()) {
            imprimirRecursivo(prefijo + entrada.getKey(), entrada.getValue());
        }
    }

    @Override
    public void predecir(String prefijo, LinkedList<String> palabras) {
        predecirRecursivo(prefijo, palabras);
    }

    private void predecirRecursivo(String prefijoActual, LinkedList<String> palabras) {
        if (this.esPalabra) {
            palabras.add(prefijoActual);
        }
        for (Map.Entry<Character, TNodoTrie> entrada : this.hijos.entrySet()) {
            entrada.getValue().predecirRecursivo(prefijoActual + entrada.getKey(), palabras);
        }
    }

    public TNodoTrie buscarNodo(String prefijo) {
        TNodoTrie nodoActual = this;
        for (int i = 0; i < prefijo.length(); i++) {
            char caracter = prefijo.charAt(i);
            TNodoTrie hijo = nodoActual.hijos.get(caracter);
            if (hijo == null) {
                return null;
            }
            nodoActual = hijo;
        }
        return nodoActual;
    }
}