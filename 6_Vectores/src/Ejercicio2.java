import java.util.Scanner;
public class Ejercicio2 {

 public static boolean primo(int num){ //Funcion para saber si es primo
    for(int j=2;j<num/2;j++){ 
        if(num % j == 0 && j!=num){ //Si es divisible por cualquier número distinto a 0 y sí mismo, entonces no es primo
            return false;
        } 
  }
    return true;
}

 public static int[] esPrimo(int[] listaNum){ //Funcion para crear el arreglo con los números primos
    int[] listaPrimo = new int[listaNum.length];
    for(int i=0;i<listaNum.length;i++){
            if(primo(listaNum[i])){
                listaPrimo[i] = listaNum[i];
            }
        }
        return listaPrimo;
    }

 public static int sumatoria(int[] listaNum){//Función para sumar los números
        int sumador = 0;
        for(int i=0;i<listaNum.length;i++){
            sumador+=listaNum[i];
        }
        return sumador;
    }
 public static float promedio(int[] listaNum){ //Funcion para sacar el promedio de los valores
        return sumatoria(listaNum) / listaNum.length;
    }

 public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
    int size;
   
    System.out.println("Ingrese el tama\u00f1o del arreglo: ");
    size = input.nextInt();
    int[] listaNumeros = new int[size];


    for(int i=0;i<size;i++){
        System.out.println("Ingrese el valor de la posicion " + (i+1));
        listaNumeros[i] = input.nextInt();
    
    }

    int[] numPrimos = esPrimo(listaNumeros);

    for(int i = 0; i<numPrimos.length;i++){
        if(numPrimos[i]!=0){ 
        System.out.print(numPrimos[i] + " ");
    }
}
    System.out.println("\nLa sumatoria de los n\u00fameros ingresados es: " + sumatoria(listaNumeros));
    System.out.println("\nEl promedio de los valores ingresados es  " + promedio(listaNumeros));


    }
}
