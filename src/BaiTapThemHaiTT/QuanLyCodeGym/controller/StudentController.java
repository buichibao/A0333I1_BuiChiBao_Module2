package BaiTapThemHaiTT.QuanLyCodeGym.controller;

import BaiTapThemHaiTT.QuanLyCodeGym.service.impl.StudentService;
import BaiTapThemHaiTT.QuanLyCodeGym.service.impl.TeacherService;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class StudentController {
      public void menuStudent (){
          Scanner scanner = new Scanner(System.in);
          StudentService studentService = new StudentService();
          do {
              System.out.println("****************CHỨC NĂNG QUẢN LÝ HỌC VIÊN**********************");
              System.out.println("1.Thêm học viên mới");
              System.out.println("2.Hiển thị danh sách học viên");
              System.out.println("3.Xóa học viên theo ID");
              System.out.println("4.Tìm kiếm học viên theo tên");
              System.out.println("5.Tìm kiếm học viên theo id");
              System.out.println("6.Sắp xếp học viên theo theo tên");
              System.out.println("7.Quay lại menu chính");
              System.out.print("Mời bạn chọn chức năng :");
              int choose = Integer.parseInt(scanner.nextLine());
              if(choose<1||choose>7){
                  System.out.println("Không có chức năng này , mời bạn nhập lại!!!");
                  continue;
              }
              switch (choose){
                  case 1:
                  case 2:
                  case 3:
                  case 4:
                  case 5:
                  case 6:
                  case 7:
                      return;
              }
          }while (true);

      }
}
