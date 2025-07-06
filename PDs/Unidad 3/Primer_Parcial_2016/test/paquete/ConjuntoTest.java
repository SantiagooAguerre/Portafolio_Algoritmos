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
     * Test of complemento method, of class Conjunto.
     */
    @Test
    public void testComplemento() {
        Alumno alumno=new Alumno(1,"Maria");
        Alumno alumno2=new Alumno(2,"Jose");
        Alumno alumno3=new Alumno(3,"Carlos");
        Alumno alumno4=new Alumno(4,"Juan");
        Alumno alumno5=new Alumno(5,"Vake");
        IConjunto<Alumno> conjuntoUniverso = new Conjunto<>();
        conjuntoUniverso.insertar(alumno);
        conjuntoUniverso.insertar(alumno2);
        conjuntoUniverso.insertar(alumno3);
        conjuntoUniverso.insertar(alumno4);
        conjuntoUniverso.insertar(alumno5);

        IConjunto<Alumno>conjunto = new Conjunto<>();
        conjunto.insertar(alumno);
        conjunto.insertar(alumno2);
        conjunto.insertar(alumno3);

        IConjunto<Alumno> complemento = conjuntoUniverso.complemento(conjunto);
        assertEquals(2,complemento.contador());
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
