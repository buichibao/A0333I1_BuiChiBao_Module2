package ss5_access_modifier_static_get_set.demo;

public class Student {
    int id;
    private String name;
    static  String college;
    //static String college ="Bách Khoa Đà Nẵng";//c1 khởi tạo giá trọ cho biến static
    static {
        college = "Bách Khoa Đà Nẵng";
    }
    static int count =0;
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        count++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
}
