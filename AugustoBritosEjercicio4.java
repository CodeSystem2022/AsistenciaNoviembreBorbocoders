package ejercicio_4;

import java.util.Scanner;

public class Ejercicio_4 {

    public static void main(String[] args) {

        int matrix[][] = new int[7][7];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 7; i++) {

            for (int j = 0; j < 7; j++) {


                if( i != j ) {

                    matrix[i][j] = 0;
                }
                else {

                    matrix[i][j] = 1;
                }

            }
        }


        for (int i = 0; i < 7; i++) {

            for (int j = 0; j < 7; j++) {

                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

    }
}
