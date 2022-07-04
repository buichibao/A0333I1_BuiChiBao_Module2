package ss2_loop.ViDu;

import java.util.Scanner;

public class ViDu3_vonglapwhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number1");
        int number1 = sc.nextInt();
        System.out.println("Enter number2");
        int number2 = sc. nextInt();
        System.out.println("Sum");
        int sum = sc.nextInt();
        while(number1+number2!=sum){
            System.out.println("Sum");
            sum = sc.nextInt();
        }
    }
}
