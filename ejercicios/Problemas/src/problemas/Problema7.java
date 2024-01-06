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
public class Problema7 {

    public static void main(String[] args) {
        String[] arreglo = crearArreglo();
        imprimirvalores(arreglo);
    }

    public static String[] crearArreglo() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de valores del arreglo ");
        int cantidad = scanner.nextInt();
        scanner.nextLine();
        String[] valores = new String[cantidad];
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese el dato que usted desee");
            valores[i] = scanner.nextLine();
        }
        return valores;
    }

    public static void imprimirvalores(String[] valores) {
        for (int i = 0; i < valores.length; i++) {
        String valor = valores[i];
        if (valor.length() == 4 || valor.length() == 5) {
            System.out.printf("%s\n",valor);
        }
    }
        }
    }


