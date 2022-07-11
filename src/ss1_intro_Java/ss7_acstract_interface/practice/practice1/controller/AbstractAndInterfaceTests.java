package ss7_acstract_interface.practice.practice1.controller;

import ss7_acstract_interface.practice.practice1.model.animal.Animal;
import ss7_acstract_interface.practice.practice1.model.animal.Chicken;
import ss7_acstract_interface.practice.practice1.model.animal.Tiger;
import ss7_acstract_interface.practice.practice1.model.edible.Edible;
import ss7_acstract_interface.practice.practice1.model.fruit.Apple;
import ss7_acstract_interface.practice.practice1.model.fruit.Fruit;
import ss7_acstract_interface.practice.practice1.model.fruit.Orange;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());
            if (animal instanceof Chicken) {
                Edible edible = (Chicken) animal;
                System.out.println(edible.howToEat());
            }
        }
        Fruit fruits[] = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }

    }
}
