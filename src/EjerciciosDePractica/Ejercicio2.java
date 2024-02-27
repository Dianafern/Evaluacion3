//En una serviteca se ha establecido una promoción de las llantas marca “Pinchadas”, que consiste
//en lo siguiente:
//• Si se compran menos de cinco llantas el precio es de U$100 cada una, de U$75 si se
//compran de cinco a 10 y de U$50 si se compran más de 10.
//• Obtener la cantidad de dinero que una persona tiene que pagar por cada una de las llantas
//que compra y la que tiene que pagar por el total de la compra.
package EjerciciosDePractica;

import java.util.Scanner;
/**
 *
 * @author u20232217593
 */
public class Ejercicio2 {
public static void main(String[] args) {
    Scanner llantas = new Scanner(System.in);
    System.out.println("¿Cúantas llantas deseas comprar?");
    int cantidad = llantas.nextInt();
    int precio1 = 100;
    int precio2 = 75;
    int precio3 = 50;
    int precioFinal;
    if (cantidad<5)
    {
        precioFinal = (precio1*cantidad);
        System.out.println("El precio por llanta sería:" + precio1 + "US");
        System.out.println("Total a pagar:" + precioFinal + "US");  
    }
    else if (cantidad>=5 && cantidad<=10)
    {
        precioFinal = (precio2*cantidad);
        System.out.println("El precio por llanta sería:" + precio2 + "US");
        System.out.println("Total a pagar:" + precioFinal + "US");  
    }
    else if (cantidad>10)
    {
        precioFinal = (precio3*cantidad);
        System.out.println("El precio por llanta sería:" + precio3 + "US");
        System.out.println("Total a pagar:" + precioFinal + "US");  
    }
}
    
}
