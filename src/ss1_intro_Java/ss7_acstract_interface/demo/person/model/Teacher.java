package ss7_acstract_interface.demo.person.model;

public class Teacher implements Peson {
    public Teacher() {
    }
    @Override
    public void run() {
        System.out.println("Teacher run()");
    }
}
