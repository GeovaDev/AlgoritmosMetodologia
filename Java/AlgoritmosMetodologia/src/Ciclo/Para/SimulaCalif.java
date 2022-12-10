
package Ciclo.Para;

import java.util.Scanner;

public class SimulaCalif {
    public static void ejecutar() throws InterruptedException {
        Scanner sc=new Scanner(System.in);
        int calf[]=new int[21];
        System.out.println("***************************************************");
        System.out.println("* Algoritmo: Invertir nombre                      *'");
        System.out.println("* Autor: Geovanni                                 *");
        System.out.println("***************************************************");
        System.out.println("");
        System.out.printf("Generando calificaciones");
        for (int x=1;x<=3;x++){
            Thread.sleep(2*1000);
            System.out.print(".");
        }
        for(int i=1;i<=20;i++){
            calf[i]=(int) (Math.random()*10);
        }
        System.out.println("");
        System.out.println("\nCalificaciones generadas:");
        int max=0, min=10, prom=0;
        for(int i=1;i<=20;i++){
            if(i<20){
                System.out.printf(calf[i]+" ");
            }else{
                System.out.printf(calf[i]+"");
            }
            max=Math.max(max, calf[i]);
            min=Math.min(min, calf[i]);
            prom=prom+calf[i];
        }
        System.out.println("");
        System.out.println("La calificación mayor es: "+max);
        System.out.println("La calificación menor es: "+min);
        System.out.println("El promedio es: "+((double) prom)/20);
    }
    public static void main(String[] args) throws InterruptedException {
        ejecutar();
    }
}
