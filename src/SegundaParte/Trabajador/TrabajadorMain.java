package SegundaParte.Trabajador;

public class TrabajadorMain {
    public static void main(String[] args) {
        Trabajador joseluis = new Trabajador("Jose Luis","54878412O",1800,7,15.0);

        System.out.println(joseluis.getNombre()+" "+joseluis.getDNI()+" con un sueldo base de "+joseluis.getSueldoBase()+" echando "+joseluis.getHorasExtrasMes()+" horas  extras"+" de un IRPF del "+joseluis.getIRPF()+".");



    }
}
