package ss7_acstract_interface.practice.practice1.model.animal;

import ss7_acstract_interface.practice.practice1.model.edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken : cluck-cluck!";
    }

    @Override
    public String howToEat() {
        return "Chicken eating";
    }
}
