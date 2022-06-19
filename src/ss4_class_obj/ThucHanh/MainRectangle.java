package ss4_class_obj.ThucHanh;

import java.util.Scanner;

public class MainRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter width");
        double width = sc.nextDouble();
        System.out.println("Enter height");
        double height = sc.nextDouble();
        Rectangle rectangle = new Rectangle(width,height);
        System.out.println("My Rectangle "+rectangle.disPlay());
        System.out.println("Perimeter of te Rectangle : "+rectangle.getPerimeter());
        System.out.println("Area of the Rectangle "+rectangle.getArea());
    }
}
