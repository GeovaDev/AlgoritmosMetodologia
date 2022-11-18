
package Main;

import Condicionales.Dobles.AprobacionRep;
import Condicionales.Dobles.CompraCamisas;
import Condicionales.Simples.CompraCasa;
import Condicionales.Dobles.DescArti;
import Condicionales.Simples.EcuaCuadratica;
import Condicionales.Dobles.IniciaMayusMin;
import Condicionales.Dobles.IniciaVoc;
import Condicionales.Simples.PagoColegiatura;
import Condicionales.Dobles.PrecioProd;
import Condicionales.Dobles.Refacciones;
import Condicionales.Dobles.SalarioSem;
import Condicionales.Multiples.DescripcionDia;
import Condicionales.Multiples.DescripcionMes;
import Condicionales.Multiples.HospitalCrisis;
import Condicionales.Multiples.NumRomanos;
import Condicionales.Multiples.SueldoTrab;
import Condicionales.Simples.SuperMarket;
import Condicionales.Simples.ValAbsoluto;
import Condicionales.Simples.VentaLlantas;
import SinCondicional.IMC;
import SinCondicional.PresupuestoHospital;
import SinCondicional.FCM;
import SinCondicional.IncrementoSalarial;
import SinCondicional.ValorAbsoluto;
import SinCondicional.DoblarNum;
import SinCondicional.CambioDivisa;
import SinCondicional.GananciaArt;
import SinCondicional.CalcHipo;
import SinCondicional.EcuacionCuad;
import java.util.Scanner;

public class Main {
    
    static Scanner sc=new Scanner(System.in);
    static void ejecutarAlgoritmos(){
        int algoritmo=0;
        System.out.println("Hola, ¿qué tipo de algoritmo quieres ejecutar?");
        System.out.println("1.- Algoritmos sin condicionales");
        System.out.println("2.- Algoritmos con condicionales");
        algoritmo=sc.nextInt();
        switch(algoritmo){
            case 1:
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
                        CambioDivisa.ejecutar();
                        tryAgain();
                        break;
                    case 2:
                        ValorAbsoluto.ejecutar();
                        tryAgain();
                        break;
                    case 3:
                        FCM.ejecutar();
                        tryAgain();
                        break;
                    case 4:
                        IncrementoSalarial.ejecutar();
                        tryAgain();
                        break;
                    case 5:
                        DoblarNum.ejecutar();
                        tryAgain();
                        break;
                    case 6:
                        EcuacionCuad.ejecutar();
                        tryAgain();
                        break;
                    case 7:
                        PresupuestoHospital.ejecutar();
                        tryAgain();
                        break;
                    case 8:
                        GananciaArt.ejecutar();
                        tryAgain();
                        break;
                    case 9:
                        CalcHipo.ejecutar();
                        tryAgain();
                        break;
                    case 10:
                        IMC.ejecutar();
                        tryAgain();
                        break;
                    default:
                        intentarSwitch();
                }
                break;
            case 2:
                System.out.println("Hola, ¿qué tipo de algoritmo quieres ejecutar?");
                System.out.println("1.- Condicionales simples");
                System.out.println("2.- Condicionales dobles");
                System.out.println("3.- Condicionales multiples");
                algoritmo=sc.nextInt();
                switch(algoritmo){
                    case 1:
                        System.out.println("Hola, ¿qué algoritmo quieres ejecutar?");
                        System.out.println("1.- Valor absoluto");
                        System.out.println("2.- Venta de llantas");
                        System.out.println("3.- SuperMarket");
                        System.out.println("4.- Ecuación Cuadrática");
                        System.out.println("5.- Pago de colegiatura");
                        System.out.println("6.- Compra de casa");
                        algoritmo=sc.nextInt();
                        switch(algoritmo){
                            case 1:
                                ValAbsoluto.ejecutar();
                                tryAgain();
                                break;
                            case 2:
                                VentaLlantas.ejecutar();
                                tryAgain();
                                break;
                            case 3:
                                SuperMarket.ejecutar();
                                tryAgain();
                                break;
                            case 4:
                                EcuaCuadratica.ejecutar();
                                tryAgain();
                                break;
                            case 5:
                                PagoColegiatura.ejecutar();
                                tryAgain();
                                break;
                            case 6:
                                CompraCasa.ejecutar();
                                tryAgain();
                                break;
                            default:
                                intentarSwitch();
                        }
                        break;
                    case 2:
                        System.out.println("Hola, ¿qué algoritmo quieres ejecutar?");
                        System.out.println("1.- Aprobación o reprobación de curso");
                        System.out.println("2.- Precio de producto almacén");
                        System.out.println("3.- Salario semanal");
                        System.out.println("4.- Inicia con vocal o consonante");
                        System.out.println("5.- Descuento por clave en artículo");
                        System.out.println("6.- Compra de camisas");
                        System.out.println("7.- Refacciones");
                        System.out.println("8.- Nombre inicia con mayúscula o minúscula");
                        algoritmo=sc.nextInt();
                        switch(algoritmo){
                            case 1:
                                AprobacionRep.ejecutar();
                                tryAgain();
                                break;
                            case 2:
                                PrecioProd.ejecutar();
                                tryAgain();
                                break;
                            case 3:
                                SalarioSem.ejecutar();
                                tryAgain();
                                break;
                            case 4:
                                IniciaVoc.ejecutar();
                                tryAgain();
                                break;
                            case 5:
                                DescArti.ejecutar();
                                tryAgain();
                                break;
                            case 6:
                                CompraCamisas.ejecutar();
                                tryAgain();
                                break;
                            case 7:
                                Refacciones.ejecutar();
                                tryAgain();
                                break;
                            case 8:
                                IniciaMayusMin.ejecutar();
                                tryAgain();
                                break;
                            default:
                                intentarSwitch();
                        }
                        break;
                    case 3:
                        System.out.println("Hola, ¿qué algoritmo quieres ejecutar?");
                        System.out.println("1.- Sueldo de trabajador");
                        System.out.println("2.- Hospital en crisis");
                        System.out.println("3.- Descripción día de la semana");
                        System.out.println("4.- Descripción del mes del año");
                        System.out.println("5.- Números romanos");
                        algoritmo=sc.nextInt();
                        switch(algoritmo){
                            case 1:
                                SueldoTrab.ejecutar();
                                tryAgain();
                                break;
                            case 2:
                                HospitalCrisis.ejecutar();
                                tryAgain();
                                break;
                            case 3:
                                DescripcionDia.ejecutar();
                                tryAgain();
                                break;
                            case 4:
                                DescripcionMes.ejecutar();
                                tryAgain();
                                break;
                            case 5:
                                NumRomanos.ejecutar();
                                tryAgain();
                                break;
                            default:
                                intentarSwitch();
                        }
                        break;
                    default:
                        intentarSwitch();
                }
                break;
            default:
                intentarSwitch();
        }
    }
    public static void main(String[] args){
        ejecutarAlgoritmos();
    }
    public static void intentarSwitch(){
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
