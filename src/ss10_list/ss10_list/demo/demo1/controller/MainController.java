package ss10_list.demo.demo1.controller;

import java.util.Scanner;

public class MainController {
    public static  void menuController(){
        StudentController studentController = new StudentController();
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Chào mừng các bạn đến với Codegym");
            System.out.println("1.Quản lý học sinh");
            System.out.println("2.Quản lý giảng viên");
            System.out.println("3.Thoát chương trình");
            System.out.print("Mời bạn nhập lựa chọn :");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:
                    studentController.menuStudent();
                    break;
                case 2:
                case 3:
                    System.exit(0);
            }
        }while (true);
    }
}
