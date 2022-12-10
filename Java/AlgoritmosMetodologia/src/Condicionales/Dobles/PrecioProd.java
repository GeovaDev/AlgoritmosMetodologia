
package Condicionales.Dobles;

import java.util.Scanner;

public class PrecioProd {
    public static void ejecutar(){
        float n;
        Scanner leer=new Scanner(System.in);
        System.out.println("**************************************************");
        System.out.println("*        Algoritmo de descuento en almacén       *");
        System.out.println("*  Ingresa el monto de la compra y el descuento  *");
        System.out.println("* descuento se hará si el monto es mayor a $1000 *");
        System.out.println("*                 Autor: Geovanni                *");
        System.out.println("**************************************************");
        System.out.println("");
        System.out.println("Ingrese el monto de la compra: ");
        n=leer.nextFloat();
        if(n<=0){
            System.out.println("El monto de la compra $"+n+" es inválido.");
        }else{
            if(n>=1000){
                System.out.println("¡Felicidades! Su compra es aplicable para un descuento del 20%.");
                System.out.println("Su monto a pagar con el descuento aplicado es de: $"+(n*0.8));
            }else{
                System.out.println("Lo sentimos. Su monto de compra no es elegible para el descuento.");
                System.out.println("Su monto a pagar es de: $"+n);
            }
        }
        
    }
    public static void main(String [] args){
        ejecutar();
    }
}
