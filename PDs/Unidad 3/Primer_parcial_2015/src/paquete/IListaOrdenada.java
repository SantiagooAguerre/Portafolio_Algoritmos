/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package paquete;

public interface IListaOrdenada<T> {
    void insertar(T dato);
    void eliminar(T dato);
    boolean contiene(T dato);
    boolean estaVacia();
    void imprimir();
    INodo<T> getPrimero();
    int tamano();
}
