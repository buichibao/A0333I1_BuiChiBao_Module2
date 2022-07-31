//package on_tap.QuanLyGianVienVaHocSinh.service.impl;
//
//
//import on_tap.QuanLyGianVienVaHocSinh.model.Person;
//import on_tap.QuanLyGianVienVaHocSinh.model.Student;
//import on_tap.QuanLyGianVienVaHocSinh.service.IPersonService;
//import on_tap.QuanLyGianVienVaHocSinh.utils.ReadWriteFileStudent;
//
//import java.util.List;
//import java.util.Scanner;
//
//public class StudentService implements IPersonService {
//    private static final Scanner SCANNER = new Scanner(System.in);
//    private static final String PATH = "src\\on_tap\\QuanLyGianVienVaHocSinh\\data\\person.csv";
//
//    @Override
//    public void add() {
//        List<Person> personList = ReadWriteFileStudent.readFileStudent(PATH);
//        Person person = enterInfor();
//        personList.add(person);
//        System.out.println("Thêm học viên mới thàng công");
//        ReadWriteFileStudent.writeFileStudent(PATH,personList);
//    }
//
//    @Override
//    public void remove() {
//        List<Person> personList = ReadWriteFileStudent.readFileStudent(PATH);
//        boolean check = false;
//        int idFind;
//        if(personList.isEmpty()){
//            System.out.println("Danh sách học viên dang rỗng");
//        }else{
//            System.out.println("Nhập id học viên cần xóa");
//            idFind =Integer.parseInt(SCANNER.nextLine());
//            for (Person student:personList) {
//                if(student.getId()==idFind){
//                    System.out.println("Bạn có muốn xóa học viên này không ?");
//                    System.out.println("1.Có");
//                    System.out.println("2.Không");
//                    System.out.print("Nhập lựa chọn của bạn :");
//                    int chooseYesNo = Integer.parseInt(SCANNER.nextLine());
//                    if(chooseYesNo==1) {
//                        personList.remove(student);
//                        ReadWriteFileStudent.writeFileStudent(PATH,personList);
//                        check = true;
//                        System.out.println("Xóa thành công học viên");
//                        break;
//                    }else {
//                        check =true;
//                        break;
//                    }
//                }
//            }if(!check){
//                System.out.println("Không tìm thấy học viên có id "+idFind);
//            }
//        }
//    }
//
//    @Override
//    public void disPlay() {
//        List<Person> personList = ReadWriteFileStudent.readFileStudent(PATH);
//        if(personList.isEmpty()){
//            System.out.println("Danh sách học viên dang rỗng");
//        }else{
//            for (Person student:personList) {
//                System.out.println(student);
//            }
//        }
//    }
//    public Student enterInfor(){
//        int id;
//        String name;
//        String dateOfBirth;
//        String sex;
//        String className;
//        String score;
//        System.out.print("Nhập mã học viên:");
//        id = Integer.parseInt(SCANNER.nextLine());
//
//        System.out.print("Nhập tên học viên :");
//        name = SCANNER.nextLine();
//
//        System.out.print("Nhập ngày sinh học viên :");
//        dateOfBirth = SCANNER.nextLine();
//
//        System.out.print("Nhập giới tính :");
//        sex = SCANNER.nextLine();
//
//        System.out.print("Nhập tên lớp :");
//        className = SCANNER.nextLine();
//
//        System.out.print("Nhập điểm :");
//        score = SCANNER.nextLine();
//
//        return new Student(id,name,dateOfBirth,sex,className,score);
//    }
//}
