import java.util.Scanner;
public class PersonaMainPrueba {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
        Persona ejemploUno = new Persona();

        ejemploUno.setNombre("");
        ejemploUno.setApellidos("");
        ejemploUno.setEdad(0);

        System.out.println("Introduce M o F si no no escribas nada.");
        char gener = teclado.next().charAt(0);
        ejemploUno.setSexo(gener);

        System.out.println("Mi nombre es "+ejemploUno.getNombre());
        System.out.println("De apellidos "+ejemploUno.getApellidos());
        System.out.println("Edad: "+ejemploUno.getEdad());
        if (ejemploUno.getSexo() == 'M'){
            System.out.println("Genero: Masculino.");
        }else if (ejemploUno.getSexo() == 'F'){
            System.out.println("Genero: Femenino.");
        }else {
            System.out.println("Genero: No especificado.");
        }

    }
}