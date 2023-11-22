package SegundaParte.Bombilla;

public class BombillaMain {
    public static void main(String[] args) {

        Bombilla.interruptorGeneral = false;

        Bombilla salon = new Bombilla("Salon",true);
        Bombilla cocina = new Bombilla("Cocina",true);
        Bombilla patio = new Bombilla("Patio",false);
        Bombilla baño = new Bombilla("Baño",false);

        salon.imprimeEncendido();
        cocina.imprimeEncendido();
        patio.imprimeEncendido();
        baño.imprimeEncendido();

        System.out.println("------------------Cambiamos Parametros-------------------");
        salon.setestadoBombilla(true);
        cocina.setestadoBombilla(false);
        baño.setestadoBombilla(false);
        patio.setestadoBombilla(true);

        salon.imprimeEncendido();
        cocina.imprimeEncendido();
        baño.imprimeEncendido();
        patio.imprimeEncendido();







    }
}