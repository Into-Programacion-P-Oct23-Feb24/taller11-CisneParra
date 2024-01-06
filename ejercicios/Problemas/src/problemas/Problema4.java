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
public class Problema4 {

    static Scanner entrada = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nom = "";
        String ced = "";
        System.out.println("¿Cuántos clientes desea ingresar?");
        int n = entrada.nextInt();
        for (int c = 0; c < n; c++) {
            entrada.nextLine();
            System.out.println("Ingrese el nombre del cliente");
            nom = entrada.nextLine();
            System.out.println("Ingrese el numero de cédula");
            ced = entrada.nextLine();
            System.out.println("Si desea conocer el valor de la planilla de"
                    + " luz ingrese 1, si desea conocer el valor a pagar del "
                    + "predio ingrese 2");
            int r = entrada.nextInt();
            if (r == 1) {
                calcularValorLuz(nom,ced);
            }else{
                calcularPredio(nom, ced);
            }
        }
    }
    public static void calcularValorLuz(String nom, String ced) {
        double total;
        System.out.println("Ingrese el valor del kilowatio");
        double k = entrada.nextDouble();
        System.out.println("Ingrese los kilowatios usados");
        double n = entrada.nextDouble();
        total = k * n;
        System.out.printf("Cliente: %s con cédula: %s debe cancelar el"
                + " valor de: $%.2f\n",nom,ced,total);
    }
    public static void calcularPredio(String nom, String ced) {
        double total;
        System.out.println("Ingrese el valor de su bien inmueble");
        double inmueble = entrada.nextDouble();
        total = inmueble - (inmueble * 0.2);
        System.out.printf("Cliente: %s con cédula: %s tiene un bien inmueble "
                + "valorado en: $%.2f y tiene que pagar un predio de: %.2f\n"
                ,nom,ced,inmueble,total);
    }

}
