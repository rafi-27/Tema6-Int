package EjerciciosE;

public class RectanguloEMain {
    public static void main(String[] args) {

        RectanguloE primero = new RectanguloE(2,5,2,90);
        primero.imprimir();

        RectanguloE fallido = new RectanguloE(120,48,200,-9);
        fallido.imprimir();

        fallido.setAll(10,5,785,451);
        fallido.imprimir();

        System.out.println("Imprimiendo el aleatorio: ");
        RectanguloE nuevo = RectanguloE.crearRectangulo();
        nuevo.imprimir();
    }
}