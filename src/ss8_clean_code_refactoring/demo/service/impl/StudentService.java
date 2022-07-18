package ss8_clean_code_refactoring.demo.service.impl;

import ss8_clean_code_refactoring.demo.model.Student;
import ss8_clean_code_refactoring.demo.service.IStudentService;

public class StudentService implements IStudentService {
    @Override
    public void findAll() {
        for (int i = 0; i <PersonService.count ; i++) {
            if(PersonService.people[i] instanceof Student){
                System.out.println(PersonService.people[i]);
            }
        }
    }
}
