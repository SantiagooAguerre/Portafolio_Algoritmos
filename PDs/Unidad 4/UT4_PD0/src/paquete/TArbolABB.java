package paquete;

public class TArbolABB {
    private TElementoABB raiz;

    public TArbolABB() {
        raiz = null;
    }

    public void setRaiz(TElementoABB raiz) {
        this.raiz = raiz;
    }

    public void sustituirVariable(String variable, int valor) {
        if (raiz != null) {
            raiz.sustituirVariable(variable, valor);
        } else {
            System.err.println("No se puede sustituir en arbol vacío");
        }
    }

    public int evaluar() {
        if (raiz == null) {
            System.err.println("El arbol está vacio");
            return 0;
        }
        return raiz.evaluar();
    }

    public void imprimir() {
        if (raiz != null) {
            System.out.println("Arbol:");
            raiz.imprimir(0);
        } else {
            System.out.println("Arbol vacío");
        }
    }
}
