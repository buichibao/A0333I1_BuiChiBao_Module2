package ss5_access_modifier_static_get_set.ThucHanh.ThucHanh1;

public class TestStaticStudent {
    public static void main(String[] args) {
        Student.change();//static được có trước khi khởi tạo đối tượng
        Student s1 = new Student(1,"Bao");
        Student s2 = new Student(2,"Nam");
        Student s3 = new Student(3,"Hoan");

        s1.display();
        s2.display();
        s3.display();
    }
}
