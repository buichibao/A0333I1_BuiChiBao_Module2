package ss10_list.demo.demo2.service.ipml;


import ss10_list.demo.demo2.model.Teacher;
import ss10_list.demo.demo2.service.IPerson;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeacherService implements IPerson {
    private List<Teacher> teachers = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void findId() {
        boolean check = false;
        System.out.println("Nhập id cần tìm :");
        int idFind = Integer.parseInt(scanner.nextLine());
        for (Teacher teacher:teachers) {
            if(idFind==teacher.getId()){
                System.out.println(teacher);
                check = true;
                break;
            }
        }
        if(!check){
            System.out.println("Không có giảng viên có id "+idFind);
        }
    }
    @Override
    public void findName() {
       boolean check = false;
        System.out.print("Nhập tên :");
        String nameFind = scanner.nextLine();
        for (Teacher teacher:teachers) {
            if(teacher.getName().contains(nameFind)){
                System.out.println(teacher);
                check=true;
            }
        }
        if(!check){
            System.out.println("Không tồn tại giảng viên tên là "+nameFind);
        }
    }

    public void add() {
        Teacher teacher = inForTeacher();
        teachers.add(teacher);
        System.out.println("Thêm học sinh mới thành công");
    }

    @Override
    public void remove() {
        if(teachers.size()==0){
            System.out.println("Danh sách học viên đang trống");
        }else {
            System.out.print("Nhập id của học viên cần xóa : ");
            int idRemove = Integer.parseInt(scanner.nextLine());
            boolean isFlag = false;
            for(Teacher teacher: teachers){
                if(teacher.getId()==idRemove){
                    System.out.println("Bạn có chắc chắn muốn xóa không ?");
                    System.out.println("1. Có");
                    System.out.println("2. Không");
                    int chooseYesNo = Integer.parseInt(scanner.nextLine());
                    if(chooseYesNo==1){
                        teachers.remove(teacher);
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
        for (Teacher teacher: teachers) {
            System.out.println(teacher);
        }
    }
    public Teacher inForTeacher(){
//         id, String name, String dateOfBirth, String sex, String specialist
        System.out.println("Nhập id:");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên:");
        String name = scanner.nextLine();
        System.out.println("Nhập ngày sinh : ");
        String dateOfBirth = scanner.nextLine();
        System.out.println("Nhập giới tính :");
        String sex = scanner.nextLine();
        System.out.println("Nhập chuyên môn: ");
        String specialist = scanner.nextLine();
        Teacher teacher = new Teacher(id,name,dateOfBirth,sex,specialist);
         return  teacher;
    }
}
