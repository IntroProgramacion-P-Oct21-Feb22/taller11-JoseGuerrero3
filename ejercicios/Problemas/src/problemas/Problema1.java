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
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[][] informacion = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};

        imprimirDatos(informacion);

    }

    public static void imprimirDatos(int[][] datos) {
        String pares = "";

        for (int filas = 0; filas < datos.length; filas++) {

            for (int columnas = 0; columnas < datos.length; columnas++) {

                if ((datos[filas][columnas] % 2) == 0) {
                    pares = String.format("%s %d",
                            pares,
                            datos[filas][columnas]);
                }
            }
        }
        System.out.println(pares);
    }

}