package SegundaParte.Triangulo;

import SegundaParte.Triangulo.ClaseTriangulo;

public class MainTriangulo {
    public static void main(String[] args) {

        ClaseTriangulo primerTriangulo = new ClaseTriangulo(new PuntoTriangulo(5,2),new PuntoTriangulo(5,5),new PuntoTriangulo(10,10));
        primerTriangulo.imprimir();

    }
}
