package paquete;

/**
 * 1) La salida una vez puesto los parámetros es:
 *  a + b = 79.5
 *  a - b = -52.699997 
 *  a * b = 885.7399 
 *  a / b = 0.20272315 
 *  a % b = 13.4
**/

/**
 * 2) Si quiero que los parámetros sean enteros y no float, entonces tendría
 * que modificar el codigo para que quede así
**/

public class Principal {

    public static void main(String[] args) {
        // this program requires two
        // arguments on the command line
        if (args.length == 2) {
// convert strings to numbers
            int a = (Integer.valueOf(args[0]));
            int b = (Integer.valueOf(args[1]));
// do some arithmetic
            System.out.println("a + b = "
                    + (a + b));
            System.out.println("a - b = "
                    + (a - b));
            System.out.println("a * b = "
                    + (a * b));
            System.out.println("a / b = "
                    + (a / b));
            System.out.println("a % b = "
                    + (a % b));
        } else {
            System.out.println("This program "
                    + "requires two command-line arguments.");
        }
    }

}
