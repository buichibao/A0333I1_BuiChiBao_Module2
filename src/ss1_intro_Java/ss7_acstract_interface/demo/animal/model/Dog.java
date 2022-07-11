package ss7_acstract_interface.demo.animal.model;

public abstract class Dog extends Animal {
    public Dog() {
    }
        @Override
    public void run() {
        System.out.println("Dog run");
    }
}
