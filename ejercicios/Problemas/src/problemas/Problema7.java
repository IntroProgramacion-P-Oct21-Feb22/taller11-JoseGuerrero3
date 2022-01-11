/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

import java.util.Scanner;
/*
 *
 * @author reroes
 */
public class Problema7 {
     public static void main(String[] args) {

        String[] ciudades;
        ciudades = obtenerArreglo();
        car(ciudades);
    }

    public static String[] obtenerArreglo() {
        Scanner entrada = new Scanner(System.in);
        int cantidadValor;
        System.out.println("Escribir la cantidad de "
                + "elementos que desea colocar: ");

        cantidadValor = entrada.nextInt();
        entrada.nextLine();
        String[] a = new String[cantidadValor];
        for (int i = 0; i < a.length; i++) {
            System.out.println("Coloque una ciudad del Ecuador: ");
            a[i] = entrada.nextLine();
        }
        return a;
    }

    public static void car(String[] a) {
        int cantidadValor;
        String cadenaFinal = "";
        for (int i = 0; i < a.length; i++) {
            cantidadValor= a[i].length();
            if (cantidadValor == 4 || cantidadValor == 5) {
                cadenaFinal = String.format("%s-%s", cadenaFinal, a[i]);
            }
        }
        System.out.printf(" Ciudades que contienen 5 o 4 caracteres son: %s\n",  
                 cadenaFinal);
    }

}

