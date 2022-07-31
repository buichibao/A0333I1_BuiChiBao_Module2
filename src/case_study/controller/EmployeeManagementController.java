package case_study.controller;

import case_study.Exception.EnterException;
import case_study.service.impl.EmployeeService;

import java.util.Scanner;

public class EmployeeManagementController {
    public static void menuEmployeeManagement(){
        EmployeeService employeeService = new EmployeeService();
        Scanner scanner = new Scanner(System.in);
        do {
            try {
                System.out.println("=====Quản lý nhân viên=====");
                System.out.println("1. Hiển thị danh sách nhân viên");
                System.out.println("2. Thêm nhân viên ");
                System.out.println("3 Sửa thông tin nhân viên");
                System.out.println("4. Trở về menu chính");
                System.out.print("Nhập chức năng bạn muốn chọn ");
                int choose = Integer.parseInt(scanner.nextLine());

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
                    default:
                        throw new EnterException("Bạn phải nhập số 1->4");
                }
            } catch (EnterException e) {
                System.out.println(e.getMessage());
            }catch (NumberFormatException e){
                System.out.println("Bạn đang nhập kí tự , hãy nhập số");
            }

        }while (true);

    }
}
