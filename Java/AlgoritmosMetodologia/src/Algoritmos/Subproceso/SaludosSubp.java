
package Algoritmos.Subproceso;

import java.util.Scanner;

public class SaludosSubp {
    public static void ejecutar() {
        String nombre;
        int saludos;
        Scanner sc=new Scanner(System.in);
        System.out.println("***************************************************");
        System.out.println("* Algoritmo: Saludos con subproceso               *");
        System.out.println("* Autor: Geovanni                                 *");
        System.out.println("***************************************************");
        System.out.println("");
        System.out.println("Ingrese el nombre:");
        nombre=sc.nextLine();
        System.out.println("Ingrese la cantidad de saludos:");
        saludos=sc.nextInt();
        greeting(nombre,saludos);
    }
    static void greeting(String nombre, int saludos){
        if(saludos>0 && saludos<=100 && nombre.length()>=3 && nombre.length()<=50){
            for(int i=1;i<=saludos;i++){
                System.out.println("Hola "+nombre+" bonito día :D");
            }
        }else{
            System.out.println("Datos inválidos.");
        }
    }
    public static void main(String[] args) {
        ejecutar();
    }
}
