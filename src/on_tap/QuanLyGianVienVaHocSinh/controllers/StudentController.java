//package on_tap.QuanLyGianVienVaHocSinh.controllers;
//
//import on_tap.QuanLyGianVienVaHocSinh.exception.EnterException;
//import on_tap.QuanLyGianVienVaHocSinh.service.impl.StudentService;
//
//import java.util.Scanner;
//
//public class StudentController {
//    private static final Scanner SCANNER = new Scanner(System.in);
//    public static void menuStudent(){
//        StudentService studentService = new StudentService();
//        do{
//            try {
//                System.out.println("=====CHỨC NĂNG QUẢN LÝ HỌC VIÊN=====");
//                System.out.println("1.Thêm mới học viên");
//                System.out.println("2.Xóa học viên");
//                System.out.println("3.Xem danh sách học viên");
//                System.out.println("4.Quay lại menu chính");
//                System.out.print("Nhập chức năng bạn cần lựa chọn :");
//                int choose = Integer.parseInt(SCANNER.nextLine());
//                switch (choose){
//                    case 1:
//                        studentService.add();
//                        break;
//                    case 2:
//                        studentService.remove();
//                        break;
//                    case 3:
//                        studentService.disPlay();
//                        break;
//                    case 4:
//                        return;
//                    default:
//                        throw new EnterException("Bạn phải nhập số trong khoảng 1->4");
//                }
//            } catch (EnterException e) {
//                System.err.println(e.getMessage());
//            }catch (NumberFormatException e){
//                System.out.println("Bạn đang nhập kí tự ,bạn hãy nhập số");
//            }
//
//        }while (true);
//    }
//}
