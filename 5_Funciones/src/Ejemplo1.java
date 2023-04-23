import java.util.Scanner;
public class Ejemplo1{
    public static int sumaEnteros(int a,int b){
        return a+b;
    }
    public static void main(String args[]) {
    Scanner input = new Scanner(System.in);

        int a = 0,b = 0;
        a = input.nextInt();
        b = input.nextInt();
    
        int result = sumaEnteros(a,b);        
        int suma =  sumaEnteros(result,b);

        System.out.print(result);

    }
    
}