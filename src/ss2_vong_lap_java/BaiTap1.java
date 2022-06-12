package ss2_vong_lap_java;

import java.util.Scanner;

public class BaiTap1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("MENU");
        System.out.println("1.Daw the rectangle");
        System.out.println("2.Daw the triangle");
        System.out.println("0.Exit");
        System.out.println("Enter choice");

        while (true){
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    for(int i =1;i<=5;i++){
                        for(int j =1;j<=6;j++){
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 2:
                    for(int i =0;i<5;i++){
                        for (int j =0;j<i;j++){
                            System.out.println("*");
                        }
                        System.out.println("\n");
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice");
            }

        }

    }
}
