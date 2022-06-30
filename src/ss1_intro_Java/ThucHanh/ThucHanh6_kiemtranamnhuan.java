package ss1_intro_Java.ThucHanh;

import java.util.Scanner;

public class ThucHanh6_kiemtranamnhuan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập năm cần kiểm tra");
        int year = sc.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " là năm nhuận");
                } else {
                    System.out.println(year + " không là năm nhuận ");
                }
            }else {
                System.out.println(year+" là năm nhuận");
            }
        }else{
            System.out.println(year + " không là năm nhuận ");
        }
    }
}
