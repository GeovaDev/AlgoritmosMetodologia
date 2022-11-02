
package Main;

import java.util.Scanner;

class ValorAbsoluto {
    static void main(){
        double n;
        Scanner leer=new Scanner(System.in);
        System.out.println("************************************************");
        System.out.println("*          Algoritmo de valor absoluto         *");
        System.out.println("*                Autor: Geovanni               *");
        System.out.println("************************************************");
        System.out.println("");
        System.out.println("Ingresa el valor numérico:");
        n=leer.nextDouble();
        System.out.println("El valor absoluto de "+ n+ " es "+ Math.abs(n));
    }
    public static void main(String [] args){
        main();
    }
}
