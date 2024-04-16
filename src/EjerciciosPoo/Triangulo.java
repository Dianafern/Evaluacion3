//Crea una clase llamada Triangulo que herede de la clase Forma, y con los atributos base y altura.
//Define en ella el método calcularArea().
package EjerciciosPoo;

/**
 *
 * @author DIANA CONTRERAS u20232217593
 */
public class Triangulo extends Forma {
    private double base;
    private double altura;
    public Triangulo(String nombre, double posicionX, double posicionY, String color, double base, double altura) {
        super(nombre, posicionX, posicionY, color);
        this.base=base;
        this.altura=altura;
    }

    @Override
    public double calcularArea() {
        return base * altura; 
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}

     
    
    
    
    

