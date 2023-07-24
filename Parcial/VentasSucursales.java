import java.util.Scanner;
public class VentasSucursales {
    public static Scanner input = new Scanner(System.in);
    public static void mostrarMatriz(int[][] matriz) {
    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[i].length; j++) {
            System.out.print(matriz[i][j] + " ");
        }
        System.out.println();
    }
}
public static void mostrarArreglo(int[] arreglo) {
    for (int i = 0; i < arreglo.length; i++) {
        System.out.print(arreglo[i] + " ");
    }
    System.out.println();
}


    public static void main(String[] args) {
        int valorVentas;
        int sucursalVentas;
        String[] diaSemana = {"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado"};
        String continuar = "s";
        int[][] VentasSemanales = new int[5][6];

        int[] ventasTotalesSucursal;
        ventasTotalesSucursal = new int[5];
        int[] ventasTotalesDias;
        ventasTotalesDias = new int[6];
        String diaIngresar;
        while(!continuar.equals("n")){
            System.out.println("Sucursales: ");
            System.out.println("1, 2 ,3 ,4 ,5");
            System.out.println("A que sucursal quiere agregar sus ventas: ");
            sucursalVentas = input.nextInt(); 
            input.nextLine();
            System.out.println("A que dia de la semana corresponde:");
            System.out.println("Lunes,Martes,Miercoles,Jueves,Viernes, Sabado");
            diaIngresar = input.nextLine();
            System.out.println("Cuantos fueron las ventas de la sucursal: ");
            valorVentas = input.nextInt();
            input.nextLine();
                    if(diaIngresar.equals(diaSemana[0])){
                        VentasSemanales[sucursalVentas - 1][0] = valorVentas;
                    }
                    if(diaIngresar.equals(diaSemana[1])){
                        VentasSemanales[sucursalVentas - 1][1] = valorVentas;
                    }
                    if(diaIngresar.equals(diaSemana[2])){
                        VentasSemanales[sucursalVentas - 1][2] = valorVentas;
                    }
                    if(diaIngresar.equals(diaSemana[3])){
                        VentasSemanales[sucursalVentas - 1][3] = valorVentas;
                    }
                    if(diaIngresar.equals(diaSemana[4])){
                        VentasSemanales[sucursalVentas - 1][4] = valorVentas;
                    }
                    if(diaIngresar.equals(diaSemana[5])){
                        VentasSemanales[sucursalVentas - 1][5] = valorVentas;
                    }
            System.out.println("Desea ingresar otra venta? s/n");
            continuar = input.nextLine();
        }

        for (int i = 0; i < VentasSemanales.length; i++) {
            int ventasDia = 0;
            for (int j = 0; j < VentasSemanales[0].length; j++) {
                ventasTotalesSucursal[i]+=VentasSemanales[i][j]; /*Ventas por dia por sucursal */
                ventasDia += VentasSemanales[i][j];
            }
            ventasTotalesDias[i] = ventasDia;
        }
        int ventasTotales = 0;
        for (int i = 0; i < VentasSemanales.length; i++) {
            for (int j = 0; j < VentasSemanales[0].length; j++) {
                ventasTotales+=VentasSemanales[i][j];
            }
         
        }
        mostrarMatriz(VentasSemanales);
        mostrarArreglo(ventasTotalesSucursal);
        mostrarArreglo(ventasTotalesDias);
        System.out.println(ventasTotales);

    }
}
