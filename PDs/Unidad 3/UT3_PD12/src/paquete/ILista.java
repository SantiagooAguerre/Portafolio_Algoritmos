package paquete;
import java.util.ArrayList;

public interface ILista<T> {
    void imprimir();
    ArrayList<TAlumno> procesarConjunto(String elemento);
    void insertar(T elemento);
    void eliminar(T elemento);
    boolean contiene(T elemento);

}
