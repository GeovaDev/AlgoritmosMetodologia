
package Condicionales.Dobles;

import java.util.Scanner;

public class AprobacionRep {
    public static void ejecutar(){
        float u1,u2,u3;
        Scanner leer=new Scanner(System.in);
        System.out.println("**************************************************");
        System.out.println("*              Algoritmo de promedio             *");
        System.out.println("*     Ingresa 3 calificaciones e indicará si     *");
        System.out.println("*   aprobaste o reprobaste, la cal. mínima es 0  *");
        System.out.println("*                 Autor: Geovanni                *");
        System.out.println("**************************************************");
        System.out.println("");
        System.out.println("Ingrese la calificación de la Unidad 1:");
        u1=leer.nextFloat();
        System.out.println("Ingrese la calificación de la Unidad 2:");
        u2=leer.nextFloat();
        System.out.println("Ingrese la calificación de la Unidad 3:");
        u3=leer.nextFloat();
        if(u1<0 || u2<0 || u3<0 || u1>10 || u2>10 || u3>10){
            System.out.println("Alguno de los datos ingresados no es válido.");
        }else{
            if(u1>=6 && u2>=6 && u3>=6){
                System.out.println("Has aprobado con un promedio de: "+(u1+u2+u3)/3);
            }else{
                System.out.println("Calificación reprobatoria. No logrado.");
            }
        }
        
    }
    public static void main(String [] args){
        ejecutar();
    }
}
