package ss5_access_modifier_static_get_set.demo.Studen;

public class MainDemo {
    public static void main(String[] args) {
        Student.college="Codegym";
        Student s1 = new Student(1,"Bùi Chí Bảo");
        Student s2 = new Student(2,"Trần Đình Nam");
        Student s3 = new Student(3,"Bùi ĐỨc Vinh");
        Student s4 = new Student(4,"Trần Đình CƯờng");
        Student s = new Student();
        s.disPlay();
        s1.disPlay();
        s2.disPlay();
        System.out.println(s1.getName());
        s1.setName("Abc");
        System.out.println(s1.getName());
        //static không cần khai báo đối tượng nên có thể chấm trực tiếp
        System.out.println(Student.count);
        Student s5 = new Student(7.8);
        s5.setScore(10);


    }
}
