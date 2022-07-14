package ss10_list.demo.demo1.service.impl;

import ss10_list.demo.demo1.model.Student;
import ss10_list.demo.demo1.service.IStudent;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentService implements IStudent {
    private  static List<Student> studentList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    @Override
    public void addStudent() {
//        Student student = inForStudent();
//        studentList.add(student);
        System.out.println("Thêm học sinh mới thành công");
    }
    @Override
    public void removeStudent() {
        if(studentList.size()==0){
            System.out.println("Danh sách học sinh đang trống");
        }else {
            System.out.print("Nhập id của học sinh cần xóa : ");
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
    public void displayAllStudent() {
        for (Student student: studentList) {
            System.out.println(student);
        }
    }
//    public  static Student inForStudent(){
//        System.out.print("Nhập id : ");
//        int id = Integer.parseInt(scanner.nextLine());
//        System.out.print("Nhập name :");
//        String name = scanner.nextLine();
//        System.out.print("Nhập ngày sinh");
//        String  dateOfBirth = scanner.nextLine();
//        System.out.print("Nhập điểm : ");
//        int point = Integer.parseInt(scanner.nextLine());
//        System.out.print("Nhập tên trường : ");
//        String nameSchool = scanner.nextLine();
////        Student student = new Student(id,name,dateOfBirth,point,nameSchool);
//        return student;
//    }
}
