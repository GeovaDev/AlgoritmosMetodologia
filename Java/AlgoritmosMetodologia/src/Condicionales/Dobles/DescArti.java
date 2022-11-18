
package Condicionales.Dobles;

import java.util.Scanner;

public class DescArti {
    public static void ejecutar(){
        String nombre;
        int clave;
        double precio, descuento;
        Scanner leer=new Scanner(System.in);
        System.out.println("**************************************************");
        System.out.println("*         Algoritmo Descuento de artículo        *");
        System.out.println("*  El algoritmo calcula el precio total en base  *");
        System.out.println("*             a la clave y el precio.            *");
        System.out.println("*                 Autor: Geovanni                *");
        System.out.println("**************************************************");
        System.out.println("");
        System.out.println("Ingrese el nombre del artículo:");
        nombre=leer.nextLine();
        System.out.println("Ingrese la clave del artículo:");
        clave=leer.nextInt();
        System.out.println("Ingrese el precio del artículo:");
        precio=leer.nextFloat();
        if(nombre.isEmpty() || nombre.length()<3 || nombre.length()>30 || clave>3 || clave<1 || precio<0){
            System.out.println("Se tiene un dato inválido en la entrada.");
        }else{
            if(clave==1){
                descuento=precio*0.9;
            }else{
                if(clave==2){
                    descuento=precio*0.8;
                }else{
                    descuento=precio*0.7;
                }
            }
            System.out.println("Nombre del artículo: "+nombre);
            System.out.println("Clave del artículo: "+clave);
            System.out.println("Precio original del artículo: $"+precio);
            System.out.println("Precio con descuento: $"+descuento);
        }
        
    }
    public static void main(String [] args){
        ejecutar();
    }
}
