
package Condicionales.Multiples;

import java.util.Scanner;

public class DescripcionDia {
    public static void ejecutar(){
        int dia;
        Scanner sc=new Scanner(System.in);
        System.out.println("************************************************");
        System.out.println("*          Algoritmo Día de la semana          *");
        System.out.println("*                Autor: Geovanni               *");
        System.out.println("************************************************");
        System.out.println("");
        System.out.println("Ingresa el número del día:");
        dia=sc.nextInt();
        switch(dia){
            case 1:
                System.out.println("DOMINGO DIA FELIZ Y DEL SOL");
                break;
            case 2:
                System.out.println("LUNES DIA DE LA LUNA");
                break;
            case 3:
                System.out.println("MARTES DIA DE MARTE");
                break;
            case 4:
                System.out.println("MIERCOLES DIA DE MERCURIO");
                break;
            case 5:
                System.out.println("JUEVES DIA DE JUPITER");
                break;
            case 6:
                System.out.println("VIERNES DIA DE VENUS");
                break;
            case 7:
                System.out.println("SABADO DIA DE SATURNO");
                break;
            default:
                System.out.println("Dato inválido.");
        }
    }
    public static void main(String [] args){
        ejecutar();
    }
}
