package ss5_access_modifier_static_get_set.thuchanh.Car;

public class Car {
    private  String name;
    private String engine;
    public  static  int numberOfCar;

    public Car(String name, String engine){
        this.name=name;
        this.engine=engine;
        numberOfCar++;
    }
}
