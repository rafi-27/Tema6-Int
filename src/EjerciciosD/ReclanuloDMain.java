package EjerciciosD;

public class ReclanuloDMain {
    public static void main(String[] args) {
        RectanguloD primero = new RectanguloD(7,8,9,10);
        RectanguloD segundo = new RectanguloD(0,5,5,5);

        System.out.println("Lista de Coordenadas: ");
        primero.imprimir();
        segundo.imprimir();

        //Precedemos a probar los setters dobles y cuadriples:
        System.out.println("Setter Doble-->");
        primero.setX1Y1(10,20);
        primero.setX2Y2(5,9);
        primero.imprimir();

        System.out.println("Setter Cuadriple-->");
        segundo.setAll(3,7,6,5);
        segundo.imprimir();

        //Calculamos perimetros y areas.
        primero.setAll(8,8,6,4);
        segundo.setAll(8,4,9,5);
        System.out.println("El area del rectangulo es "+primero.getArea());
        System.out.println("El area del segundo rectangulo es "+segundo.getArea());

        System.out.println("El perimetro del primer rectangulo es "+primero.getPerimetro());
        System.out.println("El perimetro del segundo rectangulo es "+segundo.getPerimetro());

    }
}
