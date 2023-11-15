package EjercicioC;

class PersonaC {
    private String dni;
    private String nombre;
    private String apellidos;
    private int edad;
    private boolean mayor;

    public String getNombre(){
        return nombre;
    }
    public String getApellidos(){
        return apellidos;
    }
    public String getDni(){
        return dni;
    }
    public int getEdad(){
        return edad;
    }
    public boolean getMayor(){
        if(getEdad()<=18){
            System.out.println("Es mayor de edad.");
        }else {
            System.out.println("Es menor de edad.");
        }
        return mayor;
    }

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
    //public void setNombre(String name){
      //  this.nombre=name;
    //}
}
