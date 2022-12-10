
package Condicionales.Simples;

import java.util.Scanner;

public class PagoColegiatura {
    public static void ejecutar(){
        float cantidad, promedio;
        Scanner leer=new Scanner(System.in);
        System.out.println("************************************************");
        System.out.println("*        Algoritmo de pago de colegiatura      *");
        System.out.println("*                Autor: Geovanni               *");
        System.out.println("************************************************");
        System.out.println("");
        System.out.println("************************************************");
	System.out.println("*   Si el estudiante tiene un promedio de 9 ó  *");
	System.out.println("*      más se realiza un descuento del 30%     *");
	System.out.println("************************************************");
        System.out.println("");
        System.out.println("Ingrese el promedio del estudiante: ");
        promedio=leer.nextFloat();
        System.out.println("Ingrese el monto de la colegiatura: ");
        cantidad=leer.nextFloat();
        if(promedio<0 || promedio>10 || cantidad <=0){
            System.out.println("Dato inválido.");
        }
        if(promedio>=0 && promedio <=10 && cantidad >0){
            if(promedio>=9){
                System.out.println("El descuento por 30% es de: $"+cantidad*0.3);
                System.out.println("El monto total a pagar es de: $"+cantidad*0.7);
            }
            if(promedio<9){
                System.out.println("No se tiene descuento debido al promedio.");
                System.out.println("El monto total a pagar es de: $"+cantidad*1.1);
            }
        }
    }
    public static void main(String [] args){
        ejecutar();
    }
}
