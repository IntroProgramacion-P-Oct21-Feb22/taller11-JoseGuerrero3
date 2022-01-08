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
public class Ejemplo10 {

    public static void main(String[] args) {
        // 
        String mensajeSuma;
        int sumaDos;
        mensajeSuma = obtenerSuma(10, 9);
        sumaDos = obtenerSuma(10);
        
        System.out.printf("%s\n", mensajeSuma);
        System.out.printf("%d\n", sumaDos);
    }
        
    public static String obtenerSuma(int operandor1, int operandor2){
        int suma;
        String cadena = "";
        suma = operandor1 + operandor2;
        cadena = String.format("%s%d\n", cadena, suma);
        return cadena;        
    }
    
    public static int obtenerSuma(int operandor1, int operandor2){
        int suma;
        String cadena = "";
        suma = operandor1 + operandor1;
        cadena = String.format("%s%d\n", cadena, suma);
        return suma;        
        
    }
    
}
