

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args){
        TArbolGenerico arbol = new TArbolGenerico();

        arbol.insertar("rectoria", "");
        arbol.insertar("vicerrectoria administrativa", "rectoria");
        arbol.insertar("vicerrectoria academica", "rectoria");
        arbol.insertar("vicerrectoria del medio universitario", "rectoria");
        arbol.insertar("facultad de ciencias empresariales", "vicerrectoria academica");
        arbol.insertar("facultad de ciencias humanas", "vicerrectoria academica");
        arbol.insertar("facultad de ingenieria y tecnologias", "vicerrectoria academica");
        arbol.insertar("facultad de psicologia", "vicerrectoria academica");
        arbol.insertar("departamento de informatica y ciencias de la computacion", "facultad de ingenieria y tecnologias");
        arbol.insertar("departamento de ingenieria electrica", "facultad de ingenieria y tecnologias");
        arbol.insertar("departamento de matematicas", "facultad de ingenieria y tecnologias");
        arbol.listarIndentado();
        System.out.println(arbol.buscar("rectoria").datos());
        System.out.println(arbol.buscar("facundo"));

    }
}