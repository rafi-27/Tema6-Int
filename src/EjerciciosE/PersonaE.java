package EjerciciosE;

class PersonaE {
    private final String dni;
    private String nombre;
    private String apellidos;
    private int edad;
    private static final int mayoriaEdad = 18;

    /**
     * Atributos principales-->
     * @param name
     * @param apellido
     * @param identidad
     * @param edad
     * Creamos un constructor
     */
    public PersonaE(String name, String apellido, String identidad, int edad){
        this.nombre=name;
        this.apellidos=apellido;
        this.dni=identidad;
        this.edad=edad;
    }
    //Configuramos los getters de los atributos.
    public String getNombre(){return nombre;}
    public String getApellidos(){
        return apellidos;
    }
    public String getDni(){return dni;}
    public int getEdad(){
        return edad;
    }

    //Configuramos los setters de los atributos.
    public void setNombre(String name){
        this.nombre=name;
    }
    public void setApellidos(String ape){
        this.apellidos=ape;
    }
    public void setEdad(int años){
        this.edad=años;
    }

    //Metodos.

    public void imprime(){
        System.out.println(getNombre()+" "+getApellidos()+" "+getEdad()+" "+getDni());
    }

    public boolean esMayoredad(){
        if(getEdad()>=mayoriaEdad) return true;
        else return false;
    }

    public boolean esJubilado(){
        if(getEdad()>=65) return true;
        else return false;
    }

    public int diferenciaEdad(PersonaE persona){
        return (int)(this.edad-persona.getEdad());
    }



}