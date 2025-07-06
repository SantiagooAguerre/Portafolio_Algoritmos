package paquete;
public class Principal {

    public static void main(String[] args) {
        ejercicio1();
    }

    public static void ejercicio1() {
        ManejadorArchivosGenerico archivo = new ManejadorArchivosGenerico();
        StringBuilder salida = new StringBuilder();

        Lista<Suero> sueros = archivo.cargarSueros("src/paquete/sueros.txt");
        Lista<Farmaco> farmacos = archivo.cargarFarmacos("src/paquete/farmacos.txt");
        Lista<Integer> listaBlanca = archivo.cargarListaBlanca("src/paquete/listablanca.txt");
        Lista<ListaNegra> listaNegra = archivo.cargarListaNegra("src/paquete/listanegra.txt");
        
        RevisarFarmaco revisar = new RevisarFarmaco(listaBlanca, listaNegra, sueros, farmacos);
        
        int idSuero = 10;
        Lista<Integer> idsFarmacos = new Lista<>();
        idsFarmacos.insertar(10, 10);
        idsFarmacos.insertar(20, 20);
        Nodo<Suero> sueroNodo = sueros.buscar(idSuero);
        
        if (sueroNodo != null) {
            Suero suero = sueroNodo.getDato();
            salida.append("Suero ").append(suero.getId()).append(": ").append(suero.getDescripcion()).append("\n");
        }

        Nodo<Integer> farmacoNodo = idsFarmacos.getPrimero();
        while (farmacoNodo != null) {
            Nodo<Farmaco> nodoFarmaco = farmacos.buscar(farmacoNodo.getEtiqueta());
            if (nodoFarmaco != null) {
                Farmaco farmaco = nodoFarmaco.getDato();
                salida.append("Farmaco ").append(farmaco.getId()).append(": ").append(farmaco.getDescripcion()).append("\n");
            }
            farmacoNodo = farmacoNodo.getSiguiente();
        }

        boolean esViable = revisar.preparadoViable(idSuero, idsFarmacos);
        if (esViable) {
            salida.append("Es viable");
        }
        else {
            salida.append("No es viable");
        }
        
        ManejadorArchivosGenerico.escribirArchivo("src/paquete/Resultados.txt", salida.toString().split("\n"));
    }
    
}
