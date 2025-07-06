/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete;

/**
 *
 * @author Estudiante UCU
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Alumno alumno = new Alumno(1, "Maria");
        Alumno alumno2 = new Alumno(2, "Jose");
        Alumno alumno3 = new Alumno(3, "Carlos");
        Alumno alumno4 = new Alumno(4, "Juan");
        Alumno alumno5 = new Alumno(5, "Vake");
        IConjunto<Alumno> conjuntoUniverso = new Conjunto<>();
        conjuntoUniverso.insertar(alumno);
        conjuntoUniverso.insertar(alumno2);
        conjuntoUniverso.insertar(alumno3);
        conjuntoUniverso.insertar(alumno4);
        conjuntoUniverso.insertar(alumno5);

        IConjunto<Alumno> conjunto = new Conjunto<>();
        conjunto.insertar(alumno);
        conjunto.insertar(alumno3);

        IConjunto<Alumno> complemento = conjuntoUniverso.complemento(conjunto);
        System.out.println(complemento);

    }

}
