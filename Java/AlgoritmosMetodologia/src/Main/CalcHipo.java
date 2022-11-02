
package Main;

import java.util.Scanner;

class CalcHipo {
    static void main(){
        Scanner leer=new Scanner(System.in);
        int a, b;
        System.out.println("************************************************");
        System.out.println("*    Algoritmo para calcular la hipotenusa     *");
        System.out.println("*                Autor: Geovanni               *");
        System.out.println("************************************************");
        System.out.println("");
        System.out.println("Ingrese el valor del cateto a:");
        a=leer.nextInt();
        System.out.println("Ingrese el valor del cateto b:");
        b=leer.nextInt();
        System.out.println("Dado el cateto a = "+a+" y el cateto b = "+b);
        System.out.println("El cálculo de la hipotenusa es: "+(Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2))));
    }
    public static void main(String [] args){
        main();
    }
}
