package ss5_access_modifier_static_get_set.thuchanh.Car;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Mazda 3","Skyactiv 3");
        System.out.println(Car.numberOfCar);

        Car car2 = new Car("Mazda 6","Skyactic 6");
        System.out.println(Car.numberOfCar);
    }

}
