package ss5_access_modifier_static_get_set.ThucHanh.ThucHanh1;

public class Student {
    private int id;
    private String name;
    private static  String colloge = "BBDII";//khai báo thuộc tính dùng chung đổi 1 lần là tất cả đều thay đổi

     Student(int i, String n) {
        this.id = i;
        this.name = n;
    }
     static void change(){
         colloge="CODEGYM";
    }
    void display(){
        System.out.println(id+ " "+ name+ " "+colloge);
    }
}
