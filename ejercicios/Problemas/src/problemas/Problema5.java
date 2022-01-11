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
public class Problema5 {
     public static void main(String[] args) {
        
        int sumaArreglo;
        int[][] Informe = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};
        sumaArreglo = suma(Informe);
        
        System.out.printf("Suma del arreglo ingresado es:\n%d\n"
                        , sumaArreglo);
    }
    
    public static int suma(int[][] a) {
        
        int suma = 0;
        for (int filas = 0; filas < a.length; filas++) {
            
            for (int columnas = 0; columnas < a[0].length; columnas++) {
                
                suma = suma + a[filas][columnas];        
                
            }
        }
        return suma;
    }

}

