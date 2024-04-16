//Crea una clase llamada Cuadrado que herede de la clase Forma, y con el atributo lado. Define en
//ella el método calcularArea() y calcularPerimetro().
package EjerciciosPoo;

/**
 *
 * @author DIANA CONTRERAS u20232217593
 */
public class Cuadrado extends Forma{
    private double lado;
    public Cuadrado (String nombre, double posicionX, double posicionY, String color, double lado){
         super(nombre, posicionX, posicionY, color);
         this.lado=lado;
    }
    @Override
    public double calcularArea(){
        return lado * lado;
    }
    public double calcularPerimetro(){
        return lado + lado + lado + lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    }
    

