//Una institución educativa estableció un programa para estimular a los alumnos con buen
//rendimiento académico y que consiste en lo siguiente:
//▪ Si el promedio es de 9.5 o más y el alumno es de tecnología, entonces este podrá cursar
//55 créditos y se le hará un 25% de descuento.
//▪ Si el promedio es mayor o igual a 9 pero menor que 9.5 y el alumno es de tecnología,
//entonces este podrá cursar 50 créditos y se le hará un 10% de descuento.
//▪ Si el promedio es mayor que 7 y menor que 9 y el alumno es de tecnología, este podrá
//cursar 50 créditos y no tendrá ningún descuento.
//▪ Si el promedio es de 7 o menor, el número de materias reprobadas es de 0 a 3 y el
//alumno es de tecnología, entonces podrá cursar 45 créditos y no tendrá descuento.
//▪ Si el promedio es de 7 o menor, el número de materias reprobadas es de 4 o más y el
//alumno es de tecnología, entonces podrá cursar 40 créditos y no tendrá ningún
//descuento.
//▪ Si el promedio es mayor o igual a 9.5 y el alumno es de profesional, entonces podrá
//cursar 55 créditos y se le hará un 20% de descuento.
//▪ Si el promedio es menor de 9.5 y el alumno es de profesional, entonces podrá cursar 55
//créditos y no tendrá descuento.
//Obtener el total que tendrá que pagar un alumno si el valor de la matrícula para alumnos de
//profesional es de $30.000 por cada cinco créditos y para alumnos de tecnología es de $18.000
//por cada cinco créditos.
package EjerciciosDePractica;
import java.util.Scanner;

/**
 *
 * @author u20232217593
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner prome=new Scanner(System.in);
        System.out.println("Digite su promedio");
        double promedio=prome.nextDouble();
        Scanner progra=new Scanner(System.in);
        System.out.println("¿Perteneces a la tecnologia o a la carrera profesional?");
        String programa=progra.nextLine();
        String pro1="Tecnologia";
        String pro2="Carrera profesional";
        double totalPago;
        double totalPagoDes;
        if (promedio>=9.5 && programa.equals(pro1)){
            System.out.println("Puedes cursar 55 creditos y tienes un descuento del 25%.");
            totalPago=(55/5)*18.000;
            totalPagoDes=totalPago-(totalPago*0.25);
            System.out.println("Total a pagar: " + totalPagoDes);  
        }
        else if ((promedio>=9 && promedio<9.5) && programa.equals(pro1)){
            System.out.println("Puedes cursar 50 creditos y tienes un descuento del 10%.");
            totalPago=(50/5)*18.000;
            totalPagoDes=totalPago-(totalPago*0.10);
            System.out.println("Total a pagar: " + totalPagoDes);  
        }
        else if ((promedio>7 && promedio<9) && programa.equals(pro1)){
            System.out.println("Puedes cursar 50 creditos y no tienes descuento.");
            totalPago=(50/5)*18.000;
            System.out.println("Total a pagar: " + totalPago);  
        }
        else if ((promedio<=7) && (programa.equals(pro1))){
            Scanner mate=new Scanner(System.in);
            System.out.println("Digite el numero de materias reprobadas.");
            int materia=mate.nextInt();
            if (materia>=0 && materia<=3){
            System.out.println("Puedes cursar 45 creditos y no tienes descuento.");
            totalPago=(45/5)*18.000;
            System.out.println("Total a pagar: " + totalPago);  
            }
            else if  (materia>=4){
            System.out.println("Puedes cursar 40 creditos y no tienes descuento.");
            totalPago=(40/5)*18.000;
            System.out.println("Total a pagar: " + totalPago);  
        }
        }

        else if (promedio>=9.5 && programa.equals(pro2)){
            System.out.println("Puedes cursar 55 creditos y tienes un descuento del 20%.");
            totalPago=(55/5)*30.000;
            totalPagoDes=totalPago-(totalPago*0.20);
            System.out.println("Total a pagar: " + totalPagoDes);  
        }
        else if (promedio<9.5 && programa.equals(pro2)){
            System.out.println("Puedes cursar 55 creditos y no tienes descuento.");
            totalPago=(55/5)*30.000;
            System.out.println("Total a pagar: " + totalPago); 
        }
        else {
            System.out.println("No eres beneficiario del programa.");
        }
        
        
        
        
    }
    
    
}
