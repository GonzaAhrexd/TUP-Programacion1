
import java.util.Scanner;

public class Ejercicio6{
    public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
    int A,B,C;
    
    System.out.println("Ingrese el primer numero: ");
    A = input.nextInt();
    
    System.out.println("Ingrese el segundo numero: ");
    B = input.nextInt();

    System.out.println("Ingrese el tercer numero: ");
    C = input.nextInt();

    int Junto = (A*100) + (B*10) + C;

    System.out.println(Junto);

    }
}