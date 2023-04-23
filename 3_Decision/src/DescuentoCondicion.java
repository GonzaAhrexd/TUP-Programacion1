// En un almacén se hace un 20% de descuento a los clientes cuya compra supere los $1000.
// Mostrar por pantalla cuál será la cantidad que pagará una persona por su compra.
import java.util.Scanner;

public class DescuentoCondicion{
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        double precio;
        System.out.println("Ingrese el valor de su compra: ");
        precio = input.nextFloat();
        if(precio>=1000){
            precio = precio - (precio * 0.20);
        }
        System.out.print("Usted pagara: " + precio);

    }
}