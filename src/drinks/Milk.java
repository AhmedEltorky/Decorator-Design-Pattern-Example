package drinks;

import interfaces.IComponent;

/**
 *
 * @author Ahmed El-Torky
 */
public class Milk implements IComponent {

    private IComponent drink;

    public Milk(IComponent drink) {
        this.drink = drink;
    }

    @Override
    public double cost() {
        return 2 + drink.cost();
    }

    @Override
    public String description() {
        return drink.description() + ", Milk";
    }

}
