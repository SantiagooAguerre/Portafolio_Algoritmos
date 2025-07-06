/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package paquete;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Estudiante UCU
 */
public class ListaOrdenadaTest {
    
    public ListaOrdenadaTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of mezclarCon method, of class ListaOrdenada.
     */
    @Test
    public void testMezclarCon() {
        System.out.println("mezclarCon");
        ListaOrdenada instance = new ListaOrdenada();
        IListaOrdenada expResult = null;
        IListaOrdenada result = instance.mezclarCon(null);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarDuplicados method, of class ListaOrdenada.
     */
    @Test
    public void testEliminarDuplicados() {
        ListaOrdenada<Integer> listaOrdenada = new ListaOrdenada();
        listaOrdenada.insertar(1);
        listaOrdenada.insertar(2);
        listaOrdenada.insertar(3);
        listaOrdenada.insertar(4);

        ListaOrdenada<Integer> listaOrdenadaAux = new ListaOrdenada();
        listaOrdenadaAux.insertar(4);
        listaOrdenadaAux.insertar(5);
        listaOrdenadaAux.insertar(6);
        listaOrdenadaAux.insertar(7);
        listaOrdenadaAux.insertar(8);

        ListaOrdenada<Integer> resultado = (ListaOrdenada<Integer>) listaOrdenadaAux.eliminarDuplicados(listaOrdenada);
        assertTrue(listaOrdenadaAux.estaVacia());
        assertTrue(listaOrdenada.estaVacia());
        assertTrue(resultado.contiene(1));
        assertTrue(resultado.contiene(2));
        assertTrue(resultado.contiene(3));
        assertTrue(resultado.contiene(4));
        assertTrue(resultado.contiene(5));
        assertTrue(resultado.contiene(6));
        assertTrue(resultado.contiene(7));
        assertTrue(resultado.contiene(8));
        assertEquals(8,resultado.tamano());
    }

    /**
     * Test of insertar method, of class ListaOrdenada.
     */
    @Test
    public void testInsertar() {
        System.out.println("insertar");
        Object dato = null;
        ListaOrdenada instance = new ListaOrdenada();
        instance.insertar(dato);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminar method, of class ListaOrdenada.
     */
    @Test
    public void testEliminar() {
        System.out.println("eliminar");
        Object dato = null;
        ListaOrdenada instance = new ListaOrdenada();
        instance.eliminar(dato);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of contiene method, of class ListaOrdenada.
     */
    @Test
    public void testContiene() {
        System.out.println("contiene");
        Object dato = null;
        ListaOrdenada instance = new ListaOrdenada();
        boolean expResult = false;
        boolean result = instance.contiene(dato);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of estaVacia method, of class ListaOrdenada.
     */
    @Test
    public void testEstaVacia() {
        System.out.println("estaVacia");
        ListaOrdenada instance = new ListaOrdenada();
        boolean expResult = false;
        boolean result = instance.estaVacia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of imprimir method, of class ListaOrdenada.
     */
    @Test
    public void testImprimir() {
        System.out.println("imprimir");
        ListaOrdenada instance = new ListaOrdenada();
        instance.imprimir();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrimero method, of class ListaOrdenada.
     */
    @Test
    public void testGetPrimero() {
        System.out.println("getPrimero");
        ListaOrdenada instance = new ListaOrdenada();
        INodo expResult = null;
        INodo result = instance.getPrimero();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of tamano method, of class ListaOrdenada.
     */
    @Test
    public void testTamano() {
        System.out.println("tamano");
        ListaOrdenada instance = new ListaOrdenada();
        int expResult = 0;
        int result = instance.tamano();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testOrdenada() {
        ListaOrdenada<Integer> listaOrdenada = new ListaOrdenada();
        listaOrdenada.insertar(1);
        listaOrdenada.insertar(2);
        listaOrdenada.insertar(3);
        listaOrdenada.insertar(4);

        ListaOrdenada<Integer> listaOrdenadaAux = new ListaOrdenada();
        listaOrdenadaAux.insertar(5);
        listaOrdenadaAux.insertar(6);
        listaOrdenadaAux.insertar(7);
        listaOrdenadaAux.insertar(8);

        ListaOrdenada<Integer> resultado= (ListaOrdenada<Integer>) listaOrdenadaAux.mezclarCon(listaOrdenada);
        assertTrue(listaOrdenadaAux.estaVacia());
        assertTrue(listaOrdenada.estaVacia());

        assertTrue(resultado.contiene(1));
        assertTrue(resultado.contiene(2));
        assertTrue(resultado.contiene(3));
        assertTrue(resultado.contiene(4));
        assertTrue(resultado.contiene(5));
        assertTrue(resultado.contiene(6));
        assertTrue(resultado.contiene(7));
        assertTrue(resultado.contiene(8));

    }
    
}
