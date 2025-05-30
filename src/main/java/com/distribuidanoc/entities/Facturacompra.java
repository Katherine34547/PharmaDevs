package com.distribuidanoc.entities;

import java.util.Date;

public class Facturacompra {
    private int idFacturacompra;
    private Date Fecha;
    private String Montototal;

    public Facturacompra() {
    }

    public Facturacompra(int idFacturacompra, Date fecha, String montototal) {
        this.idFacturacompra = idFacturacompra;
        Fecha = fecha;
        Montototal = montototal;
    }

    public int getIdFacturacompra() {
        return idFacturacompra;
    }

    public void setIdFacturacompra(int idFacturacompra) {
        this.idFacturacompra = idFacturacompra;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date fecha) {
        Fecha = fecha;
    }

    public String getMontototal() {
        return Montototal;
    }

    public void setMontototal(String montototal) {
        Montototal = montototal;
    }

    @Override
    public String toString() {
        return "Facturacompra{" +
                "idFacturacompra=" + idFacturacompra +
                ", Fecha=" + Fecha +
                ", Montototal='" + Montototal + '\'' +
                '}';
    }
}
