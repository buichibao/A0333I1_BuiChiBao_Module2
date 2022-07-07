package ss1_intro_Java.BaiTap;

import java.util.Scanner;

public class Moneychange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter USD");
        double usd = sc.nextDouble();
        double vnd = usd*23000;
        System.out.println(vnd+" VND");
    }
}
