package case_study.controller;

import case_study.service.impl.EmployeeService;

import java.util.Scanner;

public class EmployeeManagementController {
    public static void menuEmployeeManagement(){
        EmployeeService employeeService = new EmployeeService();
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
                    employeeService.disPlay();
                    break;
                case 2:
                    employeeService.add();
                    break;
                case 3:
                    employeeService.edit();
                    break;
                case 4:
                    return;
            }
        }while (true);

    }
}
