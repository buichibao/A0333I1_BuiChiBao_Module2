package ss1_intro_Java;

import java.util.Scanner;

public class BaiTap3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double vnd = 23000;
        double usd;
        System.out.print("Enter USD: ");
        usd = scanner.nextDouble();
        double quydoi = usd*vnd;
        System.out.print("USD->VND "+quydoi);
    }
}
