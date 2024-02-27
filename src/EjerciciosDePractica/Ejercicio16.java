//Una heladería desea obtener un reporte semanal de ventas. Para ello debe capturar en un
//sistema todas las facturas de ventas realizadas. Cada factura contiene la cantidad y el sabor de
//las paletas vendidas. Los sabores y los precios son: limón ($2500), nuez ($2800), lulo ($2600),
//fresa ($2000) y crema ($3000). El sistema debe imprimir la cantidad de paletas vendidas de cada
//sabor, el valor vendido y la venta total. Considere que una factura puede tener varias paletas de
//diferentes sabores.
package EjerciciosDePractica;
import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner helado = new Scanner(System.in);
        int precioLimon = 2500;
        int precioNuez = 2800;
        int precioLulo = 2600;
        int precioFresa = 2000;
        int precioCrema = 3000;
        int totalPaletasVendidas = 0;
        int valorTotalVentas = 0;
        System.out.println("Digite el total de facturas: ");
        int totalFacturas = helado.nextInt();
        for (int i = 1; i <= totalFacturas; i++) {
            System.out.println("Numero de factura: " + i);
            System.out.println("Digite la cantidad de paletas vendidas: ");
            int cantidadPaletas = helado.nextInt();
            helado.nextLine(); 
            System.out.println("Digite el sabor de las paletas (limon, nuez, lulo, fresa o crema): ");
            String sabor = helado.nextLine();
            int valorFactura = 0;
            switch (sabor) {
                case "limon":
                    valorFactura = cantidadPaletas * precioLimon;
                    break;
                case "nuez":
                    valorFactura = cantidadPaletas * precioNuez;
                    break;
                case "lulo":
                    valorFactura = cantidadPaletas * precioLulo;
                    break;
                case "fresa":
                    valorFactura = cantidadPaletas * precioFresa;
                    break;
                case "crema":
                    valorFactura = cantidadPaletas * precioCrema;
                    break;
                default:
                    System.out.println("Error");
            }
            totalPaletasVendidas += cantidadPaletas;
            valorTotalVentas += valorFactura;
        }
        System.out.println("Reporte Semanal de Ventas:");
        System.out.println("Total de paletas vendidas: " + totalPaletasVendidas);
        System.out.println("Valor total de ventas: $" + valorTotalVentas);
    }
}
