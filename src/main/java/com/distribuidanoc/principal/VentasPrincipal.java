package com.distribuidanoc.principal;

import com.distribuidanoc.entities.Ventas;

public class VentasPrincipal {
    public static void  main(String[] Args){
        Ventas ventas = new Ventas(1,"0-0-0","efectivo","350.00");
        System.out.println(ventas);
    }
}
