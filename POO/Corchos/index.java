import java.util.Scanner;

public class index {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Corcho corchito = new Corcho();
        Botella botellita = new Botella(corchito);
        Sacacorchos sacacorchos = new Sacacorchos();
        String opt;
        int i = 0;
        while (i < 10) {

            System.out.println("Desea quitar el corcho a la botella? ");
            opt = input.nextLine();

            if (opt.equals("si")) {
                sacacorchos.destapar(botellita);
            } else {
                break;
            }
            i++;
        }
    }
}
