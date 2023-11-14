package EjerciciosB;

import javax.swing.*;
import java.util.EventListener;

class ArticuloB {
    String nombre;
    double precio;
    int IVA = 21;
    int cuantosQuedan;


    /**
     * Datos
     * @param name
     * @param price
     * @param inventari
     * @param iva
     */


    public ArticuloB(String name, double price, int inventari, int iva){
        this.nombre=name;
        if(price < 0){
            System.err.println("Error en el valor del precio");
            precio = 0;
        }else {
            this.precio=price;
        }

        if(inventari < 0){
            System.err.println("El valor de inventario esta mal.");
            inventari = 0;
        }else {
            this.cuantosQuedan=inventari;
        }

        if(iva == 21){
            this.IVA = iva;
        }else {
            System.err.println("Error el porcentaje de iva es del 21 siempre.");
            iva = 21;
        }

    }
}