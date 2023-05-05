import java.util.Scanner;
public class Ejemplo1{
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        // int[] ventaSemanal;
        // ventaSemanal = new int[7]; //(sin valores)

        //Inicializar valores
        int[] notas = {10,20,30,40,50,60};
        System.out.println(notas[2]); //Mostrar un índice        

        //Inicializar y asignar
        int[] ventaSemanal = new int[5];
        // ventaSemanal[0] = 1200;
        // ventaSemanal[1] = 251;
        int promedio = 0;

        final String[] diaSemana = {"lunes","martes","miercoles","jueves","viernes"};
        //Recorrer vectores
        //variable.length permite saber la cantidad de valores del arreglo
        System.out.println(ventaSemanal.length);
        for(int i=0;i<ventaSemanal.length;i++){
            System.out.println("Ingrese el valor del dia " + diaSemana[i]);
            ventaSemanal[i] = input.nextInt();
        }
        for(int i=0;i<ventaSemanal.length;i++){
            // System.out.println(ventaSemanal[i]);
            promedio+=ventaSemanal[i];
        }
        System.out.println("El promedio es: " + (promedio/ventaSemanal.length));
    }
}
