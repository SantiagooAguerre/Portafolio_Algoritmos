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
public class TAlumnoTest {
    
    public TAlumnoTest() {
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
     * Test of toString method, of class TAlumno.
     */
    @Test
    public void testAlumnosCola() {
        TAlumno alumno1 = new TAlumno(1234, "Luca", "Perez");
        TAlumno alumno2 = new TAlumno(4567, "Maria", "Pedro");
        TAlumno alumno3 = new TAlumno(7890, "Jose", "Gomez");
        TAlumno alumno4 = new TAlumno(1122, "Ana", "Martínez");
        TAlumno alumno5 = new TAlumno(3344, "Pedro", "Fernández");

        Cola colaProg2 = new Cola();
        Cola colaAYEDD = new Cola();
        colaProg2.encolar(alumno1);
        colaProg2.encolar(alumno2);
        colaProg2.encolar(alumno3);

        colaAYEDD.encolar(alumno3);
        colaAYEDD.encolar(alumno4);
        colaAYEDD.encolar(alumno5);

        Cola union=(Cola)colaProg2.union(colaAYEDD);
        System.out.println("Union Cola: ");
        union.imprimir();
        assertEquals(5,union.tamano());

        Cola interseccion=(Cola)colaProg2.interseccion(colaAYEDD);
        System.out.println("Interseccion Cola: ");
        interseccion.imprimir();
        assertEquals(1,interseccion.tamano());
    }
    
    @Test
    public void testAlumnosPila(){
        TAlumno alumno1 = new TAlumno(1234, "Luca", "Perez");
        TAlumno alumno2 = new TAlumno(4567, "Maria", "Pedro");
        TAlumno alumno3 = new TAlumno(7890, "Jose", "Gomez");
        TAlumno alumno4 = new TAlumno(1122, "Ana", "Martínez");
        TAlumno alumno5 = new TAlumno(3344, "Pedro", "Fernández");

        Pila pilaProg = new Pila();
        Pila pilaAYEDD = new Pila();

        pilaProg.apilar(alumno1);
        pilaProg.apilar(alumno2);
        pilaProg.apilar(alumno3);

        pilaAYEDD.apilar(alumno3);
        pilaAYEDD.apilar(alumno4);
        pilaAYEDD.apilar(alumno4);
        pilaAYEDD.apilar(alumno5);

        Pila union = new Pila();
        union=(Pila) pilaProg.union(pilaAYEDD);
        System.out.println("Union Pila: ");
        union.imprimir();
        assertEquals(5,union.tamano());

        Pila intersection = new Pila();
        intersection=(Pila) pilaProg.interseccion(pilaAYEDD);
        System.out.println("Interseccion Pila: ");
        intersection.imprimir();
        assertEquals(1,intersection.tamano());
    }
    
}
