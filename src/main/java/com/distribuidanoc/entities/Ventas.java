package com.distribuidanoc.entities;

import java.util.Date;

public class Ventas {
    private int idVentas;
    private Date Fechaventa;
    private String Formapago;
    private String Totalventa;

    public Ventas() {
    }

    public Ventas(int idVentas, Date fechaventa, String formapago, String totalventa) {
        this.idVentas = idVentas;
        Fechaventa = fechaventa;
        Formapago = formapago;
        Totalventa = totalventa;
    }

    public int getIdVentas() {
        return idVentas;
    }

    public void setIdVentas(int idVentas) {
        this.idVentas = idVentas;
    }

    public Date getFechaventa() {
        return Fechaventa;
    }

    public void setFechaventa(Date fechaventa) {
        Fechaventa = fechaventa;
    }

    public String getFormapago() {
        return Formapago;
    }

    public void setFormapago(String formapago) {
        Formapago = formapago;
    }

    public String getTotalventa() {
        return Totalventa;
    }

    public void setTotalventa(String totalventa) {
        Totalventa = totalventa;
    }

    @Override
    public String toString() {
        return "Ventas{" +
                "idVentas=" + idVentas +
                ", Fechaventa=" + Fechaventa +
                ", Formapago='" + Formapago + '\'' +
                ", Totalventa='" + Totalventa + '\'' +
                '}';
    }
}
