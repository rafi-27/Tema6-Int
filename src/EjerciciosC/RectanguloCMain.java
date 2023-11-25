package EjerciciosC;

public class RectanguloCMain {
    public static void main(String[] args) {
        RectanguloC rUno = new RectanguloC(7,1,9,7);
        System.out.println("Primera coordenada: "+"("+rUno.getX1()+","+rUno.getX2()+")"+" "+"("+rUno.getY1()+","+rUno.getY2()+")");

        RectanguloC rDos = new RectanguloC(2,5,6,8);
        System.out.println("Segunda coordenada: "+"("+rDos.getX1()+","+rDos.getX2()+")"+" "+"("+rDos.getY1()+","+rDos.getY2()+")");

        rUno.setX1(4);
        rUno.setX2(5);
        rUno.setY1(3);
        rUno.setY2(8);
        System.out.println("La primera coordenada modificada con setters.");
        System.out.println("Primera coordenada: "+"("+rUno.getX1()+","+rUno.getX2()+")"+" "+"("+rUno.getY1()+","+rUno.getY2()+")");

        System.out.println("Segunda coordenada modificada con setters para que falle.");
        rDos.setX1(8);
        rDos.setX2(4);
        rDos.setY1(8);
        rDos.setY2(4);
        System.out.println("Segunda coordenada: "+"("+rDos.getX1()+","+rDos.getX2()+")"+" "+"("+rDos.getY1()+","+rDos.getY2()+")");

    }
}