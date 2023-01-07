/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema7 {
    public static void main(String[] args) {
        String [] arreglo = obtenerArreglo();
        System.out.println("\nEl arreglo:");
        for(int i = 0; i < arreglo.length; i++){
            System.out.printf("{%s} ", arreglo[i]);
        }
        System.out.println("\nTiene valores con 4-5 caracteres como:");
        obtenerCaracter(arreglo);
    }
    
    public static String [] obtenerArreglo(){
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int elementos = 0;
        System.out.println("Ingrese el número de elementos que contendrá "
                + "el arreglo:");
        elementos = entrada.nextInt();
        entrada.nextLine();
        String [] ciudades = new String [elementos];
        for(int i = 0; i < ciudades.length; i++){
            
            System.out.printf("Ingrese una ciudad en la posición [%d]:\n",
                    i);
            ciudades[i] = entrada.nextLine();
        }
        return ciudades;
    }
    
    public static void obtenerCaracter(String [] arreglo){
        int c;
        for(int i = 0; i < arreglo.length; i++){
            c = arreglo[i].length();
            if(c == 4 || c == 5){
                System.out.printf("%s\n", arreglo[i]);
            }
        }
    }
}