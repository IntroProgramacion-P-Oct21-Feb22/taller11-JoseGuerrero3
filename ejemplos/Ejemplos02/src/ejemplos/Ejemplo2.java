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
public class Ejemplo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 
        int[] informacion = {10, 20, 30, 40, 50, 100};
        int valorBuscar = 140;
        boolean bandera = buscarDato(informacion, valorBuscar);
        if (bandera) {
            System.out.printf("El valor %d fue encontrado\n", valorBuscar);
        } else {
            System.out.printf("El valor %d no fue encontrado\n", valorBuscar);
        }

    }

    public static boolean buscarDato(int[] datos, int datoBuscar) {
        boolean valor = false;
        for (int i = 0; i < datos.length; i++) {
            if (datos[i] == datoBuscar) {
                valor = true;
            }
        }
        return valor;
    }

}
