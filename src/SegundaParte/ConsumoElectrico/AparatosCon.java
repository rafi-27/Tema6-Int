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

public AparatosCon(String nameAparato, int consum){
    this.nombre=nameAparato;
    this.potencia=consum;
    this.encendido=false;
}

public void encender(){
    if(!encendido){
        encendido = true;
        System.out.println(nombre+" tiene un consumo de "+potencia+" watios.");
    }else {
        System.out.println(nombre+" ya esta encendio.");
    }
}

public void apagar(){
    if(encendido){
        encendido = false;
        potencia=0;
        System.out.println(nombre+" la acabas de apagar ahora tiene un consumo de "+potencia+" watios");
    }else System.out.println(nombre+" esta apagado/a.");

}

}