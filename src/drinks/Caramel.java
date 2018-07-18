package drinks;

import interfaces.IComponent;

/**
 *
 * @author Ahmed El-Torky
 */
public class Caramel implements IComponent {

    private IComponent drink;

    public Caramel(IComponent drink) {
        this.drink = drink;
    }

    @Override
    public double cost() {
        return 4 + drink.cost();
    }

    @Override
    public String description() {
        return drink.description() + ", Caramel";
    }

}
