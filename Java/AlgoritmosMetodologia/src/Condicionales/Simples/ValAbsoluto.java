
package Condicionales.Simples;

import java.util.Scanner;

public class ValAbsoluto {
    public static void ejecutar(){
        double n;
        Scanner leer=new Scanner(System.in);
        System.out.println("************************************************");
        System.out.println("*          Algoritmo de valor absoluto         *");
        System.out.println("*                Autor: Geovanni               *");
        System.out.println("************************************************");
        System.out.println("");
        System.out.println("Ingresa el valor numérico:");
        n=leer.nextDouble();
        if(n<0){
            System.out.println("El valor absoluto de "+ n+ " es "+ (n*-1));
        }
        if(n>=0){
            System.out.println("El valor absoluto de "+ n+ " es "+ n);
        }
        
    }
    public static void main(String [] args){
        ejecutar();
    }
}
