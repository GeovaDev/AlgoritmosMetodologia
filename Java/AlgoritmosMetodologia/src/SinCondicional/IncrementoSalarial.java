
package SinCondicional;

import java.util.Scanner;

public class IncrementoSalarial {
    public static void ejecutar(){
        int salario;
        Scanner leer=new Scanner(System.in);
        System.out.println("************************************************");
        System.out.println("*       Algoritmo de incremento salarial       *");
        System.out.println("*                Autor: Geovanni               *");
        System.out.println("************************************************");
        System.out.println("");
        System.out.println("************************************************");
	System.out.println("* Algoritmo para calcular un ingreso salarial  *");
	System.out.println("*             del 25% a una persona.           *");
	System.out.println("************************************************");
        System.out.println("");
        System.out.println("Ingrese su salario:");
        salario=leer.nextInt();
        System.out.println("Felicidades, su salario ahora es de: $"+ salario*1.25);
    }
    public static void main(String [] args){
        ejecutar();
    }
}
