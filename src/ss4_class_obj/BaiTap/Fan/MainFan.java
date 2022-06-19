package ss4_class_obj.BaiTap.Fan;

public class MainFan {
    public static void main(String[] args) {
        Fan f1 = new Fan(1,true,10,"yellow");
        Fan f2 = new Fan(2,false,5,"blue");

        System.out.println(f1.toString());
        System.out.println(f2.toString());
    }
}
