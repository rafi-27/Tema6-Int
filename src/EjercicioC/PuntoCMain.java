package EjercicioC;

public class PuntoCMain {
    public static void main(String[] args) {

        PuntoC puntoUno = new PuntoC(5,0);
        PuntoC puntoDos = new PuntoC(10, 10);
        PuntoC puntoTres = new PuntoC(-3,7);

        System.out.println("("+puntoUno.getX()+","+puntoUno.getY()+")");
        System.out.println("("+puntoDos.getX()+","+puntoDos.getY()+")");
        System.out.println("("+puntoTres.getX()+","+puntoTres.getY()+")");

        System.out.println("Usando get y set -->");

        puntoUno.setX(20);
        puntoUno.setY(20);
        puntoDos.setX(15);
        puntoDos.setY(15);
        puntoTres.setX(1);
        puntoTres.setY(1);

        System.out.println("("+puntoUno.getX()+","+puntoUno.getY()+")");
        System.out.println("("+puntoDos.getX()+","+puntoDos.getY()+")");
        System.out.println("("+puntoTres.getX()+","+puntoTres.getY()+")");
    }
}
