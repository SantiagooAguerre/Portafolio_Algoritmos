package paquete;

/**** Lo que está mal del codigo es que en el Rectangle myRect falta el new Rectangle(), 
 * ya que con este se crea el objeto, y al no tenerlo no puede acceder a las variables. 
 * Lo segundo y lo obvio que falta es que no existe la clase Rectangle() donde se encontraría 
 * el método area() y que hace el calculo.
 ****/

public class SomethingIsWrong {

    public static void main(String[] args) {
        Rectangle myRect = new Rectangle();
        myRect.width = 40;
        myRect.height = 50;
        System.out.println("myRect's area is " + myRect.area());
    }

}
