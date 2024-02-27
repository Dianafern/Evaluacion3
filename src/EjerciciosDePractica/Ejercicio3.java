//Un proveedor de reproductores de música ofrece un descuento del 10% sobre el precio sin IVA,
//de algún aparato, si esta cuesta U$500 o más. Además, independientemente de esto, ofrece un
//5% de descuento si la marca es “NOSY”. Determinar cuánto pagara, con IVA incluido, un cliente
//cualquiera por la compra de su aparato. El IVA es del 19%.
package EjerciciosDePractica;

import java.util.Scanner;
/**
 *
 * @author u20232217593
 */
public class Ejercicio3 {
public static void main(String[] args){
    Scanner reproductores = new Scanner(System.in);
    System.out.println("Digite el precio de su producto sin IVA");
    double precio = reproductores.nextDouble();
    double IVA = 0.19;
    double precioTotal10 = 0;
    double descuentoNosy;
    String Nosy1 = "SI";
    String Nosy2 = "NO";
    double precioTotalIva;
    
    
    if (precio>=500)
    {
       precioTotal10 = precio-(precio*0.10);
        System.out.println("Precio con descuento del 10% seria:" + precioTotal10);
    }
    else if (precio<500)
    {
        precioTotal10 = precio;
        System.out.println("No tiene descuento, por ende su total a pagar seria:" + precioTotal10);
    }
    Scanner marca = new Scanner(System.in);
    System.out.println("¿La marca es NOSY? SI/NO");
    String nosy = marca.nextLine();
    if (nosy.equals(Nosy1))
    {
        descuentoNosy = precioTotal10-(precioTotal10*0.05);
        precioTotalIva = descuentoNosy+(descuentoNosy*0.19);
        System.out.println("Precio con descuento por comprar en NOSY seria:" + descuentoNosy);
        System.out.println("El IVA es igual al 19%");
        System.out.println("Total a pagar:" + precioTotalIva);
    }
    else if (nosy.equals(Nosy2))
    {
        precioTotalIva = precioTotal10+(precioTotal10*0.19);
        System.out.println("El descuento NOSY no aplica. El total a pagar seria:" + precioTotal10);
         System.out.println("El IVA es igual al 19%");
        System.out.println("Total a pagar:" + precioTotalIva);
    }

}   

}
