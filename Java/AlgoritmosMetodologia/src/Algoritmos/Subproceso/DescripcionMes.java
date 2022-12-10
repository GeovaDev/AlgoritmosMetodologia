
package Algoritmos.Subproceso;

import java.util.Scanner;

public class DescripcionMes {
    public static void ejecutar() {
        Scanner sc=new Scanner(System.in);
        int mes;
        System.out.println("***************************************************");
        System.out.println("* Algoritmo: Imprime la descripción de un mes     *");
        System.out.println("* Autor: Geovanni                                 *");
        System.out.println("***************************************************");
        System.out.println("");
        System.out.println("Ingresa el número del mes del cuál deseas saber su descripción:");
        mes=sc.nextInt();
        System.out.println(descripcionMes(mes));
    }
    static String descripcionMes(int mes){
        String desc;
        switch(mes){
            case 1:
                desc=("Enero es el primer mes del año en el calendario gregoriano y tiene 31 días.");
                break;
            case 2:
                desc=("Febrero es el segundo mes del año en el calendario gregoriano. Tiene 28 días y\n" +
"29 en los años bisiestos.");
                break;
            case 3:
                desc=("Marzo es el tercer mes del año en el calendario gregoriano y tiene 31 días.");
                break;
            case 4:
                desc=("Abril es el cuarto mes del año y es uno de los cuatro meses que tienen 30 días.");
                break;
            case 5:
                desc=("Mayo es el quinto mes del año en el calendario gregoriano y tiene 31 días.");
                break;
            case 6:
                desc=("Junio es el sexto mes del año en el Calendario Gregoriano y tiene 30 días.");
                break;
            case 7:
                desc=("Julio es el séptimo mes del año en el calendario gregoriano y tiene 31 días.");
                break;
            case 8:
                desc=("Agosto es el octavo mes del año en el calendario gregoriano y tiene 31 días");
                break;
            case 9:
                desc=("Septiembre es el noveno mes del año en el calendario gregoriano y tiene 30\n" +
"días.");
                break;
            case 10:
                desc=("Octubre es el décimo mes del año en el calendario gregoriano y tiene 31 días.");
                break;
            case 11:
                desc=("Noviembre es el undécimo y penúltimo mes del año en el calendario gregoriano\n" +
"y tiene 30 días");
                break;
            case 12:
                desc=("Diciembre es el duodécimo y último mes del año en el calendario gregoriano y\n" +
"tiene 31 días.");
                break;
            default:
                desc="Dato inválido.";
        }
        return desc;
    }
    public static void main(String[] args) {
        ejecutar();
    }
}
