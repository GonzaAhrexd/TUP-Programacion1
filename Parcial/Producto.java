public class Producto{
    String nombre;
    String origen;
    float valorUnitario;
    int cantidadStock;

    public Producto(String nombre, int valorUnitario) {
       this.nombre = nombre;
       this.valorUnitario = valorUnitario;
    }

    public float totalVenta(int cantidadVendida){
        if(this.cantidadStock>=cantidadVendida){
            return this.valorUnitario * cantidadVendida;
        }else{
            return this.cantidadStock;
        }
    }

}