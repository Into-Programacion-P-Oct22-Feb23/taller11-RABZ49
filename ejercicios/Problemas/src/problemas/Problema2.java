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
        int opcion = 0;
        double lado;
        double base;
        double altura;
        String mensaje = "";
        System.out.println("ingrese 1 para calcular el area de un cuadrado"
                + "ingrese 2 para calcula el area de un triangulo"
                + "ingrese 3 para obtener el area de un recatangulo");
        opcion = entrada.nextInt();
        if (opcion == 1) {
            System.out.println("ingrese el lado del cuadrado");
            lado = entrada.nextDouble();
            obtenerAreaCuadrado(lado);
        } else {
            if (opcion == 2) {
                System.out.println("ingrese la base ");
                base = entrada.nextDouble();
                System.out.println("ingrese la altura ");
                altura = entrada.nextDouble();
                obtenerAreaTriangulo(base, altura);
            } else {
                if (opcion == 3) {
                    System.out.println("ingrese la base ");
                    base = entrada.nextDouble();
                    System.out.println("ingrese la altura ");
                    altura = entrada.nextDouble();
                    obtenerAreaRectangulo(base, altura);
                }
            }
        }
    }

    public static void obtenerAreaCuadrado(double lado) {
        double operacion;
        operacion = lado * lado * lado * lado;
        String mensaje = "";
        mensaje = String.format("%s el area de un cuadrado es: %s", mensaje,
                operacion);
        System.out.println(mensaje);
    }

    public static void obtenerAreaTriangulo(double base, double altura) {
        double operacion;
        operacion = (base * altura) / 2;
        String mensaje = "";
        mensaje = String.format("%s el area de un triangulo es: %s", mensaje,
                operacion);
        System.out.println(mensaje);
    }

    public static void obtenerAreaRectangulo(double base, double altura) {
        double operacion;
        operacion = (base * altura);
        String mensaje = "";
        mensaje = String.format("%s el area de un rectangulo es: %s", mensaje,
                operacion);
        System.out.println(mensaje);
    }
}
