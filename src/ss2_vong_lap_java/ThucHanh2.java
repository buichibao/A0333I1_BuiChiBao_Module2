package ss2_vong_lap_java;

import java.util.Scanner;

public class ThucHanh2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter money");
        double money = scanner.nextDouble();
        System.out.println("Enter month");
        int month = scanner.nextInt();
        System.out.println("Enter interestRate:");
        double interestRate = scanner.nextDouble();
        double total =0;
        for(int i = 1;i<=month;i++){
            total += money*(interestRate/100)/12*month;
        }
        System.out.println("Total of interest: " + total);
    }
}
