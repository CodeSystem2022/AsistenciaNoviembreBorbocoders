/*Ejercicio 3 Crear y cargar una matriz de tamaño 3*3, trasportarla y mostrarla*/

import java.util.Scanner;

public class LopezCordobaKevin_asistencia_nov {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int matriz[][] = new int[3][3];
        
        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                System.out.println("Ingrese el elemento ["+i+"]["+j+"]");
                matriz[i][j] = in.nextInt();
            }
        }
        System.out.println("Matriz original");
        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                System.out.print(matriz[i][j]+"");
            }
            System.out.println("");
        }
        System.out.println("Matriz transpuesta");
        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                System.out.print(matriz[j][i]+"");
            }
            System.out.println("");
        }
    }
}
