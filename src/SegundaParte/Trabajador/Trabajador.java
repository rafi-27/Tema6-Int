package SegundaParte.Trabajador;

import java.util.Scanner;

class Trabajador {
//Importe de la hora extra (double), será un atributo de clase
    private static double PreciohorasExtras;
//Número de trabajadores (int), será un atributo de clase
    private static int totaltrabajadores;
//DNI (String)
    private String DNI;
//Nombre (String)
    private String nombre;
//Sueldo base (double)
    private double sueldoBase;
//Horas extras realizadas en el mes (int)
    private int horasExtrasMes;
//Tipo de IRPF (%) (double)
    private double IRPF;
//Precio por hora y hora extra.
    private int precioHora, precioHoraExtra;

//Creamos el constructor por defecto.
    public Trabajador(){Trabajador.totaltrabajadores+=1;};
    public Trabajador(String name,String dni, double sueldobase, int horasExEchadasMes,double tipoIRPF){
        this.nombre=name;
        this.DNI=dni;
        this.sueldoBase=sueldobase;
        this.horasExtrasMes=horasExEchadasMes;
        this.IRPF=tipoIRPF;
        Trabajador.totaltrabajadores+=1;
    }

//Metodos getters
    public String getNombre() {
        return nombre;
    }

    public static int getTotaltrabajadores() {
        return totaltrabajadores;
    }

    public String getDNI() {
        return DNI;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public int getHorasExtrasMes() {
        return horasExtrasMes;
    }

    public double getIRPF() {
        return IRPF;
    }

    public int getPrecioHora(){
        return precioHora;
    }
    public int getPrecioHoraExtra(){
        return precioHoraExtra;
    }
//Creamos los metodos setters.


    public static void setPrecioHorasExtras(double PreciohorasExtras) {
        Trabajador.PreciohorasExtras = PreciohorasExtras;
    }

    public static void setTotaltrabajadores(int totaltrabajadores) {
        Trabajador.totaltrabajadores = totaltrabajadores;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public void setHorasExtrasMes(int horasExtrasMes) {
        this.horasExtrasMes = horasExtrasMes;
    }

    public void setIRPF(double IRPF) {
        this.IRPF = IRPF;
    }
//Setter doble para precio de la hora y hora extra.
    public void setPreciosHoras(int hora,int extra){
        this.precioHora=hora;
        this.horasExtrasMes=extra;
    }

//Creamos los metodos pedidos en el ejercicio.
    //Metodo para calcular los se va a cobrar por las horas extra
    public double calcularImporteHorasExtras(){
        return this.PreciohorasExtras*horasExtrasMes;
    }

    public double calcularSueldoBruto(){
        return sueldoBase+calcularImporteHorasExtras();
    }

    public double  calcularRetencionIrpf(){
        return ((IRPF*sueldoBase)/100);
    }

    public double calcularSueldo(){
        return (calcularSueldoBruto()-calcularRetencionIrpf());
    }

    @Override
    public String toString() {
        return this.DNI+" "+this.nombre+"\nSueldo Base: "+sueldoBase+"\nHoras Extras: "+this.horasExtrasMes+"\nTipo de IRPF: "+this.IRPF+"\nSueldo Bruto: "+calcularSueldoBruto()+"\nRetencion por IRPF: "+calcularRetencionIrpf()+"\nSueldo Neto: "+calcularSueldo();
    }

    public static void leerTrabajador(Trabajador nuevoEmpleado){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Nombre: ");
        nuevoEmpleado.nombre = teclado.next();

        teclado.nextLine();

        System.out.println("DNI: ");
        nuevoEmpleado.DNI = teclado.next();

        System.out.println("Sueldo Base: ");
        nuevoEmpleado.sueldoBase = teclado.nextDouble();

        System.out.println("Horas Extras: ");
        nuevoEmpleado.horasExtrasMes = teclado.nextInt();

        System.out.println("Tipod IRPF: ");
        nuevoEmpleado.IRPF = teclado.nextDouble();

        totaltrabajadores = totaltrabajadores + 1;
        System.out.println();

        Trabajador.totaltrabajadores+=1;
    }
}