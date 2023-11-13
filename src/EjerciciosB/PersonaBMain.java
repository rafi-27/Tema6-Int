package EjerciciosB;

public class PersonaBMain {
    public static void main(String[] args) {

        PersonaB personaUno = new PersonaB("55513702D","Rafik","Bachri Marouf",20);
        PersonaB personaDos = new PersonaB("12345678R","Jose","Martinez",3);


        if(personaUno.edad >= 18){
            System.out.println("SR/A, "+personaUno.nombre+" "+personaUno.apellidos+" con DNI "+personaUno.dni+" de "+personaUno.edad+" años. Es mayor de edad.");
        }else
            System.out.println("SR/A, "+personaUno.nombre+" "+personaUno.apellidos+" con DNI "+personaUno.dni+" de "+personaUno.edad+" años. Es ,menor de edad.");

        if(personaDos.edad>=18){
            System.out.println("SR/A, "+personaDos.nombre+" "+personaDos.apellidos+" con DNI "+personaDos.dni+" de "+personaDos.edad+" años. Es mayor de edad.");
        }else{
            System.out.println("SR/A, "+personaDos.nombre+" "+personaDos.apellidos+" con DNI "+personaDos.dni+" de "+personaDos.edad+" años. Es menor de edad.");
        }

    }
}
