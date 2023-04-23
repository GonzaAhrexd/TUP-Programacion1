import java.util.Scanner;
public class Ejercicio3Repeticion {
    public static void main(String args[]) {
    Scanner input = new Scanner(System.in);

    int num = 0, suma = 0, acumulador = 0;
    while(true){
        System.out.println("Ingrese un numero entre 0 y 100: ");
        num = input.nextInt();
        if(num>100 || num<0){
            break;
        }
        suma+=num;
        acumulador++;

    }
    System.out.println("La suma total es: " + suma);    
    System.out.println("El promedio es: " + suma/acumulador);    

    }
}
