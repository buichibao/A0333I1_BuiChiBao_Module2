package ss5_access_modifier_static_get_set.BaiTap.BaiTap2;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.toString());
        student.setClasses("A03");
        student.setName("Bao");
        System.out.println(student.toString());
    }
}
