package ss10_list.demo.demo2.service.ipml;

import ss10_list.demo.demo1.model.Student;
import ss10_list.demo.demo2.model.Teacher;
import ss10_list.demo.demo2.service.IPerson;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeacherService implements IPerson {
    private List<Teacher> teacherList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    public void add() {
//        Teacher teacher = inForTeacher();
//        teacherList.add(teacher);
        System.out.println("Thêm học sinh mới thành công");
    }

    @Override
    public void remove() {
        if(teacherList.size()==0){
            System.out.println("Danh sách học viên đang trống");
        }else {
            System.out.print("Nhập id của học viên cần xóa : ");
            int idRemove = Integer.parseInt(scanner.nextLine());
            boolean isFlag = false;
            for(Teacher teacher: teacherList){
                if(teacher.getId()==idRemove){
                    System.out.println("Bạn có chắc chắn muốn xóa không ?");
                    System.out.println("1. Có");
                    System.out.println("2. Không");
                    int chooseYesNo = Integer.parseInt(scanner.nextLine());
                    if(chooseYesNo==1){
                        teacherList.remove(teacher);
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
        for (Teacher teacher: teacherList) {
            System.out.println(teacher);
        }
    }
    public void inForTeacher(){
        System.out.println("Nhập");
    }
}
