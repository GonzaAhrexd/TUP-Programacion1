/*Escriba un algoritmo que lea un arreglo de números enteros, y un número x, y escriba en la
pantalla todos los índices de las posiciones del arreglo donde está x. Por ejemplo, si el arreglo
es el que aparece enseguida y x es 2: 1 2 3 100 23 2 2 1 El programa debe escribir: 1 5 6. */
import java.util.Scanner;


public class Ejercicio5 {
    public static int[] busqueda(int[] lista, int busqueda){
        int[] coincidencias =  new int[lista.length];

        for(int i=0;i<lista.length;i++){
            if(lista[i]==busqueda){
                coincidencias[i] = i;
            }
        }

        return coincidencias;
    }
    public static void mostrarCoincidencias(int[] lista){
        for(int i=0;i<lista.length;i++){
            if(lista[i]!=0){
                System.out.print(lista[i]);
                System.out.print(",");
            }
        }
    }
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int[] lista = {1,2,3,100,23,2,2,1};
        int busqueda;
        System.out.println("Ingrese el numero que desea buscar: ");
        busqueda = input.nextInt();
        // int[] coincidencias = busqueda(lista,busqueda);
        // System.out.println(coincidencias[1]);
        mostrarCoincidencias(busqueda(lista, busqueda));
        
        
    }
    
}
