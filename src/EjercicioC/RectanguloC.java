package EjercicioC;

import EjerciciosB.PuntoBMain;

class RectanguloC {

    private int x1;
    private int y1;
    private int x2;
    private int y2;


    public RectanguloC(int x1, int x2, int y1, int y2){
        if(x1>=x2 && y1 >= y2){
            System.err.println("Error al instanciar el objeto.");
        }else {
            this.x1=x1;
            this.x2=x2;
            this.y1=y1;
            this.y2=y2;
        }
    }

    /**
     * Configyramos los getters
     * @return
     */
    public int getX1(){
        return x1;
    }

    public int getX2(){
        return x2;
    }

    public int getY1(){
        return y1;
    }

    public int getY2(){
        return y2;
    }

    /**
     * Configuramos los setters
     */
    public void setX1(int unox){
        this.x1=unox;
    }

    public void setX2(int dosx){
        this.x2=dosx;
    }
    public void setY1(int yeuno){
        this.y1=yeuno;
    }
    public void setY2(int yedos){
        this.y2=yedos;
    }


}
