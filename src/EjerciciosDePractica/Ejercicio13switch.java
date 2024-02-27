//Un supermercado realiza una tómbola con todos los clientes, si son hombres tienen que sacar
//de una canasta una bolita la cual tiene un número grabado y si son mujeres lo mismo pero de
//otra canasta, los premios se dan bajo la siguiente tabla:
//HOMBRES MUJERES
//# Bolita Premio # bolita Premio
//1 Desodorante 1 Loción
//2 Six-Pack de cerveza 2 Bikini
//3 Camiseta 3 Crema para la cara
//4 Pantaloneta 4 Plancha para el cabello
//5 Sudadera 5 Esmalte de uñas
package EjerciciosDePractica;
import java.util.Scanner;

/**
 *
 * @author u20232217593
 */
public class Ejercicio13switch {
    public static void main(String[] args) {
     Scanner sexo = new Scanner(System.in);
     System.out.println("Digite su sexo (Hombre/Mujer)");
     String hm = sexo.nextLine();
     String H="Hombre";
     String M="Mujer";
     String premioFinal;
     
     
     if (hm.equals(H))
     {
         Scanner numero = new Scanner(System.in);
         System.out.println("Digite el numero");
         int premio = numero.nextInt();
         switch (premio) {
             case 1: premioFinal="Desodorante" ;
             break;
             case 2: premioFinal="Six-pack de cerveza";
             break;
             case 3: premioFinal="Camiseta" ;
             break;
             case 4: premioFinal="Pantaloneta";
             break;   
             case 5: premioFinal="Sudadera";
             break; 
             default: premioFinal="Nada";
             break;
            
         }
         System.out.println("Te gananste: " + premioFinal);
         
     }
     else if (hm.equals(M))
     {
         Scanner numero = new Scanner(System.in);
         System.out.println("Digite el numero");
         int premio = numero.nextInt();
         switch (premio) {
             case 1: premioFinal="Locion" ;
             break;
             case 2: premioFinal="Bikini";
             break;
             case 3: premioFinal="Crema para cara" ;
             break;
             case 4: premioFinal="Plancha capilar";
             break;   
             case 5: premioFinal="Esmalte";
             break; 
             default: premioFinal="Nada";
             break;
         }
         System.out.println("Te ganaste: " + premioFinal);
     }
    }
    
}
