package SegundaParte.Trabajador;

class Trabajador {
//Importe de la hora extra (double), será un atributo de clase
    private static double horasExtras;
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
//Creamos el constructor por defecto.
    public Trabajador(String name,String dni, double sueldobase, int horasExEchadasMes,double tipoIRPF){
        this.nombre=name;
        this.DNI=dni;
        this.sueldoBase=sueldobase;
        this.horasExtrasMes=horasExEchadasMes;
        this.IRPF=tipoIRPF;
    }

//Metodos getters
    public String getNombre() {
        return nombre;
    }

    public static double getHorasExtras() {
        return horasExtras;
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
//Creamos los metodos setters.


    public static void setHorasExtras(double horasExtras) {
        Trabajador.horasExtras = horasExtras;
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

//Creamos los metodos pedidos en el ejercicio.
//    public int calcularImporteHorasExtras(){
//
//    }











}
