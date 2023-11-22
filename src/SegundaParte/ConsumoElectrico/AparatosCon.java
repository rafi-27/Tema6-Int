package SegundaParte.ConsumoElectrico;

class AparatosCon {
/**
 * Hacer un programa que declare tres aparatos electricos, una bombilla de 100 watios, un
 * radiador de 2000 watios y una plancha de 1200 watios. El programa imprimirá el
 * consumo nada más crear los objetos. Posteriormente, se enciende la bombilla y la
 * plancha, y el programa imprime el consumo. Luego se apaga la plancha y se enciende el
 * radiador y se vuelve imprimir el consumo.
 */
String nombre;
int potencia;
boolean encendido;
static int consumoTotal=0;

public AparatosCon(String nameAparato, int consum){
    this.nombre=nameAparato;
    this.potencia=consum;
    this.encendido=false;
}

public void encenderOapagar(){
    if(!encendido){
        encendido = true;
        this.consumoTotal=consumoTotal+potencia;
    }else {
        encendido = false;
        consumoTotal=consumoTotal-potencia;
        System.out.println(nombre+", se acaba de apagar.");
    }
    imprimirConsumo();
}

public static void imprimirConsumo(){
    System.out.println("Tenemos un consumo total de: "+consumoTotal);
}

}