
package Condicionales.Simples;

import java.util.Scanner;

public class EcuaCuadratica {
    public static void ejecutar(){
        int a, b, c;
        double suma;
        Scanner leer=new Scanner(System.in);
        System.out.println("************************************************");
        System.out.println("*      Algoritmo de la ecuacion cuadratica     *");
        System.out.println("*                Autor: Geovanni               *");
        System.out.println("************************************************");
        System.out.println("");
        System.out.println("************************************************");
	System.out.println("*     Algoritmo para calcular la ecuación      *");
	System.out.println("*        cuadrática por formula general        *");
	System.out.println("************************************************");
        System.out.println("");
        System.out.println("Ingrese el coeficiente a:");
        a=leer.nextInt();
        System.out.println("Ingrese el coeficiente b:");
        b=leer.nextInt();
        System.out.println("Ingrese el coeficiente c:");
        c=leer.nextInt();
        suma=(b*b-4*a*c);
        if(a==0){
            System.out.println("a = 0 por lo tanto no se tiene solución.");
        }
        if(a!=0){
            if(suma<0){
                System.out.println("El valor de X1 es: "+(-b+Math.sqrt(suma*-1))/2*a+"i");
                System.out.println("El valor de X2 es: "+(-b-Math.sqrt(suma*-1))/2*a+"i");
            }
            if(suma>0){
                System.out.println("El valor de X1 es: "+(-b+Math.sqrt(suma))/2*a);
                System.out.println("El valor de X2 es: "+(-b-Math.sqrt(suma))/2*a);
            }
        }
    }
    public static void main(String [] args){
        ejecutar();
    }
}
