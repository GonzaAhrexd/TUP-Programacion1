import java.util.Scanner; //Librería para ingresar datos por consola
public class Ejercicio2 {
    public static void main(String args[]) {
        
        //Tomar datos por consola
        Scanner input = new Scanner(System.in);

        System.out.println("Ingresa un número: ");
        int Entero = input.nextInt();
        
        System.out.println("Ingrese un cadena de carácteres");
        String Cadena = input.next();
        
        System.out.println("Ingrese un booleano");
        boolean Logica = input.nextBoolean();
    
        
    }
}
