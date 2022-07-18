package ss6_inheritance.demo.override_overload;

public class override {
    public static void main(String[] args) {
        C c = new C();
        c.p(4);
    }
}
class  C extends D{
    @Override
    public void p(int number){
//        System.out.println("Hello "+number);
        super.p(3);
    }
}
class D{
    public void p(int number){
        System.out.println("Chào "+number);
    }
}
