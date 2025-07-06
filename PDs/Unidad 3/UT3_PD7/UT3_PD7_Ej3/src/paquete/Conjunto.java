package paquete;

import java.util.ArrayList;

public class Conjunto implements IConjunto<TAlumno> {
    private ArrayList<TAlumno> conjuntoAlumnos;
    public Conjunto(){
        conjuntoAlumnos = new ArrayList<>();
    }

    @Override
    public ArrayList<TAlumno> getConjunto() {
        return conjuntoAlumnos;
    }
    
    public void insertar(TAlumno alumno) {
        if (!conjuntoAlumnos.contains(alumno)) {
            conjuntoAlumnos.add(alumno);
        }
    }
    public void eliminar(TAlumno alumno) {
        conjuntoAlumnos.remove(alumno);
    }
    public boolean contiene(TAlumno alumno) {
        return conjuntoAlumnos.contains(alumno);
    }

    @Override
    public IConjunto<TAlumno> union(IConjunto<TAlumno> conj) {
        Conjunto nuevoConjunto = new Conjunto();
        for (TAlumno alumno : this.conjuntoAlumnos) {
            nuevoConjunto.insertar(alumno);
        }
        for (TAlumno alumno : conj.getConjunto()) {
            if (!nuevoConjunto.contiene(alumno)) {
                nuevoConjunto.insertar(alumno);
            }
        }
        return nuevoConjunto;
    }

    @Override
    public IConjunto<TAlumno> interseccion(IConjunto<TAlumno> conj) {
        Conjunto nuevoConj = new Conjunto();
        for (TAlumno alumno : this.conjuntoAlumnos) {
            for (TAlumno alumno2 : conj.getConjunto()) {
                if (alumno.equals(alumno2)) {
                    nuevoConj.insertar(alumno);
                }
            }
        }
        return nuevoConj;
    }

    @Override
    public void imprimir() {
        System.out.println("Los estudiantes son: ");
        for (TAlumno alumno : conjuntoAlumnos) {
            System.out.println(alumno);
        }
    }

    @Override
    public ArrayList<TAlumno> procesarConjunto(String elemento) {
        ArrayList<TAlumno> lista = new ArrayList<>();
        String[] elementos = elemento.split(",");
        TAlumno alumno = new TAlumno(Integer.parseInt(elementos[0]), elementos[1], elementos[2]);
        lista.add(alumno);
        return lista;

    }
}

