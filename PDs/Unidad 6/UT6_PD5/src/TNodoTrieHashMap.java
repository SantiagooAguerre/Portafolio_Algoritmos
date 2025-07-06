import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class TNodoTrieHashMap implements INodoTrie {

    Map<Character, TNodoTrieHashMap> hijos;
    private boolean esPalabra;
    private LinkedList<Integer> indices;

    public TNodoTrieHashMap() {
        hijos = new HashMap<>();
        esPalabra = false;
        indices = new LinkedList<>();
    }

    @Override
    public void insertar(String unaPalabra) {
        TNodoTrieHashMap nodo = this;
        for (int c = 0; c < unaPalabra.length(); c++) {
            char caracter = unaPalabra.charAt(c);
            if (!nodo.hijos.containsKey(caracter)) {
                nodo.hijos.put(caracter, new TNodoTrieHashMap());
            }
            nodo = nodo.hijos.get(caracter);
        }
        nodo.esPalabra = true;
    }

    public void insertarSufijo(String sufijo, int indice) {
        TNodoTrieHashMap nodo = this;
        for (int c = 0; c < sufijo.length(); c++) {
            char caracter = sufijo.charAt(c);
            if (!nodo.hijos.containsKey(caracter)) {
                nodo.hijos.put(caracter, new TNodoTrieHashMap());
            }
            nodo = nodo.hijos.get(caracter);
            nodo.indices.add(indice);
        }
        nodo.esPalabra = true;
    }

    private void imprimir(String s, TNodoTrieHashMap nodo) {
        if (nodo != null) {
            if (nodo.esPalabra) {
                System.out.println(s + " " + nodo.indices);
            }
            for (Map.Entry<Character, TNodoTrieHashMap> entrada : nodo.hijos.entrySet()) {
                imprimir(s + entrada.getKey(), entrada.getValue());
            }
        }
    }

    @Override
    public void imprimir() {
        imprimir("", this);
    }

    public TNodoTrieHashMap buscarNodoTrie(String s) {
        TNodoTrieHashMap nodo = this;
        for (int c = 0; c < s.length(); c++) {
            char caracter = s.charAt(c);
            if (!nodo.hijos.containsKey(caracter)) {
                return null;
            }
            nodo = nodo.hijos.get(caracter);
        }
        return nodo;
    }

    public LinkedList<Integer> buscarPatron(String patron) {
        TNodoTrieHashMap nodo = this;
        for (int c = 0; c < patron.length(); c++) {
            char caracter = patron.charAt(c);
            if (!nodo.hijos.containsKey(caracter)) {
                return new LinkedList<>();
            }
            nodo = nodo.hijos.get(caracter);
        }
        return nodo.obtenerTodosLosIndices();
    }

    private LinkedList<Integer> obtenerTodosLosIndices() {
        LinkedList<Integer> todosIndices = new LinkedList<>();
        if (this.esPalabra) {
            todosIndices.addAll(this.indices);
        }
        for (TNodoTrieHashMap hijo : hijos.values()) {
            todosIndices.addAll(hijo.obtenerTodosLosIndices());
        }
        return todosIndices;
    }

    private void predecir(String s, String prefijo, LinkedList<String> palabras, TNodoTrieHashMap nodo) {
        if (nodo != null) {
            if (nodo.esPalabra) {
                palabras.add(s);
            }
            for (Map.Entry<Character, TNodoTrieHashMap> entrada : nodo.hijos.entrySet()) {
                predecir(s + entrada.getKey(), prefijo, palabras, entrada.getValue());
            }
        }
    }

    @Override
    public void predecir(String prefijo, LinkedList<String> palabras) {
        if (this.esPalabra) {
            palabras.add(prefijo);
        }

        for (Map.Entry<Character, TNodoTrieHashMap> entrada : hijos.entrySet()) {
            char caracter = entrada.getKey();
            TNodoTrieHashMap hijo = entrada.getValue();
            hijo.predecir(prefijo + caracter, palabras);
        }
    }

    @Override
    public int buscar(String s) {
        TNodoTrieHashMap nodo = this;
        int contador = 0;
        for (int c = 0; c < s.length(); c++) {
            char caracter = s.charAt(c);
            if (!nodo.hijos.containsKey(caracter)) {
                return 0;
            }
            contador++;
            nodo = nodo.hijos.get(caracter);
            if (contador == s.length() && !nodo.esPalabra) {
                return 0;
            }
        }
        return contador;
    }
}