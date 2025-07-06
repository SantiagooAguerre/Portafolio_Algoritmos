package paquete;
public class Principal {
    public static void main(String[] args) {
        Multsuma multsuma = new Multsuma();
        double a = 1.0;
        double b = 2.0;
        double c = 3.0;
        double resultado = multsuma.multsuma(a, b, c);
        System.out.println(resultado);
    }
    
}