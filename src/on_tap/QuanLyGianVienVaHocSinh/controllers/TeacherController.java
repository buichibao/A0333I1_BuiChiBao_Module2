//package on_tap.QuanLyGianVienVaHocSinh.controllers;
//
//import on_tap.QuanLyGianVienVaHocSinh.exception.EnterException;
//import on_tap.QuanLyGianVienVaHocSinh.service.impl.TeacherService;
//
//import java.util.Scanner;
//
//public class TeacherController {
//    private static final Scanner SCANNER = new Scanner(System.in);
//
//    public static void menuTeacher() {
//        TeacherService teacherService = new TeacherService();
//        do {
//            try {
//                System.out.println("=====CHỨC NĂNG QUẢN LÝ GIẢNG VIÊN=====");
//                System.out.println("1.Thêm mới giảng viên");
//                System.out.println("2.Xóa giảng viên");
//                System.out.println("3.Xem danh sách giảng viên");
//                System.out.println("4.Quay lại menu chính");
//                System.out.print("Nhập chức năng bạn cần lựa chọn :");
//                int choose = Integer.parseInt(SCANNER.nextLine());
//                switch (choose) {
//                    case 1:
//                        teacherService.add();
//                        break;
//                    case 2:
//                        teacherService.remove();
//
//                        break;
//                    case 3:
//                        teacherService.disPlay();
//                        break;
//                    case 4:
//                        return;
//                    default:
//                        throw new EnterException("Bạn phải nhập số trong khoảng 1->4");
//                }
//            } catch (EnterException e) {
//                System.err.println(e.getMessage());
//            } catch (NumberFormatException e) {
//                System.out.println("Bạn đang nhập kí tự ,bạn hãy nhập số");
//            }
//
//        } while (true);
//    }
//}
