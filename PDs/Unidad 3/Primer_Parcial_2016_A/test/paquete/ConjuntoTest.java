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
public class ConjuntoTest {
    
    public ConjuntoTest() {
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
     * Test of insertar method, of class Conjunto.
     */
    @Test
    public void testInsertar() {
        System.out.println("insertar");
        Object elemento = null;
        Conjunto instance = new Conjunto();
        instance.insertar(elemento);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminar method, of class Conjunto.
     */
    @Test
    public void testEliminar() {
        System.out.println("eliminar");
        Object elemento = null;
        Conjunto instance = new Conjunto();
        instance.eliminar(elemento);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of contiene method, of class Conjunto.
     */
    @Test
    public void testContiene() {
        System.out.println("contiene");
        Object elemento = null;
        Conjunto instance = new Conjunto();
        boolean expResult = false;
        boolean result = instance.contiene(elemento);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of estaVacio method, of class Conjunto.
     */
    @Test
    public void testEstaVacio() {
        System.out.println("estaVacio");
        Conjunto instance = new Conjunto();
        boolean expResult = false;
        boolean result = instance.estaVacio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of imprimir method, of class Conjunto.
     */
    @Test
    public void testImprimir() {
        System.out.println("imprimir");
        Conjunto instance = new Conjunto();
        instance.imprimir();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of diferenciaSimetrica method, of class Conjunto.
     */
    @Test
    public void testDiferencia() {
        Alumno alumno=new Alumno(1,"Maria");
        Alumno alumno2=new Alumno(2,"Jose");
        Alumno alumno3=new Alumno(3,"Carlos");
        Alumno alumno4=new Alumno(4,"Juan");
        Alumno alumno5=new Alumno(5,"Vake");
        IConjunto<Alumno> conjunto1 = new Conjunto<>();
        conjunto1.insertar(alumno);
        conjunto1.insertar(alumno2);
        conjunto1.insertar(alumno3);
        conjunto1.insertar(alumno4);
        conjunto1.insertar(alumno5);

        IConjunto<Alumno> conjunto2 = new Conjunto<>();
        conjunto2.insertar(alumno);
        conjunto2.insertar(alumno2);
        conjunto2.insertar(alumno3);

        IConjunto<Alumno> diferencia= conjunto1.diferenciaSimetrica(conjunto2);
        assertEquals(2, diferencia.contador());
    }

    /**
     * Test of contador method, of class Conjunto.
     */
    @Test
    public void testContador() {
        System.out.println("contador");
        Conjunto instance = new Conjunto();
        int expResult = 0;
        int result = instance.contador();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of tamano method, of class Conjunto.
     */
    @Test
    public void testTamano() {
        System.out.println("tamano");
        Conjunto instance = new Conjunto();
        int expResult = 0;
        int result = instance.tamano(null);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrimero method, of class Conjunto.
     */
    @Test
    public void testGetPrimero() {
        System.out.println("getPrimero");
        Conjunto instance = new Conjunto();
        INodo expResult = null;
        INodo result = instance.getPrimero();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cargarDesdeArchivo method, of class Conjunto.
     */
    @Test
    public void testCargarDesdeArchivo() {
        System.out.println("cargarDesdeArchivo");
        String archivo = "";
        Conjunto instance = new Conjunto();
        instance.cargarDesdeArchivo(archivo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
