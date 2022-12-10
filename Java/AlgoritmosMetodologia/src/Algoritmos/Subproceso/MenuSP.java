
package Algoritmos.Subproceso;

public class MenuSP {
    public static void ejecutar() {
        System.out.println("***************************************************");
        System.out.println("* Algoritmo: Imprimir menú con subproceso         *");
        System.out.println("* Autor: Geovanni                                 *");
        System.out.println("***************************************************");
        System.out.println("");
        menu();
    }
    static void menu(){
        System.out.println("Figuras geométricas");
        System.out.println("-------------------------");
        System.out.println("C.- Figura del cuadrado");
        System.out.println("R.- Figura del rectángulo");
        System.out.println("T.- Figura del triángulo");
        System.out.println("S.- Salir");
        System.out.println("-------------------------");
    }
    public static void main(String[] args) {
        ejecutar();
    }
}
