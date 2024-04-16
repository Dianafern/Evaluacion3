//Crea una clase aparte con el método main para probar los métodos de las subclases Triangulo y
//Cuadrado.
package EjerciciosPoo;

/**
 *
 * @author DIANA CONTRERAS u20232217593
 */
public class TestForma {
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo("Triángulo", 5, 8, "Azul", 6, 4);
        System.out.println("TRIANGULO");
        System.out.println("Nombre: " + triangulo.getNombre());
        System.out.println("Posicion X: " + triangulo.getPosicionX());
        System.out.println("Posicion Y: " + triangulo.getPosicionY());
        System.out.println("Base: " + triangulo.getBase());
        System.out.println("Altura: " + triangulo.getAltura());
        System.out.println("Color: " + triangulo.getColor());
        System.out.println("Área del triángulo: " + triangulo.calcularArea());
        

        Cuadrado cuadrado = new Cuadrado ("Cuadrado",4,7, "Verde", 9);
         System.out.println("CUADRADO");
        System.out.println("Nombre: " + cuadrado.getNombre());
        System.out.println("Posicion X: " + cuadrado.getPosicionX());
        System.out.println("Posicion Y: " + cuadrado.getPosicionY());
        System.out.println("Color: "+ cuadrado.getColor());
        System.out.println("Lado: " + cuadrado.getLado());
        System.out.println("Area del cuadrado: " + cuadrado.calcularArea());
        System.out.println("Perimetro del cuadrado: " + cuadrado.calcularPerimetro());
    }
}
