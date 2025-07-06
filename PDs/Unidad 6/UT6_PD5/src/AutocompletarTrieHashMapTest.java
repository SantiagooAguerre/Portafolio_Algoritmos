import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.LinkedList;

public class AutocompletarTrieHashMapTest {
    private AutocompletarTrieHashMap autocompletar;
    
    @BeforeEach
    public void setUp() {
        autocompletar = new AutocompletarTrieHashMap();
        String[] diccionario = {
            "casa", "casamiento", "casero", "caserío", "carta", "cartón",
            "carro", "caramelo", "computadora", "compra", "comprar", "compañía",
            "perro", "perrito", "perrera", "persona", "persiana", "pez", "pedal"
        };
        autocompletar.cargarDiccionario(diccionario);
    }
    
    @Test
    public void testSugerenciasPrefijoCas() {
        LinkedList<String> sugerencias = autocompletar.obtenerSugerencias("cas");
        assertEquals(4, sugerencias.size());
        assertTrue(sugerencias.contains("casa"));
        assertTrue(sugerencias.contains("casamiento"));
        assertTrue(sugerencias.contains("casero"));
        assertTrue(sugerencias.contains("caserío"));
    }
    
    @Test
    public void testSugerenciasPrefijoCom() {
        LinkedList<String> sugerencias = autocompletar.obtenerSugerencias("com");
        assertEquals(4, sugerencias.size());
        assertTrue(sugerencias.contains("computadora"));
        assertTrue(sugerencias.contains("compra"));
        assertTrue(sugerencias.contains("comprar"));
        assertTrue(sugerencias.contains("compañía"));
    }
    
    @Test
    public void testSugerenciasPrefijoPer() {
        LinkedList<String> sugerencias = autocompletar.obtenerSugerencias("per");
        assertEquals(5, sugerencias.size());
        assertTrue(sugerencias.contains("perro"));
        assertTrue(sugerencias.contains("perrito"));
        assertTrue(sugerencias.contains("perrera"));
        assertTrue(sugerencias.contains("persona"));
        assertTrue(sugerencias.contains("persiana"));
    }
    
    @Test
    public void testSugerenciasPrefijoInexistente() {
        LinkedList<String> sugerencias = autocompletar.obtenerSugerencias("xyz");
        assertTrue(sugerencias.isEmpty());
    }
    
    @Test
    public void testSugerenciasPrefijoVacio() {
        LinkedList<String> sugerencias = autocompletar.obtenerSugerencias("");
        assertTrue(sugerencias.size() > 0); // Debería devolver todas las palabras
    }
    
    @Test
    public void testSugerenciasCaseInsensitive() {
        LinkedList<String> sugerencias1 = autocompletar.obtenerSugerencias("CAS");
        LinkedList<String> sugerencias2 = autocompletar.obtenerSugerencias("cas");
        assertEquals(sugerencias1, sugerencias2);
    }
    
    @Test
    public void testSugerenciasPalabraCompleta() {
        LinkedList<String> sugerencias = autocompletar.obtenerSugerencias("caramelo");
        assertEquals(1, sugerencias.size());
        assertTrue(sugerencias.contains("caramelo"));
    }
}