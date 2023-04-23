import java.util.Scanner;


public class Ejercicio4 {

    public static int horaGlobal = 60; 

    public static int convertirASegundo(int hora,int minuto,int segundos){

        return hora*3600 + minuto*horaGlobal + segundos;
    }

    public static String convertirDeSegundo(int segundo){

        int segundoIngresado = segundo;
        int minutos = segundo / 60;
        int segundos = segundo % 60;
        int aux = minutos;
        int horas = minutos / 60;
        minutos = aux % 60;

        return "Son " + horas + " horas, " + minutos + " minutos y " + segundos + " segundos";


    }
    
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese las horas, minutos y segundos del primer intervalo acontinuación: \n");
        int horaIntervalo1 = input.nextInt();
        int minutosIntervalo1 = input.nextInt();
        int segundosIntervalo1 = input.nextInt();

        System.out.println("Ingrese las horas, minutos y segundos del segundo intervalo acontinuación: \n");
        int horaIntervalo2 = input.nextInt();
        int minutosIntervalo2 = input.nextInt();
        int segundosIntervalo2 = input.nextInt();
        

        int intervalo1 = convertirASegundo(horaIntervalo1, minutosIntervalo1, segundosIntervalo1);        
        int intervalo2 = convertirASegundo(horaIntervalo2, minutosIntervalo2, segundosIntervalo2);
        
        int SumaIntervalos = intervalo1 + intervalo2;

        System.out.println(convertirDeSegundo(SumaIntervalos));

    }
}
