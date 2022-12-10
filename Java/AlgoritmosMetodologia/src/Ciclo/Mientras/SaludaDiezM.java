
package Ciclo.Mientras;

public class SaludaDiezM {
    public static void ejecutar() {
        System.out.println("***************************************************");
        System.out.println("* Algoritmo: Saluda 10 veces con un 'Hola a todos *'");
        System.out.println("* Autor: Geovanni                                 *");
        System.out.println("***************************************************");
        System.out.println("");
        int c=0;
        while(c!=10){
            System.out.println((c+1)+".- ¡Hola a todos! :D");
            c++;
        }
    }
    public static void main(String[] args) {
        ejecutar();
    }
}
