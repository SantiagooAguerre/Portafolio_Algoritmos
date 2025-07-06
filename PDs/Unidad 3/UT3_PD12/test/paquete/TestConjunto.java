package paquete;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestConjunto {
    
    @Test
    public void testInsertarYContiene() {
        ArrayList<TAlumno> alumnos = new ArrayList<>();
        TAlumno alumno = new TAlumno(12, "JUAN");
        TAlumno alumno2 = new TAlumno(1, "PEPE");
        TAlumno alumno3 = new TAlumno(42, "NICOL");
        TAlumno alumno4 = new TAlumno(22, "IGNACIA");
        alumnos.add(alumno);
        alumnos.add(alumno2);
        alumnos.add(alumno3);
        alumnos.add(alumno4);
        Conjunto conjunto = new Conjunto();
        for (int i = 0; i < alumnos.size(); i++) {
            conjunto.insertar(alumnos.get(i));
        }
        assertEquals(true, conjunto.contiene(alumno));
        assertEquals(true, conjunto.contiene(alumno2));
        assertEquals(true, conjunto.contiene(alumno3));
        assertEquals(true, conjunto.contiene(alumno4));
    }
    
    public void testUnion(){
        ArrayList<TAlumno> alumnos = new ArrayList<>();
        TAlumno alumno = new TAlumno(12, "JUAN");
        TAlumno alumno2 = new TAlumno(1, "PEPE");
        TAlumno alumno3 = new TAlumno(42, "NICOL");
        alumnos.add(alumno);
        alumnos.add(alumno2);
        alumnos.add(alumno3);
        Conjunto conjunto = new Conjunto();
        for (int i = 0; i < alumnos.size(); i++) {
            conjunto.insertar(alumnos.get(i));
        }


        ArrayList<TAlumno> alumnos2 = new ArrayList<>();
        TAlumno alumno1= new TAlumno(5,"MAGDALENA");
        TAlumno alumno4= new TAlumno(9,"VALERIA");
        TAlumno alumno5= new TAlumno(44,"NICO");
        alumnos2.add(alumno1);
        alumnos2.add(alumno4);
        alumnos2.add(alumno5);
        Conjunto conjunto2 = new Conjunto();
        for (int i = 0; i < alumnos2.size(); i++) {
            conjunto2.insertar(alumnos2.get(i));
        }

        IConjunto<TAlumno> union=conjunto.union(conjunto2);
        assertEquals(6,union.getConjunto().size());
    }
    
    @Test
    public void testInterseccionIguales() {
        ArrayList<TAlumno> alumnos = new ArrayList<>();
        TAlumno alumno = new TAlumno(12, "JUAN");
        TAlumno alumno2 = new TAlumno(1, "PEPE");
        TAlumno alumno3 = new TAlumno(42, "NICOL");
        alumnos.add(alumno);
        alumnos.add(alumno2);
        alumnos.add(alumno3);
        Conjunto conjunto = new Conjunto();
        for (int i = 0; i < alumnos.size(); i++) {
            conjunto.insertar(alumnos.get(i));
        }
        ArrayList<TAlumno> alumnos2 = new ArrayList<>();
        TAlumno alumno1= new TAlumno(5,"MAGDALENA");
        TAlumno alumno4= new TAlumno(9,"VALERIA");
        TAlumno alumno5= new TAlumno(44,"NICO");
        alumnos2.add(alumno1);
        alumnos2.add(alumno4);
        alumnos2.add(alumno5);
        alumnos2.add(alumno3);
        Conjunto conjunto2 = new Conjunto();
        for (int i = 0; i < alumnos2.size(); i++) {
            conjunto2.insertar(alumnos2.get(i));
        }
        IConjunto<TAlumno> interseccion = conjunto.interseccion(conjunto2);
        assertEquals(1,interseccion.getConjunto().size());
    }
    
    @Test
    public void eliminarAlumno(){
        ArrayList<TAlumno> alumnos = new ArrayList<>();
        TAlumno alumno = new TAlumno(12, "JUAN");
        TAlumno alumno2 = new TAlumno(1, "PEPE");
        TAlumno alumno3 = new TAlumno(42, "NICOL");
        alumnos.add(alumno);
        alumnos.add(alumno2);
        alumnos.add(alumno3);
        Conjunto conjunto = new Conjunto();
        for (int i = 0; i < alumnos.size(); i++) {
            conjunto.insertar(alumnos.get(i));
        }
        conjunto.eliminar(alumno);
        conjunto.eliminar(alumno2);
        assertEquals(1,conjunto.getConjunto().size());
    }
}