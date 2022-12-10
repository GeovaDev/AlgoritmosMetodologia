
package Ciclo.Para;

import java.util.Scanner;

public class DatoNum {
    public static void ejecutar() {
        Scanner sc=new Scanner(System.in);
        System.out.println("***************************************************");
        System.out.println("* Algoritmo: Dato numérico                        *'");
        System.out.println("* Autor: Geovanni                                 *");
        System.out.println("***************************************************");
        System.out.println("");
        System.out.println("Ingresa el dato a validar:");
        String dato=sc.nextLine();
        validarDato(dato);
    }
    static void validarDato(String dato){
        int letra=0,numero=0;
        if(dato.isEmpty()){
            System.out.println("El dato no puede estar vacío.");
        }else{
            for(int i=1;i<=dato.length();i++){
                if(dato.substring(i-1, i).matches("[0-9]")){
                    numero++;
                }else{
                    letra++;
                }
            }
            if(letra>0 && numero>0){
                System.out.println("Incorrecto");
            }else{
                if(numero>0 && letra==0){
                    System.out.println("Correcto");
                }
            }
        }
    }
    public static void main(String[] args) {
        ejecutar();
    }
}
