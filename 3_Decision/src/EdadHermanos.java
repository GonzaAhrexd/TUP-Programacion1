// Solicitar la edad de dos hermanos, mostrando un mensaje que informe la edad del mayor
// y cuántos años de diferencia tiene con el menor.
import java.util.Scanner;
public class EdadHermanos{
    public static void main(String args[]) {
        
        Scanner input = new Scanner(System.in);

        int edad1,edad2;

        System.out.println("Ingrese la edad de uno de los hermanos: ");
        edad1 = input.nextInt();

        System.out.println("Ingrese la edad del otro hermano: ");
        edad2 = input.nextInt();

        if(edad1>edad2){
            System.out.println("El hermano mayor es el que se ingreso pimero, de " + edad1 + " y se lleva " + (edad1 - edad2) + " anios de diferencia con su hermano");
        }
        else if(edad1==edad2){
            System.out.println("Ambos hermanos tienen la misma edad");
        }else{
            System.out.println("El hermano mayor es el que se ingreso segundo, de " + edad2 + " y se lleva " + (edad2 - edad1) + " anios de diferencia con su hermano");
        }



    }

}