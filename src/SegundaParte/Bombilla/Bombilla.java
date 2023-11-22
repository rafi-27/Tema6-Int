package SegundaParte.Bombilla;

class Bombilla {

boolean interruptorBombilla;
boolean interruptorGeneral;

String lugar;

public void encenderBombilla(String lugarCasa){
    this.lugar=lugarCasa;
    interruptorBombilla=false;
    interruptorGeneral=false;
}
//Un método para cambiar el estado del interruptor de al bombilla.
//Encendemos bombilla.
    public void encenderBombilla(){
    if(!interruptorBombilla){
        interruptorBombilla=true;
        System.out.println(lugar+ " se acaba de encender.");
    }else System.out.println("Ya estaba encendida");
}
//Apagamos la bombilla.
    public void apagarBombilla(){
    if (interruptorBombilla){
        interruptorBombilla=false;
        System.out.println("Acabas de apagar la bombilla de "+lugar);
        }else System.out.println("Ya estaba apagada.");
    }
//Un método para cambiar el estado del interruptor general de la casa.
    public void encendidoGeneral(){
        if(!interruptorGeneral){
            interruptorGeneral=true;
        }
    }

    public void apagadoGeneral(){
    if(interruptorGeneral){
        interruptorGeneral=false;
    }
    }

//Un método que determina si una bombilla esta luciendo o no.
    public void imprimeEncendido(){
        if(interruptorBombilla == true){
            System.out.println(lugar+" bombilla ON.");
        }else System.out.println(lugar+" bombilla OFF.");
    }


}
