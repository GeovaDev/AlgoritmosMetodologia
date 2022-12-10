
package Main;

import Algoritmos.Subproceso.DescDia;
import Algoritmos.Subproceso.MenuSP;
import Algoritmos.Subproceso.OpBasicasSP;
import Algoritmos.Subproceso.PromedioSP;
import Algoritmos.Subproceso.SaludosSubp;
import Algoritmos.Subproceso.ValidarNomSP;
import Ciclo.Mientras.BoletoLoteria;
import Ciclo.Mientras.CalifCadenaM;
import Ciclo.Mientras.CorreoValidoM;
import Ciclo.Mientras.CuentaRegresiva;
import Ciclo.Mientras.SaludaDiezM;
import Ciclo.Mientras.SembrarZanaM;
import Ciclo.Mientras.TodaviaNo;
import Ciclo.Para.ClaveValor;
import Ciclo.Para.CorreoValido;
import Ciclo.Para.CuentaLetras;
import Ciclo.Para.DatoNum;
import Ciclo.Para.FigurasGeo;
import Ciclo.Para.InvertirNomb;
import Ciclo.Para.RelojDig;
import Ciclo.Para.SaludaDiez;
import Ciclo.Para.SeriesNum;
import Ciclo.Para.SiembraZanahorias;
import Ciclo.Para.SimulaCalif;
import Ciclo.RepetirHastaQue.NombreVacio;
import Ciclo.RepetirHastaQue.ValidaVocal;
import Ciclo.RepetirHastaQue.ValidacionNomb;
import Ciclo.RepetirHastaQue.ValidacionRangos;
import Ciclo.RepetirHastaQue.ValidarRango;
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
import java.io.IOException;
import java.util.Scanner;

public class Main {
    
    static Scanner sc=new Scanner(System.in);
    
