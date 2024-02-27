//El Seguro Social requiere clasificar a las personas que se jubilaran en el año 2004. Existen tres
//tipos de jubilaciones: por edad, por antigüedad joven y por antigüedad adulta. Las personas
//adscritas a la jubilación por edad deben tener 60 años o más y una antigüedad en su empleo de
//menos de 25 años. Las personas adscritas a la jubilación por antigüedad joven deben tener
//menos de 60 años y una antigüedad en su empleo de 25 años o más. Las personas adscritas a
//la jubilación por antigüedad adulta deben tener 60 años o más y una antigüedad en su empleo
//de 25 años o más.
package EjerciciosDePractica;
import java.util.Scanner;
/**
 *
 * @author u20232217593
 */
public class Ejercicio8 {
    public static void main(String[] args){
        Scanner jubilacion=new Scanner(System.in);
        System.out.println("Digite su edad");
        int edad=jubilacion.nextInt();
        System.out.println("Digite los años de antiguedad en el empleo");
        int añosant=jubilacion.nextInt();
        
        if (edad>=60 && añosant<25){
            System.out.println("Su tipo de jubilacion es por edad.");
        }
        else if (edad<60 && añosant>=25) {  
            System.out.println("Su tipo de jubilacion es por antiguedad joven.");
        }
        else if (edad>=60 && añosant>=25){
            System.out.println("Su tipo de jubilacion es por antiguedad adulta.");
        }
        else {
            System.out.println("No pertences a ningun tipo de jubilacion.");
        }
           
    }
    
}
