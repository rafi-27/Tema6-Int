import javax.swing.*;

public class OperacionMain {
    public static void main(String[] args) {

        Operacion op = new Operacion();

        op.insert();
        op.sumar();
        op.restar();
        op.multiplicacion();
        op.dividir();

        op.showResult();

    }
}
