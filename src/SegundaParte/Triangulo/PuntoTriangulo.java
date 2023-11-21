package SegundaParte.Triangulo;

import java.util.concurrent.ThreadLocalRandom;

public class PuntoTriangulo {
    private int x;
    private int y;

    /**
     * Configurar constructor
     * @param x
     * @param y
     */
    public PuntoTriangulo(int x, int y){
        this.x=x;
        this.y=y;
    }

    /**
     * Configurar Getters
     * @return
     */
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }

    /**
     * Configurar Setters doble
     * @param x, y
     */
    public void setXY(int x, int y){
        this.x=x;
        this.y=y;
    }

    //Creamos el print.
    public void imprime(){
        System.out.println("Coordenada: "+"("+getX()+","+getY()+")");
    }
    //Creamos metodo para descpalzar.
    public void desplaza(int dx, int dy){
        this.x += dx;
        this.y += dy;
    }
    //Creamos el metodo para calcular la distancia.
    public int distancia(PuntoTriangulo numer){
        //return (int)Math.sqrt(Math.pow((numer.getX()-this.x),2)+(Math.pow((numer.getY()-this.y),2)));
        return (int)Math.sqrt(((numer.getX()-this.x)^2)+((numer.getY()-this.y)^2));

    }

    //Creamos el metodo para crear un punto aleatorio.

    public static PuntoTriangulo crearPuntoAleatorio(){
        int x = ThreadLocalRandom.current().nextInt(-100,100);
        int y = ThreadLocalRandom.current().nextInt(-100,100);
        return new PuntoTriangulo(x,y);
    }
}
