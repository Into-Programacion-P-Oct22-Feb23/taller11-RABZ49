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
        int[][] informacion = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};
        int resultado;
        resultado = obtenerSuma(informacion);
        System.out.println(resultado);
    }

    public static int obtenerSuma(int[][] suma) {
        int resultado = 0;
        int f;
        int c;

        for (f = 0; f < suma.length; f++) {
            for (c = 0; c < suma[f].length; c++) {
                resultado = resultado + suma[f][c];
            }
        }

        return resultado;

    }
}
