package BaiTapThemHaiTT.QuanLyCodeGym.service.impl;

import BaiTapThemHaiTT.QuanLyCodeGym.model.Teacher;
import BaiTapThemHaiTT.QuanLyCodeGym.utils.ReadWriteTeacherFile;

import java.util.*;

public class TeacherService extends PersonService{

    private static final Scanner SCANNER = new Scanner(System.in);
    private static final String PATH = "src\\BaiTapThemHaiTT\\QuanLyCodeGym\\data\\teacher.txt";

    @Override
    public void addElement() {
        List<Teacher> teacherList = ReadWriteTeacherFile.readTeacherFile(PATH);

    }

    @Override
    public void disPlay() {

    }

    @Override
    public void removeById() {

    }

    @Override
    public void findId() {

    }

    @Override
    public void findName() {

    }

    @Override
    public void sortByName() {

    }
    public  static  Teacher inforTeacher(){
        List<Teacher> teacherList = ReadWriteTeacherFile.readTeacherFile(PATH);
        return null;
    }
}