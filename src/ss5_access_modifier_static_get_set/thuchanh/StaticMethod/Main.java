package ss5_access_modifier_static_get_set.thuchanh.StaticMethod;

public class Main {
    public static void main(String[] args) {
         Student.change();

        Student s1 =  new Student(111,"bao");
        Student s2 =  new Student(222,"bui");
        Student s3 =  new Student(333,"chi");

        s1.disPlay();
        s2.disPlay();
        s3.disPlay();

    }
}
