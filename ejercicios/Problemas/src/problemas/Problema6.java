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
public class Problema6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de elementos del arreglo: ");
        int n = scanner.nextInt();
        int[] informacion = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese un valor para el arreglo");
            informacion[i] = scanner.nextInt();
        }
        double media = calcularMedia(informacion);
        System.out.printf("La media aritmética es: %.2f\n", media);
        double desviacionEstandar = calcularDesviacionEstandar(informacion,
                media);
        System.out.printf("La desviación estándar es: %.2f\n",
                desviacionEstandar);
    }

    // Función para calcular la media aritmética
    public static double calcularMedia(int[] arreglo) {
        int suma = 0;
        for (int i = 0; i < arreglo.length; i++) {
            suma = suma + arreglo[i];
        }
        return (double) suma / arreglo.length;
    }
    public static double calcularDesviacionEstandar(int[] arreglo, double media) {
        double suma = 0;
        for (int i = 0; i < arreglo.length; i++) {
            int num = arreglo[i];
            double diferencia = num - media;
            double diferenciaC = diferencia * diferencia;
            suma = diferenciaC;
        }
        double varianza = suma / arreglo.length;
        double desviacionEstandar = Math.sqrt(varianza);
        return desviacionEstandar;
    }

}
