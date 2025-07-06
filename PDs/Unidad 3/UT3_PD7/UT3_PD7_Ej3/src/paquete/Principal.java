package paquete;
public class Principal {

    public static void main(String[] args) {
        TAlumno alumno1 = new TAlumno(55531973, "Santiago", "Aguerre");
        TAlumno alumno2 = new TAlumno(12345678, "Magali", "Aguerre");
        TAlumno alumno3 = new TAlumno(98765432, "Fabian", "Aguerre");
        TAlumno alumno4 = new TAlumno(87945612, "Paola", "Brun");

        Conjunto cursoAED1 = new Conjunto();
        Conjunto cursoPF = new Conjunto();

        cursoAED1.insertar(alumno1);
        cursoAED1.insertar(alumno2);

        cursoPF.insertar(alumno2);
        cursoPF.insertar(alumno3);
        cursoPF.insertar(alumno4);
        cursoPF.insertar(alumno1);

        System.out.println("Alumnos en el curso Algoritmos y Estructuras de Datos I:");
        cursoAED1.imprimir();
        System.out.println("\nAlumnos en el curso Programación Funcional:");
        cursoPF.imprimir();
        Conjunto union=(Conjunto) cursoAED1.union(cursoPF);
        System.out.println("\nAlumnos tanto en PF o en AED1:");
        union.imprimir();

        Conjunto interseccion=(Conjunto) cursoAED1.interseccion(union);
        System.out.println("\nAlumnos tanto en PF y AED1:");
        interseccion.imprimir();

    }
    
}
