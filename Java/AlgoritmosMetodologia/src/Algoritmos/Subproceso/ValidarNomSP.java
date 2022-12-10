
package Algoritmos.Subproceso;

import java.util.Scanner;

public class ValidarNomSP {
    public static void ejecutar() {
        Scanner sc=new Scanner(System.in);
        System.out.println("***************************************************");
        System.out.println("* Algoritmo: Valida nombre con subproceso         *");
        System.out.println("* Autor: Geovanni                                 *");
        System.out.println("***************************************************");
        System.out.println("");
        System.out.println("Ingresa el nombre a validar:");
        String nombre=sc.nextLine();
        if(valida_nombre(nombre)){
            System.out.println("El nombre es correcto.");
        }else{
            System.out.println("El nombre es incorrecto.");
        }
    }
    static boolean valida_nombre(String nombre){
        int blk=0;
        if((nombre.length()>=3 && nombre.length()<=50)){
            for(int i=1;i<=nombre.length();i++){
                if(nombre.substring(i-1, i).matches("[0-9]") || nombre.substring(i-1, i).matches("[!/@#$%&*()_.,¿°¬:;+=|<>?{}\\[\\]~-]")){
                    return false;
                }else{
                    if(nombre.substring(i-1, i).equalsIgnoreCase(" ")){
                        blk++;
                    }
                }
            }
            if(blk>0){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        ejecutar();
    }
}
