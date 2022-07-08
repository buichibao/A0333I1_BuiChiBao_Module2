package ss6_inheritance.exrcise.exercise1.controller;

import ss6_inheritance.exrcise.exercise1.model.Circle;
import ss6_inheritance.exrcise.exercise1.model.Cylinder;

public class MainController {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(10.5, "red");
        System.out.println(circle);

        System.out.print(" Lấy ra thông số bán kính của Circle : ");
        System.out.println(circle.getRadius());

        System.out.print("Thay đổi màu sắc của Cricle :");
        circle.setColor("blue");
        System.out.print(circle.getColor());

        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);

        cylinder = new Cylinder(3);
        System.out.println(cylinder);

        cylinder = new Cylinder(3,"Green",4);
        System.out.println(cylinder);

        System.out.print("Lấy ra thông số bán kính của cylider");
        System.out.print(cylinder.getRadius());//vì cylinder kế thừa từ circle, nên getRadius có thể dùng


        System.out.print("Thay đổi màu sắc của Cylider ");
        cylinder.setColor("yellow");
        System.out.println(cylinder.getColor());


    }
}
