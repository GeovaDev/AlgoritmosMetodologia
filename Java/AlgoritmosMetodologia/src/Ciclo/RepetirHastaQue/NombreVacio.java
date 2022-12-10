
package Ciclo.RepetirHastaQue;

import java.io.IOException;
import java.util.Scanner;

public class NombreVacio {
    public static void ejecutar() throws IOException {
        Scanner sc=new Scanner(System.in);
        System.out.println("***************************************************");
        System.out.println("* Algoritmo: Valida un nombre vacío               *'");
        System.out.println("* Autor: Geovanni                                 *");
        System.out.println("***************************************************");
        System.out.println("");
        String nombre;
        do {
            System.out.println("Ingresa un nombre:");
            nombre=sc.nextLine();
        } while (nombre.isEmpty());
        System.out.println("Has ingresado el número correctamente.");
        System.out.println("Presione enter para continuar...");
        System.in.read();
        
    }
    public static void main(String[] args) throws IOException {
        ejecutar();
    }
}
