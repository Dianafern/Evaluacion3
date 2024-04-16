//Hacer un programa que cree una clase Persona, con estos atributos:
//String nombre, int edad, String dni.
//Crear un constructor que de valores a los atributos, y estos métodos:
//• void esMayorDeEdad() escribe por pantalla si la persona es mayor de edad o si no lo es.
//• int cuantoHaceMayorEdad() es un método que no recibe parámetro y devuelve el número de
//años que hace que la persona es mayor de edad (si la persona es menor de edad deberá por lo
//tanto devolver un valor negativo)
//• boolean asignarDNI() es un método que recibe un String por parámetro, y lo asigna al DNI de
//la Persona. Sin embargo, no debe asignar el DNI si éste no es correcto (es correcto si tiene 9
//caracteres, ni más ni menos). El método además devuelve un valor booleano dependiendo de si
//el DNI se ha validado (y por lo tanto, se ha asignado al atributo de la clase )
//• boolean estaJubilado() devuelve true o false dependiente de si la persona esta jubilada o no
//Se considera que una persona se jubila a los 65.
package EjerciciosNivelInicial.Ejercicio4;

/**
 *
 * @author DIANA CONTRERAS u20232217593
 */
public class Persona {
    private String nombre;
    private int edad;
    private String dni;

    public Persona(String nombre, int edad, String dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }
    
    public void esMayor(){
        if (edad >= 18){
            System.out.println("Es mayor de edad.");
                    
        }
        else{
            System.out.println("No es mayor de edad.");
        }
    }
    public int tiempoMayor(){
        if (edad >= 18){
            return edad-18;
        }
        else{
            return -(18-edad);
        }
    }
    public boolean asignarDni(String nuevoDni){
         if (nuevoDni.length() == 9) {
            dni = nuevoDni;
            return true; 
        } else {
            return false; 
    }
        
    }
    public boolean jubilado(){
        if (edad >= 65){
            return true;
        }
        else {
            return false;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getDni() {
        return dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
}
