package ss10_list.demo.demo2.controller;



import java.util.Scanner;
public class MainController {
   private  Scanner scanner = new Scanner(System.in);
   StudentController studentController = new StudentController();
   TeacherController teacherController = new TeacherController();
   public void displayMenu(){
       do{
           System.out.println("CHƯƠNG TRÌNH QUẢN LÝ GIẢNG VIÊN VÀ HỌC VIÊN  CODEGYM");
           System.out.println("1. Quản lý giảng viên");
           System.out.println("2.Quản lý học viên");
           System.out.println("3. Thoát");
           System.out.print("Mời bạn chọn chức năng :");
           int choose = Integer.parseInt(scanner.nextLine());
           switch (choose){
               case 1:
                   teacherController.menuTeacher();
                   break;
               case 2:
                   studentController.menuStudent();
                   break;
               case 3:
                   System.exit(0);
           }
       }while (true);
   }
}
