package SegundaParte.EticalBank;

import java.util.Scanner;

public class CuentaBancariaClass {
//Creamos los atributos.
    private String IBAN;
    private String titular;
    private double saldo;

//Procedo a crear el constructor.
    public CuentaBancariaClass(String iban,String titular){
        this.IBAN=iban;
        this.titular=titular;
        this.saldo=0;
    }
//Getters
    public String getIBAN(){
        return IBAN;
    }
    public String getTitular(){
        return this.titular;
    }
    public double getSaldo(){
        return this.saldo;
    }
//Setters
    public void setIBAN(String iban){
        this.IBAN=iban;
    }
    public void setTitular(String titular){
        this.titular=titular;
    }
    public void setSaldo(double saldo){
        this.saldo=saldo;
    }

//Metodo para ingresar dinero.
    public void ingresar(double cantidad){
        if(cantidad > 0){
            this.saldo=this.saldo+cantidad;
        }else {
            System.err.println("No se puede ingresar esta cantidad de dinero.");
        }
        if(cantidad > 3000){
            System.err.println("AVISO: Notificar a hacienda");
        }
    }
//Metodo para retirar dinero.
    public void retirar(double retirada){
        if(retirada > 0 && this.saldo - retirada >= -50){
            this.saldo=this.saldo-retirada;
        }else {
            System.err.println("No se puede retirar dicha cantidad.");
        }
        if(this.saldo <= -50){
            System.err.println("AVISO: Saldo negativo");
        }
        if(retirada > 3000){
            System.err.println("AVISO: Notificar a hacienda");
        }
    }
}
