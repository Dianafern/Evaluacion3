//En una tienda de computadoras se planea ofrecer a los clientes un descuento que dependerá
//del número de equipos que compre. Si las computadoras son menos de cinco se les dará un
//10% de descuento sobre el total de la compra; si el número de computadoras es mayor o igual
//a cinco pero menos de diez se le otorga un 20% de descuento; y si son 10 o más se les da un
//40% de descuento. El precio de cada computadora es de U$500.
package EjerciciosDePractica;

import java.util.Scanner;
/**
 *
 * @author u20232217593
 */
public class Ejercicio1 {
    
public static void main(String[] args) {
    Scanner computadores = new Scanner(System.in);
    System.out.println("¿Cuántos equipos deseas comprar?");
    int cantidad = computadores.nextInt();
    int precio = 500;
    int precioFinal = cantidad*precio;
    int precioDescuento;
    int precioTotal;
    if (cantidad<5)
    {
       precioDescuento =(precioFinal*10)/100; 
       precioTotal = (precioFinal-precioDescuento);
       System.out.println("Tienes que pagar:" + precioTotal + "US");
    }
    else if (cantidad<10 && cantidad>=5)
    {
        precioDescuento =(precioFinal*20)/100;
        precioTotal=(precioFinal-precioDescuento);
        System.out.println("Tienes que pagar:" + precioTotal + "US");
    }
    else if (cantidad>=10) 
    {
        precioDescuento =(precioFinal*40)/100;
        precioTotal=(precioFinal-precioDescuento);
        System.out.println("Tienes que pagar:" + precioTotal + "US");
            
    }
         
}
}
