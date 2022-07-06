package ss3_array_method.Demo;

import java.util.Scanner;

public class TestPrime2 {
    public static void main(String[] args) {
        //vì trong phương thức k có static nên phải khai báo
        TestPrime2 testPrime2 = new TestPrime2();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập a: ");
        int a = sc.nextInt();
        testPrime2.checkPrimer2(a);
    }
    void checkPrimer2(int number){
        if(number<2){
            System.out.println(number+" không phải là số nguyên tố");
            return;
        }
        for(int i =2;i<=Math.sqrt(number);i++) {
            if (number % i == 0) {
                System.out.println(number + " không phải là số nguyên tố");
                return;
            }
        }
        System.out.println(number+" là số nguyên tố");
    }

}
