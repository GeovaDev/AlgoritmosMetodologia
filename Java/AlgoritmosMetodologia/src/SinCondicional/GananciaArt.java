
package SinCondicional;

import java.util.Scanner;

public class GananciaArt {
    public static void ejecutar(){
        Scanner leer=new Scanner(System.in);
        double precio;
        System.out.println("************************************************");
        System.out.println("*   Algoritmo de la ganancia de un artículo    *");
        System.out.println("*                Autor: Geovanni               *");
        System.out.println("************************************************");
        System.out.println("");
        System.out.println("************************************************");
	System.out.println("*    La ganancia de un artículo es del 25%     *");
	System.out.println("************************************************");
        System.out.println("");
        System.out.println("Ingrese el precio del artículo:");
        precio=leer.nextDouble();
        System.out.println("El precio del artículo es de: $"+precio);
        System.out.println("La ganancia del artículo es de: $"+(precio*0.25));
        System.out.println("El precio al público es de: $"+(precio*1.25));
    }
    public static void main(String [] args){
        ejecutar();
    }
}
