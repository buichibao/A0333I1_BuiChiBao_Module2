package titv_youtube;

import java.util.Scanner;

public class bai16_lopMath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //LÝ THUYẾT
//        double a,b;
//        System.out.print("Nhập a : ");
//        a = sc.nextDouble();
//        System.out.print("Nhập b : ");
//        b = sc.nextDouble();
//
//        //Hàm trị tuyệt đối
//        System.out.println("|a| = "+Math.abs(a));
//
//        //Hàm max
//        System.out.println("Max(a,b) = "+Math.max(a,b));
//
//        //Hàm min
//        System.out.println("Min(a,b) = "+Math.min(a,b));
//
//        //Hàm làm tròn lên
//        System.out.println("ceil(a) = "+Math.ceil(a));
//
//        //Hàm làm tròn xuống
//        System.out.println("floor(a) = "+Math.floor(a));
//
//        //Hàm căn bậc 2
//        System.out.println("sqrt(a) = "+Math.sqrt(a));
//
//        //Ham a mũ b
//        System.out.println("a^b = "+Math.pow(a,b));
        //BÀI TẬP
        System.out.println("Nhập bán kính đường tròn");
            double r = sc.nextDouble();
            double Area = Math.PI*Math.pow(r,2);
            Area = Math.round(Area);//làm tròn
            double P = Math.PI*2*r;
            P = Math.round(P);//làm tròn
        System.out.println("diện tích hình tròn là "+Area+" và chu vi hình tròn là "+P);

    }
}

