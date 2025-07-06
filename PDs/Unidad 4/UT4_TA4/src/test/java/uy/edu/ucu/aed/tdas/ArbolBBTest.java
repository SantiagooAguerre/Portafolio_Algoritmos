/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package uy.edu.ucu.aed.tdas;

import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import uy.edu.ucu.aed.tdas.*;
import uy.edu.ucu.aed.tdas.ArbolBB;
import uy.edu.ucu.aed.tdas.IArbolBB;

/**
 *
 * @author Estudiante UCU
 */
public class ArbolBBTest {
    
    public ArbolBBTest() {
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
     * Test of insertar method, of class ArbolBB.
     */
    @Test
    public void testInsertar() {
        System.out.println("insertar");
        Comparable etiqueta = 2;
        Object unDato = 2;
        IArbolBB instance = new ArbolBB();
        boolean expResult = true;
        boolean result = instance.insertar(etiqueta, unDato);
        assertEquals(expResult, result);
    }

    /**
     * Test of buscar method, of class ArbolBB.
     */
    @Test
    public void testBuscar() {
        System.out.println("buscar");
        IArbolBB instance = new ArbolBB();
        Comparable unaEtiqueta = 2;
        instance.insertar(unaEtiqueta, "2");
        Object expResult = "2";
        Object result = instance.buscar(unaEtiqueta);
        assertEquals(expResult, result);
    }

    /**
     * Test of eliminar method, of class ArbolBB.
     */
    @Test
    public void testEliminar() {
        System.out.println("eliminar");
        Comparable unaEtiqueta = null;
        ArbolBB instance = new ArbolBB();
        instance.eliminar(unaEtiqueta);
    }

    /**
     * Test of preOrden method, of class ArbolBB.
     */
    @Test
    public void testPreOrden() {
        System.out.println("preOrden");
        ArbolBB instance = new ArbolBB();
        List expResult = null;
        List result = instance.preOrden();
        assertEquals(Collections.emptyList(), result);
    }

    /**
     * Test of inOrden method, of class ArbolBB.
     */
    @Test
    public void testInOrden() {
        System.out.println("inOrden");
        ArbolBB instance = new ArbolBB();
        List expResult = null;
        List result = instance.inOrden();
        assertEquals(expResult, result);
    }

    /**
     * Test of postOrden method, of class ArbolBB.
     */
    @Test
    public void testPostOrden() {
        System.out.println("postOrden");
        ArbolBB instance = new ArbolBB();
        List expResult = null;
        List result = instance.postOrden();
        assertEquals(expResult, result);
    }

    /**
     * Test of esVacio method, of class ArbolBB.
     */
    @Test
    public void testEsVacio() {
        System.out.println("esVacio");
        ArbolBB instance = new ArbolBB();
        boolean expResult = true;
        boolean result = instance.esVacio();
        assertEquals(expResult, result);
    }

    /**
     * Test of vaciar method, of class ArbolBB.
     */
    @Test
    public void testVaciar() {
        System.out.println("vaciar");
        ArbolBB instance = new ArbolBB();
        boolean expResult = false;
        boolean result = instance.vaciar();
        assertEquals(expResult, result);
    }

    /**
     * Test of getAltura method, of class ArbolBB.
     */
    @Test
    public void testGetAltura() {
        System.out.println("getAltura");
        ArbolBB instance = new ArbolBB();
        int result = instance.getAltura();
        assertEquals(-1, result);
    }

    /**
     * Test of getHojas method, of class ArbolBB.
     */
    @Test
    public void testGetHojas() {
        System.out.println("getHojas");
        ArbolBB instance = new ArbolBB();
        int expResult = 0;
        int result = instance.getHojas();
        assertEquals(expResult, result);
    }

    /**
     * Test of getNivel method, of class ArbolBB.
     */
    @Test
    public void testGetNivel() {
        System.out.println("getNivel");
        Comparable unaEtiqueta = null;
        ArbolBB instance = new ArbolBB();
        int expResult = -1;
        int result = instance.getNivel(unaEtiqueta);
        assertEquals(expResult, result);
    }

    /**
     * Test of getTamano method, of class ArbolBB.
     */
    @Test
    public void testGetTamano() {
        System.out.println("getTamano");
        ArbolBB instance = new ArbolBB();
        int expResult = 0;
        int result = instance.getTamano();
        assertEquals(expResult, result);
    }
    
}
