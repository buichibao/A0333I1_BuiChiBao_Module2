package ss1_intro_Java.ThucHanh;

import java.util.Scanner;

public class ThucHanh4_giaiptbac1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a;
        float b;
        float c;
        System.out.println("Giải phương trình bậc nhất ");

        System.out.println("Nhập a ");
        a = sc.nextFloat();
        System.out.println("Nhập b ");
        b = sc.nextFloat();
        System.out.println("Nhập c ");
        c = sc.nextFloat();

        if(a!=0){
            System.out.println("Nghiệm của phương trình là : "+(c-b)/a);
        }else {
            if(b==c){
                System.out.println("Phương trình vô số nghiệm");
            }else{
                System.out.println("Phương trình vô nghiệm");
            }
        }
    }
}
