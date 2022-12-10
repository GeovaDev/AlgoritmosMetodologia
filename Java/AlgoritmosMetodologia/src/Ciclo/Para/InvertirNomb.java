
package Ciclo.Para;

import java.util.Scanner;

public class InvertirNomb {
    public static void ejecutar() {
        Scanner sc=new Scanner(System.in);
        System.out.println("***************************************************");
        System.out.println("* Algoritmo: Invertir nombre                      *'");
        System.out.println("* Autor: Geovanni                                 *");
        System.out.println("***************************************************");
        System.out.println("");
        System.out.println("Ingresa el nombre:");
        String nombre=sc.nextLine();
        String fn="";
        nameInverso(nombre,fn);
    }
    
    static void nameInverso(String nombre, String fn){
        for(int i=nombre.length();i>=1;i--){
            fn=fn+nombre.substring(i-1, i);
        }
        System.out.println("El nombre invertido es: "+fn);
    }
    
    public static void main(String[] args) {
        ejecutar();
    }
}
