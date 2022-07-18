package ss10_list.demo.demo2.service.ipml;

import ss10_list.demo.demo2.model.Student;
import ss10_list.demo.demo2.service.IPerson;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentService implements IPerson {
    private  List<Student> studentList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    @Override
    public void add() {
        Student student = inForStudent();
        studentList.add(student);
        System.out.println("Thêm học sinh mới thành công");
    }
    @Override
    public void remove() {
        if(studentList.size()==0){
            System.out.println("Danh sách học viên đang trống");
        }else {
            System.out.print("Nhập id của học viên cần xóa : ");
            int idRemove = Integer.parseInt(scanner.nextLine());
            boolean isFlag = false;
            for(Student student: studentList){
                if(student.getId()==idRemove){
                    System.out.println("Bạn có chắc chắn muốn xóa không ?");
                    System.out.println("1. Có");
                    System.out.println("2. Không");
                    int chooseYesNo = Integer.parseInt(scanner.nextLine());
                    if(chooseYesNo==1){
                        studentList.remove(student);
                        System.out.println("Xóa thành công!");
                    }
                    isFlag = true;
                    break;
                }
                if(!isFlag){
                    System.out.println("Không tìm thấy");
                }
            }
        }
    }

    @Override
    public void displayAll() {
        if (studentList.size() == 0) {
            System.out.println("Danh sách học viên đang trống");
        } else {
            for (Student student : studentList) {
                System.out.println(student);
            }
        }
    }
    public Student inForStudent(){
        System.out.print("Nhập id :");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập name :");
        String name = scanner.nextLine();
        System.out.print("Nhập ngày sinh");
        String  dateOfBirth = scanner.nextLine();
        System.out.print("Nhập giới tính");
        String  sex = scanner.nextLine();
        System.out.print("Nhập tên lớp : ");
        String classed = scanner.nextLine();
        System.out.print("Nhập điểm : ");
        double score = Double.parseDouble(scanner.nextLine());
        Student student = new Student(id,name,dateOfBirth,sex,classed,score);
        return student;
    }
}
