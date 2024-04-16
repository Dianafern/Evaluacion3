//Crea una clase llamada Libro que guarde la información de cada uno de los libros de una biblioteca.
//La clase debe guardar el título del libro, autor/a, número de ejemplares del libro (número de
//ejemplares totales de un determinado libro) y número de ejemplares prestados (irá cambiando a
//medida que prestamos/devolvemos libros). La clase contendrá los siguientes métodos:
//- Constructor por defecto.
//- Constructor con parámetros.
//- Métodos setters/getters.
//- Método prestar() que incremente el atributo correspondiente cada vez que se realice un préstamo
//del libro. No se podrán prestar libros de los que no queden ejemplares disponibles para prestar.
//Devuelve true si se ha podido realizar la operación y false en caso contrario.
//- Método devolver() que decrementa el atributo correspondiente cuando se produzca la devolución
//de un libro. No se podrán devolver libros que no se hayan prestado. Devuelve true si se ha podido
//realizar la operación y false en caso contrario.
//Una vez creada la clase, escribe una clase LibroMain.java con un método main, crea 2 libros y ejecuta
//las operaciones disponibles para probar la funcionalidad de la clase.
package EjerciciosNivelInicial.Ejercicio3;

/**
 *
 * @author DIANA CONTRERAS u20232217593
 */
public class Libro {
    private String nombre;
    private String autor;
    private int numeroLibro;
    private int numeroPrestados;

    public Libro() {
    }

    public Libro(String nombre, String autor, int numeroLibro) {
        this.nombre = nombre;
        this.autor = autor;
        this.numeroLibro = numeroLibro;
        this.numeroPrestados = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumeroLibro() {
        return numeroLibro;
    }

    public int getNumeroPrestados() {
        return numeroPrestados;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNumeroLibro(int numeroLibro) {
        this.numeroLibro = numeroLibro;
    }

    public void setNumeroPrestados(int numeroPrestados) {
        this.numeroPrestados = numeroPrestados;
    }
    
    public boolean prestar(){
        if (numeroPrestados < numeroLibro){
            numeroPrestados++;
            return true;
        }
        
        else {
            return false;
        }
  
      }
         public boolean devolver(){
             if (numeroPrestados > 0){
            numeroPrestados--;
            return true;
        }
        
        else {
            return false;
        }
         
             
         }
    }
    

