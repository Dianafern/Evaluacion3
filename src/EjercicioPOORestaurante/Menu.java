
package EjercicioPOORestaurante;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dc558
 */
public class Menu {
    private List<IFastFood> elementos;

    public Menu() {
    this.elementos = new ArrayList<>();
    }

    public void setElementos(List<IFastFood> elementos) {
        this.elementos = elementos;
    }

    public List<IFastFood> getElementos() {
        return elementos;
    }
    
}
