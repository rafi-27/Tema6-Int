package SegundaParte.Biblioteca;

import java.time.LocalDate;

class EjemplarLibro {
    private String tituloLibro;
    private LocalDate fechaAdquisicion;
    private int numeroEjemplar;
    private boolean prestado;
    private static int contador = 1;

    /**
     * Constructor 1: cuando es el primer ejemplar de un determinado título, se le
     * pasa como parámetro solo el título del libro. El resto de datos los puede
     * calcular él.
     **/

    public EjemplarLibro(String nameLibro) {
        this.tituloLibro = nameLibro;
        this.fechaAdquisicion = LocalDate.now();
        this.numeroEjemplar = contador++;
        this.prestado = false;
    }

    /**
     * Constructor 2: se le pasa como parámetro un libro y copia todos sus atributos
     * salvo el número de ejemplar que será 1 más el del libro pasado.
     **/

    public EjemplarLibro(EjemplarLibro Libro) {
        this.tituloLibro = Libro.tituloLibro;
        this.fechaAdquisicion = Libro.fechaAdquisicion;
        this.numeroEjemplar = contador++;
        this.prestado = Libro.prestado;
    }

    /**
     * • Prestar(): si no está prestado lo marca como prestado y devuelve true ̧ si está
     * prestado no hace nada y devuelve false.
     **/
    public boolean getPrestado() {
        if (prestado == false) {
            prestado = true;
            return true;
        } else return false;
    }

    /**
     * Devolver(): si está prestado lo marca como no prestado y devuelve true ̧ si no
     * está prestado no hace nada y devuelve false.
     **/
    public boolean getDevolver() {
        if (prestado == true) {
            prestado = false;
            return true;
        } else return false;
    }

    /**
     * toString(): Genera un String con el nombre, la fecha entre paréntesis y el
     * número de ejemplar entre corchetes. Este método se usará para sacar por
     * pantalla de forma cómoda los datos de un libro
     **/
    @Override
    public String toString() {
        return this.tituloLibro+"("+LocalDate.now()+")["+this.numeroEjemplar+"]";
    }
}