package com.danrivcap.samples;

import com.danrivcap.samples.data.Address;
import com.danrivcap.samples.data.TipoVia;

public class Main {
    public static void main(String[] args) {
        //var casa = new Address(TipoVia.CALLE,"Real","5","A","1","3C","1","España","12015","Madrid","Madrid");
        //var trabajo = new Address(TipoVia.AVENIDA,"Ancha","SN","A","",null,null,"España","12015","Madrid","Madrid");

        var casa = new Address.Builder()
                .tipoVia(TipoVia.CALLE)
                .nombreVia("Real")
                .numero("5")
                .bloque("A").portal("1").piso("3C").escalera("1")
                .pais("España")
                .cp("12015").localidad("Madrid").provincia("Madrid")
                .build();
        var trabajo = new Address.Builder()
                .tipoVia(TipoVia.AVENIDA)
                .nombreVia("Ancha")
                .bloque("A")
                .pais("España")
                .cp("12015").localidad("Madrid").provincia("Madrid")
                .build();
        System.out.println("nombreVia casa: " + casa.getNombreVia());
        System.out.println("numero trabajo "+ trabajo.getNumero());

        var template = new Address.Builder().numero("S/N").build();
        var nuevaCasa = new Address.Builder(template).nombreVia("plana").build();
        System.out.println("nombreVia template is default: " + template.getNombreVia());
        System.out.println("numero template is S/N: " + template.getNumero());
        System.out.println("numero nuevaCasa is S/N "+ nuevaCasa.getNumero());
        System.out.println("nombreVia template is default: " + template.getNombreVia());



    }
}