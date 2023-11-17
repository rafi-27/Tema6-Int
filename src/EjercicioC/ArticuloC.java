package EjercicioC;

class ArticuloC {
    private String nombre;
    private double precio;
    private double IVA = 21.00;
    private int cuantosQuedan;

    public ArticuloC(String name, double price, int inventari, int iva){
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
            System.err.println("Error el porcentaje de iva es del 21% siempre.");
            iva = 21;
        }
    }

    /**
     * Configuramos los getters
     * @return
     */
    public String getnombre(){
        return nombre;
    }

    public double getPrecio(){
        return precio;
    }

    public double getIVA(){
        return IVA;
    }

    public int getCuantosQuedan(){
        return cuantosQuedan;
    }

    /**
     * Configuramos setters
     * @param name
     */
    public void setNombre(String name){
        this.nombre=name;
    }

    public void setPrecio(double price){
        if(price < 0){
            System.err.println("La cantidad de dinero es negativa.");
        }
        this.precio=price;
    }

    public void setCuantosQuedan(int inventario){
        if(inventario < 0){
            System.err.println("Error inventario negativo");
            inventario = 0;
            this.cuantosQuedan=inventario;
        }else this.cuantosQuedan=inventario;
    }

    public void setIVA(int iva){
        if(iva == 21) this.IVA=iva;
        else System.err.println("No pudes cambiar el iva siempre sera del 21%");

    }
}