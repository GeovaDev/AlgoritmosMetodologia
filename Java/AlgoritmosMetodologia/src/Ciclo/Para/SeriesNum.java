
package Ciclo.Para;

import java.util.Scanner;

public class SeriesNum {
    public static void ejecutar() {
        int opc;
        Scanner sc=new Scanner(System.in);
        System.out.println("***************************************************");
        System.out.println("* Algoritmo: Series númericas                     *'");
        System.out.println("* Autor: Geovanni                                 *");
        System.out.println("***************************************************");
        System.out.println("");
        System.out.println("Elija la serie que desea ejecutar:");
        System.out.println("1.- Serie I");
        System.out.println("2.- Serie II");
        System.out.println("3.- Serie III");
        System.out.println("4.- Serie IV");
        opc=sc.nextInt();
        switch(opc){
            case 1:
                System.out.println("Serie ascendente:");
                for(int i=5;i<=500;i+=5){
                    System.out.printf(i+" ");
                }
                break;
            case 2:
                System.out.println("Serie descendente:");
                for(int i=500;i>=10;i-=5){
                    System.out.printf(i+", ");
                }
                System.out.printf("5.\n");
                break;
            case 3:
                System.out.println("Serie de Fibonacci:");
                System.out.println("¿Cuántos números desea calcular?");
                int c=sc.nextInt();
                int num[]=new int[c+1];
                num[0]=0;
                num[1]=1;
                num[2]=num[0]+num[1];
                System.out.printf("1 1 ");
                for(int x=3;x<=c;x++){
                    num[x]=num[x-2]+num[x-1];
                    System.out.printf(num[x]+" ");
                }
                break;
            case 4:
                System.out.println("Factorial de un número entero:");
                int n, mult;
                System.out.println("Ingresa el número entero del cual deseas saber el factorial:");
                n=sc.nextInt();
                mult=n*(n-1);
                for(int i=n-1;i>=1;i--){
                    if(i!=1){
                        mult=mult*(i-1);
                        System.out.printf(i+1+" * ");
                    }else{
                        System.out.printf(i+1+" ");
                    }
                }
                System.out.println("* 1 = "+mult);
                break;
            default:
                System.out.println("Dato inválido");
        }
    }
    
    public static void main(String[] args) {
        ejecutar();
    }
}
