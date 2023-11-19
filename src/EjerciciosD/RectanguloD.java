package EjerciciosD;

class RectanguloD {
    private int x1;
    private int y1;
    private int x2;
    private int y2;


    public RectanguloD(int x1, int x2, int y1, int y2) {
        if (x1 >= x2 && y1 >= y2) {
            System.err.println("Error al instanciar el objeto.");
        } else {
            this.x1 = x1;
            this.x2 = x2;
            this.y1 = y1;
            this.y2 = y2;
        }
    }

    /**
     * Configyramos los getters
     *
     * @return
     */
    public int getX1() {
        return x1;
    }

    public int getX2() {
        return x2;
    }

    public int getY1() {
        return y1;
    }

    public int getY2() {
        return y2;
    }

    /**
     * Configuramos los setters
     */
    public void setX1(int unox) {
        this.x1 = unox;
    }

    public void setX2(int dosx) {
        if (dosx < x1) {
            System.err.println("Dato introducido incorrecto");
        } else this.x2 = dosx;
    }

    public void setY1(int yeuno) {
        this.y1 = yeuno;
    }

    public void setY2(int yedos) {
        if (yedos < x1) {
            System.err.println("Dato introducido incorrecto");
        } else this.y2 = yedos;
    }

    /**
     * Configuramos el imprimir.
     */

    public void imprimir(){
        System.out.println("Coordenada: "+"("+getX1()+","+getY1()+")"+" "+"("+getX2()+","+getY2()+")");
    }

    //Métodos setters dobles y cuadruples: setX1Y1, set X2Y2 y setAll(…)

    public void setX1Y1(int x1, int y1){
        this.x1=x1;
        this.y1=y1;
    }
    public void setX2Y2(int x2, int y2){
        this.x2=x2;
        this.y2=y2;
    }

    public void setAll(int x1, int y1, int x2, int y2){
        this.x1=x1;
        this.y1=y1;
        this.x2=x2;
        this.y2=y2;
    }

    //Métodos getPerimetro y getArea que calculen y devuelvan el perímetro y área del objeto.

    public int getArea(){
        return (this.x1-this.x2)*(this.y1-this.y2);
    }

    public int getPerimetro(){
        return (2*((this.x1-this.x2)+(this.y1-this.y2)));
    }
}