package EjerciciosD;

class AtriculoD {

    private String nombre;
    private double precio;
    private double IVA = 21.00;
    private int cuantosQuedan;

    public AtriculoD(String name, double price, int inventari, int iva) {
        this.nombre = name;
        if (price < 0) {
            System.err.println("Error en el valor del precio");
            precio = 0;
        } else {
            this.precio = price;
        }

        if (inventari < 0) {
            System.err.println("El valor de inventario esta mal.");
            inventari = 0;
        } else {
            this.cuantosQuedan = inventari;
        }

        if (iva == 21) {
            this.IVA = iva;
        } else {
            System.err.println("Error el porcentaje de iva es del 21% siempre.");
            iva = 21;
        }
    }

    /**
     * Configuramos los getters
     *
     * @return
     */
    public String getnombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public double getIVA() {
        return IVA;
    }

    public int getCuantosQuedan() {
        return cuantosQuedan;
    }

    /**
     * Configuramos setters
     *
     * @param name
     */
    public void setNombre(String name) {
        this.nombre = name;
    }

    public void setPrecio(double price) {
        if (price < 0) {
            System.err.println("La cantidad de dinero es negativa.");
        }
        this.precio = price;
    }

    public void setCuantosQuedan(int inventario) {
        if (inventario < 0) {
            System.err.println("Error inventario negativo");
            inventario = 0;
            this.cuantosQuedan = inventario;
        } else this.cuantosQuedan = inventario;
    }

    public void setIVA(int iva) {
        if (iva == 21) this.IVA = iva;
        else System.err.println("No pudes cambiar el iva siempre sera del 21%");
    }

    //imprimimos
    public void imprimir(){
        System.out.println("Producto: "+getnombre()+" de "+getPrecio()+"€"+" quedan "+getCuantosQuedan()+" con un iva fijo del "+getIVA()+"%");
    }

    //Método getPVP que devuelva el precio de venta al público (PVP) con iva incluido.
    public double getPVP(){
        return (getPrecio()+((getPrecio()*21)/100));
    }

    //Método getPVPDescuento que devuelva el PVP con un descuento pasado como argumento.
    public double getDescuento(Double discount){
        return (getPVP()-(getPVP()*(discount/100)));
    }

    //Método vender que actualiza los atributos del objeto tras vender una cantidad ‘x’
    //(si es posible). Devolverá true si ha sido posible (false en caso contrario).

    public boolean vender(int vendido){
        if(this.cuantosQuedan-vendido < 0) return false;
        else{
            this.cuantosQuedan= this.cuantosQuedan-vendido;
            return true;
        }
    }

    //Método almacenar que actualiza los atributos del objeto tras almacenar una
    //cantidad ‘x’ (si es posible). Devolverá true si ha sido posible (false en caso
    //contrario).
    public boolean almacenar(int cuanto){
        if(this.cuantosQuedan+cuanto < 0) return false;
        else this.cuantosQuedan=this.cuantosQuedan+cuanto;
        return true;
    }


}