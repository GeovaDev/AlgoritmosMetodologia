
package SinCondicional;

import java.util.Scanner;

public class PresupuestoHospital {
    public static void ejecutar(){
        double presupuesto;
        Scanner leer=new Scanner(System.in);
        System.out.println("************************************************");
        System.out.println("*    Algoritmo del presupuesto del hospital    *");
        System.out.println("*                Autor: Geovanni               *");
        System.out.println("************************************************");
        System.out.println("");
        System.out.println("************************************************");
	System.out.println("*    Algoritmo para calcular el presupuesto    *");
	System.out.println("*          de un hospital dividido en:         *");
        System.out.println("* 1.- Ginecología ------------------------ 40% *");
        System.out.println("* 2.- Traumatología ---------------------- 30% *");
        System.out.println("* 3.- Pediatría -------------------------- 30% *");
	System.out.println("************************************************");
        System.out.println("");
        System.out.println("Ingrese el presupiesto total del hospital:");
        presupuesto=leer.nextDouble();
        System.out.println("De acuerdo al presupuesto "+presupuesto+" para las áreas son:");
        System.out.println("Traumatología: $"+(presupuesto*0.3));
        System.out.println("Ginecología: $"+(presupuesto*0.4));
        System.out.println("Pediatría: $"+(presupuesto*0.3));
    }
    public static void main(String [] args){
        ejecutar();
    }
}
