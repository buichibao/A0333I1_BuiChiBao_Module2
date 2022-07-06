package ss3_array_method.Demo;

import java.util.Scanner;

public class TestPrime3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số cần kiểm tra ");
        int number = sc.nextInt();
        checkPrime(number);
    }

    public static void checkPrime(int number) {
        boolean check = true;
        if (number < 2) {
            check = false;
        } else {
            for (int i = 2; i < Math.sqrt(number); i++) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println(number + " là số nguyên tố");
            }
        }

    }
}
