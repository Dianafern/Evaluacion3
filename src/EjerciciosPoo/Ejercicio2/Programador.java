//2) Clase Programador . Clase que hereda de Empleado y además tiene:
//Atributos:
//- lineasDeCodigoPorHora : tipo entero
//- lenguajeDominante: tipo cadena
//Metodos:
//- Constructor con y sin parámetros de entrada.
//- Método double calculaSalario(), que calcula y devuelve el salario del programador,
//calculado con la operación 10* lineasDeCodigoPorHora.
package EjerciciosPoo.Ejercicio2;

/**
 *
 * @author DIANA CONTRERAS u20232217593
 */
public class Programador extends Empleado{
    private int lineaDeCodigoPorHora;
    private String lenguajeDominante;

    public Programador(String nombre, String dni, int edad, boolean casado, double salario, int lineaDeCodigoPorHora, String lenguajeDominante) {
        super(nombre, dni, edad, casado, salario);
        this.lineaDeCodigoPorHora = lineaDeCodigoPorHora;
        this.lenguajeDominante = lenguajeDominante;
    }
    public Programador(){
        
    }
    public double calcularSalario(){
        return 10 * lineaDeCodigoPorHora;
        
    }

    public int getLineaDeCodigoPorHora() {
        return lineaDeCodigoPorHora;
    }

    public String getLenguajeDominante() {
        return lenguajeDominante;
    }

    public void setLineaDeCodigoPorHora(int lineaDeCodigoPorHora) {
        this.lineaDeCodigoPorHora = lineaDeCodigoPorHora;
    }

    public void setLenguajeDominante(String lenguajeDominante) {
        this.lenguajeDominante = lenguajeDominante;
    }
    
    
    
    
}
