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
public class TArbolBBTest {
    
    public TArbolBBTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    private static TArbolBB<Integer> arbol;
    @BeforeEach
    public void setUp(){
        arbol = new TArbolBB<>();
        arbol.insertar(new TElementoABB(1));
        arbol.insertar(new TElementoABB(2));
        arbol.insertar(new TElementoABB(3));
        arbol.insertar(new TElementoABB(4));
        arbol.insertar(new TElementoABB(5));

    }
    @Test
    public void testMenorClave(){
        assertEquals(1,arbol.menorClaveABB());
        System.out.println( "ClaveMenor: " + arbol.menorClaveABB());
    }

    @Test
    public void testMaxClave(){
        assertEquals(5,arbol.maxClaveABB());
        System.out.println( "ClaveMayor: " + arbol.maxClaveABB());
    }

    @Test
    public void testClaveAnterior(){
        assertEquals(3,arbol.claveAnteriorABB(new TElementoABB(4)));
        System.out.println( "ClaveAnterior: " + arbol.claveAnteriorABB(new TElementoABB(5)));
    }
    @Test
    public void testContNiveles(){
        TArbolBB<Integer> arbol2 = new TArbolBB<>();
        arbol2.insertar(new TElementoABB(4));
        arbol2.insertar(new TElementoABB(2));
        arbol2.insertar(new TElementoABB(1));
        arbol2.insertar(new TElementoABB(5));
        arbol2.insertar(new TElementoABB(6));
        arbol2.insertar(new TElementoABB(7));
        int cantNivel2=arbol2.contNivelesABB(2);
        assertEquals(2,cantNivel2);
        System.out.println( "Nivel2: " + cantNivel2);
    }
    @Test
    public void testCantHojas(){
        assertEquals(1,arbol.cantHojasABB());
    }
    @Test
    public void testVerificarABB(){
        TArbolBB<Integer> arbol2 = new TArbolBB<>();
        arbol2.insertar(new TElementoABB(4));
        arbol2.insertar(new TElementoABB(2));
        arbol2.insertar(new TElementoABB(1));
        arbol2.insertar(new TElementoABB(5));
        arbol2.insertar(new TElementoABB(6));
        arbol2.insertar(new TElementoABB(7));
        assertTrue(arbol2.verificarABB());
        System.out.println( "Verificar ABB: " + arbol2.verificarABB());
    }
    
}
