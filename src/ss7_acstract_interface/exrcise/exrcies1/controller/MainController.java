package ss7_acstract_interface.exrcise.exrcies1.controller;

import ss7_acstract_interface.exrcise.exrcies1.model.Circle;
import ss7_acstract_interface.exrcise.exrcies1.model.Rectangle;

public class MainController {
    public static void main(String[] args) {
//        Circle circle = new Circle(3);
//        System.out.println("Diện tích trước khi chưa thay đổi là :" + circle.getArea());
//        circle.resize(5);
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle.getArea());
        rectangle.resize(3);
    }
}
