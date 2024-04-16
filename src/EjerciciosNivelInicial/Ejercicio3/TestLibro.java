
package EjerciciosNivelInicial.Ejercicio3;

/**
 *
 * @author DIANA CONTRERAS u20232217593
 */
public class TestLibro {
    public static void main(String[] args) {
    Libro libro1 = new Libro ("100 años de soledad", "Gabriel Garcia Marquez", 5);
    
        libro1.prestar();
        libro1.prestar();
        libro1.prestar();
        libro1.devolver();
       
        System.out.println("Libro 1: " + libro1.getNombre()+ "(" + libro1.getAutor()+ ")");
        System.out.println("Ejemplares totales: "+ libro1.getNumeroLibro());
        System.out.println("Ejemplares prestados: "+ libro1.getNumeroPrestados());
        
    Libro libro2 = new Libro ("Satanas", "Mario Mendoza", 9);
    
        libro2.prestar();
        libro2.prestar();
        libro2.prestar();
        libro2.prestar();
        libro2.devolver();
        
        System.out.println("Libro 2: " + libro2.getNombre()+ "(" + libro2.getAutor()+ ")");
        System.out.println("Ejemplares totales: "+ libro2.getNumeroLibro());
        System.out.println("Ejemplares prestados: "+ libro2.getNumeroPrestados());
        
    }
       
}
