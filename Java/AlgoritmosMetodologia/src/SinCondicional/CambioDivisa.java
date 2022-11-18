
package SinCondicional;

import java.util.Scanner;

public class CambioDivisa {
    public static void ejecutar(){
        double dolar, dolar_euro, pesos;
        Scanner sc=new Scanner(System.in);
        dolar_euro=0.887;
        System.out.println("************************************************");
        System.out.println("*             Algoritmo de divisas             *");
        System.out.println("*                Autor: Geovanni               *");
        System.out.println("************************************************");
        System.out.println("Ingrese la cantidad en pesos mexicanos");
        pesos=sc.nextDouble();
        dolar=(pesos/2)/19.75;
        System.out.println(pesos + " pesos equivalen a:");
        System.out.println(dolar+" dólares.");
        System.out.println((dolar_euro*dolar)+" euros.");
    }
    public static void main(String [] args){
        ejecutar();
    }
}
