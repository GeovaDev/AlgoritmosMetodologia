
package SinCondicional;

import java.util.Scanner;

public class DoblarNum {
    public static void ejecutar(){
        double n;
        Scanner leer=new Scanner(System.in);
        System.out.println("************************************************");
        System.out.println("*       Algoritmo para doblar un número        *");
        System.out.println("*                Autor: Geovanni               *");
        System.out.println("************************************************");
        System.out.println("");
        System.out.println("************************************************");
	System.out.println("*      Algoritmo para doblar un número y       *");
	System.out.println("*             multiplicarlo por 25             *");
	System.out.println("************************************************");
        System.out.println("");
        System.out.println("Ingresa un número:");
        n=leer.nextDouble();
        System.out.println("El resultado es: "+ (n*2)*25);
    }
    public static void main(String [] args){
        ejecutar();
    }
}
