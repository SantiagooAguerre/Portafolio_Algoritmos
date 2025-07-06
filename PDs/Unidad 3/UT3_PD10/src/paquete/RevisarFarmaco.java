package paquete;
public class RevisarFarmaco {
    private Lista<Integer> listaBlanca;
    private Lista<ListaNegra> listaNegra;
    private Lista<Suero> sueros;
    private Lista<Farmaco> farmacos;

    public RevisarFarmaco(Lista<Integer> listaBlanca, Lista<ListaNegra> listaNegra, Lista<Suero> sueros, Lista<Farmaco> farmacos) {
        this.listaBlanca = listaBlanca;
        this.listaNegra = listaNegra;
        this.sueros = sueros;
        this.farmacos = farmacos;
    }
    
    /**** EL TIEMPO DE EJECUCION DE ESTE CODIGO ES O(N^2) ****/
    
    public boolean preparadoViable(int identificadorSuero, Lista<Integer> identificadorFarmaco) {
        if (sueros.buscar(identificadorSuero) == null) { /** O(1) **/
            return false;
        }
        
        Nodo<Integer> actual = identificadorFarmaco.getPrimero();
        while (actual != null) { /** O(N) **/
            Integer idFarmaco = actual.getDato();
            if (farmacos.buscar(idFarmaco) == null) {
                return false;
            } /** O(1) **/
            
            if (listaBlanca.buscar(idFarmaco) != null) {
                actual = actual.getSiguiente();
                continue;
            } /** O(1) **/
            
            Nodo<ListaNegra> nodoNegro = listaNegra.getPrimero();
            while (nodoNegro != null) { /** O(N) **/
                ListaNegra medinaInvalida = nodoNegro.getDato();
                if (medinaInvalida.getIdSuero() == identificadorSuero && medinaInvalida.getIdFarmaco() == idFarmaco) {
                    return false;
                } /** O(1) **/
                
                nodoNegro = nodoNegro.getSiguiente();
            }
            actual = actual.getSiguiente();
        }
        return true;
    }
}
