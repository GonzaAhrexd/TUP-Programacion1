public class Ejercicio1Repeticion {
  
    public static void main(String args[]) {
        //For
        for(int i=0;i<=300;i++){
            if(i%2 == 0){
                System.out.print(i + " ");
            }
        }
        //While
        int contador = 0;
        while(contador<=300){
            if(contador%2 == 0){
                System.out.print(contador + " ");
            }
        contador++;
        }
    }
}
