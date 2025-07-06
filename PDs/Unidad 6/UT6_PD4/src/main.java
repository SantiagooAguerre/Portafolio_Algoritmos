
public class main {
    public static void main(String[] args) {

        String[] lineas = ManejadorArchivosGenerico.leerArchivo("libro.txt");
        
        ContadorPalabras contador = new ContadorPalabras();
        
        contador.procesarLineas(lineas);
        
        contador.imprimirTopN(10);
        
        String[] frecuencias = contador.obtenerFrecuenciasComoArray();
        ManejadorArchivosGenerico.escribirArchivo("frecuencias.txt", frecuencias);
    }
}
