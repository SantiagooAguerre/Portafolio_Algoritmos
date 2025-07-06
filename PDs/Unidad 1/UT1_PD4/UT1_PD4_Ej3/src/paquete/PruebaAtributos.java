package paquete;
/** 1) El array students tiene una referencia al principio cuando se hace el new String[10]; 
 * Luego el string Peter Parker se hace referencia en students[0]. Y no se borraría en el 
 * garbage collector porque el array y el string tienen referencias activas.
 * 
 * 2) Para eliminar lo que se puede hacer es dejar todas las referencias en null, 
 * o sea básicamente hay que hacer que los agarre el garbage collector.
**/

public class PruebaAtributos {

    public class NumberHolder {

        public int anInt;
        public float aFloat;
    }

    void Iniciar() {
        NumberHolder numero = new NumberHolder();
        numero.aFloat = 3.10f;
        numero.anInt = 10;
        
        System.out.println(numero.aFloat);
        System.out.println(numero.anInt);
    }

    public static void main(String[] args) {
        PruebaAtributos prueba = new PruebaAtributos();
        prueba.Iniciar();
    }

}
