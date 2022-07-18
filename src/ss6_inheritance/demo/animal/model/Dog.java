package ss6_inheritance.demo.animal.model;

import java.util.Objects;

public class Dog extends  Animal{
    private  String color;

    public Dog(){
        super("abc");
        System.out.println("Dog()");
    }
    public Dog(String color) {
        this.color = color;
    }

    public Dog(String name, String color) {
        super(name);
        this.color = color;
    }

    @Override
    public void bark() {
        System.out.println("Dog braking...");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(color, dog.color);
    }


}
