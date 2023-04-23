// Calcula el precio de un boleto de viaje, tomando en cuenta el número de kilómetros que 
// se van a recorrer, siendo el precio $45 por Km.


import java.util.Locale;
import java.util.Scanner;

public class BoletoViaje {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        final float precioKm = 45;

        System.out.println("Ingrese la cantida de Km a recorrer: ");
        input.useLocale(Locale.US);
        float cantKm = input.nextFloat();
        System.out.printf("La cantidad a recorrer por " + cantKm + " es de: " + precioKm * cantKm);
    }   
}
