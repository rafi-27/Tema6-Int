package SegundaParte.Bombilla;

class Bombilla {

    private boolean interruptorBombilla;
    static boolean interruptorGeneral;

    String lugar;

    public Bombilla(String lugarCasa, boolean encendemosBombilla) {
        this.lugar = lugarCasa;
        this.interruptorBombilla = encendemosBombilla;
    }

    //Un método para cambiar el estado del interruptor de al bombilla.
    public void setestadoBombilla(boolean encender) {
        if (encender) {
            interruptorBombilla = true;
            System.out.println(lugar + " se acaba de encender.");
        }
        else{
            interruptorBombilla = false;
            System.out.println("Acabas de apagar la bombilla de " + lugar);
        }
    }

    //Apagamos la bombilla.

    //Un método para cambiar el estado del interruptor general de la casa.

    //Un método que determina si una bombilla está luciendo o no.
    public void imprimeEncendido() {
        if (interruptorBombilla && interruptorGeneral) {
            System.out.println(lugar + " bombilla ON.");
        } else System.out.println(lugar + " bombilla OFF.");
    }

}