/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete;

public class Producto implements IProducto {

    private Comparable etiqueta;
    private String nombre;
    private Integer precio;
    private Integer stock;

    public Producto(Comparable etiqueta, String nombre) {
        this.etiqueta = etiqueta;
        this.nombre = nombre;
        this.stock = 0;
        this.precio = 0;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public Integer getPrecio() {
        return precio;
    }

    @Override
    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    @Override
    public Integer getStock() {
        return stock;
    }

    public void agergarStock(Integer stock) {
        this.stock += stock;
    }

    public Integer restarStock(Integer stock) {
        if (stock > this.stock) {
            return -1;
        } else {
            setStock(this.stock - stock);
            return this.stock;
        }
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void setStock(Integer stock) {
        this.stock = stock;
    }

    @Override
    public Comparable getEtiqueta() {
        return this.etiqueta;
    }

}