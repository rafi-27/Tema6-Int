public class PuntoMain {
    public static void main(String[] args) {

        Punto punto1 = new Punto();
        Punto punto2 = new Punto();
        Punto punto3 = new Punto();

        punto1.x=5;
        punto1.y=0;

        punto2.x=10;
        punto2.y=10;

        punto3.x=-3;
        punto3.y=7;

        System.out.println("Primera coordenada es: "+"("+punto1.x+","+punto1.y+")");
        System.out.println("Segunda coordenada es: "+"("+punto2.x+","+punto2.y+")");
        System.out.println("Tercera coordenada es: "+"("+punto3.x+","+punto3.y+")");

    }
}