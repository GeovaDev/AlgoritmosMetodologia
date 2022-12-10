
package Condicionales.Dobles;

import java.util.Scanner;

public class Refacciones {
    public static void ejecutar(){
        int n;
        double precio;
        Scanner leer=new Scanner(System.in);
        System.out.println("**************************************************");
        System.out.println("*            Algoritmo de refacciones            *");
        System.out.println("*  El algoritmo calculará el total de inversión  *");
        System.out.println("*      prestamo o crédito que una empresa de     *");
        System.out.println("*          refacciones debe solicitar.           *");
        System.out.println("*                 Autor: Geovanni                *");
        System.out.println("**************************************************");
        System.out.println("");
        System.out.println("Ingrese el costo de la pieza: ");
        precio=leer.nextDouble();
        System.out.println("Ingrese la cantidad de piezas a comprar: ");
        n=leer.nextInt();
        if(precio<=0 || n<=0){
            System.out.println("Datos de entrada inválido.");
        }else{
            double total=precio*n, inversion, prestamo=0, credito;
            if(total>500000){
                inversion=total*0.55;
                prestamo=total*0.3;
                credito=total*0.15;
            }else{
                inversion=total*0.7;
                credito=total*0.3;
            }
            System.out.println("Total de la compra: $"+total);
            System.out.println("Cantidad invertida: $"+inversion);
            System.out.println("Préstamo: $"+prestamo);
            System.out.println("Crédito: $"+credito);
            System.out.println("Interés: $"+(credito*0.2));
        }
    }
    public static void main(String [] args){
        ejecutar();
    }
}
