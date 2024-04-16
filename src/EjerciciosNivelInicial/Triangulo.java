//Crear una clase Triangulo que representa un triángulo equilátero, con los atributos enteros base y
//altura. Crear métodos para dar valor y poder consultar los atributos, un método constructor, y un
//método para calcular el área del triángulo.
//Crear una clase Prueba que en su main cree varios objetos de Triángulo, consulte sus atributos, cambie
//el valor nuevamente de los atributos y pruebe su método.
package EjerciciosNivelInicial;

/**
 *
 * @author DIANA CONTRERAS u20232217593
 */
public class Triangulo {
    private int base;
    private int altura;

    public Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
     public double area(){
        return base * altura/2;
     }
     
    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
   
        
    }

