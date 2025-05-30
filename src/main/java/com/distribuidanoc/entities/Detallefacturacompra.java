package com.distribuidanoc.entities;

public class Detallefacturacompra {
    private int idDetallecompra;
    private String Cantidad;
    private Float Preciounitario;
    private String Iva;
    private Float Subtotal;

    public Detallefacturacompra() {
    }

    public Detallefacturacompra(int idDetallecompra, String cantidad, Float preciounitario, String iva, Float subtotal) {
        this.idDetallecompra = idDetallecompra;
        Cantidad = cantidad;
        Preciounitario = preciounitario;
        Iva = iva;
        Subtotal = subtotal;
    }

    public int getIdDetallecompra() {
        return idDetallecompra;
    }

    public void setIdDetallecompra(int idDetallecompra) {
        this.idDetallecompra = idDetallecompra;
    }

    public String getCantidad() {
        return Cantidad;
    }

    public void setCantidad(String cantidad) {
        Cantidad = cantidad;
    }

    public Float getPreciounitario() {
        return Preciounitario;
    }

    public void setPreciounitario(Float preciounitario) {
        Preciounitario = preciounitario;
    }

    public String getIva() {
        return Iva;
    }

    public void setIva(String iva) {
        Iva = iva;
    }

    public Float getSubtotal() {
        return Subtotal;
    }

    public void setSubtotal(Float subtotal) {
        Subtotal = subtotal;
    }

    @Override
    public String toString() {
        return "Detallefacturacompra{" +
                "idDetallecompra=" + idDetallecompra +
                ", Cantidad='" + Cantidad + '\'' +
                ", Preciounitario=" + Preciounitario +
                ", Iva='" + Iva + '\'' +
                ", Subtotal=" + Subtotal +
                '}';
    }
}
