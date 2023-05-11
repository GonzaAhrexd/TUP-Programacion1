import java.util.Scanner;
public class Ejercicio1{
public static Scanner input = new Scanner(System.in);

    public static int[][] ingresarValoresMatriz(int filas, int columnas){
        int[][] MatrizConDatos = new int[filas][columnas];
        for(int i=0;i<filas;i++){
            for (int j=0;j<columnas;j++){
                System.out.println("Ingrese el valor de ["+i+"]["+j+"]");
                MatrizConDatos[i][j] = input.nextInt();
            }
        }
        return MatrizConDatos;
    }
    public static void main(String args[]) {
        int filas,columnas;
        System.out.println("Ingrese la cantidad de filas: ");
        filas = input.nextInt();
        System.out.println("Ingrese la cantidad de columnas: ");
        columnas = input.nextInt();
        
        int[][] ventaSemanaQ = new int[filas][columnas];

        ventaSemanaQ = ingresarValoresMatriz(filas,columnas);

        for(int i=0;i<filas;i++){
            for(int j=0;j<columnas;j++){
                System.out.print(ventaSemanaQ[i][j] + " ");

            }
            System.out.println(" ");
        }
    }
}