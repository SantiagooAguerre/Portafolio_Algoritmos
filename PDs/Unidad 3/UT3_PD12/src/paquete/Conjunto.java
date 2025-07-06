package paquete;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class Conjunto implements IConjunto<TAlumno> {
    private ArrayList<TAlumno> basicoIng;
    private ArrayList<TAlumno> basicoEmp;

    public Conjunto() {
        basicoIng = new ArrayList<>();
        basicoEmp = new ArrayList<>();
    }

    @Override
    public IConjunto<TAlumno> union(IConjunto<TAlumno> otroConjunto) {
        Conjunto nuevoConjunto = new Conjunto();

        for (TAlumno alumno : this.getConjunto()) {
            nuevoConjunto.insertar(alumno);
        }

        for (TAlumno alumno : otroConjunto.getConjunto()) {
            nuevoConjunto.insertar(alumno);
        }

        return nuevoConjunto;
    }

    @Override
    public IConjunto<TAlumno> interseccion(IConjunto<TAlumno> otroConjunto) {
        Conjunto nuevoConjunto = new Conjunto();

        for (TAlumno alumno : this.getConjunto()) {
            if (otroConjunto.getConjunto().contains(alumno)) {
                nuevoConjunto.insertar(alumno);
            }
        }

        return nuevoConjunto;
    }

    @Override
    public void insertar(TAlumno alumno) {
        if (!this.basicoIng.contains(alumno) && !this.basicoEmp.contains(alumno)) {
            this.basicoIng.add(alumno);
        }
    }

    @Override
    public boolean contiene(TAlumno alumno) {
        return basicoIng.contains(alumno) || basicoEmp.contains(alumno);
    }

    @Override
    public ArrayList<TAlumno> getConjunto() {
        ArrayList<TAlumno> conjuntoCompleto = new ArrayList<>();
        conjuntoCompleto.addAll(basicoIng);
        conjuntoCompleto.addAll(basicoEmp);
        return conjuntoCompleto;
    }

    @Override
    public void eliminar(TAlumno alumno) {
        this.basicoIng.remove(alumno);
        this.basicoEmp.remove(alumno);
    }

    @Override
    public void imprimir() {
        System.out.println("Conjunto de alumnos: ");
        getConjunto().forEach(alumno -> System.out.println(alumno.toString()));
    }

    @Override
    public ArrayList<TAlumno> procesarConjunto(String elemento) {
        ArrayList<TAlumno> lista = new ArrayList<>();
        String[] elementos = elemento.split(",");

        TAlumno alumno = new TAlumno(Integer.parseInt(elementos[0]), elementos[1]);

        lista.add(alumno);
        return lista;
    }

    public void cargarDesdeBasicoEmp(String archivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");

                if (partes.length == 2) {
                    int id = Integer.parseInt(partes[0]);
                    String nombre = partes[1];
                    TAlumno alumno = new TAlumno(id, nombre);
                    insertar(alumno);
                } else {
                    System.out.println("Linea invalida " + linea);
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo");
        }
    }

    public void cargarDesdeBasicoIng(String archivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");

                if (partes.length == 2) {
                    int id = Integer.parseInt(partes[0]);
                    String nombre = partes[1];
                    TAlumno alumno = new TAlumno(id, nombre);
                    insertar(alumno);
                } else {
                    System.out.println("Linea invalida " + linea);
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo");
        }
    }
}