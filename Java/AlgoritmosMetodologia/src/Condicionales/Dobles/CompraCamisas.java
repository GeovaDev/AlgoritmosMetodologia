
package Condicionales.Dobles;

import java.util.Scanner;

public class CompraCamisas {
    public static void ejecutar(){
        int n, descuento=10;
        boolean desc;
        float precio;
        Scanner leer=new Scanner(System.in);
        System.out.println("**************************************************");
        System.out.println("*           Algoritmo Compra de camisas          *");
        System.out.println("*  El algoritmo calcula el precio total a pagar  *");
        System.out.println("*         en base a la compra de camisas.        *");
        System.out.println("*     Menos de 3 camisas el 10% de descuento     *");
        System.out.println("*       3 o más camisas, 20% de descuento.       *");
        System.out.println("*                 Autor: Geovanni                *");
        System.out.println("**************************************************");
        System.out.println("");
        System.out.println("Ingrese el número de camisas a comprar:");
        n=leer.nextInt();
        System.out.println("Ingrese el precio de las camisas: ");
        precio=leer.nextFloat();
        if(n<=0 || precio<=0){
            System.out.println("Se ingreso un dato inválido en la entrada.");
        }else{
            desc = n>=3;
            if(desc){
                descuento=20;
            }
            System.out.println("Por la compra de "+n+" camisas se aplica un descuento del "+descuento+"%");
            System.out.println("Descuento por compra: $"+((precio*n)*descuento)/100);
            System.out.println("El total a pagar es de: $"+(precio*n-((precio*n)*descuento)/100));
        }
    }
    public static void main(String [] args){
        ejecutar();
    }
}
