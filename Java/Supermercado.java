
package Condicionales;

import java.util.Scanner;

public class Supermercado {
    public static void ejecutar(){
        int cantidad, descuento;
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese el monto de la compra: ");
        cantidad=(int) (Math.random()*100);
        System.out.println(cantidad);
        if(cantidad>=0 && cantidad <=100){
            if(cantidad>=74){
                descuento=(int) (cantidad*0.80);
                System.out.println("El monto a pagar por 20% de descuento es de $"+descuento);
            }else{
                descuento=(int) (cantidad*0.85);
                System.out.println("El monto a pagar por 15% de descuento es de $"+descuento);
            }
        }else{
            System.out.println("El monto de la compra no es una cantidad válida.");
        }
        
    }
    public static void main(String [] args){
        ejecutar();
    }
}
