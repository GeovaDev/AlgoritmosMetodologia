
package Ciclo.RepetirHastaQue;

import java.io.IOException;
import java.util.Scanner;

public class ValidarRango {
    public static void ejecutar() throws IOException {
        Scanner sc=new Scanner(System.in);
        System.out.println("***************************************************");
        System.out.println("* Algoritmo: Valida un número entre [20, 100]     *'");
        System.out.println("* Autor: Geovanni                                 *");
        System.out.println("***************************************************");
        System.out.println("");
        int num;
        do {
            System.out.println("Ingresa un número entre [20, 100]:");
            num=sc.nextInt();
        } while (!(num>=20 && num<=100));
        System.out.println("Has ingresado el número correctamente.");
        System.out.println("Presione enter para continuar...");
        System.in.read();
        
    }
    public static void main(String[] args) throws IOException {
        ejecutar();
    }
}
