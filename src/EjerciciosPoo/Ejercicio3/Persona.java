//Define una clase Persona con los siguientes datos
//• Atributos privados :
//- Nombre : String
//- NIF : String
//• Y los siguientes métodos:
//- Constructor parametrizado
//- Métodos de acceso para los atributos
package EjerciciosPoo.Ejercicio3;

/**
 *
 * @author DIANA CONTRERAS u20232217593
 */
public class Persona {
    private String nombre;
    private int NIF;

    public Persona(String nombre, int NIF) {
        this.nombre = nombre;
        this.NIF = NIF;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNIF() {
        return NIF;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNIF(int NIF) {
        this.NIF = NIF;
    }

    
    }
    
    

