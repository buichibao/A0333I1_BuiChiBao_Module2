package ss2_vong_lap_java;

import java.util.Scanner;

public class ThucHanh4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice =1;
        System.out.println("MENU");
        System.out.println("1.Daw the triangle");
        System.out.println("2.Daw the square");
        System.out.println("3.Daw the rectangle");
        System.out.println("0.Exit");
        System.out.println("Enter choice");
        while(choice!=0){
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Daw the triangle");
                    System.out.println("*");
                    System.out.println("**");
                    System.out.println("***");
                    System.out.println("****");
                    System.out.println("*****");
                    System.out.println("******");
                    System.out.println("*******");
                    break;
                case 2:
                    System.out.println("Daw the square");
                    System.out.println("**************");
                    System.out.println("**************");
                    System.out.println("**************");
                    System.out.println("**************");
                    System.out.println("**************");
                    System.out.println("**************");
                    break;
                case 3:
                    System.out.println("Daw the rectangle");
                    System.out.println("****************");
                    System.out.println("****************");
                    System.out.println("****************");
                    System.out.println("****************");
                    break;
                case 0:
                    System.exit(0);

                default:
                    System.out.println("No choice");

            }
        }
    }
}
