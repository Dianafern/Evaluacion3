//10. Un obrero necesita calcular su salario semanal, el cual se obtiene de la sig. manera:
//• Si trabaja 40 horas o menos se le paga $5000 por hora
//• Si trabaja más de 40 horas se le paga $5000 por cada una de las primeras 40 horas y un
//aumento del 20% por cada hora extra.
package EjerciciosDePractica;
import java.util.Scanner; 

/**
 *
 * @author u20232217593
 */
public class Ejercicio10 {
  public static void main(String[] args)  {
      Scanner salario=new Scanner(System.in);
      System.out.println("Digite el numero de horas");
      int horas = salario.nextInt();
      int salario1;
      int salario2;
      int horasExtras;
      int totalPago;
      int valorHora; 
    if (horas<=40)
    {
        salario1=(horas*5000);
        System.out.println("Total de salario:" + salario1);   
    }
    else if (horas>40)
    {
        horasExtras=(horas-40);
        valorHora= 5000+(5000*20/100);
        salario2= (horasExtras*valorHora);
        totalPago=(200000+salario2);
        System.out.println("Total de salario con horas extras es:" + totalPago);   
    }
  }
}
