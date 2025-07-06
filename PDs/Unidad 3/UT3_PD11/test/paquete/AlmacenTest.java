/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package paquete;

import java.util.ArrayList;
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
public class AlmacenTest {
    
    public AlmacenTest() {
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

   @Test
    public void testInsertarEnOrdenAscendente() {
        Almacen almacen = new Almacen();
        almacen.agregarArticulo(1);
        almacen.agregarArticulo(2);
        almacen.agregarArticulo(3);
        almacen.agregarArticulo(4);
        almacen.agregarArticulo(5);
        almacen.agregarArticulo(6);
        almacen.agregarArticulo(7);
        almacen.agregarArticulo(8);
        almacen.agregarArticulo(9);
        almacen.agregarArticulo(10);
        almacen.agregarArticulo(11);
        almacen.agregarArticulo(12);
        almacen.agregarArticulo(13);

        almacen.mostrarArticulos();
        assertEquals(13, almacen.articulos.size());
        ArrayList<Integer> listaEsperada = new ArrayList<>();
        listaEsperada.add(1);
        listaEsperada.add(3);
        listaEsperada.add(5);
        listaEsperada.add(7);
        listaEsperada.add(9);
        listaEsperada.add(11);
        listaEsperada.add(13);
        listaEsperada.add(2);
        listaEsperada.add(4);
        listaEsperada.add(6);
        listaEsperada.add(8);
        listaEsperada.add(10);
        listaEsperada.add(12);
        assertEquals(listaEsperada, almacen.articulos);

    }
}
