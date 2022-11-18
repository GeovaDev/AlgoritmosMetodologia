
package Condicionales.Multiples;

import java.util.Scanner;

public class SueldoTrab {
    public static void ejecutar(){
        String nombre;
        int tipo, hijos;
        double sueldo, aumento=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("************************************************");
        System.out.println("*  Algoritmo cálculo de sueldo de trabajador   *");
        System.out.println("*                Autor: Geovanni               *");
        System.out.println("************************************************");
        System.out.println("");
        System.out.println("************************************************");
        System.out.println("*              Tipo de trabajador              *");
        System.out.println("*             1 ---------------- 10%           *");
        System.out.println("*             2 ---------------- 15%           *");
        System.out.println("*             3 ---------------- 20%           *");
        System.out.println("*             4 ---------------- 30%           *");
        System.out.println("*                    Prima 5%                  *");
        System.out.println("*Prima es de acuerdo al número de hijos [1, 10]*");
        System.out.println("************************************************");
        System.out.println("");
        System.out.println("Ingresa tu nombre: ");
        nombre=sc.nextLine();
        System.out.println("Ingresa el tipo de trabajador (1-4):");
        tipo=sc.nextInt();
        System.out.println("Ingresa la cantidad de hijos que tienes:");
        hijos=sc.nextInt();
        System.out.println("Ingresa tu sueldo:");
        sueldo=sc.nextDouble();
        if(!(nombre.isEmpty() || tipo<=0 || tipo>4 || hijos<0 || sueldo<0)){
            switch(tipo){
                case 1:
                    aumento=sueldo*1.1;
                    break;
                case 2:
                    aumento=sueldo*1.15;
                    break;
                case 3:
                    aumento=sueldo*1.20;
                    break;
                case 4:
                    aumento=sueldo*1.30;
                    break;
            }
            System.out.println("Nombre del trabajador: "+nombre);
            System.out.println("El tipo de trabajador es "+tipo+" por lo que su sueldo aumentó a $"+aumento);
            System.out.println("La prima de acuerdo al número de hijos "+hijos+" es de: $"+(sueldo*(hijos*5))/100);
            System.out.println("El nuevo sueldo es de: $"+(aumento+((sueldo*(hijos*5))/100)));
        }else{
            System.out.println("Algún dato ingresado no es correcto.");
        }
    }
    public static void main(String [] args){
        ejecutar();
    }
}
