/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package paquete;

public interface IProducto{

    /**
     * Retorna el codigo del Producto.
     *
     * @return codigo del Producto.
     */
    public Comparable getEtiqueta();

    /**
     * Retorna el precio unitario del Producto.
     *
     * @return precio del Producto.
     */
    public Integer getPrecio();

    public void setPrecio(Integer precio);

    /**
     * Retorna el stock del Producto.
     *
     * @return stock del Producto.
     */
    public Integer getStock();

    public void setStock(Integer stock);

    /**
     * Retorna la descripcion/nombre del Producto.
     *
     * @return descripci n del Producto.
     */
    public String getNombre();

    public void setNombre(String nombre);

}
