package titv_youtube;

public class bai10_ep_kieu_trong_java {
    public static void main(String[] args) {

        //Ép kiểu ngầm định :dùng cho ép kiểu từ bé sang lớn không bị mất giá trị
        int  a = 2;
        int b = 3;
        System.out.println("a ="+a);
        System.out.println("b ="+b);
        float  c = a;
        float d = b;
        System.out.println("c ="+c);
        System.out.println("d ="+d);

        //Ép kiểu tường minh:dùng cho ép kiểu thì bé sang lớn và bị mất đi giá trị
        float e = 18.9f;
        float h =5.5f;
        System.out.println("e ="+e);
        System.out.println("h ="+h);
        int g = (int)e;
        int f = (int)h;
        System.out.println("g ="+g);
        System.out.println("f ="+f);

        //Ép từ 1 kiểu đối tượng về kiểu nguyên thủy
        int x = new Integer(32);
        System.out.println("x ="+x);
    }
}
