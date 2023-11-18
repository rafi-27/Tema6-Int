package EjerciciosD;

public class PersonaDMain {
    public static void main(String[] args) {

    PersonaD pedro = new PersonaD("Pedro","Sanchez","5478742P",45);
    PersonaD juan = new PersonaD("Juan","Perez","1234578Ñ",19);

    pedro.imprime();
    //pedro.esMayoredad();
    //pedro.esJubilado();

    juan.imprime();
    //juan.esMayoredad();
    //juan.esJubilado();

        System.out.println("Vamos a comprobar la diferecia de edad que hay entre el primero y el segundo.");
        System.out.println("Hay una diferencia de edad entre pedro y juan de: "+pedro.diferenciaEdad(juan)+" años.");

    }
}
