
package Main;

import java.util.Scanner;

class EcuacionCuad {
    public static void main(String [] args){
        main();
    }
    static void main(){
        Scanner leer=new Scanner(System.in);
        int a, b, c;
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
        System.out.println("Ingresa el valor de A:");
        a=leer.nextInt();
        System.out.println("Ingresa el valor de B:");
        b=leer.nextInt();
        System.out.println("Ingresa el valor de C:");
        c=leer.nextInt();
        System.out.println("La solucion de X1 es: "+ (-b+Math.sqrt(Math.pow(b, 2)-4*a*c))/(2*a));
        System.out.println("La solucion de X2 es: "+ (-b-Math.sqrt(Math.pow(b, 2)-4*a*c))/(2*a));
    }
}
