//Implementar una clase Moto para que la guardamos la velocidad. Tendremos dos métodos uno para
//acelerar (aumentamos su velocidad en una cantidad variable) y otro para frenar (disminuimos la
//velocidad en una cantidad variable). Generar una clase con un main y crear una moto, y acelerarla y
//frenarla para probar la clase.
//MEJORA 1: Hay que controlar que la moto no puede tener una velocidad negativa ni tener una
//velocidad superior a 150
package EjerciciosNivelInicial.Ejercicio2;

/**
 *
 * @author DIANA CONTRERAS u20232217593
 */
public class Moto {
    private double velocidad;

    public Moto() {
        this.velocidad = 0;
    }

    

    public void acelerar(int cantidad){
        if ( velocidad + cantidad <= 150) {
            velocidad +=cantidad;
            System.out.println("La velocidad ha aumentado a " + velocidad + " km/h.");
        } else {
            System.out.println("La velocidad máxima es 150 km/h. No se puede acelerar más.");
        }
    }
    public void frenar(int cantidad) {
        if (velocidad - cantidad >= 0) {
            velocidad -= cantidad;
            System.out.println("Velocidad reducida a " + velocidad + " km/h");
        } else {
            System.out.println("La velocidad no puede ser negativa");
        }
    }

        public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

}
    
   

