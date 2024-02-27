//Una empresa automotriz necesita un sistema para seleccionar el tipo de carro (auto, SUV o
//camioneta) lo cual debe de aparecer en un menú, y el color (negro, blanco o rojo) en otro menú.
//Al final se necesita que despliegue la selección realizada. Nota. Debe de anidarse una estructura
//de selección múltiple dentro de otra.
package EjerciciosDePractica;
import java.util.Scanner;

/**
 *
 * @author u20232217593
 */
public class Ejercicio14switch {
    public static void main(String[] args) {
        Scanner seleccionar=new Scanner(System.in);
        System.out.println("Seleccione el tipo de auto que deseas: 1.Auto, 2.SUV, 3.Camioneta");
        int vehiculo = seleccionar.nextInt();
        String vh;
        
         switch (vehiculo) {
             case 1:
                 Scanner co=new Scanner(System.in);
                 System.out.println("Seleccione el color del auto: 1.Negro, 2.Blanco, 3.Rojo");
                 int color = co.nextInt();
                 switch(color){
                     case 1:
                         System.out.println("Haz seleccionado un auto negro");
                         break;
                     case 2:
                         System.out.println("Haz seleccionado un auto blanco");
                         break;
                     case 3:
                         System.out.println("Haz seleccionado un auto rojo");
                         break;
                     default:System.out.println("No tenemos de este color");
                         break;
                 }
             break;
             case 2:
                 Scanner co2=new Scanner(System.in);
                 System.out.println("Seleccione el color del SUV: 1.Negro, 2.Blanco, 3.Rojo");
                 int color2 = co2.nextInt();
                 switch(color2){
                     case 1:
                         System.out.println("Haz seleccionado un SUV negro");
                         break;
                     case 2:
                         System.out.println("Haz seleccionado un SUV blanco");
                         break;
                     case 3:
                         System.out.println("Haz seleccionado un SUV rojo");
                         break;
                     default:System.out.println("No tenemos de este color");
                         break;
                 }
            break;
             case 3:
                 Scanner co3=new Scanner(System.in);
                 System.out.println("Seleccione el color de la camioneta: 1.Negro, 2.Blanco, 3.Rojo");
                 int color3 = co3.nextInt();
                 switch(color3){
                     case 1:
                         System.out.println("Haz seleccionado una camioneta negra");
                         break;
                     case 2:
                         System.out.println("Haz seleccionado una camioneta blanca");
                         break;
                     case 3:
                         System.out.println("Haz seleccionado una camioneta roja");
                         break;
                     default:System.out.println("No tenemos de este color");
                         break;
                 }
             default: System.out.println("No tenemos de este vehiculo");
             break;
    }
         
}
}
