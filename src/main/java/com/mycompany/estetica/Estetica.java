/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.estetica;

/**
 *
 * @author Admin
 */
public class Estetica {
    private int numTurno;
    private String horario;
    private String dia;
    private String cliente;
    private String zonaAtrabajar;
    private String estilista;
    private String estado;
    private float precio;
    private String formaPago;

    public Estetica() {
        this.numTurno = 0;
        this.horario = "";
        this.dia = "";
        this.cliente = "";
        this.zonaAtrabajar = "";
        this.estilista = "";
        this.estado = "";
        this.precio = 0;
        this.formaPago = "";
    }

    public Estetica(int numTurno, String horario, String dia, String cliente, String zonaAtrabajar, String estilista, String estado, float precio, String formaPago) {
        this.numTurno = numTurno;
        this.horario = horario;
        this.dia = dia;
        this.cliente = cliente;
        this.zonaAtrabajar = zonaAtrabajar;
        this.estilista = estilista;
        this.estado = estado;
        this.precio = precio;
        this.formaPago = formaPago;
    }

    public int getNumTurno() {
        return numTurno;
    }

    public void setNumTurno(int numTurno) {
        this.numTurno = numTurno;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getZonaAtrabajar() {
        return zonaAtrabajar;
    }

    public void setZonaAtrabajar(String zonaAtrabajar) {
        this.zonaAtrabajar = zonaAtrabajar;
    }

    public String getEstilista() {
        return estilista;
    }

    public void setEstilista(String estilista) {
        this.estilista = estilista;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }
    
    public String toString(){
        return "Numero de Turno: " + this.numTurno + "\nEl Horario es: " + 
                this.horario + "\nEl Dia es: " + this.dia + 
                "\nEl nombre del Cliente es: " + this.cliente + 
                "\nLa Zona A Trabajar es: " + this.zonaAtrabajar + 
                "\nEstilista que te atendera: " + this.estilista + 
                "\nEstado del Turno: " + this.estado + "\nEl precio es: " + 
                this.precio + "\nLa Forma De Pago es: " + this.formaPago;
    }   
    private String comprobarDia(String dia) {
        if (dia == "Sabado" || dia == "Domingo"){
            return "Dia No Disponible";
        } else {
            return "Dia Disponible";
        }
    }    
    
}
