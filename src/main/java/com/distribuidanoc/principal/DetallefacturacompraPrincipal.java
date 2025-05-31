package com.distribuidanoc.principal;

import com.distribuidanoc.entities.Detallefacturacompra;

public class DetallefacturacompraPrincipal {
    public static void main(String[] Args){
        Detallefacturacompra detallefacturacompra = new Detallefacturacompra(1,"12",10.00F,"15%",10.99F);
        System.out.println(detallefacturacompra);
    }
}
