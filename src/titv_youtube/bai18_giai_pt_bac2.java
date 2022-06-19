package titv_youtube;

import java.util.Scanner;

public class bai18_giai_pt_bac2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a,b,c,x1,x2, delta;
        System.out.println("Nhập các hệ số của phương trình bậc 2");
        System.out.print("Nhập a :");
        a = scanner.nextDouble();
        System.out.print("Nhập b :");
        b = scanner.nextDouble();
        System.out.print("Nhập c :");
        c = scanner.nextDouble();

        delta = Math.pow(b,2)-4*a*c;

        if(a==0){
            System.out.println("Bạn đã nhập sai dữ liệu");
        }else{
            if(delta<0){
                System.out.println("Phương trình vô nghiện");
            }else if(delta==0){
                x1 = -b/(2*a);
                System.out.println("Phương trong trình có nghiện kép x1 = x2 = "+x1);
            }else{
                x1 = (-b-Math.sqrt(delta))/(2*a);
                x2 = (-b+Math.sqrt(delta))/(2*a);
                System.out.println("Phương trình có 2 ngiện phận biệt x1 = "+x1+" và x2 = "+x2);
            }
        }
    }
}
