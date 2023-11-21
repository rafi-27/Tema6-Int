package SegundaParte.Triangulo;

public class MainTriangulo {
    public static void main(String[] args) {

        ClaseTriangulo primerTriangulo = new ClaseTriangulo(new PuntoTriangulo(8,9),(new PuntoTriangulo(10,10)),new PuntoTriangulo(7,3));
        primerTriangulo.imprimir();
        System.out.println("Su perimetro es de: "+primerTriangulo.calcularPerimetro());
    }
}
