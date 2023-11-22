package SegundaParte.Biblioteca;

public class BibliotecaMain {
    public static void main(String[] args) {
        EjemplarLibro libroUno = new EjemplarLibro("Cronicas de la torre.");
        EjemplarLibro libroDos= new EjemplarLibro(libroUno);
        EjemplarLibro libroTres = new EjemplarLibro(libroDos);
        EjemplarLibro libroCuatro = new EjemplarLibro(libroTres);

        System.out.println(libroUno.toString());
        System.out.println(libroDos.toString());
        System.out.println(libroTres.toString());
        System.out.println(libroCuatro.toString());

        System.out.println("----------------Probando con otra forma-------------------");

        libroUno.getPrestado();
        libroDos.getPrestado();
        libroTres.getDevolver();
        libroCuatro.getDevolver();

        System.out.println(libroUno.toString());
        System.out.println(libroDos.toString());
        System.out.println(libroTres.toString());
        System.out.println(libroCuatro.toString());


    }

}
