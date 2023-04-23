import javax.swing.JOptionPane;

public class Ejercicio4 {
  public static void main(String[] args) {
    int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero "));
    boolean noPrimo = false;
    for(int i=2;i<(numero/2);i++){
        if(numero%i==0){
            noPrimo = true;
            break;
        }
   
    }   
        if(noPrimo){
        JOptionPane.showMessageDialog(null,  numero + " no es primo");
        }
        else{
            JOptionPane.showMessageDialog(null,  numero + " es primo");
        }

  }
}
