package ss2_vong_lap_java;

import java.util.Scanner;

public class ViDu4 {
    public static void main(String[] args) {
        int sum = 0;
        int number;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Enter number");
            number = scanner.nextInt();
            sum += number;
        }while (number!=0);
        System.out.println("This sum is "+sum);
    }
}
