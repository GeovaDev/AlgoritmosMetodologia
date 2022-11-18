
package Condicionales.Dobles;

import java.util.Scanner;

public class SalarioSem {
    public static void ejecutar(){
        int n;
        Scanner leer=new Scanner(System.in);
        System.out.println("**************************************************");
        System.out.println("*          Algoritmo de salario semanal          *");
        System.out.println("*   Un obrero de manera normal trabaja 40 horas  *");
        System.out.println("*     La hora de paga a $16 y la extra a $32     *");
        System.out.println("*                 Autor: Geovanni                *");
        System.out.println("**************************************************");
        System.out.println("");
        System.out.println("Ingrese las horas trabajadas por el obrero:");
        n=leer.nextInt();
        if(n<0){
            System.out.println("Número de horas trabajadas inválida.");
        }else{
            if(n>40){
                System.out.println("Se trabajaron "+n+" horas totales.");
                System.out.println("De las cuales, "+(n-40)+" fueron horas extras.");
                System.out.println("Por "+(n-40)+" horas extras, el pago es de: $"+(n-40)*32);
                System.out.println("El pago por las 40 horas normales es de: $"+(40*16));
                System.out.println("El total a pagar es de: $"+(((n-40)*32)+40*16));
            }else{
                System.out.println("No hubo horas extras a considerar.");
                System.out.println("El total a pagar por "+n+" horas es de: $"+n*16);
            }
        }
        
    }
    public static void main(String [] args){
        ejecutar();
    }
}
