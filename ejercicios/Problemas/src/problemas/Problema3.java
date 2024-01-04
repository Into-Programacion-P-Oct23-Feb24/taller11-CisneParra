/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema3 {

    static Scanner entrada = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        entrada.useLocale(Locale.US);
        System.out.println("Ingrese su primera nota");
        double n1 = entrada.nextDouble();
        System.out.println("Ingrese su segunda nota");
        double n2 = entrada.nextDouble();
        System.out.println("Ingrese su tercera nota");
        double n3 = entrada.nextDouble();
        System.out.println("Ingrese su cuarta nota");
        double n4 = entrada.nextDouble();
        String mensaje = "";
        mensaje = obtenerPromedio(n1, n2, n3, n4);
    }

    public static String obtenerPromedio(double n1, double n2, double n3, double n4) {
        entrada.useLocale(Locale.US);
        double promedio;
        String promedioc;
        promedio = (n1 + n2 + n3 + n4) / 4;
        if ((promedio >= 0)&&(promedio < 5)){
            promedioc
        }
        return promedioc;

    }
}
