
package Ciclo.RepetirHastaQue;

import java.io.IOException;
import java.util.Scanner;

public class ValidacionNomb {
    public static void ejecutar() throws IOException {
        Scanner sc=new Scanner(System.in);
        System.out.println("***************************************************");
        System.out.println("* Algoritmo: Valida un nombre de longitud 3-50    *'");
        System.out.println("* Autor: Geovanni                                 *");
        System.out.println("***************************************************");
        System.out.println("");
        String nombre;
        do {
            System.out.println("Ingresa un nombre entre 3 y 50 carácteres:");
            nombre=sc.nextLine();
        } while (!(nombre.length()>=3 && nombre.length()<=50));
        System.out.println("Has ingresado el nombre correctamente.");
        System.out.println("Presione enter para continuar...");
        System.in.read();
    }
    public static void main(String[] args) throws IOException {
        ejecutar();
    }
}
