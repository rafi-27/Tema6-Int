package SegundaParte.Triangulo;

public class MainTriangulo {
    public static void main(String[] args) {

<<<<<<< HEAD

=======
>>>>>>> e93a4e469baedbc034ce57fa9922751755e165b4
        ClaseTriangulo primerTriangulo = new ClaseTriangulo(new PuntoTriangulo(5,2),new PuntoTriangulo(5,5),new PuntoTriangulo(10,10));
        primerTriangulo.imprimir();


<<<<<<< HEAD
        ClaseTriangulo segundoTriangulo = new ClaseTriangulo(new PuntoTriangulo(8,9),(new PuntoTriangulo(10,10)),new PuntoTriangulo(7,3));
        primerTriangulo.imprimir();

        System.out.println("El perimetro del primer triangulo: "+primerTriangulo.calcularPerimetro());
        System.out.println("El perimetro del segundo triangulo: "+segundoTriangulo.calcularPerimetro());

        ClaseTriangulo tercerTrianle = new ClaseTriangulo(new PuntoTriangulo(5,2),new PuntoTriangulo(5,5),new PuntoTriangulo(10,10));
        ClaseTriangulo cuartoTriangulo = new ClaseTriangulo(new PuntoTriangulo(8,9),new PuntoTriangulo(10,10),new PuntoTriangulo(7,3));

        System.out.println("Nueva forma: ");
        System.out.println("El perimetro del primer triangulo: "+primerTriangulo.calculoDos());
        System.out.println("El perimetro del tercer triangulo: "+tercerTrianle.calculoDos());
        System.out.println("El perimetro del cuarto triangulo: "+cuartoTriangulo.calculoDos());
=======
        //ClaseTriangulo primerTriangulo = new ClaseTriangulo(new PuntoTriangulo(8,9),(new PuntoTriangulo(10,10)),new PuntoTriangulo(7,3));
        primerTriangulo.imprimir();
        System.out.println("Su perimetro es de: "+primerTriangulo.calcularPerimetro());
>>>>>>> e93a4e469baedbc034ce57fa9922751755e165b4
    }
}
