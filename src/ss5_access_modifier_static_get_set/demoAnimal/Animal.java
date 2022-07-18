package ss5_access_modifier_static_get_set.demoAnimal;

public class Animal {
    private  String name;
    String color;
    protected  double weight;
    public  int age;
    protected   void eat(){
        this.name="abc";
        this.color="red";
        this.weight=132;
        this.age=12;
        System.out.println("Con mèo ăn cơm");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                ", age=" + age +
                '}';
    }
}
