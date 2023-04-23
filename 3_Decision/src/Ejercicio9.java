// Determinar la cantidad de dinero que recibirá un trabajador por concepto de las horas 
// extras trabajadas en una empresa, sabiendo que cuando las horas de trabajo exceden de 
// 40, el resto se consideran horas extras y que estas se pagan al doble de una hora normal 
// cuando no exceden de 8; si las horas extras exceden de 8 se pagan las primeras 8 al doble 
// de lo que se pagan las horas normales y el resto al triple.

import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        float precioHora, precioExtra, precioExtraExtra, precioFinal = 0;
        int horasTrabajadas, horasExtra, horasExtraExtra;
        System.out.println("Ingrese la cantidad de horas trabajadas: ");
        horasTrabajadas = input.nextInt();
        
        System.out.println("\nIngrese el pago por hora: ");
        precioHora = input.nextFloat();

        if(horasTrabajadas>40){
            horasExtra = horasTrabajadas - 40;
            horasTrabajadas = horasTrabajadas - horasExtra;
            if(horasExtra>8){
                horasExtraExtra = horasExtra - 8;
                horasExtra = horasExtra - horasExtraExtra;
                //Horas que superan las 8
                precioExtraExtra = (precioHora *3) * horasExtraExtra;
                //Horas que no superan las 8
                precioExtra = (precioHora * 2) * horasExtra;
                precioFinal = precioHora * horasTrabajadas + precioExtra + precioExtraExtra;
            }
            else{
                precioExtra = (precioHora * 2) * horasExtra;
                precioFinal = precioHora * horasTrabajadas + precioExtra;
            }
        }
        else{
            precioFinal = precioHora * horasTrabajadas;
        }

        System.out.printf("El pago es de :" + precioFinal );
    }
    
}
