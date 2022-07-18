package ss5_access_modifier_static_get_set.demoAnimal;

import ss5_access_modifier_static_get_set.thuchanh.Car.Car;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(cat.weight);
        cat.eat();
        System.out.println(cat.toString());
    }
}
