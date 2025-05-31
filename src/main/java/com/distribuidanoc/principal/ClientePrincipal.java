package com.distribuidanoc.principal;

import com.distribuidanoc.entities.Cliente;

public class ClientePrincipal {
    public static void main(String[] Args){
        Cliente cliente = new Cliente(1,"pharmacys","Puembo","0999999999","example@example.com","171717171717001");
        System.out.println(cliente);
    }
}
