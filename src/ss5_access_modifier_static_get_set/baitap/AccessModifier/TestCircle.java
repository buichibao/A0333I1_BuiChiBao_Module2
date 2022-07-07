package ss5_access_modifier_static_get_set.baitap.AccessModifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        Circle circle1 = new Circle(2);
        System.out.println(circle1);
        System.out.println(circle1.getArea());
    }
}
