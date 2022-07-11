package ss7_acstract_interface.demo.person.controller;

import ss7_acstract_interface.demo.person.model.Student;
import ss7_acstract_interface.demo.person.model.Teacher;

public class MainController {
    public static void main(String[] args) {
        Student student = new Student();
        student.run();

        Teacher teacher = new Teacher();
        teacher.eat();
    }
}
