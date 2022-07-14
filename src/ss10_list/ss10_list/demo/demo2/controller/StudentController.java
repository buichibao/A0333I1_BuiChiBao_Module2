package ss10_list.demo.demo2.controller;

import ss10_list.demo.demo2.service.IPerson;
import ss10_list.demo.demo2.service.ipml.StudentService;

import java.util.Scanner;

public class StudentController {
    private Scanner scanner = new Scanner(System.in);
    StudentService studentService = new StudentService();
    public void menuStudent(){
        do {
            System.out.println("BẠN MUỐN ");
            System.out.println("1.Thêm học viên mới");
            System.out.println("2.Xóa học viên");
            System.out.println("3.Hiện thị danh sách học viên");
            System.out.println("4.Quay lại menu chính");
            System.out.println("Nhập chức năng bạn muốn :");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:
                     studentService.add();
                     break;
                case 2:
                    studentService.remove();
                    break;
                case 3:
                    studentService.displayAll();
                    break;
                case 4:
                    return;
            }
        }while (true);
    }
}
