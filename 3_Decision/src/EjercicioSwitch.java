import java.util.Scanner;
public class EjercicioSwitch {
    public static void main(String args[]) {
        System.out.println("Ingrese un numero: ");
        Scanner input = new Scanner(System.in);

        int nro = input.nextInt();
        String nroRomano = "";

        switch(nro){
            case 1:
                nroRomano = "I";
                break;
            case 5:
                nroRomano = "V";
                break;
            case 10:
                nroRomano = "X";
                break;
            case 50:
                nroRomano = "L";
                break;
            case 100:
                nroRomano = "C";
                break;
            case 500:
                nroRomano = "D";
                break;
            case 1000:
                nroRomano = "M";
                break;
        }

        System.out.println(nroRomano);
    
    }
}
