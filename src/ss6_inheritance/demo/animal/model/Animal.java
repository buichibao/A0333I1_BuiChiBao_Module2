package ss6_inheritance.demo.animal.model;

public class Animal {
    private  String name;

    public  Animal(){
        System.out.println("Animal()");
    }

    public Animal(String name) {
        this.name = name;
    }
    public void eat(){
        System.out.println("eating...");
    }
    public  void bark(){
        System.out.println("Animal barking...");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
    public String getName(){
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
