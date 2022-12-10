
package Ciclo.Para;

import java.util.Scanner;

public class FigurasGeo {
    public static void ejecutar() {
        int opc, x, y;
        Scanner sc=new Scanner(System.in);
        System.out.println("***************************************************");
        System.out.println("* Algoritmo: Dibujar figuras geométricas          *'");
        System.out.println("* Autor: Geovanni                                 *");
        System.out.println("***************************************************");
        System.out.println("");
        System.out.println("Elija la figura que desea dibujar:");
        System.out.println("1.- Cuadrado");
        System.out.println("2.- Rectángulo");
        System.out.println("3.- Triángulo");
        opc=sc.nextInt();
        switch(opc){
            case 1:
                System.out.println("Ingrese la medida de un lado del cuadrado:");
                x=sc.nextInt();
                for(int i=1;i<=(x*x);i++){
                    if(i%x==0){
                        System.out.printf("* ");
                        System.out.println("");
                    }else{
                        System.out.printf("* ");
                    }
                }
                break;
            case 2:
                System.out.println("Introduzca el largo del rectángulo:");
                x=sc.nextInt();
                System.out.println("Introduzca el ancho del rectángulo:");
                y=sc.nextInt();
                for(int i=1;i<=(x*y);i++){
                    if(i%x==0){
                        System.out.printf("* ");
                        System.out.println("");
                    }else{
                        System.out.printf("* ");
                    }
                }
                break;
            case 3:
                System.out.println("Introduzca la cantidad de filas del triángulo:");
                x=sc.nextInt();
                int cont=x;
                for(int i=1;i<=x;i++){
                    for(int c=1;c<=cont;c++){
                        if(c%cont==0){
                            System.out.printf("* ");
                            System.out.println("");
                            cont--;
                        }else{
                            System.out.printf("* ");
                        }
                    }
                }
                break;
            default:
                System.out.println("La opción no existe.");
        }
    }
    
    public static void main(String[] args) {
        ejecutar();
    }
}
