package paquete;

public class Principal {

    public static void main(String[] args) {
        ContadorPalabras contar = new ContadorPalabras();
        System.out.println("Vocales: " + contar.contarPalabras("Hola como estas"));

    }

}
