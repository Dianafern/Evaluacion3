
package EjerciciosPoo.Ejercicio3;

/**
 *
 * @author DIANA CONTRERAS u20232217593
 */
public class TestCuenta {
    public static void main(String[] args) {
        Persona cliente = new Persona("Julian Castro", 1076502747);
        System.out.println("Nombre: " + cliente.getNombre());
        System.out.println("NIF: " + cliente.getNIF());
        CuentaCorriente cc1 = new CuentaCorriente(123456,cliente,1000.0);
        CuentaAhorro ca1 = new CuentaAhorro(789012,cliente,500.0);

       
        cc1.ingresar(200.0);
        cc1.retirar(50.0);

        ca1.ingresar(300.0);
        ca1.retirar(200.0);

       
        Persona cliente2 = new Persona("Diana Contreras", 10758902);
        System.out.println("Nombre: " + cliente2.getNombre());
        System.out.println("NIF: " + cliente2.getNIF());
        CuentaCorriente cc2 = new CuentaCorriente(123458,cliente2,1000.5);
        CuentaAhorro ca2 = new CuentaAhorro(789012,cliente2,800.0);

       
        cc1.ingresar(700.0);
        cc1.retirar(300.0);

        ca1.ingresar(400.0);
        ca1.retirar(900.0);
    }
}
    
    

