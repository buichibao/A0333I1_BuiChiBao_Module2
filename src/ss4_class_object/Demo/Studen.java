package ss4_class_object.Demo;

public class Studen {
    String name;
    int age;
    String color;

    public Studen(){
        //gán cho "" để nó khác null
        name = "";
        color = "";
    }
    public  Studen(int age){
        this.age = age;
    }

    public Studen(String name){
        this("Bao",21,"yellow");
        this.name=name;//name+21+yellow
    }
    public Studen(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }
    //nếu không khởi tại phương thức toString khi sout(đối tượng) thì ra địa chỉ
    //sau khi khai báo toString chỉ cần tên đối tượng (name.toString) để in ra các thuộc tính
    @Override
    public String toString() {
        return "Studen{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
