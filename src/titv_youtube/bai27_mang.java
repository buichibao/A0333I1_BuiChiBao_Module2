package titv_youtube;

import java.util.Scanner;

public class bai27_mang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Khai báo mảng
        double[] mang1;
        int mang2[];

        //Khởi tạo mảng
        mang1 = new double[10];
        mang2 = new int []{1,2,3,4,5};

        //Nhập phần tử của mang 1
        for (int i = 0; i <mang1.length ; i++) {
            System.out.print("mang1["+i+"] = ");
            mang1[i] = sc.nextDouble();
        }
        double tong = 0;
        for (int i = 0; i <mang1.length ; i++) {
            tong+=mang1[i];
        }
        System.out.println("tong = "+tong);
    }

}
