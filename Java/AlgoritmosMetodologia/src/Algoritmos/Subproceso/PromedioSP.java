
package Algoritmos.Subproceso;

import java.util.Scanner;

public class PromedioSP {
    public static void ejecutar() {
        double cal[]=new double[4];
        Scanner sc=new Scanner(System.in);
        System.out.println("***************************************************");
        System.out.println("* Algoritmo: Calcular promedio con subproceso     *");
        System.out.println("* Autor: Geovanni                                 *");
        System.out.println("***************************************************");
        System.out.println("");
        for(int i=1;i<=3;i++){
            System.out.println("Ingresa la calificación de la Unidad "+i);
            cal[i]=sc.nextInt();
        }
        if(promedio(cal[1],cal[2],cal[3])<8){
            System.out.println("No has aprobado, tu promedio es de: "+promedio(cal[1],cal[2],cal[3]));
        }else{
            System.out.println("Has aprobado, tu promedio es de: "+promedio(cal[1],cal[2],cal[3]));
        }
    }
    static double promedio(double cal1, double cal2, double cal3){
        return (cal1+cal2+cal3)/3;
    }
    public static void main(String[] args) {
        ejecutar();
    }
}
