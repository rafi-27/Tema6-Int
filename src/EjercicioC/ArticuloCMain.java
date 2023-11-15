package EjercicioC;

public class ArticuloCMain {
    public static void main(String[] args) {

        ArticuloC zapatillas = new ArticuloC("Nike",20,5,21);

        System.out.println(zapatillas.getnombre()+" con un precio de "+zapatillas.getPrecio()+"€ hay "+zapatillas.getCuantosQuedan()+" con un iva de "+ zapatillas.getIVA()+"% sale a "+(zapatillas.getPrecio()+(zapatillas.getPrecio()* zapatillas.getIVA()/100))+"€");

        System.out.println("Probando");

        zapatillas.setNombre("Nike Nocta");
        zapatillas.setPrecio(250);
        zapatillas.setCuantosQuedan(-8);
        zapatillas.setIVA(22);
        System.out.println(zapatillas.getnombre()+" con un precio de "+zapatillas.getPrecio()+"€ hay "+zapatillas.getCuantosQuedan()+" con un iva de "+ zapatillas.getIVA()+"% sale a "+(zapatillas.getPrecio()+(zapatillas.getPrecio()* zapatillas.getIVA()/100))+"€");

        System.out.println("Siguente zapatilla");

        zapatillas.setNombre("Adidas");
        zapatillas.setPrecio(10000);
        zapatillas.setCuantosQuedan(-18);
        zapatillas.setIVA(21);
        System.out.println(zapatillas.getnombre()+" con un precio de "+zapatillas.getPrecio()+"€ hay "+zapatillas.getCuantosQuedan()+" con un iva de "+ zapatillas.getIVA()+"% sale a "+(zapatillas.getPrecio()+(zapatillas.getPrecio()* zapatillas.getIVA()/100))+"€");
    }
}