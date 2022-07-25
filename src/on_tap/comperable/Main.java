package on_tap.comperable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Tham",29));
        studentList.add(new Student("Bao",21));
        studentList.add(new Student("Nam",22));
        studentList.add(new Student("Anh",24));

        Collections.sort(studentList, new AgeStudentComperator());

        for (Student student:studentList) {
            System.out.println(student);
        }
    }
}
