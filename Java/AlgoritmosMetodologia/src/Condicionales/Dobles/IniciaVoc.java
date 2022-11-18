
package Condicionales.Dobles;

import java.util.Scanner;

public class IniciaVoc {
    public static void ejecutar(){
        String word, vocales="aeiou";
        boolean esVocal=false;
        Scanner leer=new Scanner(System.in);
        System.out.println("**************************************************");
        System.out.println("*     Algoritmo inicia con vocal o consonante    *");
        System.out.println("*   El algoritmo despliega si inicia con vocal   *");
        System.out.println("*                   o consonante                 *");
        System.out.println("*                 Autor: Geovanni                *");
        System.out.println("**************************************************");
        System.out.println("");
        System.out.println("Ingrese nombre:");
        word=leer.nextLine();
        if(word.length()<3 && word.length()>30){
            System.out.println("La longitud de la palabra "+word+" excede el límite permitido.");
        }else{
            for(int i=1; i<=vocales.length();i++){
                if(word.substring(0, 1).equalsIgnoreCase(vocales.substring(i-1, i))){
                    esVocal=true;
                }
            }
            if(esVocal){
                System.out.println("La palabra "+word+" inicia con la vocal "+word.substring(0, 1));
            }else{
                System.out.println("La palabra "+word+" inicia con la consonante "+word.substring(0, 1));
            }
        }
    }
    public static void main(String [] args){
        ejecutar();
    }
}
