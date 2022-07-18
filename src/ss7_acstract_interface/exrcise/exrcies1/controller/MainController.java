package ss7_acstract_interface.exrcise.exrcies1.controller;

import ss7_acstract_interface.exrcise.exrcies1.model.Circle;
import ss7_acstract_interface.exrcise.exrcies1.model.Rectangle;
import ss7_acstract_interface.exrcise.exrcies1.model.Shape;

import java.util.Random;

public class MainController {
    public static void main(String[] args) {
        Shape []shapes = new Shape[3];
        shapes[0] = new Rectangle();
        shapes[1]= new Circle(3);
        shapes[2]= new Rectangle (10,10);
        Random random = new Random();
        Rectangle rectangle1 =  (Rectangle) shapes[0];
        System.out.println("Diện tích trước khi chưa thay đổi : "+rectangle1.getArea());
        System.out.println("Diện tích sau khi thay đổi ");
        rectangle1.resize(Math.random()*100);

        Circle circle = (Circle) shapes[1];
        System.out.println("Diện tích trước khi chưa thay đổi : "+circle.getArea());
        System.out.println("Diện tích sau khi thay đổi ");
        circle.resize(Math.random()*100);

    }
}
