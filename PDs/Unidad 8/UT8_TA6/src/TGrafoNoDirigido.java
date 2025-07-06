
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class TGrafoNoDirigido extends TGrafoDirigido implements IGrafoNoDirigido {
    protected TAristas lasAristas = new TAristas();

    /**
     *
     * @param vertices
     * @param aristas
     */
    public TGrafoNoDirigido(Collection<TVertice> vertices, Collection<TArista> aristas) {
        super(vertices, aristas);
        lasAristas.insertarAmbosSentidos(aristas);

    }

    @Override
    public boolean insertarArista(TArista arista) {
        boolean tempbool = false;
        TArista arInv = new TArista(arista.getEtiquetaDestino(), arista.getEtiquetaOrigen(), arista.getCosto());
        tempbool = (super.insertarArista(arista) && super.insertarArista(arInv));
        return tempbool;
    }

    public TAristas getLasAristas() {
        return lasAristas;
    }

    @Override
    public TGrafoNoDirigido Prim() {
        if (this.getVertices().isEmpty()) {
            return null;
        }
        TGrafoNoDirigido mst = new TGrafoNoDirigido(this.getVertices().values(), new LinkedList<>());
        Set<Comparable> visitados = new HashSet<>();
        PriorityQueue<TArista> pq = new PriorityQueue<>(Comparator.comparingDouble(TArista::getCosto));
        TVertice inicio = this.getVertices().values().iterator().next();
        visitados.add(inicio.getEtiqueta());
        for (TArista arista : this.getLasAristas()) {
            if (arista.getEtiquetaOrigen().equals(inicio.getEtiqueta())
                    && !visitados.contains(arista.getEtiquetaDestino())) {
                pq.add(arista);
            } else if (arista.getEtiquetaDestino().equals(inicio.getEtiqueta())
                    && !visitados.contains(arista.getEtiquetaOrigen())) {
                pq.add(new TArista(arista.getEtiquetaDestino(), arista.getEtiquetaOrigen(), arista.getCosto()));
            }
        }

        while (!pq.isEmpty() && visitados.size() < this.getVertices().size()) {
            TArista aristaMin = pq.poll();

            Comparable destino = aristaMin.getEtiquetaDestino();
            if (visitados.contains(destino)) {
                continue;
            }

            mst.getLasAristas().add(aristaMin);
            visitados.add(destino);

            for (TArista arista : this.getLasAristas()) {
                if (arista.getEtiquetaOrigen().equals(destino)
                        && !visitados.contains(arista.getEtiquetaDestino())) {
                    pq.add(arista);
                } else if (arista.getEtiquetaDestino().equals(destino)
                        && !visitados.contains(arista.getEtiquetaOrigen())) {
                    pq.add(new TArista(arista.getEtiquetaDestino(), arista.getEtiquetaOrigen(), arista.getCosto()));
                }
            }
        }

        if (esConexo() == false) {
            System.err.println("El grafo no es conexo. MST incompleto.");
            return null;
        }

        return mst;
    }

    @Override
    public TGrafoNoDirigido Kruskal() {
        TGrafoNoDirigido mst = new TGrafoNoDirigido(this.getVertices().values(), new LinkedList<>());
        List<TArista> aristas = new ArrayList<>(lasAristas);
        aristas.sort(Comparator.comparingDouble(TArista::getCosto));
        Map<Comparable, Integer> componentes = new HashMap<>();
        int idComponente = 0;
        for (TVertice v : this.getVertices().values()) {
            componentes.put(v.getEtiqueta(), idComponente++);
        }
        for (TArista arista : aristas) {
            Comparable origen = arista.getEtiquetaOrigen();
            Comparable destino = arista.getEtiquetaDestino();
            int compOrigen = componentes.get(origen);
            int compDestino = componentes.get(destino);
            if (compOrigen != compDestino) {
                mst.getLasAristas().add(arista);

                for (Map.Entry<Comparable, Integer> entry : componentes.entrySet()) {
                    if (entry.getValue() == compDestino) {
                        entry.setValue(compOrigen);
                    }
                }

                if (esConexo() == false) {
                    System.err.println("El grafo no es conexo. MST incompleto.");
                    return null;
                }
            }
        }

        return mst;
    }

    @Override
    public Collection<TVertice> bea(Comparable etiquetaOrigen) {
        LinkedList<TVertice> resultado = new LinkedList<>();
        if (this.getVertices().isEmpty() || !this.existeVertice(etiquetaOrigen)) {
            return resultado;
        }

        this.desvisitarVertices();
        TVertice origen = this.buscarVertice(etiquetaOrigen);
        Queue<TVertice> cola = new LinkedList<>();

        origen.setVisitado(true);
        cola.add(origen);

        while (!cola.isEmpty()) {
            TVertice actual = cola.poll();
            resultado.add(actual);

            for (Object adyacenciaObj : actual.getAdyacentes()) {
                TAdyacencia adyacencia = (TAdyacencia) adyacenciaObj;
                TVertice adyacente = adyacencia.getDestino();
                if (!adyacente.getVisitado()) {
                    adyacente.setVisitado(true);
                    cola.add(adyacente);
                }
            }
        }

        return resultado;
    }

    @Override
    public boolean esConexo() {
        if (this.getVertices().isEmpty()) {
            return true;
        }
        Comparable etiquetaOrigen = this.getVertices().keySet().iterator().next();
        Collection<TVertice> visitados = this.bea(etiquetaOrigen);
        return visitados != null && visitados.size() == this.getVertices().size();
    }

    @Override
    public boolean conectados(TVertice origen, TVertice destino) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from
                                                                       // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public LinkedList<TVertice> puntosArticulacion(Comparable etOrigen) {
        LinkedList<TVertice> puntos = new LinkedList<>();
        if (!this.getVertices().containsKey(etOrigen)) {
            System.out.println("El vertice no se encuentra");
            return puntos;
        }

        for (TVertice v : this.getVertices().values()) {
            v.setVisitado(false);
            v.setNumBp(-1);
            v.setNumBajo(-1);
        }

        int[] tiempo = { 0 };
        puntosArticulacionDFS(this.getVertices().get(etOrigen), null, tiempo, puntos);
        return puntos;
    }

    private void puntosArticulacionDFS(TVertice actual, TVertice padre, int[] tiempo, LinkedList<TVertice> puntos) {
        actual.setVisitado(true);
        actual.setNumBp(tiempo[0]);
        actual.setNumBajo(tiempo[0]);
        tiempo[0]++;

        int hijos = 0;
        boolean esPunto = false;

        for (Object adyacencia1 : actual.getAdyacentes()) {
            TAdyacencia adyacencia = (TAdyacencia) adyacencia1;
            TVertice ady = adyacencia.getDestino();
            if (!ady.getVisitado()) {
                hijos++;
                puntosArticulacionDFS(ady, actual, tiempo, puntos);
                actual.setNumBajo(Math.min(actual.getNumBajo(), ady.getNumBajo()));

                if (padre != null && ady.getNumBajo() >= actual.getNumBp()) {
                    esPunto = true;
                }
            } else if (ady != padre) {
                actual.setNumBajo(Math.min(actual.getNumBajo(), ady.getNumBp()));
            }
        }

        if ((padre == null && hijos > 1) || (padre != null && esPunto)) {
            puntos.add(actual);
        }
    }

    public void imprimirArbolesGeneradoresMinimos(TGrafoNoDirigido mst) {
        if (mst == null || mst.getLasAristas().isEmpty()) {
            return;
        }
        System.out.println("Aristas del Árbol Generador Mínimo:");
        for (TArista arista : mst.getLasAristas()) {
            System.out.println(arista.getEtiquetaOrigen() + " - " +
                    arista.getEtiquetaDestino() + " : " +
                    arista.getCosto());
        }
    }

    public String getCostoTotal() {
        double costoTotal=0;
        for(TArista arista:lasAristas) {
            costoTotal+=arista.getCosto();
        }
        return String.format("%.2f", costoTotal);
    }

}
