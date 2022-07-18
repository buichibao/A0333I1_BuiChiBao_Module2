package ss6_inheritance.demo.super_this;

public class Test {
    public static void main(String[] args) {
        B b = new B();
        A a = new A();
        b.call();//b gọi thì ưu tiên b trước
    }
}
