
package Ciclo.Mientras;

public class CalifCadenaM {
    public static void ejecutar() {
        System.out.println("***************************************************");
        System.out.println("* Algoritmo: Saluda 10 veces con un 'Hola a todos *'");
        System.out.println("* Autor: Geovanni                                 *");
        System.out.println("***************************************************");
        System.out.println("");
        String text= "01=9.1|02=5.4|03=9.3|04=8.0|05=8.3|06=5.1|07=9.9|08=5.6|09=8.8|10=7.5";
        int c=0;
        while(c!=text.length()+1){
            System.out.println("La clave "+text.substring(c, c+2)+" tiene una calificación de "+text.substring(c+3, c+6));
            c+=7;
        }
    }
    public static void main(String[] args) {
        ejecutar();
    }
}
