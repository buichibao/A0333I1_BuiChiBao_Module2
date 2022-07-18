package ss6_inheritance.demo.override_overload;

public class overload {
    public static void main(String[] args) {
        A a = new A();
        a.p(9.1);
        a.p(2);
    }
}
class A extends  B{
    public void p(double number){
        System.out.println(number);
    }
}
class B{
    public  void p(int number){
        System.out.println(number*2);
    }
}
