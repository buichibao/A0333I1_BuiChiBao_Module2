package ss6_inheritance.practice.practice1.controller;

import ss6_inheritance.practice.practice1.model.Circle;
import ss6_inheritance.practice.practice1.model.Rectangle;
import ss6_inheritance.practice.practice1.model.Square;

public class MainController {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        square = new Square(2.3);
        System.out.println(square);

        square = new Square("yellow",false,5.8);
        System.out.println(square);

        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(2.3, 5.8);
        System.out.println(rectangle);

        rectangle = new Rectangle("red", false, 5, 6);
        System.out.println(rectangle);

        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle("indigo",true,3);
        System.out.println(circle);
    }
}
