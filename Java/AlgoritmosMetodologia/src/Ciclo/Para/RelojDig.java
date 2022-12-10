
package Ciclo.Para;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RelojDig {
    public static void ejecutar() throws InterruptedException {
        Scanner sc=new Scanner(System.in);
        System.out.println("***************************************************");
        System.out.println("* Algoritmo: Reloj Digital                        *'");
        System.out.println("* Autor: Geovanni                                 *");
        System.out.println("***************************************************");
        System.out.println("");
        System.out.println("Ingrese un dato de hora (ej. 12:04:06):");
        String hora=sc.next();
        ejecutarReloj(hora);
    }
    static void ejecutarReloj(String hora) throws InterruptedException{
        Pattern especiales = Pattern.compile ("[a-z A-Z]");
        Matcher tieneLetras= especiales.matcher(hora);
        if(hora.isEmpty() || tieneLetras.find() || hora.length()!=8){
            System.out.println("El dato ingresado está vacío o no tiene el formato correcto.");
        }else{
            int hr=Integer.parseInt(hora.substring(0, 2)),min=Integer.parseInt(hora.substring(3, 5)),segu=Integer.parseInt(hora.substring(6, 8));
            if(hr>=24 || min>=60 || segu>=60){
                System.out.println("Los valores ingresados no son correctos.");
            }else{
                for(int seg=Integer.parseInt(hora.substring(6, 8));hr<=24;seg++){
                    Thread.sleep(1*1000);
                    segu++;
                    if(hr>23){
                        hr=0;
                        min=0;
                        segu=0;
                    }else{
                        if(min==60){
                            min=0;
                            hr++;
                        }else{
                            if(segu==60){
                                segu=0;
                                min++;
                                if(min==60){
                                    min=0;
                                    hr++;
                                    if(hr==24){
                                        hr=0;
                                        min=0;
                                        segu=0;
                                    }
                                }
                            }
                        }
                    }
                    if(hr<10){
                        if(min<10){
                            if(segu<10){
                                System.out.println("0"+hr+":0"+min+":0"+segu);
                            }else{
                                System.out.println("0"+hr+":0"+min+":"+segu);
                            }
                        }else{
                            if(segu<10){
                                System.out.println("0"+hr+":"+min+":0"+segu);
                            }else{
                                System.out.println("0"+hr+":"+min+":"+segu);
                            }
                        }
                    }else{
                        if(min<10){
                            if(segu<10){
                                System.out.println(hr+":0"+min+":0"+segu);
                            }else{
                                System.out.println(hr+":0"+min+":"+segu);
                            }
                        }else{
                            if(segu<10){
                                System.out.println(hr+":"+min+":0"+segu);
                            }else{
                                System.out.println(hr+":"+min+":"+segu);
                            }
                        }
                    }

                }
            }
        }
    }
    
    public static void main(String[] args) throws InterruptedException {
        ejecutar();
    }
}