    static void ejecutarAlgoritmos() throws InterruptedException, IOException{
        int algoritmo=0;
        System.out.println("Hola, ¿qué tipo de algoritmo quieres ejecutar?");
        System.out.println("1.- Algoritmos sin condicionales");
        System.out.println("2.- Algoritmos con condicionales");
        System.out.println("3.- Algoritmos de ciclos");
        System.out.println("4.- Algoritmos de subproceso.");
        System.out.println("5.- Salir.");
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
            case 3:
                System.out.println("Hola, ¿qué tipo de algoritmo quieres ejecutar?");
                System.out.println("1.- Ciclo Para");
                System.out.println("2.- Ciclo Repetir hasta que");
                System.out.println("3.- Ciclo Mientras");
                algoritmo=sc.nextInt();
                switch(algoritmo){
                    case 1:
                        System.out.println("Hola, ¿qué algoritmo quieres ejecutar?");
                        System.out.println("1.- Saluda 10 veces");
                        System.out.println("2.- Siembra de zanahorias");
                        System.out.println("3.- Dibujar figuras");
                        System.out.println("4.- Trabajando con series.");
                        System.out.println("5.- Cuenta letras");
                        System.out.println("6.- Valida dato numérico.");
                        System.out.println("7.- Invierte el nombre");
                        System.out.println("8.- Reloj digital");
                        System.out.println("9.- Simulación de calificaciones");
                        System.out.println("10.- Clave y valor");
                        System.out.println("11.- Correo electrónico válido");
                        algoritmo=sc.nextInt();
                        switch(algoritmo){
                            case 1:
                                SaludaDiez.ejecutar();
                                tryAgain();
                                break;
                            case 2:
                                SiembraZanahorias.ejecutar();
                                tryAgain();
                                break;
                            case 3:
                                FigurasGeo.ejecutar();
                                tryAgain();
                                break;
                            case 4:
                                SeriesNum.ejecutar();
                                tryAgain();
                                break;
                            case 5:
                                CuentaLetras.ejecutar();
                                tryAgain();
                                break;
                            case 6:
                                DatoNum.ejecutar();
                                tryAgain();
                                break;
                            case 7:
                                InvertirNomb.ejecutar();
                                tryAgain();
                                break;
                            case 8:
                                RelojDig.ejecutar();
                                tryAgain();
                                break;
                            case 9:
                                SimulaCalif.ejecutar();
                                tryAgain();
                                break;
                            case 10:
                                ClaveValor.ejecutar();
                                tryAgain();
                                break;
                            case 11:
                                CorreoValido.ejecutar();
                                tryAgain();
                                break;
                            default:
                                intentarSwitch();
                        }
                        break;
                    case 2:
                        System.out.println("Hola, ¿qué algoritmo quieres ejecutar?");
                        System.out.println("1.- Validación de rango de número");
                        System.out.println("2.- Validación de nombre");
                        System.out.println("3.- Validación de rangos de número");
                        System.out.println("4.- Nombre vacío.");
                        System.out.println("5.- Validación de vocal");
                        algoritmo=sc.nextInt();
                        switch(algoritmo){
                            case 1:
                                ValidarRango.ejecutar();
                                tryAgain();
                                break;
                            case 2:
                                ValidacionNomb.ejecutar();
                                tryAgain();
                                break;
                            case 3:
                                ValidacionRangos.ejecutar();
                                tryAgain();
                                break;
                            case 4:
                                NombreVacio.ejecutar();
                                tryAgain();
                                break;
                            case 5:
                                ValidaVocal.ejecutar();
                                tryAgain();
                                break;
                            default:
                                intentarSwitch();
                        }
                        break;
                    case 3:
                        System.out.println("Hola, ¿qué algoritmo quieres ejecutar?");
                        System.out.println("1.- Saluda 10 veces");
                        System.out.println("2.- Calificaciones en cadena");
                        System.out.println("3.- Sembrando zanahorias con mientras");
                        System.out.println("4.- Cuentra regresiva");
                        System.out.println("5.- Boleto de lotería");
                        System.out.println("6.- Correo electrónico válido");
                        System.out.println("7.- Todavía no");
                        algoritmo=sc.nextInt();
                        switch(algoritmo){
                            case 1:
                                SaludaDiezM.ejecutar();
                                tryAgain();
                                break;
                            case 2:
                                CalifCadenaM.ejecutar();
                                tryAgain();
                                break;
                            case 3:
                                SembrarZanaM.ejecutar();
                                tryAgain();
                                break;
                            case 4:
                                CuentaRegresiva.ejecutar();
                                tryAgain();
                                break;
                            case 5:
                                BoletoLoteria.ejecutar();
                                tryAgain();
                                break;
                            case 6:
                                CorreoValidoM.ejecutar();
                                tryAgain();
                                break;
                            case 7:
                                TodaviaNo.ejecutar();
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
            case 4:
                System.out.println("Hola, ¿qué algoritmo quieres ejecutar?");
                System.out.println("1.- Saluda X veces con el nombre con subproceso");
                System.out.println("2.- Imprimir un menú con subproceso");
                System.out.println("3.- Validar un nombre con subproceso");
                System.out.println("4.- Operaciones básicas con subproceso");
                System.out.println("5.- Descripción del número de mes con subproceso");
                System.out.println("6.- Promedio de 3 calificaciones con subproceso");
                System.out.println("7.- Descripción del número de día con subproceso");
                algoritmo=sc.nextInt();
                switch(algoritmo){
                    case 1:
                        SaludosSubp.ejecutar();
                        tryAgain();
                        break;
                    case 2:
                        MenuSP.ejecutar();
                        tryAgain();
                        break;
                    case 3:
                        ValidarNomSP.ejecutar();
                        tryAgain();
                        break;
                    case 4:
                        OpBasicasSP.ejecutar();
                        tryAgain();
                        break;
                    case 5:
                        DescripcionMes.ejecutar();
                        tryAgain();
                        break;
                    case 6:
                        PromedioSP.ejecutar();
                        tryAgain();
                        break;
                    case 7:
                        DescDia.ejecutar();
                        tryAgain();
                        break;
                    default:
                        intentarSwitch();
                }
                break;
            case 5:
                System.out.println("¡Hasta luego!");
                System.exit(0);
                break;
            default:
                intentarSwitch();
        }
    }
    public static void main(String[] args) throws InterruptedException, IOException{
        ejecutarAlgoritmos();
    }
    public static void intentarSwitch() throws InterruptedException, IOException{
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
    public static void tryAgain() throws InterruptedException, IOException{
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
