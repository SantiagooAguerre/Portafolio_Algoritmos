package paquete;

public class Principal {

    public static void main(String[] args) {
        Conjunto<Alumno> conjunto = new Conjunto<>();
        conjunto.cargarDesdeBasicoEmp("src/paquete/basico-empt.txt");
        Conjunto<Alumno> conjunto2 = new Conjunto<>();
        conjunto2.cargarDesdeIng("src/paquete/basico-ing.txt");
        IConjunto<Alumno> union = conjunto.union(conjunto2);
        union.imprimir();
        System.out.println("---");
        IConjunto<Alumno> interseccion = conjunto.interseccion(union);
        interseccion.imprimir();
    }
    
}
