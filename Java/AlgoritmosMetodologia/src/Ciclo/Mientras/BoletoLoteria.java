
package Ciclo.Mientras;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class BoletoLoteria {
    public static void ejecutar() {
        int boleto, c=0, ganador=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("***************************************************");
        System.out.println("* Algoritmo: Boletos de lotería                   *'");
        System.out.println("* Autor: Geovanni                                 *");
        System.out.println("***************************************************");
        System.out.println("");
        System.out.println("Ingrese el número de boleto que crees que ganará:");
        boleto=sc.nextInt();
        if(boleto>100 || boleto<1){
            System.out.println("Número de boleto fuera de rango");
        }else{
            while((!(c>99) && boleto!=ganador)){
                ganador=ThreadLocalRandom.current().nextInt(1,100);
                c++;
            }
            System.out.println("En "+c+" intentos se sacará el boleto "+boleto);
        }
    }
    public static void main(String[] args) {
        ejecutar();
    }
}
