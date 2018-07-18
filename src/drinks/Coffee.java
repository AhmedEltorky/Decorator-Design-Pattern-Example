package drinks;

import interfaces.IComponent;

/**
 *
 * @author Ahmed El-Torky
 */
public class Coffee implements IComponent {

    @Override
    public double cost() {
        return 5;
    }

    @Override
    public String description() {
        return "Coffee";
    }

}
