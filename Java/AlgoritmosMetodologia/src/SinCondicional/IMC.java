
package SinCondicional;

import java.util.Scanner;

public class IMC {
    public static void ejecutar(){
        Scanner leer=new Scanner(System.in);
        double masa, altura;
        System.out.println("************************************************");
        System.out.println("*       Algoritmo del IMC de una persona       *");
        System.out.println("*                Autor: Geovanni               *");
        System.out.println("************************************************");
        System.out.println("");
        System.out.println("Ingresa tu talla en Kilogramos:");
        masa=leer.nextDouble();
        System.out.println("Ingresa tu talla en metros:");
        altura=leer.nextDouble();
        System.out.println("De acuerdo a la masa = "+masa+" y la talla = "+altura);
        System.out.println("El IMC (Indice de masa corporal) es de: "+(masa/Math.pow(altura, 2)));
    }
    public static void main(String [] args){
        ejecutar();
    }
}
