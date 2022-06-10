package ss2_vong_lap_java;

import java.util.Scanner;

public class ViDu3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int sum = scanner.nextInt();
        while (number1+number2!=sum){
            System.out.println("Wrong answer");
            sum =scanner.nextInt();
        }
        System.out.println("You got it");
    }
}
