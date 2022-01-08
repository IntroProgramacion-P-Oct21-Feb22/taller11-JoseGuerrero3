/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 
        int numeroDatos = 3;
        int[] informacion = obtenerDatos(numeroDatos);
        for (int i = 0; i < informacion.length; i++) {
            System.out.printf("Datos ingresado: %d\n", informacion[i]);
        }
    }
    
    public static int[] obtenerDatos(int numero){
        Scanner entrada = new Scanner(System.in);
        int [] arregloResultante = new int[numero];
        int valor;
        for (int i = 0; i < numero; i++) {
            System.out.println("Ingrese valor");
            valor = entrada.nextInt();
            arregloResultante[i] = valor;
        }
        return arregloResultante;
    }
    
}
