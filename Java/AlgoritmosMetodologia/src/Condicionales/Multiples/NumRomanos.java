
package Condicionales.Multiples;

import java.util.Scanner;

public class NumRomanos {
    public static void ejecutar(){
        int pdecimal=0, punidad=0;
        String basicos[]=new String[9];
        String cadadiez[]=new String[9];
        int n;
        Scanner sc=new Scanner(System.in);
        basicos[0]="I";basicos[1]="II";basicos[2]="III";basicos[3]="IV";basicos[4]="V";basicos[5]="VI";basicos[6]="VII";basicos[7]="VIII";basicos[8]="IX";
        cadadiez[0]="X";cadadiez[1]="XX";cadadiez[2]="XXX";cadadiez[3]="XL";cadadiez[4]="L";cadadiez[5]="LX";cadadiez[6]="LXX";cadadiez[7]="LXXX";cadadiez[8]="XC";
        System.out.println("Ingresa un número del 1 al 100");
        n=sc.nextInt();
        if(n<=0 || n>100){
            System.out.println("Solo conozco números del 1 al 100.");
        }else{
            switch(n){
                case 100:
                    System.out.println("El número romano es: C");
                    break;
                default:
                    if(n<=9){
                        System.out.println("El número romano es: "+(basicos[n-1]));
                    }else{
                        pdecimal=Integer.parseInt(String.valueOf(n).substring(0, 1));
                        punidad=Integer.parseInt(String.valueOf(n).substring(1, 2));
                        switch(punidad){
                            case 0:
                                System.out.println("El número romano es: "+(cadadiez[pdecimal-1]));
                                break;
                            default:
                                System.out.println("El número romano es: "+(cadadiez[pdecimal-1]+basicos[punidad-1]));
                        }
                        
                    }
            }
        }
    }
    public static void main(String [] args){
        ejecutar();
    }
}
