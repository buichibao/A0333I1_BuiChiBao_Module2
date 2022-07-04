package ss2_loop.BaiTap;

import java.util.Scanner;

public class MainDraw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = -1;
        String result;
        while (choice != 4) {
            System.out.println("Menu");
            System.out.println("1.Draw rectangle ");
            System.out.println("2.Draw square triangle");
            System.out.println("3.Draw isosceles triangle");
            System.out.println("4.Exit");
            System.out.println("Enter your choice");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Draw rectangle");
                    for (int i = 1; i <= 3; i++) {
                        for (int j = 1; j <= 10; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("Draw square triangle");
                    for(int i = 1;i<=5;i++){
                        for(int j = 1;j<=i;j++){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Draw isosceles triangle");
                    for (int i = 0; i < 5; i++) {
                        for (int j = 1; j <= 5 + 4; j++) {
                            if (j >= 5 - i && j <= 5 + i) {
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("No choice");
            }
        }
    }
}

