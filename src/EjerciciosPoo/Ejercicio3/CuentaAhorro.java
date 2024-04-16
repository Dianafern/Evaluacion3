//Define una clase CuentaAhorro, subclase de Cuenta, con los siguientes datos:
//• Atributos privados:
//- double saldoMinimo : entero
//• Y los siguientes métodos:
//- Constructor parametrizado
//- Métodos de acceso para su atributo
//- Metodo toString()
//• Al retirar dinero hay que tener en cuenta que no se sobrepase el saldo mínimo
package EjerciciosPoo.Ejercicio3;

/**
 *
 * @author DIANA CONTRERAS u20232217593
 */
public class CuentaAhorro extends Cuenta{
    
    private double saldoMinimo;
    
    public CuentaAhorro(long numeroCuenta, Persona cliente, double saldoMinimo) {
        super(numeroCuenta, cliente);
        this.saldoMinimo=saldoMinimo;
    }

    public double getSaldoMinimo() {
        return saldoMinimo;
    }

    public void setSaldoMinimo(double saldoMinimo) {
        this.saldoMinimo = saldoMinimo;
    }

    @Override
    public  String toString() {
        return "Cuenta de Ahorro - Número de cuenta: " + getNumeroCuenta();
    }
    @Override
    public void retirar (double cantidad){
        if (cantidad < saldoMinimo ){
           super.retirar(cantidad); 
        }
        else {
            System.out.println("No se puede retirar esa cantidad. Verifica el límite saldo disponible.");
        }
    
    }
}
