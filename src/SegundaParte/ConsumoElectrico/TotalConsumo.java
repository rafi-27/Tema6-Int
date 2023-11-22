package SegundaParte.ConsumoElectrico;

public class TotalConsumo {
    public static void main(String[] args) {

        AparatosCon bombilla = new AparatosCon("Bombilla",100);
        AparatosCon radiador = new AparatosCon("Radiador",2000);
        AparatosCon plancha = new AparatosCon("Plancha",1200);

        bombilla.encenderOapagar();
        radiador.encenderOapagar();
        plancha.encenderOapagar();
        radiador.encenderOapagar();
        plancha.encenderOapagar();
        bombilla.encenderOapagar();
        //AparatosCon.imprimirConsumo();
    }
}