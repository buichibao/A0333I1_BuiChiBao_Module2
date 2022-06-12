package ss3_array_method;

import java.util.Scanner;

public class ThucHanh4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int choice;
        do {

            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit ");
            System.out.println("Enter Choice");
            choice =scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter fahrenheit");
                    double fahrenheit = scanner.nextDouble();
                    System.out.println(" Fahrenheit to Celsius "+fahrenheitToCelsius(fahrenheit));
                    break;
                case 2:
                    System.out.println("Enter celsius ");
                    double celsius = scanner.nextDouble();
                    System.out.println("Celsius to Fahrenheit "+celsiusToFahrenheit(celsius));
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Enter error");
            }
        } while (choice!=0);
    }
    public  static  double celsiusToFahrenheit(double celsius){
        double fahrenheit = ( celsius + 32 )* 9 / 5 ;
        return fahrenheit;
    }
    public static double fahrenheitToCelsius(double fahrenheit){
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return  celsius;
    }
}

