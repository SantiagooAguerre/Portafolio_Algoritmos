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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Alumno otro = (Alumno) obj;
        return this.id == otro.id;
    }

    @Override
    public String toString() {
        return "Alumno{id=" + id + ", nombre='" + nombre + "'}";
    }

}
