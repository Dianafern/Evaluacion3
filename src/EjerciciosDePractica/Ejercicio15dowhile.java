//Una clínica de maternidad necesita un sistema para determinar cuántos bebés han nacido
//recientemente. Dicho sistema solicita al usuario capturar la cantidad de nacimientos (N), el
//nombre de cada bebé y su sexo (implemente un ciclo do-while para validar la captura, siendo M
//para masculino y F para femenino). Al final, debe imprimir la cantidad de bebés de cada sexo.
package EjerciciosDePractica;
import java.util.Scanner;

/**
 *
 * @author u20232217593
 */
public class Ejercicio15dowhile {
    public static void main(String[] args) {
        Scanner bebes = new Scanner(System.in);
        System.out.println("Digite la acantidad de bebes nacidos");
        int cantidad = bebes.nextInt();
        int m=0, f=0;
        char s;
        bebes.nextLine();
        for (int i=1; i<=cantidad; i++){
            System.out.println("Escriba el nombre del bebe "+ i + ":");
            String nombres = bebes.nextLine();
            do {
                System.out.println("Escriba el sexo del bebe " + i + " M o F ");
            String sexo = bebes.nextLine();
            s =sexo.charAt(0);   
            }while (s != 'M' && s != 'F');
            if (s == 'M'){
                m++;
            }
            else if (s == 'F'){
                f++;
            }
        }
        System.out.println("La cantidad de bebes masculinos son: "+ m);
        System.out.println("La cantidad de bebes femeninos son: "+ f);
    }
    
}
