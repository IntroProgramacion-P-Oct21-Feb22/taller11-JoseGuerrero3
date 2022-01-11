/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

import java.util.Scanner;
import java.util.Locale;
/**
 *
 * @author reroes
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner entrada = new Scanner(System.in);

        double[] nota = new double[4];
        String cadena = "";
        String nota_cualitativo = "";

        for (int a = 0; a < nota.length; a++) {

            System.out.println("Coloque las notas");
            nota[a] = entrada.nextDouble();

            nota_cualitativo = obtenerNotas(nota);
            cadena = String.format("%s %.2f", cadena, nota[a]);
        }

        System.out.printf("Promedio de las notas: %s es %s\n",
                 cadena,
                 nota_cualitativo);

    }

    public static String obtenerNotas(double[] notas) {
        
        double promedio;
        double suma = 0;
        String ncualitativa = "";

        for (int a = 0; a < notas.length; a++) {

            suma = suma + notas[a];
        }

        promedio = suma / notas.length;

        if (promedio >= 0 && promedio < 5) {
            ncualitativa = "Regular";
            
        } else {
            if (promedio >= 5 && promedio < 8) {
                ncualitativa = "Bueno";
                
            } else {
                if (promedio >= 8 && promedio < 9) {
                    ncualitativa= "Muy Bueno";
                    
                } else {
                    
                    if (promedio >= 9 && promedio < 10) {
                        ncualitativa = "Sobresaliente";
                    }
                }
            }
        }
        return ncualitativa;

    }
}