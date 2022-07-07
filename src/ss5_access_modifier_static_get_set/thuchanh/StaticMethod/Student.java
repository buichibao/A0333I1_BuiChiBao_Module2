package ss5_access_modifier_static_get_set.thuchanh.StaticMethod;

public class Student {
    private int rollno;
    private  String name;
    private static    String college= "BBDIT";

    public Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

     static void change (){
        college = "CODEGYM";
    }
    void disPlay (){
        System.out.println(rollno+" "+name+" "+college);
    }
}
