package SegundaParte.Triangulo;

class ClaseTriangulo {

/**
 * Crea una clase Triangulo. Sus atributos son los 3 puntos de sus vértices
 * Crea un constructor al que se le pasan los tres vértices (recuerda que son Puntos)
 * Crea un método que devuelva la longitud del perímetro del triángulo.
 */
PuntoTriangulo puntoUno,puntoDos,puntoTres;

    /**
     * Llamamos al punto de nuestro anterior ejercicio.
     * @param puntoUno
     * @param puntoDos
     * @param puntoTres
     */
    public ClaseTriangulo( PuntoTriangulo puntoUno,PuntoTriangulo puntoDos,PuntoTriangulo puntoTres){
        this.puntoUno =puntoUno;
        this.puntoDos=puntoDos;
        this.puntoTres=puntoTres;
    }

    public void imprimir(){

        System.out.println("Coordenadas: "+"("+puntoUno.getX()+","+puntoUno.getY()+")"+"("+puntoDos.getX()+","+puntoDos.getY()+")"+"("+puntoTres.getX()+","+puntoTres.getY()+")");


        System.out.println("Coordenadas: "+"("+puntoUno.getX()+","+puntoUno.getY()+")"+"("+puntoDos.getX()+","+puntoDos.getY()+")"+"("+puntoTres.getX()+","+puntoTres.getY()+")");


        System.out.println("Vértrices: "+"("+puntoUno.getX()+","+puntoUno.getY()+")"+" "+"("+puntoDos.getX()+","+puntoDos.getY()+")"+" "+"("+puntoTres.getX()+","+puntoTres.getY()+")");
    }

    //Creando el metodo para calcular los lados.

    public int calcularPerimetro(){
        int ladoUno = (int)Math.sqrt(Math.pow((puntoUno.getX()-puntoDos.getX()),2)+Math.pow((puntoUno.getY()-puntoDos.getY()),2));
        int ladoDos = (int)Math.sqrt(Math.pow((puntoDos.getX()-puntoTres.getX()),2)+Math.pow((puntoDos.getY()-puntoTres.getY()),2));
        int ladoTres = (int)Math.sqrt(Math.pow((puntoTres.getX()-puntoUno.getX()),2)+Math.pow((puntoTres.getY()-puntoUno.getY()),2));
        int perimetro = ladoUno+ladoDos+ladoTres;
        return perimetro;
    }

    public int calculoDos(){
        return puntoUno.distancia(puntoDos)+puntoDos.distancia(puntoTres)+puntoTres.distancia(puntoUno);
    }
}
