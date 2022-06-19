package ss5_access_modifier_static_get_set.ThucHanh.ThucHanh2;

public class Car {
    private  String name;
    private  String engine;

    public  static  int numberOfCars;

    public Car(String name, String engine) {
        this.name = name;
        this.engine = engine;
        numberOfCars++;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", engine='" + engine + '\'' +",numberOfCars = "+numberOfCars+
                '}';
    }
}
