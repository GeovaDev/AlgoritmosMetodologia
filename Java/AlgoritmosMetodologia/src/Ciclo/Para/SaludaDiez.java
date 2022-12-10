
package Ciclo.Para;

public class SaludaDiez {
    
    public static void ejecutar(){
        System.out.println("***************************************************");
        System.out.println("* Algoritmo: Saluda 10 veces con un 'Hola a todos *'");
        System.out.println("* Autor: Geovanni                                 *");
        System.out.println("***************************************************");
        System.out.println("");
        for(int i=1;i<=10;i++){
            System.out.println(i + " Hola a todos :)");
        }
    }
    
    public static void main(String[] args) {
        ejecutar();
    }
}
