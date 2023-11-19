package EjerciciosD;
class PersonaD {
    private String dni;
    private String nombre;
    private String apellidos;
    private int edad;

    /**
     * Atributos principales-->
     * @param name
     * @param apellido
     * @param identidad
     * @param edad
     * Creamos un constructor
     */
    public PersonaD(String name, String apellido, String identidad, int edad){
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
    public void setDni(String identidad){
        this.dni=identidad;
    }
    public void setEdad(int años){
        this.edad=años;
    }

    //Metodos.

    public void imprime(){
        System.out.println(getNombre()+" "+getApellidos()+" "+getEdad()+" "+getDni());
    }

    public boolean esMayoredad(){
        if(getEdad()>=18) return true;
        else return false;
    }

    public boolean esJubilado(){
        if(getEdad()>=65) return true;
        else return false;
    }

    public int diferenciaEdad(PersonaD persona){
        return (int)(this.edad-persona.getEdad());
    }
}