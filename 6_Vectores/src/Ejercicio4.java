/*
 * Diseñe un algoritmo que lea un número cualquiera y lo busque en un arreglo X, el cual tiene
almacenado 10 elementos numéricos. Escriba la posición donde se encuentra almacenado el
número en el arreglo o el mensaje “NO” si no lo encuentra.*/
import java.util.Scanner;
public class Ejercicio4 {

public static int buscarNum(int[] listaNum, int num){
    for(int i=0;i<listaNum.length;i++){
        if(listaNum[i]==num){
            return i;
        }
    }
    return -1;
}
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int[] listaNum = {4,3,2,5,6,3,1,4,6,4};
        int buscar;
        System.out.println("Ingrese el numero que desea buscar: ");
        buscar = input.nextInt();

        if(buscarNum(listaNum,buscar)==-1){
            System.out.println("No se encuentra el elemento");
        }else{
            System.out.println("El elemento se encuentra en la posición " + buscarNum(listaNum,buscar));
        }
        
   
   
    }
}
