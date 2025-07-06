package paquete;

/*** 4) Lo valores que imprime son del 1 al 50 sin ningún cambio entre medio. ***/

public class Contador {
    
    final int MAX_CONT = 50;
    int incremento = 1;
    int contador = 1;

    public void mostrarContador() {
        
        while (contador <= MAX_CONT) {
            System.out.println(contador);
            contador += incremento;
        }
    }

    public void mostrarContadorConDo() {
        contador = 1; 
        do {
            System.out.println(contador);
            contador += incremento;
        } while (contador <= MAX_CONT);
    }

    public void mostrarContadorConFor() {
        contador = 1;
        for (; contador <= MAX_CONT;) {
            System.out.println(contador);
            contador += incremento;
        }

    }

}
