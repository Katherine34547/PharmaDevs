package com.distribuidanoc.principal;

import com.distribuidanoc.entities.Detallefacturaventa;

import javax.sound.midi.spi.SoundbankReader;
import java.sql.SQLOutput;

public class DetallefacturaventaPrincipal {
    public static void main(String[] Args){
        Detallefacturaventa detallefacturaventa = new Detallefacturaventa(1,12,10.99F,"15%",19.99F);
        System.out.println(detallefacturaventa);
    }
}
