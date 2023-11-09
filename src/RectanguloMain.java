public class RectanguloMain {
    public static void main(String[] args) {
        Rectangulo rectangulo1 = new Rectangulo();
        Rectangulo rectangulo2 = new Rectangulo();

        rectangulo1.x1 = 0;
        rectangulo1.y1 = 0;
        rectangulo1.x2 = 5;
        rectangulo1.y2 = 5;

        rectangulo2.x1 = 7;
        rectangulo2.y1 = 9;
        rectangulo2.x2 = 2;
        rectangulo2.y2 = 3;


        System.out.println("Coordenada x: ("+rectangulo1.x1+","+ rectangulo1.y1+")"+" coordenada y: "+"("+rectangulo1.x2+","+rectangulo1.y2+")");
        System.out.println("Coordenada x: ("+rectangulo2.x1+","+ rectangulo2.y1+")"+" coordenada y: "+"("+rectangulo2.x2+","+rectangulo2.y2+")");

        System.out.println("Perimetro rectangulo 1: "+(2*(rectangulo1.x1+rectangulo1.y1)));
        System.out.println("Perimetro rectangulo 2: "+(2*(rectangulo2.x2+rectangulo2.y2)));

        System.out.println("Área rectangulo 1: "+(rectangulo1.x1*rectangulo1.y1));
        System.out.println("Área rectangulo 2: "+(rectangulo2.x2*rectangulo2.y2));

        System.out.println("Modificado-->");

        rectangulo1.x1 = 9;
        rectangulo1.y1 = 5;
        rectangulo1.x2 = 4;
        rectangulo1.y2 = 7;

        rectangulo2.x1 = 1;
        rectangulo2.y1 = 5;
        rectangulo2.x2 = 3;
        rectangulo2.y2 = 8;

        System.out.println("Coordenada x: ("+rectangulo1.x1+","+ rectangulo1.y1+")"+" coordenada y: "+"("+rectangulo1.x2+","+rectangulo1.y2+")");
        System.out.println("Coordenada x: ("+rectangulo2.x1+","+ rectangulo2.y1+")"+" coordenada y: "+"("+rectangulo2.x2+","+rectangulo2.y2+")");

        System.out.println("Perimetro rectangulo 1: "+(2*(rectangulo1.x1+rectangulo1.y1)));
        System.out.println("Perimetro rectangulo 2: "+(2*(rectangulo2.x2+rectangulo2.y2)));

        System.out.println("Área rectangulo 1: "+(rectangulo1.x1*rectangulo1.y1));
        System.out.println("Área rectangulo 2: "+(rectangulo2.x2*rectangulo2.y2));
    }
}
