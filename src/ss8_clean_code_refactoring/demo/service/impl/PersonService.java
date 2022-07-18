package ss8_clean_code_refactoring.demo.service.impl;

import ss8_clean_code_refactoring.demo.model.Person;
import ss8_clean_code_refactoring.demo.model.Student;
import ss8_clean_code_refactoring.demo.model.Teacher;
import ss8_clean_code_refactoring.demo.service.IPersonService;

public class PersonService implements IPersonService {
    public  static Person[]people;
    public static  int count;

    static {
        count = 3;
        people = new Person[1000];
        people[0] = new Student(1,"Bao",8);
        people[1] = new Student(2, "Quyết",8);
        people[2] = new Teacher(3,"Nam",7);
    }

    @Override
    public void findAll() {
        for (int i = 0; i <count ; i++) {
            System.out.println(people[i]);
        }
    }
}
