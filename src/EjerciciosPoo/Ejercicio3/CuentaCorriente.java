//Define una clase CuentaCorriente, subclase de Cuenta, con los siguientes datos:
//• Atributos privados:
//- double maximoRetirable : entero
//• Y los siguientes métodos:
//- Constructor completo (con todos los atributos)
//- Métodos de acceso para su atributo
//- Metodo toString()
//• Al retirar dinero hay que tener en cuenta que el importe a retirar debe ser menor o igual
//que maximoRetirable, y mayor que 0.
package EjerciciosPoo.Ejercicio3;

/**
 *
 * @author DIANA CONTRERAS u20232217593
 */
public class CuentaCorriente extends Cuenta{
    private double maximoRetirable;

    public CuentaCorriente(long numeroCuenta, Persona cliente,double maximoRetirable ) {
        super(numeroCuenta, cliente);
        this.maximoRetirable = maximoRetirable;
    }

    public double getMaximoRetirable() {
        return maximoRetirable;
    }

    public void setMaximoRetirable(double maximoRetirable) {
        this.maximoRetirable = maximoRetirable;
    }

    @Override
    public String toString() {
        return "Cuenta Corriente - Número de cuenta: " + getNumeroCuenta();
    }
    @Override
    public void retirar (double cantidad){
        if (cantidad <= maximoRetirable && cantidad>0){
           super.retirar(cantidad); 
        }
        else {
            System.out.println("No se puede retirar esa cantidad. Verifica el límite saldo disponible.");
        }
    }
           
}
