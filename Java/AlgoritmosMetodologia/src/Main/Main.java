
package Main;

import java.util.Scanner;

public class Main {
    
    static Scanner sc=new Scanner(System.in);
    static void ejecutarAlgoritmos(){
        int algoritmo=0;
        System.out.println("Hola, ¿qué algoritmo quieres ejecutar?");
        System.out.println("1.- Cambio de divisa");
        System.out.println("2.- Valor absoluto");
        System.out.println("3.- Frecuencia cardiaca maxima");
        System.out.println("4.- Incremento salarial");
        System.out.println("5.- Doblar número y multiplicar por 25");
        System.out.println("6.- Raíces de ecuación cuadrática");
        System.out.println("7.- Presupuesto de hospital");
        System.out.println("8.- Ganancia de artículo");
        System.out.println("9.- Cálculo de hipotenusa");
        System.out.println("10.- Índice de masa corporal");
        algoritmo=sc.nextInt();
        switch(algoritmo){
            case 1:
                CambioDivisa.main();
                tryAgain();
                break;
            case 2:
                ValorAbsoluto.main();
                tryAgain();
                break;
            case 3:
                FCM.main();
                tryAgain();
                break;
            case 4:
                IncrementoSalarial.main();
                tryAgain();
                break;
            case 5:
                DoblarNum.main();
                tryAgain();
                break;
            case 6:
                EcuacionCuad.main();
                tryAgain();
                break;
            case 7:
                PresupuestoHospital.main();
                tryAgain();
                break;
            case 8:
                GananciaArt.main();
                tryAgain();
                break;
            case 9:
                CalcHipo.main();
                tryAgain();
                break;
            case 10:
                IMC.main();
                tryAgain();
                break;
            default:
                int opc=0;
                while(opc==0){
                    System.out.println("Valor no admitido. ¿desea intentar nuevamente?");
                    System.out.println("1.- Sí");
                    System.out.println("2.- No");
                    opc=sc.nextInt();
                    switch(opc){
                        case 1:
                            ejecutarAlgoritmos();
                            break;
                        case 2:
                            System.out.println("¡Hasta luego!");
                            System.exit(0);
                            break;
                        default:
                            opc=0;
                    }
                }
        }
    }
    public static void main(String[] args){
        ejecutarAlgoritmos();
    }
    public static void tryAgain(){
        int resp=0;
        System.out.println("¿Desea ejecutar otro algoritmo?");
        System.out.println("1.- Sí");
        System.out.println("2.- No");
        resp=sc.nextInt();
        switch (resp){
            case 1:
                ejecutarAlgoritmos();
                break;
            case 2:
                System.out.println("¡Hasta luego!");
                System.exit(0);
        }
    }
}
