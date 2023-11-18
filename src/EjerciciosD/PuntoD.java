package EjerciciosD;

class PuntoD {
    private int x;
    private int y;

    /**
     * Configurar constructor
     * @param x
     * @param y
     */
    public PuntoD(int x, int y){
        this.x=x;
        this.y=y;
    }

    /**
     * Configurar Getters
     * @return
     */
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }

    /**
     * Configurar Setters doble
     * @param x, y
     */
    public void setXY(int x, int y){
        this.x=x;
        this.y=y;
    }

    public void imprime(){
        System.out.println("Coordenada: "+"("+getX()+","+getY()+")");
    }

    public void desplaza(int dx, int dy){
        this.x += dx;
        this.y += dy;
    }

    public int distancia(PuntoD numer){
        return (int)Math.sqrt(Math.pow(numer.x-this.x,2)+(Math.pow(numer.y-this.y,2)));
    }
}