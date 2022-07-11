package ss7_acstract_interface.demo.person.model;

public class Student implements Peson {
    public Student() {

    }
    @Override
    public void run() {
        System.out.println("Student run()");
    }
    @Override
    public void eat() {
        System.out.println("Student eat()");
    }
}
