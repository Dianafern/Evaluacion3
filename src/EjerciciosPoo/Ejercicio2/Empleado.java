//1) Clase Empleado
//Atributos:
//- nombre: tipo String (Incluye nombre y apellido)
//- dni: tipo String
//- edad : entero (Rango entre 18 y 45 años, se debe validar en el constructor y en el setter)
//- casado: boolean
//- salario: tipo double
//Métodos:
//- Constructor con todos los parámetros y otro sin parámetros
//- Método clasifica(), que permita mostrar la clasificación según la edad de acuerdo al
//siguiente algoritmo:
//• Si edad es menor o igual a 21, Principiante
//• Si edad es >=22 y <=35, Intermedio
//• Si edad es >35, Senior.
//- Método toString(), para imprimir los datos de un empleado por pantalla (utilizar salto de
//línea \n para separar los atributos).
//- Método subirSalario(int x), que permita aumentar el salario en un porcentaje que sería
//pasado como parámetro al método.
package EjerciciosPoo.Ejercicio2;

/**
 *
 * @author DIANA CONTRERAS u20232217593
 */
public class Empleado {
    private String nombre;
    private String dni;
    private int edad;
    private boolean casado;
    private double salario;

    public Empleado(String nombre, String dni, int edad, boolean casado, double salario) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
        this.casado = casado;
        this.salario = salario;
    }
    public Empleado(){
     
    }
    public String clasifica(){
        if (edad<=21){
            return("Principiante");
        }
        else if (edad>=22 && edad<=35){
            return("Intermedio");
        }
        else if (edad>35){
            return("Senior");
        }
        return null;

    }
    


    @Override
    public String toString() {
        return "Empleado" + "nombre=" + nombre + ", \ndni=" + dni + ", \nedad=" + edad + ", \ncasado=" + casado;
    }
     public void subirSalario(int x) {
        salario *= (1 + x / 100.0);
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public int getEdad() {
        return edad;
    }

    public boolean isCasado() {
        return casado;
    }

    public double getSalario() {
        return salario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    
}
