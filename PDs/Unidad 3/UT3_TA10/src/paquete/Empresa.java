/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete;

import java.util.LinkedList;
import java.util.List;

// el consumo de memoria es similar a la PD6 ya que ambos implementan una lista enlazada.

public class Empresa{ 
    public String name;
    private List<String> sucursal;

    public Empresa(String name){ // O(1)
        this.name = name;
        this.sucursal = new LinkedList<String>();
    }

    public void addSucursal(String sucursal){  // O(n)
        this.sucursal.add(sucursal);
    }

    public void removeSucursal(String sucursal){ // O(n)
        this.sucursal.remove(sucursal);
    }

    public void getSucursal() { // O(n)
        getSucursal(null);
    }

    public void getSucursal(String separador) { // O(n)
        for (int i = 0; i < this.sucursal.size(); i++) {
            if (separador != null) {
                System.out.print(this.sucursal.get(i) + separador);
            } else {
                System.out.print(this.sucursal.get(i) + "\n");
            }
            
        }
        
        System.out.println();
    }
    

    public void searchSucursal(String sucursal){  // O(n)
        if (this.sucursal.contains(sucursal)) {
            System.out.println("La sucursal " + sucursal + " existe en la empresa " + this.name);
        } else {
            System.out.println("La sucursal " + sucursal + " no existe en la empresa " + this.name);
        }
    }

    public void countSucursal(){  // O(1)
        System.out.println("La empresa " + this.name + " tiene " + this.sucursal.size() + " sucursales.");
    }

    public boolean isEmpty(){  // O(1)
        return this.sucursal.isEmpty();
    }
}
