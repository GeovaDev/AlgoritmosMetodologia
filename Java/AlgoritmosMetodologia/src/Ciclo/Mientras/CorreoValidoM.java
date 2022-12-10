
package Ciclo.Mientras;

import java.util.Scanner;

public class CorreoValidoM {
    public static void ejecutar() {
        String correo;
        Scanner sc=new Scanner(System.in);
        System.out.println("***************************************************");
        System.out.println("* Algoritmo: Correo electrónico válido.           *'");
        System.out.println("* Autor: Geovanni                                 *");
        System.out.println("***************************************************");
        System.out.println("");
        System.out.println("Ingrese el correo electrónico:");
        correo=sc.next();
        if(correo.isEmpty()){
            System.out.println("El valor no puede estar vacío.");
        }else{
            int x=0, c=1;
            while(c<=correo.length()){
                if((correo.substring(c-1, c).matches("[0-9]") || correo.substring(c-1, c).matches("[.]") || correo.toLowerCase().substring(c-1, c).matches("[a-z]")) && correo.endsWith(".com")){
                    x++;
                }
                c++;
            }
            if((x+1)==correo.length()){
                System.out.println("El correo electrónico es valido");
            }else{
                System.out.println("El correo electrónico no es valido");
            }
        }
    }
    public static void main(String[] args) {
        ejecutar();
    }
}
