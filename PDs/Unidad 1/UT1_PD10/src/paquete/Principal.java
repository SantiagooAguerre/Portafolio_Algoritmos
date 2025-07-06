package paquete;
public class Principal {
    public static void main(String[] args) {
        ContadorPalabras contador = new ContadorPalabras();
        String[] archivo1 = contador.obtenerLineas("src/paquete/archivo1.txt");
        String[] archivo2 = contador.obtenerLineas("src/paquete/archivo1.txt");
        
        String[] resultado = contador.palabrasComunes(archivo1, archivo2);
        
        for (int i=0; i < resultado.length;i++) {
            System.out.print(resultado[i] + " ");
        }
    }
    
}
