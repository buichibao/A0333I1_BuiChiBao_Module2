package ss8_clean_code_refactoring.demo.service.impl;

import ss8_clean_code_refactoring.demo.model.Teacher;
import ss8_clean_code_refactoring.demo.service.ITeacherService;

public class TeacherService  implements  ITeacherService {
    @Override
    public void findAll() {
        for (int i = 0; i <PersonService.count ; i++) {
            if(PersonService.people[i] instanceof Teacher){
                System.out.println(PersonService.people[i]);
            }
        }
    }
}
