package ss7_acstract_interface.demo.animal.controller;

import ss7_acstract_interface.demo.animal.model.Animal;
import ss7_acstract_interface.demo.animal.model.BabyDog;

public class MainController {
    public static void main(String[] args) {
//        Animal animal = new Dog(); lỗi do lớp dog là abstract nên không thể tạo ra đối tượng được
        Animal animal = new BabyDog();
        animal.run();
        animal.eat();
    }
}
