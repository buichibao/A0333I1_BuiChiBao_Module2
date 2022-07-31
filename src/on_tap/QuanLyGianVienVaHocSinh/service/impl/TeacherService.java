//package on_tap.QuanLyGianVienVaHocSinh.service.impl;
//
//import on_tap.QuanLyGianVienVaHocSinh.model.Person;
//import on_tap.QuanLyGianVienVaHocSinh.model.Teacher;
//import on_tap.QuanLyGianVienVaHocSinh.service.IPersonService;
//import on_tap.QuanLyGianVienVaHocSinh.utils.ReadWriteFileStudent;
//import on_tap.QuanLyGianVienVaHocSinh.utils.ReadWriteFileTeacher;
//
//import java.util.List;
//import java.util.Scanner;
//
//public class TeacherService implements IPersonService {
//    private static final Scanner SCANNER = new Scanner(System.in);
//    private static final String PATH = "src\\on_tap\\QuanLyGianVienVaHocSinh\\data\\person.csv";
//
//    @Override
//    public void add() {
//        List<Person> personList = ReadWriteFileStudent.readFileStudent(PATH);
//        Person person = enterInfor();
//        personList.add(person);
//        System.out.println("Thêm giảng viên mới thàng công");
//        ReadWriteFileStudent.writeFileStudent(PATH,personList);
//    }
//
//    @Override
//    public void remove() {
//        List<Person> teacherList = ReadWriteFileStudent.readFileStudent(PATH);
//        boolean check = false;
//        int idFind;
//        if (teacherList.isEmpty()) {
//            System.out.println("Danh sách giảng viên dang rỗng");
//        } else {
//            System.out.println("Nhập id giảng viên cần xóa");
//            idFind = Integer.parseInt(SCANNER.nextLine());
//            for (Teacher teacher : teacherList) {
//                if (teacher.getId() == idFind) {
//                    System.out.println("Bạn có muốn xóa giảng viên này không ?");
//                    System.out.println("1.Có");
//                    System.out.println("2.Không");
//                    System.out.print("Nhập lựa chọn của bạn :");
//                    int chooseYesNo = Integer.parseInt(SCANNER.nextLine());
//                    if (chooseYesNo == 1) {
//                        teacherList.remove(teacher);
//                        ReadWriteFileTeacher.writeFileTeacher(PATH, teacherList);
//                        check = true;
//                        System.out.println("Xóa thành công giảng viên");
//                        break;
//                    } else {
//                        check = true;
//                        break;
//                    }
//                }
//            }
//            if (!check) {
//                System.out.println("Không tìm thấy giảng viên có id " + idFind);
//            }
//        }
//    }
//
//    @Override
//    public void disPlay() {
//        List<Teacher> teacherList = ReadWriteFileTeacher.readFileTeacher(PATH);
//        if (teacherList.isEmpty()) {
//            System.out.println("Danh sách giảng viên dang rỗng");
//        } else {
//            for (Teacher teacher : teacherList) {
//                System.out.println(teacher);
//            }
//        }
//    }
//
//    public Teacher enterInfor() {
//        int id;
//        String name;
//        String dateOfBirth;
//        String sex;
//        String specialist;
//        System.out.print("Nhập mã giảng viên:");
//        id = Integer.parseInt(SCANNER.nextLine());
//
//        System.out.print("Nhập tên giảng viên:");
//        name = SCANNER.nextLine();
//
//        System.out.print("Nhập ngày sinh giảng viên:");
//        dateOfBirth = SCANNER.nextLine();
//
//        System.out.print("Nhập giới tính :");
//        sex = SCANNER.nextLine();
//
//        System.out.print("Nhập chuyên môn :");
//        specialist = SCANNER.nextLine();
//
//        return new Teacher(id, name, dateOfBirth, sex, specialist);
//    }
//}
