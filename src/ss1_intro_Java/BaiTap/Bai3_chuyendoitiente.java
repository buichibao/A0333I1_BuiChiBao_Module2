package ss1_intro_Java.BaiTap;

import java.util.Scanner;

public class Bai3_chuyendoitiente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter USD");
        double USD = sc.nextDouble();
        double VND = USD*23000;
        System.out.println(VND+" VND");
    }
}
