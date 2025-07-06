package paquete;

public class TAlumno {
    int cedula;
    String nombre;
    String apellido;
    
    public TAlumno(int cedula, String nombre, String apellido) {
        if (String.valueOf(cedula).length() < 7) {
            throw new IllegalArgumentException("La cedula no es valida");

        }
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    public int getCedula() {
        return cedula;
    }
    
    public String getNombre() {
        nombre = nombre.toUpperCase();
        return nombre;
    }
    
    public String getApellido() {
        apellido = apellido.toUpperCase();
        return apellido;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        TAlumno alumno = (TAlumno) obj;
        return cedula == alumno.cedula;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(cedula);
    }

    @Override
    public String toString() {
        return "TAlumno{" + "cedula=" + cedula + ", nombre='" + nombre + '\'' + ", apellido='" + apellido + '\'' + '}';
    }
}
