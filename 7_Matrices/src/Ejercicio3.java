import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class Ejercicio3 {
    public static Scanner input = new Scanner(System.in);
    public static void main(String args[]) {
        int[][] matriz1;
        int[][] matriz2;
        int[][] matriz3;
        int filas1, filas2, columnas1, columnas2, opcion;
        System.out.println("Ingrese la cantidad de filas: ");
        filas1 = input.nextInt();
        System.out.println("Ingrese la cantidad de columnas: ");
        columnas1 = input.nextInt();
        System.out.println("Ingrese la cantidad de filas de la segunda matriz: ");
        filas2 = input.nextInt();
        System.out.println("Ingrese la cantidad de columnas de la segunda matriz: ");
        columnas2 = input.nextInt();

        matriz1 = new int[filas1][columnas1];
        matriz2 = new int[filas2][columnas2];

        System.out.println("Matriz 1: ");
        matriz1 = cargarMatriz(matriz1);
        
        System.out.println("Matriz 1: ");
        matriz2 = cargarMatriz(matriz2);

        
        System.out.println("1. Suma de matrices");
        System.out.println("2. Multiplicacion de matrices");
        System.out.println("Ingrese una opcion: ");
        opcion = input.nextInt();
        switch (opcion) {
            case 1:
                if(matriz1.length  == matriz2.length && matriz1[0].length == matriz2[0].length){
                    matriz3 = sumaMatrices(matriz1,matriz2);
                    mostrarMatriz(matriz3);
                }else{
                    System.out.println("No se puede realizar la operacion, ya que la matriz ingresada debe ser cuadrada");
                }
                break;
            case 2:
                if(matriz1[0].length == matriz2.length){
                    matriz3 = mutliplicacionMatrices(matriz1,matriz2);
                    mostrarMatriz(matriz3);
                }else{
                    System.out.println("No se puede realizar la operacion, ya que las columnas de la primer matriz deben ser iguales a las filas de la segunda");
                }
            default:
                System.out.println("Opcion ingresasda es incorrecta");
                break;
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

    public static int[][] sumaMatrices(int[][] matriz1, int[][] matriz2){
        int[][] matriz3;
        matriz3 = new int[matriz1.length][matriz1.length];
        for (int i = 0; i < matriz3.length; i++) {
            for (int j = 0; j < matriz3.length; j++) {
                matriz3[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
            
        return matriz3;
    }
    public static void mostrarMatriz(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
    public static int valorMultiplicacion(int [][] matriz1, int[][] matriz2, int filas, int columnas){
        int valorMultiplicacion = 0, valorSuma = 0, i = 0;
        for(int j=0;j<matriz1[0].length;j++){
                valorMultiplicacion = matriz1[filas][i] * matriz2[j][columnas];
                valorSuma+= valorMultiplicacion;   
                i++;
        }
        
        return valorSuma;
    }
    public static int[][] mutliplicacionMatrices(int [][] matriz1, int[][] matriz2){
        int[][] matriz3 = new int[matriz1.length][matriz2[0].length];
        for(int i=0;i<matriz1.length;i++){
            for(int j=0;j<matriz2[0].length;j++){
                //Aquí accedemos al indice de la matriz 3
                //Debemos multiplicar las filas de 1 por las columnas de 2 y luego sumar
                matriz3[i][j] = valorMultiplicacion(matriz1, matriz2, i, j);
            }
        }
        return matriz3;
    }
}
