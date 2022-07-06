package ss4_class_object.ThucHanh;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập chiều dài");
        double width = sc.nextDouble();
        System.out.println("Nhập chiều rộng");
        double height = sc.nextDouble();

        Rectangle rectangle = new Rectangle(width,height);

        System.out.println(rectangle.disPlay());
        System.out.println("Diện tích hình chữ nhật là "+rectangle.getArea());
        System.out.println("Chu vi hình chữ nhật là :"+rectangle.getPerimeter());


    }

}
