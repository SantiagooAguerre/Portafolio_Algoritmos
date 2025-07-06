import java.util.LinkedList;
import java.util.Scanner;

public class AutocompletarTrieHashMap {
    private TArbolTrieHashMap trie;

    public AutocompletarTrieHashMap() {
        trie = new TArbolTrieHashMap();
    }

    public void cargarDiccionario(String[] palabras) {
        for (String palabra : palabras) {
            trie.insertar(palabra.toLowerCase());
        }
    }

    public LinkedList<String> obtenerSugerencias(String prefijo) {
        return trie.predecir(prefijo.toLowerCase());
    }

    public static void main(String[] args) {
        AutocompletarTrieHashMap autocompletar = new AutocompletarTrieHashMap();
        
        String[] diccionario = {
            "casa", "casamiento", "casero", "caserío", "carta", "cartón",
            "carro", "caramelo", "computadora", "compra", "comprar", "compañía",
            "perro", "perrito", "perrera", "persona", "persiana", "pez", "pedal"
        };
        
        autocompletar.cargarDiccionario(diccionario);
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sistema de Autocompletar (escribe 'salir' para terminar)");
        
        while (true) {
            System.out.print("\nIngresa un prefijo: ");
            String entrada = scanner.nextLine().trim();
            
            if (entrada.equalsIgnoreCase("salir")) {
                break;
            }
            
            if (entrada.isEmpty()) {
                System.out.println("Por favor ingresa un prefijo válido.");
                continue;
            }
            
            LinkedList<String> sugerencias = autocompletar.obtenerSugerencias(entrada);
            
            if (sugerencias.isEmpty()) {
                System.out.println("No se encontraron sugerencias para '" + entrada + "'");
            } else {
                System.out.println("Sugerencias para '" + entrada + "':");
                for (String sugerencia : sugerencias) {
                    System.out.println("- " + sugerencia);
                }
            }
        }
        
        scanner.close();
        System.out.println("Aplicación terminada.");
    }
}