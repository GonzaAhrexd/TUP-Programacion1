import java.util.Scanner;
public class Ejercicio3{
    public static String[] cadenaInvertida(String[] listaCadena){
        String[] cadenaInvertida = new String[listaCadena.length];
        for(int i=(listaCadena.length - 1);i>=0;i--){
            cadenaInvertida[i] = listaCadena[i];
        }
        return cadenaInvertida;
    } 
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        int size;
        System.out.println("Ingrese el tama\u00f1o del arreglo: ");
        size = input.nextInt();
        String[] listaCadena = new String[size];

        for(int i=0;i<listaCadena.length;i++){
            System.out.println("Ingrese la cadena en la posicion " + i);
            if(i==0) input.nextLine();
            listaCadena[i] = input.nextLine();
      
        }

       String[] invertido = cadenaInvertida(listaCadena);

       for(int i=0;i<invertido.length;i++){
        System.out.println(invertido[i]);

  
    }
        
        
    }

}