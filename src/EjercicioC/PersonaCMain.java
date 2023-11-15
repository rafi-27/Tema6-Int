package EjercicioC;

public class PersonaCMain {
    public static void main(String[] args) {
        PersonaC rafi = new PersonaC();
        PersonaC antoni = new PersonaC();

        rafi.setNombre("Boos");
        rafi.setApellidos("Hugo");
        rafi.setDni("45357498534E");
        rafi.setEdad(19);

        antoni.setNombre("Antoni");
        antoni.setApellidos("Ronaldo");
        antoni.setDni("543875934R");
        antoni.setEdad(12);

        if(antoni.getEdad()>=18){
            System.out.println(antoni.getNombre()+" con apellido "+antoni.getApellidos()+" con dni "+antoni.getDni()+" de edad "+antoni.getEdad()+" es mayor de edad.");
        }else {
            System.out.println(antoni.getNombre()+" con apellido "+antoni.getApellidos()+" con dni "+antoni.getDni()+" de edad "+antoni.getEdad()+" es menor de edad.");

        }
        if(rafi.getEdad()>=18){
            System.out.println(rafi.getNombre()+" con apellido "+rafi.getApellidos()+" con dni "+rafi.getDni()+" de edad "+rafi.getEdad()+" es mayor de edad.");
        }else {
            System.out.println(rafi.getNombre()+" con apellido "+rafi.getApellidos()+" con dni "+rafi.getDni()+" de edad "+rafi.getEdad()+" es menor de edad.");

        }

        System.out.println("Siguente");

        System.out.println(antoni.getNombre()+" con apellido "+antoni.getApellidos()+" con dni "+antoni.getDni()+" de edad "+antoni.getEdad()+antoni.getMayor());
        System.out.println(rafi.getNombre()+" con apellido "+rafi.getApellidos()+" con dni "+rafi.getDni()+" de edad "+rafi.getEdad()+rafi.getMayor());

    }
}
