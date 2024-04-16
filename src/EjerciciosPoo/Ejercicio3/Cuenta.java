//Define una clase Cuenta con los siguientes datos
//• Atributos privados:
//- numerocuenta : entero largo
//- saldo : double
//- cliente : atributo de la clase Persona.
//• Y los siguientes métodos:
//- Constructor que recibe un cliente y un número de cuenta
//- Métodos de acceso para los tres atributos
//- ingresar(double x): permitirá ingresar una cantidad en la cuenta.
//- retirar(double x): permitirá sacar una cantidad de la cuenta.
package EjerciciosPoo.Ejercicio3;

/**
 *
 * @author DIANA CONTRERAS u20232217593
 */
public class Cuenta{
    private long numeroCuenta;
    private double saldo;
    private Persona cliente;

    
    public Cuenta(long numeroCuenta, Persona cliente) {
        this.numeroCuenta = numeroCuenta;
        this.cliente = cliente;
        this.saldo = 0.0;
    }

    public long getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public Persona getCliente() {
        return cliente;
    }

    public void setNumeroCuenta(long numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setCliente(Persona cliente) {
        this.cliente = cliente;
    }
     public void ingresar(double cantidad){
          if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Se ha ingresado " + cantidad + " a la cuenta.");
        } else {
            System.out.println("La cantidad ingresada debe ser mayor que cero.");
        }
    }

    public void retirar(double cantidad) {
        if (cantidad > 0 && saldo >= cantidad) {
            saldo -= cantidad;
            System.out.println("Se ha retirado " + cantidad + " de la cuenta.");
        } else {
            System.out.println("Fondos insuficientes.");
        }
    }
     }
    

