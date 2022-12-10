
package Ciclo.Para;

public class ClaveValor {
    public static void ejecutar() {
        String cadena="01=9|02=5|03=9|04=8|05=8|06=5|07=9|08=5|09=9|10=5";
        String calif[]=new String[11];
        calif[1]="uno";calif[2]="dos";calif[3]="tres";calif[4]="cuatro";calif[5]="cinco";calif[6]="seis";calif[7]="siete";calif[8]="ocho";calif[9]="nueve";calif[10]="diez";
        System.out.println("***************************************************");
        System.out.println("* Algoritmo: Clave y valor                        *'");
        System.out.println("* Autor: Geovanni                                 *");
        System.out.println("***************************************************");
        System.out.println("");
        for(int i=0;i<=cadena.length();i+=5){
            System.out.println("Estudiante con clave "+cadena.substring(i, i+2)+" tiene una calificación de "+calif[Integer.parseInt(cadena.substring(i+3, i+4))]);
        }
    }
    
    public static void main(String[] args) {
        ejecutar();
    }
}
