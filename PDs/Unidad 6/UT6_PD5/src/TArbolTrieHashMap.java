import java.util.LinkedList;

public class TArbolTrieHashMap implements IArbolTrie {

    private TNodoTrieHashMap raiz;

    @Override
    public void insertar(String palabra) {
        if (raiz == null) {
            raiz = new TNodoTrieHashMap();
        }
        raiz.insertar(palabra);
    }

    public void insertarSufijos(String texto) {
        if (raiz == null) {
            raiz = new TNodoTrieHashMap();
        }
        for (int i = 0; i < texto.length(); i++) {
            String sufijo = texto.substring(i);
            raiz.insertarSufijo(sufijo, i);
        }
    }

    @Override
    public void imprimir() {
        if (raiz != null) {
            raiz.imprimir();
        }
    }

    @Override
    public int buscar(String palabra) {
        if (raiz == null) {
            return 0;
        }
        return raiz.buscar(palabra);
    }

    public LinkedList<Integer> buscarPatron(String patron) {
        if (raiz == null) {
            return new LinkedList<>();
        }
        return raiz.buscarPatron(patron);
    }

    @Override
public LinkedList<String> predecir(String prefijo) {
    LinkedList<String> palabras = new LinkedList<>();
    if (raiz == null) {
        return palabras;
    }
    
    TNodoTrieHashMap nodoActual = raiz;
    for (int i = 0; i < prefijo.length(); i++) {
        char c = prefijo.charAt(i);
        if (!nodoActual.hijos.containsKey(c)) {
            return palabras;
        }
        nodoActual = nodoActual.hijos.get(c);
    }
    
    nodoActual.predecir(prefijo, palabras);
    return palabras;
}
}