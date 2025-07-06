import java.util.Collection;
import java.util.LinkedList;

public class PruebaGrafo {

    public static void main(String[] args) {
        TGrafoNoDirigido gnd = (TGrafoNoDirigido) UtilGrafos.cargarGrafo("src/vert2.txt", "src/ari2.txt",
                false, TGrafoNoDirigido.class);

      gnd.bea("1");


      TGrafoNoDirigido grafoPrim = gnd.Kruskal();
      gnd.imprimirArbolesGeneradoresMinimos(grafoPrim);
       System.out.println("cantidad de vertices del grafo por prim: "  + grafoPrim.getVertices().size());
       System.out.println("Costo total: " + grafoPrim.getCostoTotal() + "");
  
         TGrafoNoDirigido grafoKruskal = gnd.Kruskal();
       System.out.println("cantidad de vertices del grafo por kruskal: "  + grafoKruskal.getVertices().size());
       System.out.println("Costo total: " + grafoKruskal.getCostoTotal() + "");
       
    }
}