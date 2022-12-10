
package Condicionales.Multiples;

import java.util.Scanner;

public class HospitalCrisis {
    public static void ejecutar(){
        String nombre;
        int tipo, n, costo=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("************************************************");
        System.out.println("*         Algoritmo Hospital en crisis         *");
        System.out.println("*                Autor: Geovanni               *");
        System.out.println("************************************************");
        System.out.println("");
        System.out.println("************************************************");
        System.out.println("*       Tipo de enfermedad a diagnosticar      *");
        System.out.println("*            1 ---------------- $1500          *");
        System.out.println("*            2 ---------------- $1700          *");
        System.out.println("*            3 ---------------- $1900          *");
        System.out.println("************************************************");
        System.out.println("");
        System.out.println("Ingrese el nombre del paciente:");
        nombre=sc.nextLine();
        System.out.println("Ingrese el tipo de enfermedad:");
        tipo=sc.nextInt();
        System.out.println("Ingrese el número de días:");
        n=sc.nextInt();
        if(nombre.isEmpty() || tipo<=0 || tipo>3 || n<=0){
            System.out.println("Algún dato ingresado no es válido.");
        }else{
            switch(tipo){
                case 1:
                    costo=1500*n;
                    break;
                case 2:
                    costo=1700*n;
                    break;
                case 3:
                    costo=1900*n;
                    break;
            }
            System.out.println("Nombre del paciente: "+nombre);
            System.out.println("Días hospitalizado: "+n);
            System.out.println("Tipo de enfermedad: "+tipo);
            System.out.println("Costo total a pagar: $"+costo);
        }
    }
    public static void main(String [] args){
        ejecutar();
    }
}
