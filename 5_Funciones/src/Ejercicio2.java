public class Ejercicio2 {

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

        // System.out.print(convertirASegundo(5,22,32));
        System.out.println(convertirDeSegundo(165000));
    }
}
