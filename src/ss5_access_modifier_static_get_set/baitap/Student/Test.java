package ss5_access_modifier_static_get_set.baitap.Student;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student);

        student.setName("Bao");
        student.setClasses("A03");
        System.out.println(student);
    }
}
