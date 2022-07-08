package ss6_inheritance.exrcise.exercise2.controller;

import ss6_inheritance.exrcise.exercise2.model.Point2D;
import ss6_inheritance.exrcise.exercise2.model.Point3D;

import java.util.Arrays;

public class MainController {
    public static void main(String[] args) {
        //Test lớp Point3D
        Point2D point2D = new Point2D();
        System.out.println(point2D);

        point2D = new Point2D(1,2);
        System.out.println(point2D);

        System.out.print("thay đối giá trị  x của point2D :");
        point2D.setX(2);
        System.out.println(point2D);

        System.out.println("Lấy ra giá trị y của point2D :"+point2D.getY());
        //Test lớp Point3D
        Point3D point3D = new Point3D();
        System.out.println(point3D);

        point3D = new Point3D(1,2,3);
        System.out.println(point3D);


        System.out.print("Thay đổi gái trị của x,y : ");
        point3D.setXY(3,3);
        System.out.println(point3D);

        Point3D point3D1 = new Point3D();
        point3D1.setXYZ(9,9,9);
        System.out.println(point3D1);

        System.out.print("Thay đổi gái trị của x,y,z : ");
        point3D1.setXYZ(8,8,8);
        System.out.print(Arrays.toString(point3D1.getXYZ()));

        //bổ sung equals


    }
}
