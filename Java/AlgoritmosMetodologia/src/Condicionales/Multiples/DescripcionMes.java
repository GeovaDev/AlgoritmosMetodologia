
package Condicionales.Multiples;

import java.util.Scanner;

public class DescripcionMes {
    public static void ejecutar(){
        int mes;
        Scanner sc=new Scanner(System.in);
        System.out.println("************************************************");
        System.out.println("*          Algoritmo Día de la semana          *");
        System.out.println("*                Autor: Geovanni               *");
        System.out.println("************************************************");
        System.out.println("");
        System.out.println("Ingresa el número del mes que deseas saber:");
        mes=sc.nextInt();
        switch(mes){
            case 1:
                System.out.println("Enero es el primer mes del año en el calendario gregoriano y tiene 31 días.");
                break;
            case 2:
                System.out.println("Febrero es el segundo mes del año en el calendario gregoriano. Tiene 28 días y\n" +
"29 en los años bisiestos.");
                break;
            case 3:
                System.out.println("Marzo es el tercer mes del año en el calendario gregoriano y tiene 31 días.");
                break;
            case 4:
                System.out.println("Abril es el cuarto mes del año y es uno de los cuatro meses que tienen 30 días.");
                break;
            case 5:
                System.out.println("Mayo es el quinto mes del año en el calendario gregoriano y tiene 31 días.");
                break;
            case 6:
                System.out.println("Junio es el sexto mes del año en el Calendario Gregoriano y tiene 30 días.");
                break;
            case 7:
                System.out.println("Julio es el séptimo mes del año en el calendario gregoriano y tiene 31 días.");
                break;
            case 8:
                System.out.println("Agosto es el octavo mes del año en el calendario gregoriano y tiene 31 días");
                break;
            case 9:
                System.out.println("Septiembre es el noveno mes del año en el calendario gregoriano y tiene 30\n" +
"días.");
                break;
            case 10:
                System.out.println("Octubre es el décimo mes del año en el calendario gregoriano y tiene 31 días.");
                break;
            case 11:
                System.out.println("Noviembre es el undécimo y penúltimo mes del año en el calendario gregoriano\n" +
"y tiene 30 días");
                break;
            case 12:
                System.out.println("Diciembre es el duodécimo y último mes del año en el calendario gregoriano y\n" +
"tiene 31 días.");
                break;
            default:
                System.out.println("Dato inválido.");
        }
    }
    public static void main(String [] args){
        ejecutar();
    }
}
