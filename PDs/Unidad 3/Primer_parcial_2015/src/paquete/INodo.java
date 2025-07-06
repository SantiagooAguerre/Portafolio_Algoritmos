/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package paquete;

public interface INodo<T> {
    T getDato();
    INodo<T> getSiguiente();
    void setSiguiente(INodo<T> nodo);
}
