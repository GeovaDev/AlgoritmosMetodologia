
package Main;

import java.util.Scanner;

class FCM {
    static void main(){
        int lpm, edad;
        Scanner leer=new Scanner(System.in);
        System.out.println("************************************************");
        System.out.println("*                Algoritmo de FCM              *");
        System.out.println("*                Autor: Geovanni               *");
        System.out.println("************************************************");
        System.out.println("");
        System.out.println("************************************************");
	System.out.println("*Algoritmo para calcular la frecuencia cardiaca*");
	System.out.println("*             máxima de una persona.           *");
	System.out.println("************************************************");
        System.out.println("");
        System.out.println("Ingresa su edad:");
        edad=leer.nextInt();
        lpm=220-edad;
        System.out.println(lpm+" pulsaciones por minuto.");
    }    
    public static void main(String [] args){
        main();
    }
}
