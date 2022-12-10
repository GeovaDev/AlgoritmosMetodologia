
package Condicionales.Simples;

import java.util.Scanner;

public class CompraCasa {
    public static void ejecutar(){
        double n, m;
        Scanner leer=new Scanner(System.in);
        System.out.println("************************************************");
        System.out.println("*      Algoritmo de la compra de una casa      *");
        System.out.println("*                Autor: Geovanni               *");
        System.out.println("************************************************");
        System.out.println("");
        System.out.println("************************************************");
        System.out.println("* Si el ingreso es mayor a $8000, el enganche  *");
        System.out.println("* es del 15% a pagar a cinco años.             *");
        System.out.println("* Si el ingreso es menos a $4000, el enganche  *");
        System.out.println("* es del 25% a pagar a diez años.              *");
        System.out.println("************************************************");
        System.out.println("");
        System.out.println("Ingresa el salario mensual: ");
        n=leer.nextDouble();
        System.out.println("Ingrese el costo de la casa: ");
        m=leer.nextDouble();
        if(n<0&&m<0){
            System.out.println("Datos inválidos.");
        }
        if(n>0 && m>0){
            if(n>=8000){
                System.out.println("El enganche es de: $"+m*0.15);
                System.out.println("Los pagos a realizar son: $"+(m-(m*0.15))/60+" mensuales a cinco años.");
            }
            if(n>=4000){
                System.out.println("El enganche es de: $"+m*0.25);
                System.out.println("Los pagos a realizar son: $"+(m-(m*0.25))/120+" mensuales a diez años.");
            }
            if(n<4000){
                System.out.println("El ingreso no es suficiente para adquirir una casa.");
            }
        }
    }
    public static void main(String [] args){
        ejecutar();
    }
}
