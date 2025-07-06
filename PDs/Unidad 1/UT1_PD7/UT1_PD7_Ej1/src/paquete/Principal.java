/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete;

/**
 *
 * @author Estudiante UCU
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s1 = new String("Hola");
        String s2 = "Hola";
        if (s1.intern() == s2) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }

}
