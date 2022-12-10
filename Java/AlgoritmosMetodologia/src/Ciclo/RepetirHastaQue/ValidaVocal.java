
package Ciclo.RepetirHastaQue;

import java.io.IOException;
import java.util.Scanner;

public class ValidaVocal {
    public static void ejecutar() throws IOException {
        Scanner sc=new Scanner(System.in);
        System.out.println("***************************************************");
        System.out.println("* Algoritmo: Valida si una letra es vocal         *'");
        System.out.println("* Autor: Geovanni                                 *");
        System.out.println("***************************************************");
        System.out.println("");
        String vocal;
        do {
            System.out.println("Ingresa un nombre:");
            vocal=sc.next();
            if(vocal.length()>1){
                System.out.println("Solo se admite un caracter.");
            }
        } while (!(vocal.toLowerCase().matches("[aeiou]")));
        System.out.println("Has ingresado una vocal correctamente.");
        System.out.println("Presione enter para continuar...");
        System.in.read();
    }
    public static void main(String[] args) throws IOException {
        ejecutar();
    }
}
