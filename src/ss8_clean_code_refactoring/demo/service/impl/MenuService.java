package ss8_clean_code_refactoring.demo.service.impl;

import ss8_clean_code_refactoring.demo.model.Person;
import ss8_clean_code_refactoring.demo.model.Student;
import ss8_clean_code_refactoring.demo.model.Teacher;
import ss8_clean_code_refactoring.demo.service.IMenuService;
import ss8_clean_code_refactoring.demo.service.IPersonService;
import ss8_clean_code_refactoring.demo.service.IStudentService;
import ss8_clean_code_refactoring.demo.service.ITeacherService;

import java.util.Scanner;

public class MenuService  implements IMenuService {
    Scanner scanner = new Scanner(System.in);
    @Override
    public  void BigMenu() {
        int choose;
        do {
            System.out.println("======Menu======");
            System.out.println("1.Thêm mới");
            System.out.println("2.Hiểm thị danh sách");
            System.out.println("3.Chỉnh sửa");
            System.out.println("4.Delete");
            System.out.println("5.Thoát");
            System.out.println("Nhập lựa chọn của bạn : ");
            choose = Integer.parseInt(scanner.nextLine());
            if (choose < 1 || choose > 5) {
                System.out.println("Lựa chọn không hợp lệ , hãy chọn lại");
                continue;
            }
            switch (choose) {
                case 1:
                    break;
                case 2:
                     smallMenu();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.exit(0);

            }
        } while (true);
    }

    @Override
    public  void smallMenu() {
        int choose;
        do {
            System.out.println("Bạn muốn ");
            System.out.println("1.Hiển thị tất cả danh sách");
            System.out.println("2.Hiển thị Sinh viên");
            System.out.println("3.Hiển thị giáo viên");
            System.out.println("4.Thoát");
            System.out.println("Nhập sự lựa chọn của bạn :");
            choose = Integer.parseInt(scanner.nextLine());
            if (choose < 1 || choose > 4) {
                System.out.println("Lựa chọn không hợp lệ , mời nhập lại :");
                continue;
            }
            switch (choose){
                case 1:

                    for (int i = 0; i <PersonService.count ; i++) {
                        System.out.println(PersonService.people[i]);
                    }
                    break;
                case 2:
                    for (int i = 0; i <PersonService.count ; i++) {
                        if(PersonService.people[i] instanceof  Student){
                            System.out.println(PersonService.people[i]);
                        }
                    }
                    break;
                case 3:
                    for (int i = 0; i <PersonService.count ; i++) {
                        if(PersonService.people[i] instanceof Teacher){
                            System.out.println(PersonService.people[i]);
                        }

                    }
                    break;
                case 4:
                    System.exit(0);
            }
        } while (true);
    }
}
