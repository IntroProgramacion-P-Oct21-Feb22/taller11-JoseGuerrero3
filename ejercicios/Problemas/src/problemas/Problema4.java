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
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        String mensaje;
        String nombre;
        String cedula;
        int opciondis;

        System.out.println("Coloque el nombre del cliente");
        nombre = entrada.nextLine();

        System.out.println("Coloque el número de cédula del cliente");
        cedula = entrada.nextLine();
        System.out.println("Coloque 1 para calcular el valor de su planilla de "
                + "luz, o digite 2 para calcular el predio de un inmueble");
        opciondis = entrada.nextInt();

        if (opciondis == 1) {
            calcularValorLuz(nombre, cedula);
        } else {
            if (opciondis == 2) {
                PredioInmueble(nombre, cedula);
            } else {
                System.out.println("Número fuera de rango, intente nuevamente");
            }
        }

    }

    public static void calcularValorLuz(String a, String b) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double valorKilovatio;
        double numeroKilovatioMes;
        double p;
        String cadenaFinal = " ";
        System.out.println("Coloque el número de kilovatios consumidos en "
                + "el mes");
        numeroKilovatioMes = entrada.nextDouble();

        System.out.println("Coloque el costo por kilovatios ");
        valorKilovatio = entrada.nextDouble();

        p = (valorKilovatio * numeroKilovatioMes);
        cadenaFinal = String.format("%s\nCliente %s" + " con cédula %s"
                + " debe cancelar el valor de %.2f", cadenaFinal, a, b,
                p);
        System.out.println(cadenaFinal);
    }

    public static void PredioInmueble(String a, String b) {
        Scanner entrada = new Scanner(System.in);
         entrada.useLocale(Locale.US);
        double valorInmueble;
        double p;
        String cadenaFinal = " ";
        System.out.println("Coloque el valor del inmueble");
        valorInmueble = entrada.nextDouble();

        p = valorInmueble * 0.02;
        cadenaFinal = String.format("%s\nCliente %s" + " con cédula %s"
                + " tiene un bien inmueble valorado en $%.2f"
                + " y tiene que pagar de predio $%.2f",
                cadenaFinal,
                a,
                b,
                valorInmueble,
                p);
        System.out.println(cadenaFinal);
    }

}
    
    

