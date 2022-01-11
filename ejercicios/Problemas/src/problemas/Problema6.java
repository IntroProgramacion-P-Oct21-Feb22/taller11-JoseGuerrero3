/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

/**
 *
 * @author reroes
 */
public class Problema6 {
    public static void main(String[] args) {

        double media;
        double varianza;
        int[] Informe = {1, 2, 3, 10, 20, 30, 100, 200, 300};
        media = mediaAritmetica(Informe);
        varianza = obtenerDesviacion(Informe, media);

        System.out.printf(" Media aritmética es: %.2f\n"
                + " Desviación estándar es: %.2f\n",
                media,
                varianza);
    }

    public static double mediaAritmetica(int[] a) {

        int suma = 0;
        int mediaAritmetica;
        for (int i = 0; i < a.length; i++) {
            suma = suma + a[i];

        }

        mediaAritmetica = suma / a.length;
        return mediaAritmetica;
    }

    public static double obtenerDesviacion(int[] a, double b) {

        double desviacion = 0;
        double desviacion_final;

        for (int i = 0; i < a.length; i++) {

            desviacion = desviacion + Math.pow((a[i] - b), 2);
        }

        desviacion_final = desviacion / a.length;

        return desviacion_final;
    }
}

