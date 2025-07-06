package paquete;

public class Alumno {

    private String nombre;
    private int id;

    public Alumno(int id, String nombre) {
        this.nombre = nombre;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public String toString() {
        return "Alumno{id=" + id + ", nombre='" + nombre + "'}";
    }

}
