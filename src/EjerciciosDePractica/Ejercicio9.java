//Calcular la utilidad que un trabajador recibe en el reparto anual de utilidades si a este se le asigna
//un porcentaje de su salario mensual que depende de su antigüedad en la empresa de acuerdo
//con la siguiente tabla:

//Tiempo Utilidad
//Menos de 1 año 5 % del salario
//1 año o más y menos de 2 años 7% del salario
//2 años o más y menos de 5 años 10% del salario
//5 años o más y menos de 10 años 15% del salario
//10 años o más 20% del salario
package EjerciciosDePractica;
import java.util.Scanner;


/**
 *
 * @author u20232217593
 */
public class Ejercicio9 {
    public static void main(String[] args){
        Scanner utilidad=new Scanner(System.in);
        System.out.println("Digite su salario mensual");
        double salario=utilidad.nextDouble();
        System.out.println("Digite sus años de antiguedad");
        double anti=utilidad.nextDouble();
        double totalPago;
        double salarioad;
        if (anti<1){
            salarioad = (salario*0.05);
            System.out.println("El valor adicional corresponde al: " + salarioad);
            totalPago=salario+salarioad;
            System.out.println("La utilidad recibida seria de: " + totalPago);
        }
        else if (anti>=1 && anti<2){
            salarioad=(salario*0.07);
            System.out.println("El valor adicional corresponde al: " + salarioad);
            totalPago=salario+salarioad;
            System.out.println("La utilidad recibida seria de: " + totalPago);
        }
        
        else if (anti>=2 && anti<5){
            salarioad=(salario*0.10);
            System.out.println("El valor adicional corresponde al: " + salarioad);
            totalPago=salario+salarioad;
            System.out.println("La utilidad recibida seria de: " + totalPago);
        }
        else if (anti>=5 && anti<10){
            salarioad=(salario*0.15);
            System.out.println("El valor adicional corresponde al: " + salarioad);
            totalPago=salario+salarioad;
            System.out.println("La utilidad recibida seria de: " + totalPago);
        }
        else if (anti>=10){
            salarioad=(salario*0.20);
            System.out.println("El valor adicional corresponde al: " + salarioad);
            totalPago=salario+salarioad;
            System.out.println("La utilidad recibida seria de: " + totalPago);
            
        }
            
    }
    
}
