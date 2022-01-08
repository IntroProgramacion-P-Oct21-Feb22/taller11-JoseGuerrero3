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
public class Ejemplo05 {
    // aquí globales
    public static void main(String[] args) {
        // 
        int suma = 100;
        obtenerSuma(10, 30); // se invoca al método (procedimiento) obtenerSuma // 40
        System.out.println(suma); // 100
        
    }
        
    public static void obtenerSuma(int a, int b){
        int suma; 
        suma = a + b; // 10 + 30 // 40
        System.out.printf("El valor de la suma es: %d\n", suma);
        
    }
    
    
}
