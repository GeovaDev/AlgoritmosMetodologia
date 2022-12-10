
package Condicionales.Dobles;

import java.util.Scanner;

public class IniciaMayusMin {
    public static void ejecutar(){
        String word;
        Scanner leer=new Scanner(System.in);
        System.out.println("**************************************************");
        System.out.println("*   Algoritmo Nombre en Mayusculas o Minusculas  *");
        System.out.println("*    Indica si un nombre inicia con minúscula.   *");
        System.out.println("*                 Autor: Geovanni                *");
        System.out.println("**************************************************");
        System.out.println("");
        System.out.println("Ingrese el nombre o palabra: ");
        word=leer.nextLine();
        if(word.isEmpty() || word.length()>30 || word.length()<3){
            System.out.println("El valor ingresado no es válido.");
        }else{
            if(word.substring(0, 1).equals(word.substring(0, 1).toUpperCase())){
                System.out.println("El nombre o palabra '"+word+"' inicia con mayúsculas.");
            }else{
                System.out.println("El nombre o palabra '"+word+"' inicia con minúsculas.");
            }
        }
    }
    public static void main(String [] args){
        ejecutar();
    }
}
