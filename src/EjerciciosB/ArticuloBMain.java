package EjerciciosB;

public class ArticuloBMain {
    public static void main(String[] args) {

        ArticuloB productoUno = new ArticuloB("Nike",17,-7,21);

        System.out.println(productoUno.nombre+" precio de "+productoUno.precio+" quedan "+productoUno.cuantosQuedan+" con un iva del "+productoUno.IVA+"% con el precio final de venta al publico de "+(productoUno.precio+(productoUno.precio*productoUno.IVA/100))+"€");


    }
}
