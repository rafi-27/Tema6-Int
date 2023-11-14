package EjerciciosB;

public class RectanguloBMain {
    public static void main(String[] args) {

        RectanguloB rectanguloUno = new RectanguloB(10,10,-3,7);
        RectanguloB rectanguloDos = new RectanguloB(1,1,2,5);

        System.out.println("Coordenadas 1: "+"("+"x:"+rectanguloUno.x1+","+"y:"+rectanguloUno.y1+")"+" "+"("+"x:"+rectanguloUno.x2+","+"y:"+rectanguloUno.y2+")");
        System.out.println("Coordenadas 2: "+"("+"x:"+rectanguloDos.x1+","+"y:"+rectanguloDos.y1+")"+" "+"("+"x:"+rectanguloDos.x2+","+"y:"+rectanguloDos.y2+")");

        System.out.println("Procedemos a calcular el area y perimetro-->");
        int ladoReUno = rectanguloUno.x2-rectanguloUno.x1;
        int alturaReUno = rectanguloUno.y2-rectanguloUno.y1;
        int sumaLadoUno = (ladoReUno*2)+(alturaReUno*2);
        int perimetroUno = ladoReUno*alturaReUno;
        System.out.println("Del primer rectangulo, los lados suman:"+sumaLadoUno+" y tiene un perimetro de "+perimetroUno);

        int ladoReDos = rectanguloDos.x2-rectanguloDos.x1;
        int alturaReDos = rectanguloDos.y2-rectanguloDos.y1;
        int sumaLadoDos = (ladoReDos*2)+(alturaReDos*2);
        int perimetroDos = ladoReDos*alturaReDos;
        System.out.println("Del segundo rectangulo, los lados suman:"+sumaLadoDos+" y tiene un perimetro de "+perimetroDos);

    }
}