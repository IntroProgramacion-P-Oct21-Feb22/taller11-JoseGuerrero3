/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);   
        double altura;
         double base;
        int opcionDis;
        
        System.out.println("Colocar la base de la figura: ");
        base = entrada.nextDouble();
        
        System.out.println("Colocar la altura de la figura: ");
        altura = entrada.nextDouble();
        
        System.out.println("Seleccione (1) para "
                + "calcular  área de un cuadrado, (2) para calcular el área"
                + " de un triángulo, o (3) para calcular el área de un"
                + " rectángulo.");
        opcionDis = entrada.nextInt();
        
        if (opcionDis == 1) {
            area_cuadrado(base, altura);
        } else {
            if (opcionDis == 2) {
                area_triangulo(base, altura);
            } else {
                if (opcionDis == 3) {
                    area_rectangulo(base, altura);
                }
            }
        }
    }

    public static void area_cuadrado(double a, double b) {
        double area_cuadrado;
        area_cuadrado = a * b;
        System.out.printf("Área obtenida de la figura es: %.2f\n",
                area_cuadrado);
    }

    public static void area_triangulo(double a, double b) {
        double area_triangulo;
        area_triangulo = (a * b)/2;
        System.out.printf("Área obtenida de la figura es: %.2f\n",
                area_triangulo);
    }

    public static void area_rectangulo(double a, double b) {
        double area_rectangulo;
        area_rectangulo = a * b;
        System.out.printf("Área obtenida de la figura es: %.2f\n",
                area_rectangulo);
    }
}
