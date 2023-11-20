package EjerciciosE;

public class PuntoEMain {
    public static void main(String[] args) {
//        PuntoE puntoUno = PuntoE.crearPuntoAleatorio();
//        puntoUno.imprime();
//        PuntoE puntoDos = PuntoE.crearPuntoAleatorio();
//        puntoDos.imprime();

        PuntoE prueba = new PuntoE(15,9);
        PuntoE diference = new PuntoE(27,20);

        System.out.println("Diferencia: "+prueba.distancia(diference));


    }
}
