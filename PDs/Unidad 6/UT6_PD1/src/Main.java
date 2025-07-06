
public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {

        // LA MEMORIA QUE SE UTILIZA ES DE 68,200 BYTES (68.2 KB) // 
        TArbolTrie trie = new TArbolTrie();

        String[] palabrasclave = ManejadorArchivosGenerico.leerArchivo("./src/palabras1.txt");
        for (String p : palabrasclave) {
            trie.insertar(p);
        }
        trie.imprimir();

        String[] palabrasTest = { "surprise", "violin", "passion", "science", "portal" };
        int repeticiones = 10000;

        System.out.println("\n--- Prueba con implementación HashMap ---");
        trie.medirTiempoBusquedas(palabrasTest, repeticiones);
    }
}