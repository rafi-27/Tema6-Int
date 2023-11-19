package EjerciciosD;

public class ArticuloDMain {
    public static void main(String[] args) {

        AtriculoD zapatila = new AtriculoD("Nike nocta",15,88,20);
        AtriculoD camisaTupac = new AtriculoD("Camisa de tupac",10,100,21);
        //Imprimimos
        zapatila.imprimir();
        camisaTupac.imprimir();
        //Metodo getPVP
        System.out.println("Las zapatilas tienen un precio de venta al publico de "+zapatila.getPVP()+"€");
        System.out.println("La camiseta de 2pac sale con un precio de venta al publico de "+camisaTupac.getPVP()+"€");
        //Metodo Descuento
        System.out.println("La zapatilla con descuento queda en "+zapatila.getDescuento(7.0));
        //Probando Modificar el almacen para comprobar que resta.
        AtriculoD pantalon = new AtriculoD("Gucci",19,10,21);
        pantalon.imprimir();

        pantalon.vender(7);
        pantalon.imprimir();

        //Probando sumar al almacen.
        pantalon.almacenar(3);
        pantalon.imprimir();

    }
}
