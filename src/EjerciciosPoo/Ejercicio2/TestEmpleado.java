
package EjerciciosPoo.Ejercicio2;

/**
 *
 * @author DIANA CONTRERAS u20232217593
 */
public class TestEmpleado{
    public static void main(String[] args) {
       Empleado empleado1 = new Empleado("Diana", "12345678", 30, true, 50000.0);
        System.out.println("EMPLEADO");
        System.out.println("Nombre: " + empleado1.getNombre());
        System.out.println("DNI: " + empleado1.getDni());
        System.out.println("Edad: " + empleado1.getEdad());
        System.out.println("Casado: " + empleado1.isCasado());
        System.out.println("Salario: " + empleado1.getSalario());
        System.out.println("Clasificación: " + empleado1.clasifica());
        empleado1.subirSalario(10);

    
        Programador programador1 = new Programador("Diego", "98765432", 25, false, 60000.0, 100, "Java");
        System.out.println("PROGRAMADOR");
        System.out.println("Nombre: " + programador1.getNombre());
        System.out.println("DNI: " + programador1.getDni());
        System.out.println("Edad: " + programador1.getEdad());
        System.out.println("Casado: " + programador1.isCasado());
        System.out.println("Salario: " + programador1.getSalario());
        System.out.println("Linea de codigo por hora: " + programador1.getLineaDeCodigoPorHora());
        System.out.println("Lenguaje dominante: " + programador1.getLenguajeDominante());
        System.out.println("Salario del programador: " + programador1.calcularSalario());
    }
}
    
    

