package paquete;
public class Principal {

    public static void imprimirTablero(int largo, int ancho) {
        String[][] impresion = new String[largo][ancho];
        for(int i = 0; i < largo; i++) {
            for(int j = 0; j < ancho; j++) {
                impresion[i][j] = "#"; 
            }
        }
        for(int i = 0; i < largo; i++) {
            for(int j = 0; j < ancho; j++) {
                System.out.print(impresion[i][j] + " ");
            }
            System.out.println("");
        }
    }
    
    public static void main(String[] args) {
        Principal principal = new Principal();
        principal.imprimirTablero(7, 7);
                
    }
    
}
