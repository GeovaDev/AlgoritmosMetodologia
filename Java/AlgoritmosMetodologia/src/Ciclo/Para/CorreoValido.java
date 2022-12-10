
package Ciclo.Para;

import java.util.Scanner;

public class CorreoValido {
    public static void ejecutar() {
        Scanner sc=new Scanner(System.in);
        System.out.println("***************************************************");
        System.out.println("* Algoritmo: Correo electrónico válido            *'");
        System.out.println("* Autor: Geovanni                                 *");
        System.out.println("***************************************************");
        System.out.println("");
        System.out.println("Ingresa el correo electrónico:");
        String correo=sc.next();
        boolean esValido=false;
        for(int i=1;i<=correo.length();i++){
            if(correo.substring(i-1, i).equalsIgnoreCase("@")){
                esValido=true;
            }
        }
        if(esValido){
            System.out.println(correo+" es un correo electrónico válido.");
        }else{
            System.out.println(correo+" no es un correo electrónico válido.");
        }
    }
    public static void main(String[] args) {
        ejecutar();
    }
}
