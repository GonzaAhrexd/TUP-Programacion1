import java.util.Scanner;

public class EjercicioHospital {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        float presupuesto;
        System.out.println("Ingrese el presupuesto del hospital: ");
        presupuesto = input.nextFloat();

        System.out.printf("El presupuesto de Urgencias es de: " + presupuesto * 0.37);
        System.out.printf("\nEl presupuesto de Pediatría es de: " + presupuesto * 0.42);
        System.out.printf("\nEl presupuesto de Traumatología es de: " + presupuesto * 0.21);
    }

}
