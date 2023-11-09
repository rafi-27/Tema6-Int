import java.util.Scanner;

public class ArticuloMain {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Articulo producto = new Articulo();

        producto.nombre = "Zapatilla";
        producto.precio = 10;
        producto.iva = (producto.precio*21.0)/100;

        System.out.println(producto.nombre+" - "+" Precio: "+producto.precio+"€"+" - "+" IVA: 21%"+" - "+" PVP: "+(producto.iva+ producto.precio)+"€");

        System.out.println(producto.nombre+" Precio: "+producto.precio+"€"+" IVA: 21%"+" PVP: "+(((producto.precio*21.0)/100)+ producto.precio)+"€");
    }
}