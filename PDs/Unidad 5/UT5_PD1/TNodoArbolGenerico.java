public class TNodoArbolGenerico {
    private String etiqueta;
    private Object datos;
    private TNodoArbolGenerico primerHijo;
    private TNodoArbolGenerico hermanoDerecho;

    public String etiqueta (){
        return etiqueta;
    }

    public Object datos (){
        return datos;
    }

    public TNodoArbolGenerico(Object dato,String etiqueta) {
        this.etiqueta = etiqueta;
        this.datos = dato;
    }

    public boolean insertar(String unaEtiqueta, String etiquetaPadre) {
        if (this.etiqueta.equals(etiquetaPadre)) {
            TNodoArbolGenerico nuevo = new TNodoArbolGenerico(unaEtiqueta,unaEtiqueta);
            if (primerHijo == null) {
                primerHijo = nuevo;
            } else {
                TNodoArbolGenerico actual = primerHijo;
                while (actual.hermanoDerecho != null) {
                    actual = actual.hermanoDerecho;
                }
                actual.hermanoDerecho = nuevo;
            }
            return true;
        } else {
            if (primerHijo != null && primerHijo.insertar(unaEtiqueta, etiquetaPadre)) {
                return true;
            }
            if (hermanoDerecho != null && hermanoDerecho.insertar(unaEtiqueta, etiquetaPadre)) {
                return true;
            }
        }
        return false;
    }

    public void listarIndentado(int depth) {
        System.out.println("    ".repeat(depth) + etiqueta);
        if (primerHijo != null) {
            primerHijo.listarIndentado(depth + 1);
        }
        if (hermanoDerecho != null) {
            hermanoDerecho.listarIndentado(depth);
        }
    }
    public TNodoArbolGenerico buscar(String unaEtiqueta) {
        if (this.etiqueta.equals(unaEtiqueta)) {
            return this;
        }
        TNodoArbolGenerico resultado = null;
        if (primerHijo != null) {
            resultado = primerHijo.buscar(unaEtiqueta);
        }
        if (resultado == null && hermanoDerecho != null) {
            resultado = hermanoDerecho.buscar(unaEtiqueta);
        }
        return resultado;
    }
}
