/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebainterfases;

/**
 *
 * @author FAMGOMO
 */
public class Factura implements PorPagar{
    private String numeroPieza;
    private String descripcion;
    private int cantidad;
    private double precioArticulo;

    public Factura(String numeroPieza, String descripcion, int cantidad, double precioArticulo) {
        this.numeroPieza = numeroPieza;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precioArticulo = precioArticulo;
    }
    
    public String getNumeroPieza() {
        return numeroPieza;
    }

    public void setNumeroPieza(String numeroPieza) {
        this.numeroPieza = numeroPieza;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioArticulo() {
        return precioArticulo;
    }

    public void setPrecioArticulo(double precioArticulo) {
        this.precioArticulo = precioArticulo;
    }
    
    @Override
    public double obtenerMontoPago() {
        return this.cantidad*this.precioArticulo;
    }
    
}
