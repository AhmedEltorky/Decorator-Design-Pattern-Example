package decoratordesignpattern;

import drinks.*;
import interfaces.IComponent;

/**
 *
 * @author Ahmed El-Torky
 */
public class DecoratorDesignPattern {

    public static void main(String[] args) {
        
        IComponent order1 = new Tea();
        order1 = new Milk(order1);
        order1 = new Milk(order1);
        System.out.println(order1.description() + " $" + order1.cost());
        
        IComponent order2 = new Coffee();
        order2 = new Milk(order2);
        order2 = new Caramel(order2);
        System.out.println(order2.description() + " $" + order2.cost());
        
    }

}
