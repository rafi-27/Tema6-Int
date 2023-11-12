class PersonaPrueba {
    private String Nombre;
    private String Apellidos;
    private int Edad;
    private char Sexo;

    void setNombre(String name){
        this.Nombre = name;
    }
    public String getNombre() {
        return Nombre;
    }

    void setApellidos(String apellidos){
        this.Apellidos = apellidos;
    }
    public String getApellidos(){
        return Apellidos;
    }

    void setEdad(int anios){
        this.Edad = anios;
    }
    public int getEdad(){
        return Edad;
    }

    void setSexo(char genero){
        this.Sexo = genero;
    }
    public char getSexo(){
        return Sexo;
    }


}
