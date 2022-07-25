package case_study.controller;

import java.util.Scanner;

public class EmployeeManagementController {
    public static void menuEmployeeManagement(){
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("=====Menu Employee Management=====");
            System.out.println("1. Display list employees");
            System.out.println("2. Add new employee");
            System.out.println("3 Edit employee");
            System.out.println("4. Return main menu");
            System.out.print("Nhập chức năng bạn muốn chọn ");
            int choose = Integer.parseInt(scanner.nextLine());
            if(choose<1||choose>4){
                System.out.println("Không có chức năng này mời bạn nhập lại!!");
                continue;
            }
            switch (choose){
                case 1:
                case 2:
                case 3:
                case 4:
                    return;
            }
        }while (true);

    }
}
