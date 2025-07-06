package paquete;
import java.util.Random;

/**** Lenguaje Natural ****/
/* En el codigo lo que se tiene que hacer es calcular la multiplicacion entre cada uno de los index
dentro del vector de cada uno, y al final muestra el resultado de la suma de cada uno de los vectores
multiplicados entre si. Para que el codigo funcione se necesita la misma cantidad de elementos en ambos
vectores, porque si no, este daria error al tratar de multiplicar el elemento final de un vector que en el
otro no existe. Lo segundo que se necesita es que el vector no sea 0, debido a que no se puede multiplicar
un vector que no existe con otro que no existe.

Para evitar el primero error, plantee que la cantidad fuera establecida al momento de llamar el metodo,
y que ambos vectores agarrarian esta cantidad para que ninguno tenga mas elementos que el otro.

El segundo error lanza una excepcion al momento de ejecutar un vector de 0.
*/

public class Principal {
    Random azar = new Random();
    int MultiplicacionVectores(int cantidad) {
        
        if (cantidad <= 0) {
            throw new IllegalArgumentException("La cantidad de elementos debe ser mayor a cero.");
        }
        
        int vector1[] = new int[cantidad];
        int vector2[] = new int[cantidad];
        
        for(int i = 0; i < cantidad; i++) {
            vector1[i] = azar.nextInt(10)+1;
            vector2[i] = azar.nextInt(10)+1;
        }
        
        int resultado = 0;
        for(int i = 0; i < cantidad; i++) {
            resultado += vector1[i] * vector2[i];
        }
        
        return resultado;
    }
    
    public static void main(String[] args) {
        Principal principal = new Principal();
        System.out.println(principal.MultiplicacionVectores(4));
    }
    
}
