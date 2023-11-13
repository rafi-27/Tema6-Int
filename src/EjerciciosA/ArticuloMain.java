package EjerciciosA;

import java.util.Scanner;

public class ArticuloMain {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Articulo producto = new Articulo();

        producto.nombre = "Zapatilla";
        producto.precio = 10;
        //producto.iva = (producto.precio*21.0)/100;
    double inin = ((producto.precio * producto.iva)/100)+ producto.precio;
        System.out.println(producto.nombre+" - "+" Precio: "+producto.precio+"€"+" - "+" IVA: 21%"+" - "+" PVP: "+(producto.iva+ producto.precio)+"€");

        System.out.println(producto.nombre+" Precio: "+producto.precio+"€"+" IVA: 21%"+" PVP: "+(((producto.precio* producto.iva)/100)+ producto.precio)+"€");
        System.out.println(inin);
    }
}