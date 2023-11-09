public class PuntoMain {
    public static void main(String[] args) {

        Punto punto1 = new Punto();
        Punto punto2 = new Punto();
        Punto punto3 = new Punto();
        Punto punto4 = new Punto();

        punto1.x=5;
        punto1.y=0;

        punto2.x=10;
        punto2.y=10;

        punto3.x=-3;
        punto3.y=7;

        punto4.x = 0;
        punto4.y = 5;

        punto4.x= punto3.y+punto2.x* punto1.x;

        System.out.println("Primera coordenada x: "+punto1.x+" y la y: "+punto1.y);
        System.out.println("Segunda coordenada es: "+punto2.x+" y la y: "+punto2.y);
        System.out.println("Tercera coordenada es: "+punto3.x+" y la y: "+punto3.y);

        System.out.println("Coordenada generada de multiplicar y sumar y restar: "+punto4.x);

    }
}