
package Ciclo.Mientras;

import java.util.Scanner;

public class TodaviaNo {
    public static void ejecutar() {
        int n1=0,n2=1, res=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("***************************************************");
        System.out.println("* Algoritmo: Todavía no                           *'");
        System.out.println("* Autor: Geovanni                                 *");
        System.out.println("***************************************************");
        System.out.println("");
        while(res==0){
                System.out.println("Ingrese el primer número:");
                n1=sc.nextInt();
                System.out.println("Ingrese el segundo número:");
                n2=sc.nextInt();
            if(n1!=n2 || (n1%2==0 && n2%2==1) || (n1%2==1 && n2%2==0) || (n1>=1000 && n2>=1000)){
                res=1;
                System.out.println("Ya!!!");
            }else{
                res=0;
                System.out.println("Todavía no");
            }
        }
    }
    public static void main(String[] args) {
        ejecutar();
    }
}
