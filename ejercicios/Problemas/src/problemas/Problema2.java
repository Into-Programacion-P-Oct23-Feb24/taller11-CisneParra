/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema2 {

    static Scanner entrada = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Ingrese un numero del 1 al 3");
        int n = entrada.nextInt();
        if (n == 1) {
            obtenerC();
        } else {
            if (n == 2) {
                obtenerT();
            } else {
                obtenerR();
            }
        }

    }

    public static void obtenerC() {
        double area;
        System.out.println("Ingrese el valor del lado de su cuadrado");
        double l = entrada.nextDouble();
        area = l * l * l * l;
        System.out.printf("El area del cuadrado es: %.2f\n", area);
    }

    public static void obtenerT() {
        double area;
        System.out.println("Ingrese ingrese la base de su triangulo");
        double b = entrada.nextDouble();
        System.out.println("Ingrese ingrese la altura de su triangulo");
        double h = entrada.nextDouble();
        area = (b * h)/2;
        System.out.printf("El area del triangulo es: %.2f\n", area);
    }

    public static void obtenerR() {
        double area;
        System.out.println("Ingrese ingrese la base de rectangulo");
        double b = entrada.nextDouble();
        System.out.println("Ingrese ingrese la altura de su rectangulo");
        double h = entrada.nextDouble();
        area = b * h;
        System.out.printf("El area del rectangulo es: %.2f\n", area);
    }

}
