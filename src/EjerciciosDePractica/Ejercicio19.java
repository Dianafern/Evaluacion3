/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosDePractica;
import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner presos = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de internos registrados: ");
        int totalInternos = presos.nextInt();
        presos.nextLine();
        String[] nombres = new String[totalInternos];
        int[] condenasMeses = new int[totalInternos];
        for (int i = 0; i < totalInternos; i++) {
            System.out.println("Ingrese el nombre del interno " + (i+1) + ": ");
            nombres[i] = presos.nextLine();

            System.out.println("Ingrese la condena en meses de " + nombres[i] + ": ");
            condenasMeses[i] = presos.nextInt();
            presos.nextLine();
        }
        int internosCumplenCondicion = 0;
        System.out.println("Internos con menos de 36 meses de condena:");
        for (int i = 0; i < totalInternos; i++) {
            if (condenasMeses[i] < 36) {
                System.out.println("Nombre: " + nombres[i] + ", Condena (meses): " + condenasMeses[i]);
                internosCumplenCondicion++;
            }
        }

        System.out.println("Cantidad total de internos que cumplen con la condición: " + internosCumplenCondicion);
    }
}