
package Ciclo.Para;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CuentaLetras {
    public static void ejecutar() {
        String name;
        Scanner sc=new Scanner(System.in);
        System.out.println("***************************************************");
        System.out.println("* Algoritmo: Cuenta letras                        *'");
        System.out.println("* Autor: Geovanni                                 *");
        System.out.println("***************************************************");
        System.out.println("");
        System.out.println("Ingrese un nombre:");
        name=sc.nextLine();
        if(name.isEmpty()){
            System.out.println("El nombre no puede estar vacío.");
        }else{
            int v=0, esp=0, blk=0, con=0;
            Pattern especiales = Pattern.compile ("[!/@#$%&*()_.,¿°¬:;+=|<>?{}\\[\\]~-]");
            Matcher tieneEspecial= especiales.matcher(name);
            for(int i=1;i<=name.length();i++){
                if(name.substring(i-1, i).equalsIgnoreCase("a") || name.substring(i-1, i).equalsIgnoreCase("e") || name.substring(i-1, i).equalsIgnoreCase("i") || name.substring(i-1, i).equalsIgnoreCase("o") || name.substring(i-1, i).equalsIgnoreCase("u")){
                    v++;
                }else{
                    if(tieneEspecial.find()){
                        esp++;
                    }else{
                        if(name.substring(i-1, i).equalsIgnoreCase(" ")){
                            blk++;
                        }else{
                            con++;
                        }
                    }
                }
            }
            
            System.out.println(name+" tiene "+v+" vocales.");
            System.out.println(name+" tiene "+esp+" carácteres especiales.");
            System.out.println(name+" tiene "+blk+" espacios en blanco.");
            System.out.println(name+" tiene "+con+" consonantes.");
        }
    }
    
    public static void main(String[] args) {
        ejecutar();
    }
}
