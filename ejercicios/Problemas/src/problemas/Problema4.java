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
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int cedula;
        int opciones;
        String nombre;
        System.out.println("ingrese su nombre");
        nombre = entrada.nextLine();
        System.out.println("ingrese su cedula");
        cedula = entrada.nextInt();
        System.out.println("Si desea obtener su planilla de luz ingrese 1"
                + " si desea calcular su predio ingrese 2");
        opciones = entrada.nextInt();
        if (opciones == 1) {

            System.out.println(obtenerPlanillaLuz(nombre, cedula));
        } else {
            if (opciones == 2) {

                System.out.println(obtenerPredio(nombre, cedula));
            }
        }
    }

    public static String obtenerPlanillaLuz(String nombre, int cedula) {
        double operacion;
        Scanner entrada = new Scanner(System.in);
        double kw;
        double kwm;
        String mensaje = "";
        System.out.println("ingrese el costo de los kilowatios:");
        kw = entrada.nextDouble();
        System.out.println("ingrese los kilowatios consumidos en el mes:");
        kwm = entrada.nextDouble();

        operacion = kw * kwm;
        mensaje = String.format("%s cliente %s con cedula %s El valor de la "
                + "planilla a pagar es de %s", mensaje, nombre, cedula,
                operacion);
        return mensaje;

    }

    public static String obtenerPredio(String nombre, int cedula) {
        double operacion;
        Scanner entrada = new Scanner(System.in);
        double casa;
        System.out.println("ingrese el valor de la vivienda:");
        casa = entrada.nextDouble();
        String mensaje = "";
        operacion = casa * 0.2;
        mensaje = String.format("%s cliente %s con cedula %s tiene un bien "
                + "inmueble valorado en %s y tiene que pagar de predio %s",
                mensaje, nombre, cedula, casa, operacion);
        return mensaje;

    }
}
