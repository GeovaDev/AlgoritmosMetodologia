
package Algoritmos.Subproceso;

import java.util.Scanner;

public class OpBasicasSP {
    public static void ejecutar() {
        double v1,v2;
        Scanner sc=new Scanner(System.in);
        System.out.println("***************************************************");
        System.out.println("* Algoritmo: Operaciones básica con Subproceso    *");
        System.out.println("* Autor: Geovanni                                 *");
        System.out.println("***************************************************");
        System.out.println("");
        System.out.println("Ingresa el valor 1:");
        v1=sc.nextDouble();
        System.out.println("Ingresa el valor 2:");
        v2=sc.nextDouble();
        System.out.println("El resultado de la suma es "+suma(v1,v2));
        System.out.println("El resultado de la resta es "+resta(v1,v2));
        System.out.println("El resultado de la multiplicación es "+multiplicacion(v1,v2));
        if(v2==0){
            System.out.println("La división por 0 no es posible.");
        }else{
            System.out.println("El resultado de la división es "+division(v1,v2));
        }
    }
    static double suma(double v1, double v2){
        return (v1+v2);
    }
    static double resta(double v1, double v2){
        return (v1-v2);
    }
    static double multiplicacion(double v1, double v2){
        return (v1*v2);
    }
    static double division(double v1, double v2){
        return (v1/v2);
    }
    public static void main(String[] args) {
        ejecutar();
    }
}
