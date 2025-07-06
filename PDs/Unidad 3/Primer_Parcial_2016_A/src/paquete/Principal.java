package paquete;

public class Principal {

    public static void main(String[] args) {
        Alumno alumno=new Alumno(1,"Maria");
        Alumno alumno2=new Alumno(2,"Jose");
        Alumno alumno3=new Alumno(3,"Carlos");
        Alumno alumno4=new Alumno(4,"Juan");
        Alumno alumno5=new Alumno(5,"Vake");
        IConjunto<Alumno> conjunto1 = new Conjunto<>();
        conjunto1.insertar(alumno);
        conjunto1.insertar(alumno2);
        conjunto1.insertar(alumno3);
        conjunto1.insertar(alumno4);
        conjunto1.insertar(alumno5);

        IConjunto<Alumno> conjunto2 = new Conjunto<>();
        conjunto2.insertar(alumno);
        conjunto2.insertar(alumno2);
        conjunto2.insertar(alumno3);

        IConjunto<Alumno> diferencia = conjunto1.diferenciaSimetrica(conjunto2);
        System.out.println(diferencia);
    }
    
}
