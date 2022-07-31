//package on_tap.QuanLyGianVienVaHocSinh.utils;
//
//
//
//import on_tap.QuanLyGianVienVaHocSinh.model.Person;
//import on_tap.QuanLyGianVienVaHocSinh.model.Student;
//import on_tap.QuanLyGianVienVaHocSinh.model.Teacher;
//
//import java.io.*;
//import java.util.ArrayList;
//import java.util.List;
//
//public class ReadWriteFileStudent {
//    public static List<String> readFile(String path) {
//        List<String> list = new ArrayList<>();
//        try {
//            File file = new File(path);
//            FileReader fileReader = new FileReader(file);
//            BufferedReader bufferedReader = new BufferedReader(fileReader);
//            String line;
//
//            while ((line = bufferedReader.readLine()) != null) {
//
//                list.add(line);
//
//            }
//            bufferedReader.close();
//        } catch (IOException e) {
//            System.out.println("Lỗi File");
//        }
//        return list;
//    }
//
//    public static List<Person> readFileStudent(String path) {
//        List<String> newList = readFile(path);
//        System.out.println(newList);
//        List<Person> personList = new ArrayList<>();
//        String[] info;
//        for (String string : newList) {
//            info = string.split(",");
//                if(info.length==6){
//                    personList.add(new Student(Integer.parseInt(info[0]), info[1], info[2], info[3], info[4], info[5]));
//                }else if(info.length==5){
//                    personList.add(new Teacher(Integer.parseInt(info[0]), info[1], info[2], info[3], info[4]));
//                }
//        }
//        return personList;
//    }
//
//
//    public static void writeFile(String path, String data) {
//
//        try {
//            File file = new File(path);
//            FileWriter fileWriter = new FileWriter(file);
//            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//            bufferedWriter.write(data);
//            bufferedWriter.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public static void writeFileStudent(String path, List<Person> studentList) {
//
//        StringBuilder data = new StringBuilder();
//        for (Student student : studentList) {
//            data.append(student.inFor());
//        }
//        writeFile(path, data.toString());
//    }
//
//
//}
