package ss1_intro_Java;


import java.util.Scanner;

public class ThucHanh6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year");
        int year = scanner.nextInt();


//        if((year%4==0&&year!=0)||(year%100==0&&year%400==0)){
//            System.out.printf(year+" is leap year");
//        }else {
//            System.out.println(year+" is NOT leap year");
//        }




//        if (year % 4 == 0) {
//            if (year % 100 == 0) {
//                if (year % 400 == 0) {
//                    System.out.printf("%d is leap year", year);
//                } else {
//                    System.out.printf("%d is NOT leap year", year);
//                }
//            } else {
//                System.out.printf("%d is leap year", year);
//                   }
//            } else{
//                System.out.printf("%d is NOT leap year", year);
//            }
//        }
//    }



        boolean isLeapYear = false;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }
        if (isLeapYear) {
            System.out.println(year + " is leap year");
        } else {
            System.out.println(year + " is NOT leap year");
        }
    }
}

