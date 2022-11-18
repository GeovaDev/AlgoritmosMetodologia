
package Condicionales.Simples;

import java.util.Scanner;

public class VentaLlantas {
    public static void ejecutar(){
        int n;
        Scanner leer=new Scanner(System.in);
        System.out.println("**************************************************");
        System.out.println("*          Algoritmo de venta de llantas         *");
        System.out.println("*     El precio normal por llanta es de $800     *");
        System.out.println("*  Si la compra es 5 o más el precio es de $700  *");
        System.out.println("*                 Autor: Geovanni                *");
        System.out.println("**************************************************");
        System.out.println("");
        System.out.println("Ingrese el total de llantas a comprar:");
        n=leer.nextInt();
        if(n<0){
            System.out.println("Valor en llantas no válido.");
        }
        if(n>0 && n<4){
            System.out.println("El número de llantas a comprar es: "+n);
            System.out.println("El monto a pagar es de: $"+(n*800));
        }
        if(n>=5){
            System.out.println("El número de llantas a comprar es: "+n);
            System.out.println("El monto a pagar es de: $"+(n*700));
        }
        
    }
    public static void main(String [] args){
        ejecutar();
    }
}
