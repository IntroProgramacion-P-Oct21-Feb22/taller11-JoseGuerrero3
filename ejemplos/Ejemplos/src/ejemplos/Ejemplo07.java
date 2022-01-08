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
public class Ejemplo07 {

    public static void main(String[] args) {
        // 
        obtenerTablaSumar(10, 9); // se invoca al método obtenerTablaSumar
                                 // que no devuelve ningún valor (void)
        obtenerTablaMultiplicar(10, 9);
    }
        
    public static void obtenerTablaSumar(int limite, int tabla){
        int operacion;
        String cadena = "";
        for (int i = 1; i <= limite; i++) {
            operacion = tabla * i;
            cadena = String.format("%s%d + %d = %d\n", cadena, tabla, i, 
                    operacion);
        }
        
        System.out.printf("%s\n", cadena);
        
    }
    
    public static void obtenerTablaMultiplicar(int limite, int tabla){
        int operacion;
        String cadena = "";
        for (int i = 1; i <= limite; i++) {
            operacion = tabla * i;
            cadena = String.format("%s%d * %d = %d\n", cadena, tabla, i, 
                    operacion);
        }
        
        System.out.printf("%s\n", cadena);
        
    }
    
    
}
