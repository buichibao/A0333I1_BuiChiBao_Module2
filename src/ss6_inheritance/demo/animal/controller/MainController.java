package ss6_inheritance.demo.animal.controller;

import ss6_inheritance.demo.animal.model.Animal;
import ss6_inheritance.demo.animal.model.Dog;

public class MainController {
    static  final  int MAX = 2;

    public static void main(String[] args) {
        Dog dog = new Dog("súc","red");
        Dog dog1 = new Dog("anni","red");

        dog.bark();
        dog.eat();

        System.out.println(dog.equals(dog1));//hiện đang so sánh màu sắc

        //Ép kiểu
        Animal animal = new Animal();//ngầm định ->cha->con
        Dog dog2 = (Dog) animal;//Tường minh->con->cha lỗi do ép từ nhiều thuộc tính về ít thuộc tính
    }
}
