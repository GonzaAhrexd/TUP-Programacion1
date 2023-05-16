import java.util.Scanner;

public class Ejercicio2 {
    public static Scanner input = new Scanner(System.in);

    public static void main(String args[]) {
        int n;
        System.out.println("Ingrese la cantidad de filas y columnas: ");
        n = input.nextInt();
        int[][] matriz = new int[n][n];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i == j) {
                    matriz[i][j] = 1;
                    break;
                }
            }

        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
