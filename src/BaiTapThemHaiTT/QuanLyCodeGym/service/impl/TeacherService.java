package BaiTapThemHaiTT.QuanLyCodeGym.service.impl;

import BaiTapThemHaiTT.QuanLyCodeGym.model.Teacher;
import BaiTapThemHaiTT.QuanLyCodeGym.utils.ReadWriteTeacherFile;

import java.util.*;
import java.util.zip.DataFormatException;

public class TeacherService extends PersonService{

    private static final Scanner SCANNER = new Scanner(System.in);
    static final String PATH = "src\\BaiTapThemHaiTT\\QuanLyCodeGym\\data\\teacher.csv";
    private static String Date ="[0-9]{1,2}/[0-9]{1,2}/[0-9]{4}";

    @Override
    public void addElement() {
        List<Teacher> teacherList = ReadWriteTeacherFile.readFileTeacher(PATH);
        Teacher teacher = inforTeacher();
        teacherList.add(teacher);
        ReadWriteTeacherFile.writeFileTeacher(PATH,teacherList);
        System.out.println("Thêm thành công");
    }

    @Override
    public void disPlay() {
       List<Teacher> teacherList = ReadWriteTeacherFile.readFileTeacher(PATH);
       if(teacherList.isEmpty()){
           System.out.println("Danh sách giảng viên rổng");
       }else{
           for (Teacher teacher:teacherList) {
               System.out.println(teacher);
           }
       }
    }

    @Override
    public void removeById() {
        List<Teacher> teacherList = ReadWriteTeacherFile.readFileTeacher(PATH);
        if(teacherList.isEmpty()){
            System.out.println("Danh sách giảng viên trống");
        }else{
            System.out.print("Nhập id của giảng viên bạn muốn xóa :");
            String idRemove = SCANNER.nextLine();
            boolean check = false;
            for (Teacher teacher:teacherList) {
                if(teacher.getId().equals(idRemove)){
                    System.out.println("Bạn có chắc chắn xóa giảng viên có id "+idRemove+ " là "+ teacher +"không ??");
                    System.out.println("1.Có");
                    System.out.println("2.Không");
                    System.out.print("Nhập lựa chọn của bạn : ");
                    int chooseYesNo = Integer.parseInt(SCANNER.nextLine());
                    if(chooseYesNo==1){
                        teacherList.remove(teacher);
                        ReadWriteTeacherFile.writeFileTeacher(PATH,teacherList);
                        break;
                    }
                }
            }
            if(!check){
                System.out.println("Không thấy giảng viên có id là "+idRemove);
            }
        }
    }

    @Override
    public void findId() {
        List<Teacher> teacherList = ReadWriteTeacherFile.readFileTeacher(PATH);
        if(teacherList.isEmpty()){
            System.out.println("Danh sách đang trống");
        }else{
            boolean check = false;
            System.out.print("Nhập id cần kiếm :");
            String idFind = SCANNER.nextLine();
            for (Teacher teacher:teacherList) {
                if(teacher.getId().equals(idFind)){
                    System.out.println("Giảng viên có id "+idFind+" là :");
                    System.out.println(teacher);
                    check = true;
                    break;
                }
            }
            if(!check){
                System.out.println("Không tìm thấy giảng viên có id "+idFind);
            }
        }
    }

    @Override
    public void findName() {
        List<Teacher> teacherList = ReadWriteTeacherFile.readFileTeacher(PATH);
        boolean check = false;
        if(teacherList.isEmpty()){
            System.out.println("Danh sách giảng viên đang trống");
        }else {
            System.out.print("Nhập tên bạn cần tìm kiếm :");
            String nameFind = SCANNER.nextLine();
            for (Teacher teacher:teacherList) {
                if(teacher.getName().toLowerCase().contains(nameFind.toLowerCase())){
                    System.out.println(teacher);
                }
            }
            if(!check){
                System.out.println("Không tìm thấy tên bạn vừa nhập");
            }
        }
    }

    @Override
    public void sortByName() {
        List<Teacher> teacherList = ReadWriteTeacherFile.readFileTeacher(PATH);
        if(teacherList.isEmpty()){
            System.out.println("Danh sách đang trống");
        }else {
            Collections.sort(teacherList);
            ReadWriteTeacherFile.writeFileTeacher(PATH,teacherList);
        }
    }
    public  static  Teacher inforTeacher(){
        System.out.print("Nhập id giảng viên :");
        String id = SCANNER.nextLine();

        System.out.print("Nhập tên giảng viên :");
        String name = SCANNER.nextLine();
        String dateOfBirth;
        do {
            try {
                System.out.println("Nhập ngày sinh giảng viên :");
                 dateOfBirth =SCANNER.nextLine();
                if(dateOfBirth.matches(Date)){
                    break;
                }else {
                    throw  new DataFormatException("Bạn đã nhập sai mời nhập lại");
                }
            } catch (DataFormatException e) {
                System.out.println(e.getMessage());
            }
        }while (true);


        System.out.print("Nhập giới tính giảng viên :");
        String sex =SCANNER.nextLine();

        System.out.print("Nhập chuyên mô của giảng viên :");
        String specialist =SCANNER.nextLine();

        return new Teacher(id,name,dateOfBirth,sex,specialist);
    }
}