package SegundaParte.Trabajador;

import java.util.Scanner;

public class TrabajadorMain {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Trabajador joseluis = new Trabajador("Jose Luis","54878412O",1800,7,15.0);

        //System.out.println(joseluis.getNombre()+" "+joseluis.getDNI()+" con un sueldo base de "+joseluis.getSueldoBase()+" echando "+joseluis.getHorasExtrasMes()+" horas  extras"+" de un IRPF del "+joseluis.getIRPF()+".")
        //Trabajador rafik = new Trabajador("Rafik","394802373R",1150.0,4,15.0,9,12);
        //System.out.println(rafik.toString());

        //Probando

        System.out.print("Precio de la hora extra: ");Trabajador.setPrecioHorasExtras(teclado.nextDouble());

        Trabajador rafik = new Trabajador();
        Trabajador.leerTrabajador(rafik);

        Trabajador dani = new Trabajador();
        Trabajador.leerTrabajador(dani);

        Trabajador jose = new Trabajador();
        Trabajador.leerTrabajador(jose);

        System.out.println("Total de trabajadores: "+Trabajador.getTotaltrabajadores());

        System.out.println("-------------------------Nominas de los Trabajadores------------------------");

        System.out.println(rafik.toString());
        System.out.println();
        System.out.println(dani.toString());
        System.out.println();
        System.out.println(jose.toString());
    }
}
