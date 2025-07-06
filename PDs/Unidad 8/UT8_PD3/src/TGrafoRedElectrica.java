
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;


/**
 *
 * @author ocamp
 */
public class TGrafoRedElectrica extends TGrafoNoDirigido implements IGrafoRedElectrica{
    
    public TGrafoRedElectrica(Collection<TVertice> vertices, Collection<TArista> aristas) {
        super(vertices, aristas);
    }

    @Override
    public TAristas mejorRedElectrica() {
        LinkedList<TArista> aristasKruskal = new LinkedList();
        Map<Comparable, TVertice> vertices = getVertices();

        if (!vertices.isEmpty()) {
            desvisitarVertices();
            HashMap<Comparable, LinkedList<TVertice>> colecciones = new HashMap(vertices.size());
            LinkedList<TVertice> colTemp;

            for (TVertice v : vertices.values()) {
                colTemp = new LinkedList();
                colTemp.add(v);
                colecciones.put(v.getEtiqueta(), colTemp);
            }

            LinkedList<TArista> aristasOrdenadas = new LinkedList();
            forAristas:
            for (TArista a : lasAristas) {
                if (aristasOrdenadas.isEmpty() || aristasOrdenadas.getFirst().getCosto() > a.getCosto()) {
                    aristasOrdenadas.addFirst(a);
                    continue;
                }
                for (int i = 1; i < aristasOrdenadas.size(); i++) {
                    if (aristasOrdenadas.get(i).getCosto() > a.getCosto()) {
                        aristasOrdenadas.add(i - 1, a);
                        continue forAristas;
                    }
                }
                aristasOrdenadas.add(a);
            }

            TArista menorArista;
            LinkedList<TVertice> colOrigen, colDestino;
            while (!aristasOrdenadas.isEmpty()) {
                menorArista = aristasOrdenadas.pollFirst();
                colOrigen = colecciones.get(menorArista.etiquetaOrigen);
                colDestino = colecciones.get(menorArista.etiquetaDestino);
                if (colOrigen != colDestino) {
                    colOrigen.addAll(colDestino);
                    for (TVertice v : colDestino) {
                        if (colecciones.get(v.getEtiqueta()) != colOrigen) {
                            colecciones.replace(v.getEtiqueta(), colOrigen);
                        }
                    }
                    aristasKruskal.add(menorArista);
                }
            }
        }

        TGrafoNoDirigido grafo = new TGrafoNoDirigido(vertices.values(), aristasKruskal);
        return grafo.lasAristas;
    }
}