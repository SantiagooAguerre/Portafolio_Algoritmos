
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      // cargar grafo con casas y distancias
        TGrafoRedElectrica laRed = (TGrafoRedElectrica) UtilGrafos.cargarGrafo("src/centros.txt", "src/costo_conexiones.txt",
                false, TGrafoRedElectrica.class);
        System.out.println(laRed.mejorRedElectrica().imprimirEtiquetas());
        String[] redes = laRed.mejorRedElectrica().imprimirEtiquetas().split("\n");
        ManejadorArchivosGenerico.escribirArchivo("redes.txt", redes);
        System.out.println(laRed.conectados(laRed.buscarVertice("CC1"),laRed.buscarVertice("CC6")));
        System.out.println(laRed.conectados(laRed.buscarVertice("CC1"),laRed.buscarVertice("CC7")));



        /*
           
        calcular la mejor red electrica\
        listar en el archivo "redelectrica.txt" el costo total del cableado
        y las conexiones establecidas, una por linea (origen, destino, costo)
        
        */
    }
}
