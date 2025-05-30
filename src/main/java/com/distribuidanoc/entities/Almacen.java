package com.distribuidanoc.entities;

public class Almacen {
    private int idAlmacen;
    private String Stock;
    private String Ubicacion;

    public Almacen() {
    }

    public Almacen(int idAlmacen, String stock, String ubicacion) {
        this.idAlmacen = idAlmacen;
        Stock = stock;
        Ubicacion = ubicacion;
    }

    public int getIdAlmacen() {
        return idAlmacen;
    }

    public void setIdAlmacen(int idAlmacen) {
        this.idAlmacen = idAlmacen;
    }

    public String getStock() {
        return Stock;
    }

    public void setStock(String stock) {
        Stock = stock;
    }

    public String getUbicacion() {
        return Ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        Ubicacion = ubicacion;
    }

    @Override
    public String toString() {
        return "Almacen{" +
                "idAlmacen=" + idAlmacen +
                ", Stock='" + Stock + '\'' +
                ", Ubicacion='" + Ubicacion + '\'' +
                '}';
    }
}
