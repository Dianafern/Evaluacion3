package EjerciciosNivelInicial;

/**
 *
 * @author DIANA CONTRERAS u20232217593
 */
public class TestTriangulo {
    public static void main(String[] args) {
       Triangulo triangulo = new Triangulo(4,5);
        System.out.println("Triangulo 1");
        System.out.println("Base: "+ triangulo.getBase());
        System.out.println("Altura: "+ triangulo.getAltura());
        System.out.println("Area: "+ triangulo.area());
     
     triangulo.setBase(5);
     triangulo.setAltura(8);
    
        System.out.println("Triangulo 2");
        System.out.println("Base del triángulo: " + triangulo.getBase());
        System.out.println("Altura del triángulo: " + triangulo.getAltura());
        System.out.println("Área del triángulo: " + triangulo.area());
        
     triangulo.setBase(19);
     triangulo.setAltura(7);
     
     System.out.println("Triangulo 3");
        System.out.println("Base del triángulo: " + triangulo.getBase());
        System.out.println("Altura del triángulo: " + triangulo.getAltura());
        System.out.println("Área del triángulo: " + triangulo.area());
        
        
    }
}
