
package Ciclo.RepetirHastaQue;

import java.io.IOException;
import java.util.Scanner;

public class ValidacionRangos {
    public static void ejecutar() throws IOException {
        Scanner sc=new Scanner(System.in);
        System.out.println("*******************************************************");
        System.out.println("* Algoritmo: Valida un número entre [1, 10] y [40,50] *'");
        System.out.println("* Autor: Geovanni                                     *");
        System.out.println("*******************************************************");
        System.out.println("");
        int num;
        do {
            System.out.println("Ingresa un número entre [1, 10] y [40, 50]:");
            num=sc.nextInt();
        } while (!(num>=1 && num<=10) && !(num>=40 && num<=50));
        System.out.println("Has ingresado el número correctamente.");
        System.out.println("Presione enter para continuar...");
        System.in.read();
        
    }
    public static void main(String[] args) throws IOException {
        ejecutar();
    }
}
