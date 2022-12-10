
package Ciclo.Mientras;

import java.util.Scanner;

public class SembrarZanaM {
    public static void ejecutar() {
        Scanner sc=new Scanner(System.in);
        System.out.println("***************************************************");
        System.out.println("* Algoritmo: Siembra de zanahorias y lechugas     *'");
        System.out.println("* Autor: Geovanni                                 *");
        System.out.println("***************************************************");
        System.out.println("");
        System.out.println("Ingresa la cantidad de hortalizas a sembrar:");
        int x=1, c=sc.nextInt();
        while(x<=c){
            if(x%10==0){
                System.out.printf("&");
                System.out.println("");
            }else{
                if(x%2==1){
                    System.out.printf("* ");
                }else{
                    System.out.printf("& ");
                }
            }
            x++;
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        ejecutar();
    }
}
