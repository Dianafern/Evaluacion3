//Una frutería ofrece las manzanas con descuento según la siguiente tabla:
//NUM. DE KILOS COMPRADOS % DESCUENTO
//0 - 2 0%
//2.01 - 5 10%
//5.01 - 10 15%
//10.01 en adelante 20%
//Determinar cuánto pagara una persona que compre manzanas es esa frutería.
package EjerciciosDePractica;
import java.util.Scanner;
/**
 *
 * @author u20232217593
 */
public class Ejercicio4 {
    public static void main(String[] agrs) {
        Scanner Manzanas = new Scanner(System.in);
        System.out.println("¿Cúantas kilos deseas comprar?");
        double Kilos = Manzanas.nextDouble();
        double precio = 1000.0; // precio por kilo
        double descuento1; // no tiene descuento
        double descuento2; // tiene un 10
        double descuento3; // tiene un 15
        double descuento4; // tiene un 20
        double precioTotal=(Kilos*precio);
    if (Kilos<=2)
    {
       System.out.println("No tiene ningun descuento, por ende el precio a pagar seria:" + precioTotal);
        
    }
    else if (Kilos>=2.01 && Kilos<=5)
    {
        descuento2 = precioTotal-(precioTotal*0.10);
        System.out.println("Tiene un descuento del 10%, por ende sus total a pagar seria:" + descuento2);   
    }
    else if (Kilos>=5.01 && Kilos<=10)
    {
        descuento3 = precioTotal-(precioTotal*0.15);
        System.out.println("Tiene un descuento del 15%, por ende sus total a pagar seria:" + descuento3);
    }
    else if (Kilos>=10.1)
    {
        descuento4 = precioTotal-(precioTotal*0.20);
        System.out.println("Tiene un descuento del 20%, por ende sus total a pagar seria:" + descuento4);
    }
    
        
    }
}
