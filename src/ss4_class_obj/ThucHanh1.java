//package ss4_class_obj;
//
//import java.util.Scanner;
//
//public class ThucHanh1 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the width");
//        double width = scanner.nextDouble();
//        System.out.println("Enter the height");
//        double height = scanner.nextDouble();
//        Rectangle rectangle = new Rectangle(width, height);
//        System.out.println("Your Rectangle \n"+ rectangle.display());
//        System.out.println("Perimeter of the Rectangle: "+ rectangle.getPerimeter());
//        System.out.println("Area of the Rectangle: "+ rectangle.getArea());
//       }
//
//    }
//
//    public class Rectangle {
//        double width, height;
//
//        public Rectangle() {
//
//        }
//
//        public Rectangle(double width, double height) {
//            this.width = width;
//            this.height = height;
//        }
//
//        public double getArea() {
//            return this.width * this.height;
//        }
//
//        public double getPerimeter() {
//            return 2 * (this.height + this.width);
//        }
//
//        public String disPlay() {
//            return "Rectangle { " + this.width + " ," + this.height + "}";
//        }
//}
//
//
