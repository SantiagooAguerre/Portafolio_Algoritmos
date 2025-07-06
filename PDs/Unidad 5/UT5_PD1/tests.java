import org.junit.*;
import java.io.*;

import static org.junit.Assert.*;

public class tests {

    private TArbolGenerico arbol;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setup() {
        System.setOut(new PrintStream(outContent));

        arbol = new TArbolGenerico();

        arbol.insertar("hola", "");
        arbol.insertar("mundo", "hola");
        arbol.insertar("mundo!", "hola");
        arbol.insertar("mundo!!", "mundo");


    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    
    @Test
    public void testListarIdentado() {
        arbol.listarIndentado();
        String output = outContent.toString().replace("\r\n", "\n");
        String expected = "hola\n" +
                  "    mundo\n" +
                  "        mundo!!\n" +
                  "    mundo!\n";
    
        assertEquals(expected, output);
    }
}
