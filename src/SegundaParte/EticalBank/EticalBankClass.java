package SegundaParte.EticalBank;

import java.util.Scanner;

public class EticalBankClass {
    public static void main(String[] args) {
        CuentaBancariaClass rafi = new CuentaBancariaClass("ES12345678910111213141516171819202122","Rafik Bachri Marouf");
        Scanner teclado = new Scanner(System.in);
        int numero;
        do {
            System.out.println("1.Datos de la cuenta. Mostrará el IBAN, el titular y el saldo.");
            System.out.println("2. IBAN. Mostrará el IBAN.");
            System.out.println("3. Titular. Mostrará el titular.");
            System.out.println("4. Saldo. Mostrará el saldo disponible.");
            System.out.println("5. Ingreso. Pedirá la cantidad a ingresar y realizará el ingreso si es posible.");
            System.out.println("6. Retirada. Pedirá la cantidad a retirar y realizará la retirada si es posible.");
            System.out.println("7. Salir. Termina el programa.");
            System.out.print("Introduce la opcion: ");
            numero = teclado.nextInt();
            switch (numero){
                case 1:
                    System.out.println("Titular: "+ rafi.getTitular()+" numero IBAN "+rafi.getIBAN()+" saldo: "+rafi.getSaldo());
                    break;
                case 2:
                    System.out.println("IBAN: "+rafi.getIBAN());
                    break;
                case 3:
                    System.out.println("Titular: "+rafi.getTitular());
                    break;
                case 4:
                    System.out.println("Saldo: "+rafi.getSaldo());
                    break;
                case 5:
                    System.out.print("Indique la cantidad a ingresar: ");
                    rafi.ingresar(teclado.nextDouble());
                    break;
                case 6:
                    System.out.print("Indica la cantidad a retirar: ");
                    rafi.retirar(teclado.nextDouble());
                    break;
                case 7:
                    break;
            }
        }while (numero != 7);










    }
}
