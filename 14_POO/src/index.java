public class index {
    public static void main(String args[]){
        Persona persona1 = new Persona();
        persona1.nombre = "Pepito";

        System.out.println("Nombre: " + persona1.nombre);
        System.out.println(persona1.comer("Manzana"));
    }
}
