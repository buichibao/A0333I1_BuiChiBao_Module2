package titv_youtube;

import java.util.Scanner;

public class bai17_if_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n;

//        System.out.print("Nhập số nguyên cần kiểm tra: ");
//        n = sc .nextInt();
//        if(n%2==0){
//            System.out.println(n + " là số chẵn ");
//        }else {
//            System.out.println(n +" là số lẻ");
//        }
        double a,b,x;
        System.out.print("Nhập a = ");
        a = sc.nextDouble();
        System.out.print("Nhập b = ");
        b = sc.nextDouble();

        if(a == 0){
            if(b==0){
                System.out.println("Phương trình vô số nghiệm");
            }else{
                System.out.println("Phương trình vô nghiệm");
            }
        }else {
            x = -b/a;
            System.out.println("Phương trình có nghiệm x = "+x);
        }
    }
}
