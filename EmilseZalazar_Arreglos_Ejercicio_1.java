/*
 Ejercicio1 

Leer 5 nros, guardarlos en un arreglo y mostrarlos en el mismo orden introducidos.-
 */
package arreglos_ejercicio_1;

import java.util.Scanner;

public class Arreglos_Ejercicio_1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float[] arreglos = new float[5];
        
        System.out.println("Se almacenarán los datos ingresados en un arreglo");
        
        for (int i = 0; i < 5; i++) {
            System.out.print((i+1) + ". Ingrese un nro: ");
            arreglos[i] = entrada.nextFloat();   
        }
        
        System.out.println("\nLos elementos almacenados en el arreglo son: ");
        for (float i:arreglos) {
                System.out.print(i + " ");
        }
        
        System.out.println("\n");
    }
}
