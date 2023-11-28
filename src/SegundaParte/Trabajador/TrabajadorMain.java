package SegundaParte.Trabajador;

import java.util.Scanner;

public class TrabajadorMain {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Probando
        System.out.print("Precio de la hora extra: ");Trabajador.setPrecioHorasExtras(teclado.nextDouble());
//
//        Trabajador rafik = new Trabajador();
//        rafik.leerTrabajador();
//
//        Trabajador dani = new Trabajador();
//        dani.leerTrabajador();
//
        Trabajador jose = new Trabajador();
        jose.leerTrabajador();

        Trabajador t1 = new Trabajador("Antoni","436455787W",2300,6,10);

        Trabajador joseluis = new Trabajador("Jose Luis","54878412O",1800,7,15.0);

        System.out.println("Total de trabajadores: "+Trabajador.getTotaltrabajadores());

        System.out.println("-------------------------Nominas de los Trabajadores------------------------");

//        System.out.println(rafik.toString());
//        System.out.println();
//        System.out.println(dani.toString());
//        System.out.println();
//        System.out.println(jose.toString());
//        System.out.println();
//        System.out.println(joseluis.toString());
//        System.out.println();
//        System.out.println(t1.toString());
    }
}
