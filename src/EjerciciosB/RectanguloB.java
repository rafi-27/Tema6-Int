package EjerciciosB;

class RectanguloB {
    int x1;
    int y1;
    int x2;
    int y2;

    public RectanguloB(int x1, int y1, int x2, int y2){
        if(x1>x2 && x2>y2){
            System.err.println("ERROR al instanciar Rectangulo: ");
        }else{
            this.x1 = x1;
            this.x2 = x2;
            this.y1 = y1;
            this.y2 = y2;
        }
    }
}