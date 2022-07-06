package ss3_array_method.Demo;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       //vì không khai báo static nên phải tạo đối tượng để truy cập đến phương thức
        Factorial factorial = new Factorial();
        int a = factorial.inputValue("a");
        int b = factorial.inputValue("b");
        int c = factorial.inputValue("c");

        long factA = factorial.calculateFactorial(a);
        long factB = factorial.calculateFactorial(b);
        long factC = factorial.calculateFactorial(c);

        long S = factA+factB+factC;
        System.out.println("S = "+S);
    }

    int inputValue(String number) {
        int n;
        do {
            System.out.println("Nhập " + number);
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            if (n < 0) {
                System.out.println("n<0, mời bạn nhập lại");
            }
        } while (n < 0);
        return n;
    }

    long calculateFactorial(int number) {
        int factNumber = 1;
        for (int i = 2; i <= number; i++) {
            factNumber *= i;
        }
        return  factNumber;
    }
}
