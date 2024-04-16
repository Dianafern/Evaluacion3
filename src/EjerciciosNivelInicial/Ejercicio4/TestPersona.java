
package EjerciciosNivelInicial.Ejercicio4;

/**
 *
 * @author dc558
 */
public class TestPersona {
    public static void main(String[] args) {
         Persona persona1 = new Persona("Ana", 30, "109863625");
         
         persona1.setEdad(25);
         
        System.out.println(persona1.getNombre() + " tiene " + persona1.getEdad() + " años.");
        System.out.println(persona1.getNombre() + " tiene DNI: " + persona1.getDni());
         persona1.esMayor();
         System.out.println(persona1.getNombre()+ " hace " + persona1.tiempoMayor()+ " años que es mayor de edad.");
        
        
        Persona persona2 = new Persona("Carlos", 70, "987654321");
        
        persona2.setNombre("Andres");

        System.out.println(persona2.getNombre() + " tiene " + persona2.getEdad() + " años.");
        System.out.println(persona2.getNombre() + " tiene DNI: " + persona2.getDni());
        persona1.esMayor();
        System.out.println(persona2.getNombre() + " se jubiló: " + persona2.jubilado());
        System.out.println(persona2.getNombre()+ " hace " + persona2.tiempoMayor()+ " años que es mayor de edad.");
        
         Persona persona3 = new Persona("Mario", 7, "1076502757");
         
         System.out.println(persona3.getNombre() + " tiene " + persona3.getEdad() + " años.");
         System.out.println(persona3.getNombre() + " tiene DNI: " + persona3.getDni());
         persona3.esMayor();
         
          
    }
    
}
    
    

