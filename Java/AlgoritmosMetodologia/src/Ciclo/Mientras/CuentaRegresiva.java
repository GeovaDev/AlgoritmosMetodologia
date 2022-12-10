
package Ciclo.Mientras;

import java.util.Scanner;

public class CuentaRegresiva {
    public static void ejecutar() throws InterruptedException {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("***************************************************");
        System.out.println("* Algoritmo: Cuenta regresiva                     *'");
        System.out.println("* Autor: Geovanni                                 *");
        System.out.println("***************************************************");
        System.out.println("");
        System.out.println("Ingrese el número de donde quiere comenzar la cuenta regresiva:");
        num=sc.nextInt();
        while(num>=0){
            System.out.println("Cuenta regresiva "+num);
            Thread.sleep(1*1000);
            num--;
        }
    }
    public static void main(String[] args) throws InterruptedException {
        ejecutar();
    }
}
