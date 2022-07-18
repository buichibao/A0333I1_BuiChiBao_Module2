package ss6_inheritance.demo.hocvien.model;

public class HocVien {
    private String name ;
    private String age;

    public HocVien() {

    }

    public HocVien(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", age=" + age ;
    }
}
