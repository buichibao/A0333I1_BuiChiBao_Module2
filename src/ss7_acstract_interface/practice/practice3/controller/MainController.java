package ss7_acstract_interface.practice.practice3.controller;

import ss7_acstract_interface.practice.practice3.model.Circle;
import ss7_acstract_interface.practice.practice3.model.Rectangle;
import ss7_acstract_interface.practice.practice3.model.Resizeable;
import ss7_acstract_interface.practice.practice3.model.Shape;

public class MainController {
    public static void main(String[] args) {
        Shape shape [] = new Rectangle[2];
        shape[0] = new Rectangle();
        shape[1]= new Rectangle(2,2);
        Rectangle rectangle1 = (Rectangle)shape[0];
        Rectangle rectangle2 = (Rectangle)shape[1];
        shape[1] = new Rectangle(2,2);
        System.out.println("Diện tích trước khi đổi của hình chữ nhật");
        System.out.println(rectangle1.getArea());
        System.out.println("Diện tích sau khi tăng");
        rectangle1.resize(4);
    }
}
