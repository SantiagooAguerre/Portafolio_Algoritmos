package paquete;
public class UtilMath {
    public static int factorial(int num) {
        int resultado = 1;
        for (int i = 1; i <= num; i++) {
            resultado = resultado * i;
        }
        return resultado;
    }

    public static boolean isPrime(long n) {
        boolean es_primo = true;
        int i = 2;
        while (i <= n / 2 && es_primo) {
            es_primo = (n % i != 0);
            i++;
        }
        return es_primo;
    }
}
