//package on_tap.QuanLyGianVienVaHocSinh.controllers;
//
//
//
//import on_tap.QuanLyGianVienVaHocSinh.exception.EnterException;
//
//import java.util.Scanner;
//
//public class MainController {
//    private static final Scanner SCANNER = new Scanner(System.in);
//    public static  void menuCodeGym(){
//        do{
//            try {
//                System.out.println("CHÀO MỪNG BẠN ĐẾN VỚI CHƯƠNG TRÌNH QUẢN LÝ CODEGYM");
//                System.out.println("1.Quản lý giảng viên");
//                System.out.println("2.Quản lý học viên");
//                System.out.println("3.Exit");
//                System.out.print("Nhập chức năng bạn muốn sử dụng :");
//                int choose = Integer.parseInt(SCANNER.nextLine());
//                switch (choose){
//                    case 1:
//                        TeacherController.menuTeacher();
//                        break;
//                    case 2:
//                        StudentController.menuStudent();
//                        break;
//                    case 3:
//                        System.exit(0);
//                    default:
//                      throw  new EnterException("Bạn phải nhập số từ 1->3");
//                }
//            }catch (EnterException e) {
//                System.err.println(e.getMessage());
//            }catch (NumberFormatException e){
//                System.err.println("Bạn đang nhập kí tự, bạn hãy nhật số ");
//            }
//
//        }while (true);
//    }
//}
