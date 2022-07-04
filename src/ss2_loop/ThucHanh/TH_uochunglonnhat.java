package ss2_loop.ThucHanh;

import java.util.Scanner;

public class TH_uochunglonnhat {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhập a");
        int a = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập b");
        int b = Integer.parseInt(sc.nextLine());
        int UCLN = 1;
        if(a==0||b==0){
            System.out.println("Không có ước chung");
        }
        while (a!=b){
            if(a>b){
                a=a-b;
            }else {
                b = b -a;
            }
        }
        UCLN = a;
        System.out.println("UCLN "+UCLN);

    }
}
