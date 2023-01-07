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
public class Problema6 {

    public static void main(String[] args) {
        int[] informacion = {1, 2, 3, 10, 20, 30, 100, 200, 300};
        double media;
        double desviacion;
        media = obtenerMedia(informacion);
        desviacion = obtenerDesviacion(informacion, media);

        System.out.printf("La media es: %.2f\nLa desviación es: %.2f\n",
                media, desviacion);
    }

    public static double obtenerMedia(int[] arreglo1) {
        int suma = 0;
        double media;
        for (int i = 0; i < arreglo1.length; i++) {
            suma = suma + arreglo1[i];
        }
        media = suma / arreglo1.length;
        return media;
    }

    public static double obtenerDesviacion(int[] arreglo, double media) {
        double rango;
        double varianza = 0;
        double desviacion;

        for (int i = 0; i < arreglo.length; i++) {
            rango = Math.pow(arreglo[i] - media, 2);
            varianza = varianza + rango;
        }

        varianza = varianza / arreglo.length;
        desviacion = Math.sqrt(varianza);

        return desviacion;
    }
}
