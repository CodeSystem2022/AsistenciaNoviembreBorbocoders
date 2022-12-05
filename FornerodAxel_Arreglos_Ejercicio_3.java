
package Arreglos_Ejercicio_3;

import java.util.Scanner;


public class Arreglos_Ejercicio_3 {
   public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int numeros [] = new int[5];
        float negativos = 0; float positivos = 0; float mediaNegativos;float mediaPositivos;
        int contador0=0; int contador_negativos=0; int contador_positivos=0;
        
        System.out.println("Aqui Guardamos los elementos del arreglo");
        for (int i = 0; i < 5; i++){
            System.out.println((i+1)+"Digite un numero");
            numeros [i] = Integer.parseInt(entrada.nextLine());
            
            if (numeros[i]>0) {
                positivos += numeros[i];
                contador_positivos ++;
                
            } else if (numeros [i]<0){
                negativos += numeros [i];
                contador_negativos ++;
            } else {
                contador0 ++;
            }
        }
        if (contador_positivos == 0){
            System.out.println("No se puede sacar la media de positivos");
        } else {
            mediaPositivos = positivos/contador_positivos;
            System.out.println("Media positivos: " + mediaPositivos);
        }
        if (contador_negativos == 0 ){
            System.out.println("No se puede sacar la media de negativos");
        }else {
            mediaNegativos = negativos/ contador_negativos;
            System.out.println("Media negativos = " + mediaNegativos);
        }
        System.out.println("La cantidad de ceros es: " + contador0);
   }
}
