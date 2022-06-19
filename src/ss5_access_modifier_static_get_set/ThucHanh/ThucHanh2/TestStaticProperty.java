package ss5_access_modifier_static_get_set.ThucHanh.ThucHanh2;

public class TestStaticProperty {
    public static void main(String[] args) {

        Car car1 = new Car("Mazda 3","Skyactiv 3");
        System.out.println(Car.numberOfCars);
        System.out.println(car1.toString());

        Car car2 = new Car("Mazda 6","Skyactiv 6");
        System.out.println(Car.numberOfCars);
        System.out.println(car2.toString());
    }
}
