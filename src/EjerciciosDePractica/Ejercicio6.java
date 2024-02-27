//Tomando como base los resultados obtenidos en un laboratorio de análisis clínicos, un médico
//determina si una persona tiene anemia o no, lo cual depende de su nivel de hemoglobina en la
//sangre, de su edad y de su sexo. Si el nivel de hemoglobina que tiene una persona es menor
//que el rango que le corresponde, se determina su resultado como positivo y en caso contrario
//como negativo. La tabla en la que el medico se basa para obtener el resultado es la siguiente:

//EDAD NIVEL HEMOGLOBINA
//0 - 1 mes 13 - 26 g%
//> 1 y < = 6 meses 10 - 18 g%
//> 6 y < = 12 meses 11 - 15 g%
//> 1 y < = 5 años 11.5 - 15 g%
//> 5 y < = 10 años 12.6 - 15.5 g%
//> 10 y < = 15 años 13 - 15.5 g%
//Mujeres > 15 años 12 - 16 g%
//Hombres > 15 años 14 - 18 g%
package EjerciciosDePractica;
import java.util.Scanner;
/**
 *
 * @author u20232217593
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner resultados = new Scanner(System.in);
        System.out.println("Digite su edad en meses.");
        int edad=resultados.nextInt();
        Scanner resultados1 = new Scanner(System.in);
        System.out.println("Digite su sexo.");
        String sexo=resultados1.nextLine();
        String s1="Mujer";
        String s2="Hombre";
        Scanner resultados2 = new Scanner(System.in);
        System.out.println("Digite su nivel de hemoglovina.");
        double hemo=resultados2.nextDouble();
        if (edad<=1 && (hemo<13 || hemo>26)){
            System.out.println("Positivo.");
        }
        else if ((edad>1 && edad<=6)&& (hemo<10 || hemo>18)){
            System.out.println("Positivo.");
        }
        else if ((edad>6 && edad<=12) && (hemo<11 || hemo>15)){
            System.out.println("Positivo.");
        }
        else if ((edad>12 && edad<=60)&& (hemo<11.5 || hemo>15)){
            System.out.println("Positivo.");
        }
        else if ((edad>60 && edad<=120)&& (hemo<12.6|| hemo>15.5)){
            System.out.println("Positivo.");
        }
        else if ((edad>120 && edad<=180)&& (hemo<13|| hemo>15.5)){
            System.out.println("Positivo.");
        }
        else if ((sexo.equals(s1)) && (edad>15) && (hemo<12|| hemo>16)){
            System.out.println("Positivo.");
        }
        else if ((sexo.equals(s2)) && (edad>15) && (hemo<14|| hemo>18)){
            System.out.println("Positivo.");
        }
        else {
            System.out.println("Negativo.");
        }
   
    }      
        
        
    }
    

