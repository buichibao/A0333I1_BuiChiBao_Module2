package titv_youtube;

import java.util.Scanner;

public class bai11_phep_toan_co_ban {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;

        System.out.println("Nhập a");
        a = scanner.nextInt();
        System.out.println("Nhập b");
        b = scanner.nextInt();

        int tong = a+b;
        System.out.println("a + b = "+tong);
        int hieu = a-b;
        System.out.println("a - b = "+hieu);
        int tich = a*b;
        System.out.println("a * b = "+tich);
        float thuong = (float)a/(float)b;
        System.out.println("a / b = "+thuong);
        int chiaLayDu = a%b;
        System.out.println("a % b = "+chiaLayDu);

    }
}
