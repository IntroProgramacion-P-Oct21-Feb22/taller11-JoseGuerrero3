/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

/**
 *
 * @author reroes
 */
public class Ejemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 
        int[] informacion = {10, 20, 30, 40, 50, 100};
        
        // int suma = obtenerSumaDatos(10);
        int suma = obtenerSumaDatos(informacion);
        double promedio = obtenerPromedioDatos(informacion);
        System.out.printf("La suma es %d\n", suma);
        System.out.printf("El promedio es %.2f\n", promedio);
    }
    
    public static int obtenerSumaDatos(int [] d){
        int suma = 0;
        for (int i = 0; i < d.length; i++) {
            suma = suma + d[i];
        }
        return suma;
    }
    
    public static double obtenerPromedioDatos(int [] datos){
        int suma = 0;
        double promedio;
        for (int i = 0; i < datos.length; i++) {
            suma = suma + datos[i];
        }
        promedio = (double)suma/datos.length;
        return promedio;
    }
    
}
