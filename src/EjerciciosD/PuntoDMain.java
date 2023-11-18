package EjerciciosD;
public class PuntoDMain {
    public static void main(String[] args) {
        PuntoD puntoUno = new PuntoD(5,0);
        PuntoD puntoDos = new PuntoD(5, 5);
        PuntoD puntoTres = new PuntoD(-3,7);

        System.out.println("Imprimimos:");
        puntoUno.imprime();
        puntoDos.imprime();
        puntoTres.imprime();

        //Probamos el setter doble:
        System.out.println("Setter doble:");
        puntoUno.setXY(2,5);
        puntoUno.imprime();
        //Probamos desplazar:
        System.out.println("Desplazamos:");
        puntoUno.desplaza(1,1);
        puntoUno.imprime();
        //Calculamos la distancia:
        puntoUno.setXY(6,4);
        puntoDos.setXY(4,5);
        System.out.println("Calculamos la distancia: "+puntoUno.distancia(puntoDos));

    }
}
