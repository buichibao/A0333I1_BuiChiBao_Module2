package ss15_exception_debug.exercise.controller;

import ss15_exception_debug.exercise.model.Triangle;
import ss15_exception_debug.exercise.model.TriangleException;

import java.util.Scanner;

public class MainController {
    Scanner scanner = new Scanner(System.in);
    public void conditionToTriangle(){
        double a;
        double b;
        double c;
        do {
            try {
                System.out.println("Nhập cạnh thứ nhất :");
                a = Double.parseDouble(scanner.nextLine());
                System.out.println("Nhập cạnh thứ nhất :");
                b = Double.parseDouble(scanner.nextLine());
                System.out.println("Nhập cạnh thứ nhất :");
                c = Double.parseDouble(scanner.nextLine());
                Triangle triangle = new Triangle(a,b,c);
                System.out.println(triangle);
                break;
            }catch (NumberFormatException e){
                System.out.println(e.getMessage());
                System.out.println("Bạn phải nhập vào số nguyên , mời bạn nhật lại");
            }catch (TriangleException e){
                System.out.println(e.getMessage());
                System.out.println("Cạnh tam giác không thõa mãn mời bạn nhập lại");
            }

        }while (true);

    }
}
