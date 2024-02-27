//Una empresa quiere hacer una compra de varias piezas de la misma clase a una fábrica de
//refacciones. La empresa, dependiendo del monto total de la compra, decidirá qué hacer para
//pagar al fabricante.
//• Si el monto total de la compra excede de $500.000 la empresa tendrá la capacidad de invertir
//de su propio dinero un 55% del monto de la compra, pedir prestado al banco un 30% y el
//resto lo pagará solicitando un crédito al fabricante.
//• Si el monto total de la compra no excede de $500.000 la empresa tendrá capacidad de
//invertir de su propio dinero un 70% y el restante 30% lo pagará solicitando crédito al
//fabricante.
//• El fabricante cobra por concepto de intereses un 20% sobre la cantidad que se le pague a
//crédito.
package EjerciciosDePractica;
import java.util.Scanner;

/**
 *
 * @author u20232217593
 */
public class Ejercicio11 {
    public static void main(String[] args){
        Scanner piezas=new Scanner(System.in);
        System.out.println("Digite el numero de piezas");
        int nump=piezas.nextInt();
        System.out.println("Digite el valor por pieza");
        double valorp=piezas.nextDouble();
        double montoTotal=nump*valorp;
        double inv;
        double pres;
        double cred;
        double intereses;
        
       if (montoTotal>500.000){
           inv=montoTotal*0.55;
           pres=montoTotal*0.30;
           cred=montoTotal*0.25;
           intereses=cred*0.20;
           System.out.println("Valor a pagar:" + montoTotal); 
           System.out.println("La inversion es:" + inv); 
           System.out.println("El prestamo es:" +pres); 
           System.out.println("El credito es:" + cred); 
           System.out.println("El interes por el credito es:" + intereses);
       }
       else if (montoTotal>=500.000){
           inv=montoTotal*0.70;
           pres=0;
           cred=montoTotal*0.30;
           intereses=cred*0.20;
           System.out.println("Valor a pagar:" + montoTotal); 
           System.out.println("La inversion es:" + inv); 
           System.out.println("El prestamo es:" +pres); 
           System.out.println("El interes por el credito es:" + intereses);  
       }
       
    }
    
    
}
