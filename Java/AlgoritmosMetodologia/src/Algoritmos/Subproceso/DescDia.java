
package Algoritmos.Subproceso;

import java.util.Scanner;

public class DescDia {
    public static void ejecutar() {
        Scanner sc=new Scanner(System.in);
        int dia;
        System.out.println("***************************************************");
        System.out.println("* Algoritmo: Imprime la descripción de un día     *");
        System.out.println("* Autor: Geovanni                                 *");
        System.out.println("***************************************************");
        System.out.println("");
        System.out.println("Ingresa el número de día para ver su descripción:");
        dia=sc.nextInt();
        System.out.println(descripcionDia(dia));
    }
    static String descripcionDia(int dia){
        String desc;
        switch(dia){
            case 1:
                desc=("DOMINGO DIA FELIZ Y DEL SOL");
                break;
            case 2:
                desc=("LUNES DIA DE LA LUNA");
                break;
            case 3:
                desc=("MARTES DIA DE MARTE");
                break;
            case 4:
                desc=("MIERCOLES DIA DE MERCURIO");
                break;
            case 5:
                desc=("JUEVES DIA DE JUPITER");
                break;
            case 6:
                desc=("VIERNES DIA DE VENUS");
                break;
            case 7:
                desc=("SABADO DIA DE SATURNO");
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
