package ss10_list.demo.demo1.controller;

import ss10_list.demo.demo1.service.IStudent;
import ss10_list.demo.demo1.service.impl.StudentService;

import java.util.Scanner;

public class StudentController {
    private Scanner scanner = new Scanner(System.in);
    private IStudent iStudent = new StudentService();
    public void menuStudent(){
        do {
            System.out.println("1.Thêm học sinh mới");
            System.out.println("2.Xóa học sinh");
            System.out.println("3.Hiển thị danh sách học sinh");
            System.out.println("4.Quay về menu chính");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    iStudent.addStudent();
                    break;
                case 2:
                    iStudent.removeStudent();
                    break;
                case 3:
                    iStudent.displayAllStudent();
                case 4:
                    return;
            }
        }while (true);
    }
}
