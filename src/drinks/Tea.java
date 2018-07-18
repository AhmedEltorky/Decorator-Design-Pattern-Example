package drinks;

import interfaces.IComponent;

/**
 *
 * @author Ahmed El-Torky
 */
public class Tea implements IComponent {

    @Override
    public double cost() {
        return 3;
    }

    @Override
    public String description() {
        return "Tea";
    }

}
