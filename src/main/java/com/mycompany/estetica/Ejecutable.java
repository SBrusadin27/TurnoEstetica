/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estetica;

/**
 *
 * @author Admin
 */
public class Ejecutable {
    public static void main(String[] args){
        Estetica e1 = new Estetica();
        e1.setNumTurno(3);
        e1.setHorario("14:30");
        e1.setDia("Sabado");
        e1.setCliente("Santino Brusadin");
        e1.setZonaAtrabajar("Unias");
        e1.setEstilista("Rosa Vivas");
        e1.setEstado("Ocupado");
        e1.setPrecio(500);
        e1.setFormaPago("PayPal");
        System.out.println(e1.toString());
    }
}
