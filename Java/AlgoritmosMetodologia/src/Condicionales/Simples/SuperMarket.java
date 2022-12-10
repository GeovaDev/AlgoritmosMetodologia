
package Condicionales.Simples;

import java.util.Scanner;

public class SuperMarket {
    public static void ejecutar(){
        double n;
        Scanner leer=new Scanner(System.in);
        System.out.println("************************************************");
        System.out.println("*           Algoritmo de SuperMarket           *");
        System.out.println("*                Autor: Geovanni               *");
        System.out.println("************************************************");
        System.out.println("");
        System.out.println("************************************************");
        System.out.println("*   Calcula el monto a pagar por la compra en  *");
        System.out.println("*  base a un número sacado al azar (1-74) 15%  *");
        System.out.println("*                 (75-100) 20%                 *");
        System.out.println("************************************************");
        System.out.println("");
        System.out.println("Ingrese el monto de compra:");
        n=leer.nextDouble();
        if(n<=0){
            System.out.println("El monto de la compra no es una cantidad válida.");
        }
        if(n>0){
            int rdm=((int) Math.floor(Math.random()*100));
            System.out.println("El número generado al azar es: "+rdm);
            if(rdm<75){
                System.out.println("El monto a pagar por 15% de descuento es: $"+(n*0.85));
            }
            if(rdm>=75){
                System.out.println("El monto a pagar por 20% de descuento es: $"+(n*0.80));
            }
        }
        
    }
    public static void main(String [] args){
        ejecutar();
    }
}
