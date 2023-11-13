package EjerciciosA;

public class RectanguloMain {
    public static void main(String[] args) {
        Rectangulo rectangulo1 = new Rectangulo();
        Rectangulo rectangulo2 = new Rectangulo();

        rectangulo1.x1 = 4;
        rectangulo1.y1 = 6;
        rectangulo1.x2 = 5;
        rectangulo1.y2 = 5;

        rectangulo2.x1 = 7;
        rectangulo2.y1 = 9;
        rectangulo2.x2 = 2;
        rectangulo2.y2 = 3;

        int ladoPrimerRectangulo, ladoSegundoRectangulo, alturaPrimerRectangulo, alturaSegundoRectanulo;

        //Realizamos los calculos, antes debemos asegurarmos que los numeros esten situados correctamente.

        if(rectangulo1.x1 > rectangulo1.x2){
            ladoPrimerRectangulo = rectangulo1.x1-rectangulo1.x2;
        }else{
            ladoPrimerRectangulo = rectangulo1.x2-rectangulo1.x1;
        }

        if(rectangulo1.y1 > rectangulo1.y2){
            alturaPrimerRectangulo = rectangulo2.y1-rectangulo1.y2;
        }else {
            alturaPrimerRectangulo = rectangulo1.y1-rectangulo1.y2;
        }

        double totalLados1 = (ladoPrimerRectangulo*2)+(alturaPrimerRectangulo*2);
        double perimetro1 = alturaPrimerRectangulo * ladoPrimerRectangulo;



        System.out.println("Coordenada x: ("+rectangulo1.x1+","+ rectangulo1.y1+")"+" coordenada y: "+"("+rectangulo1.x2+","+rectangulo1.y2+")");
        System.out.println("Coordenada x: ("+rectangulo2.x1+","+ rectangulo2.y1+")"+" coordenada y: "+"("+rectangulo2.x2+","+rectangulo2.y2+")");

        System.out.println("Lados: "+totalLados1+" Area: "+perimetro1);

        System.out.println("Modificado-->");

        rectangulo1.x1 = 6;
        rectangulo1.y1 = 5;
        rectangulo1.x2 = 4;
        rectangulo1.y2 = 7;

        rectangulo2.x1 = 7;
        rectangulo2.y1 = 5;
        rectangulo2.x2 = 3;
        rectangulo2.y2 = 8;

        if(rectangulo2.x1 > rectangulo2.x2){
            ladoSegundoRectangulo = rectangulo2.x1-rectangulo2.x2;
        }else{
            ladoSegundoRectangulo = rectangulo2.x2-rectangulo2.x1;
        }

        if(rectangulo2.y1 > rectangulo2.y2){
            alturaSegundoRectanulo = rectangulo2.y1-rectangulo2.y2;
        }else {
            alturaSegundoRectanulo = rectangulo2.y2-rectangulo2.y1;
        }

        double totalLados2 = (ladoSegundoRectangulo*2)+(alturaSegundoRectanulo*2);
        double perimetro2 = alturaSegundoRectanulo * ladoSegundoRectangulo;



        System.out.println("Coordenada x: ("+rectangulo1.x1+","+ rectangulo1.y1+")"+" coordenada y: "+"("+rectangulo1.x2+","+rectangulo1.y2+")");
        System.out.println("Coordenada x: ("+rectangulo2.x1+","+ rectangulo2.y1+")"+" coordenada y: "+"("+rectangulo2.x2+","+rectangulo2.y2+")");

        System.out.println("Lados: "+totalLados2+" Area: "+perimetro2);

    }
}