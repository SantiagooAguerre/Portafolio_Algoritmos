package paquete;
import java.util.ArrayList;

public interface IConjunto<T> extends ILista<T> {
    IConjunto<T> union(IConjunto<TAlumno> otroConjunto);
    IConjunto<T> interseccion(IConjunto<TAlumno> otroConjunto);
    ArrayList<T> getConjunto();
}

