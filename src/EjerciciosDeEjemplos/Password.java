package EjerciciosDeEjemplos;

import java.util.concurrent.ThreadLocalRandom;

public class Password {
    private int longitud;
    private String contra="";

    public Password(){}

    public Password(int longi){
        this.longitud=longi;
    }

//    public String transform(){
//        this.longitud = String.valueOf(longitud);
//        return this.longitud;
//    }

    public String generarPassword(){
        //this.longitud = String.valueOf(longitud);
        for (int i = 0; i < this.longitud; i++) {
            this.contra += ThreadLocalRandom.current().nextInt(0,9);
        }return this.contra;
    }


    public void setLongitud(int longitud){
        this.longitud=longitud;
    }
    public void setContra(String contra){
        this.contra=contra;
    }

    public int getLongitud(){
        return longitud;
    }

    public String getContra(){
        return contra;
    }

    public static void main(String[] args) {
        Password nuevaPassword = new Password(8);
        System.out.println(nuevaPassword.generarPassword());


    }










}