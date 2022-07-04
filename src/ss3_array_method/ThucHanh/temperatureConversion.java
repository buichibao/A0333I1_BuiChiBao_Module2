package ss3_array_method.ThucHanh;

import java.util.Scanner;

public class temperatureConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice ;
        do{
            System.out.println("Menu");
            System.out.println("1.F--->C");
            System.out.println("2.C--->F");
            System.out.println("0.Exit");
            System.out.print("Enter choice:");
            choice=sc.nextLine();
            switch (choice){
                case "1":
                    System.out.println("Enter F");
                    double F = Double.parseDouble(sc.nextLine());
                    System.out.println("C = "+fToC(F));
                    break;
                case "2":
                    System.out.println("Enter C");
                    double C =  Double.parseDouble(sc.nextLine());
                    System.out.println("F = "+cToF(C));
                    break;
                case "0":
                    System.exit(0);
                default:
                    System.out.println("No choice");

            }
        }while(choice!="0");

    }
    public static double fToC(double f){
        double c = (5.0 / 9) * (f- 32);
        return  c;
    }
    public static double cToF(double c){
        double f =(9.0 / 5) * c + 32;
        return f;
    }
}
