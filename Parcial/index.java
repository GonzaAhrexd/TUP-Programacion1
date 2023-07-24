public class index {
    public static void main(String[] args) {
        Producto productoVendido = new Producto("Cafe", 49);

        productoVendido.cantidadStock = 5;

        System.out.println(productoVendido.totalVenta(6));
    }
    
}
