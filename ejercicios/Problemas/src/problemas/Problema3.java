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
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        double nota1;
        double nota2;
        double nota3;
        double nota4;
        double mensaje;
        System.out.println("ingrese la nota 1");
        nota1 = entrada.nextDouble();
        System.out.println("ingrese la nota 2");
        nota2 = entrada.nextDouble();
        System.out.println("ingrese la nota 3");
        nota3 = entrada.nextDouble();
        System.out.println("ingrese la nota 4");
        nota4 = entrada.nextDouble();
        obtenerPromedio(nota1, nota2, nota3, nota4);
        System.out.println(obtenerPromedio(nota1, nota2, nota3, nota4));
    }

    public static String obtenerPromedio(double n1, double n2, double n3, double n4) {
        double operacion;
        String mensaje = "";
        operacion = (n1 + n2 + n3 + n4) / 4;
        if (operacion >= 0 && operacion <= 5) {
            mensaje = String.format("%s El promedio de las notas: %s %s %s %s "
                    + "es regular", mensaje, n1, n2, n3, n4);
            return mensaje;
        } else {
            if (operacion >= 5.1 && operacion <= 8) {
                mensaje = String.format("%s El promedio de las notas: %s %s %s %s "
                        + "es Bueno", mensaje, n1, n2, n3, n4);
                return mensaje;

            } else {
                mensaje = String.format("%s El promedio de las notas: %s %s %s %s "
                        + "es Bueno", mensaje, n1, n2, n3, n4);
                return mensaje;

            }
        }
    }
}
