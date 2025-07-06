public class TArbolGenerico {
    private TNodoArbolGenerico raiz;

    public boolean insertar(String unaEtiqueta, String etiquetaPadre) {
        if (etiquetaPadre.equals("")) {
            if (raiz == null) {
                raiz = new TNodoArbolGenerico(unaEtiqueta,unaEtiqueta);
                return true;
            }
            return false;
        }
        if (raiz != null) {
            return raiz.insertar(unaEtiqueta, etiquetaPadre);
        }
        return false;
    }

    public void listarIndentado() {
        if (raiz != null) {
            raiz.listarIndentado(0);
        }
    }

    public TNodoArbolGenerico buscar(String etiqueta) {
        return (raiz != null) ? raiz.buscar(etiqueta) : null;
    }
}
