import java.util.Scanner;

public class Practica1 {
    public static Scanner input = new Scanner(System.in);
    public static void main(String args[]) {
        int[][] matriz;
        int filas, columnas;
        System.out.println("Ingrese la cantidad de filas: ");
        filas = input.nextInt();
        System.out.println("Ingrese la cantidad de columnas: ");
        columnas = input.nextInt();
        matriz = new int[filas][columnas];
        matriz = cargarMatriz(matriz);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
    public static int[][] cargarMatriz(int[][] matriz) {
        int[][] matrizCargada = new int[matriz.length][matriz[0].length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.println("Ingrese el valor de la matriz en la posicion ["+ i + "]["+j+"]");
                matrizCargada[i][j] = input.nextInt();
            }
        }
        return matrizCargada;
    }
}
