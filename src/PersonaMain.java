import java.util.Scanner;

public class PersonaMain {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
    /*En el main de la clase principal instancia dos objetos de la clase Persona. Luego, pide por
teclado los datos de ambas personas (guárdalos en los objetos). Por último, imprime dos
mensajes por pantalla (uno por objeto) con un mensaje del estilo “Azucena Luján García
con DNI … es / no es mayor de edad”.*/

        Persona person = new Persona();
        Persona person1 = new Persona();
        //boolean mayor = false;

        System.out.println("Escribe tu nombre: ");
        person.nombre = teclado.nextLine();

        System.out.println("Introduce tu apellido: ");
        person.apellidos = teclado.nextLine();

        System.out.println("Introduce tu DNI: ");
        person.dni = teclado.nextLine();

        System.out.println("Introduce la edad: ");
        person.edad = teclado.nextInt();
        teclado.nextLine();


        System.out.println("Nombre de la segunda persona: ");
        person1.nombre = teclado.nextLine();

        System.out.println("El apellido: ");
        person1.apellidos = teclado.nextLine();

        System.out.println("Introduce el DNI: ");
        person1.dni = teclado.nextLine();

        System.out.println("Introduce la edad: ");
        person1.edad = teclado.nextInt();

        if(person.edad >= 18)
            person.mayor = true;

        if(person1.edad >= 18)
            person.mayor = true;


        if (person.mayor){
            System.out.println(person.nombre+" "+person.apellidos+" con DNI "+person.dni+" es mayor de edad.");
        }else {
            System.out.println(person.nombre+" "+person.apellidos+" con "+person.dni+" no es mayor de edad.");
        }
        if(person1.mayor) {
            System.out.println(person1.nombre + " " + person1.apellidos + " con DNI " + person1.dni + " es mayor de edad.");
        }else {
            System.out.println(person1.nombre + " " + person1.apellidos + " con " + person1.dni + " no es mayor de edad.");
        }
    }
}