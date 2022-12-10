
package Ciclo.Para;

import java.util.Scanner;

public class SiembraZanahorias {
    public static void ejecutar(){
        int cantidad;
        Scanner sc=new Scanner(System.in);
        System.out.println("***************************************************");
        System.out.println("* Algoritmo: Siembra de zanahorias interactivo    *'");
        System.out.println("* Autor: Geovanni                                 *");
        System.out.println("***************************************************");
        System.out.println("");
        System.out.println("Ingrese el total de zanahorias a sembrar:");
        cantidad=sc.nextInt();
        if(cantidad<=0){
            System.out.println("Dato inválido");
        }else{
            for(int x=1;x<=cantidad;x++){
                if(x%10==0){
                    System.out.printf("* ");
                    System.out.println("");
                }else{
                    System.out.printf("* ");
                }
            }
            System.out.println("");
            
        }
    }
    
    public static void main(String[] args) {
        ejecutar();
    }
}
