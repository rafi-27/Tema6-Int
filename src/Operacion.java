import javax.swing.*;

public class Operacion {
    //Atributos
    int numeroUno;
    int numeroDos;
    int suma;
    int resta;
    int producto;
    int division;

    //Metodo para que el usuario meta los datos:
    public void insert(){
        //Scanner teclado = new Scanner(System.in);
        //System.out.print("Introduce el primer numero: ");
        numeroUno = Integer.parseInt(JOptionPane.showInputDialog("Inserta el primer numero: "));
        //numeroUno = teclado.nextInt();
        //System.out.print("Introduce el segundo numero: ");
        //numeroDos = teclado.nextInt();
        numeroDos = Integer.parseInt(JOptionPane.showInputDialog("Inserta el segundo numero: "));
    }

    //Metodos
    public void sumar(){
        suma = numeroUno+numeroDos;
    }
    public void restar(){
        resta = numeroUno-numeroDos;
    }
    public void multiplicacion(){
        producto = numeroUno*numeroDos;
    }
    public void dividir(){
        division = numeroUno/numeroDos;
    }

    //Printamos los resultados-
    public void showResult(){
        System.out.println("La suma: "+suma);
        System.out.println("La resta: "+resta);
        System.out.println("La multiplicacion: "+producto);
        System.out.println("La division: "+division);
    }



}