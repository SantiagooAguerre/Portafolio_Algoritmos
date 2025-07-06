
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      // cargar grafo con casas y distancias
        TGrafoRedElectrica laRed = (TGrafoRedElectrica) UtilGrafos.cargarGrafo("src/barrio.txt", "src/distancias.txt",
                false, TGrafoRedElectrica.class);
        System.out.println(laRed.mejorRedElectrica().imprimirEtiquetas());
        String[] redes = laRed.mejorRedElectrica().imprimirEtiquetas().split("\n");
        ManejadorArchivosGenerico.escribirArchivo("redes.txt", redes);




        /*
           
        calcular la mejor red electrica\
        listar en el archivo "redelectrica.txt" el costo total del cableado
        y las conexiones establecidas, una por linea (origen, destino, costo)
        
        */
    }
}
