package com.distribuidanoc.principal;

import com.distribuidanoc.entities.Producto;

public class ProductoPrincipal {

    public static void  main(String[] Args){
        Producto producto = new Producto(1,"Penecilina","medicamento","liquidos","ml","3");
        System.out.println(producto);
}
