package ss1_intro_Java;

import java.util.Scanner;

public class ThucHanh7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Enter weight");
        double weight = scanner.nextDouble();

        System.out.println("Enter height");
        double height = scanner.nextDouble();

        double bmi = weight/(height*height) ;

        if(bmi>=30.0){
            System.out.println(bmi+" is Obese");
        }else if(bmi>=25.0){
            System.out.println(bmi+" is Overweight");
        }else if(bmi >= 18.5){
            System.out.println(bmi+" is Normal");
        }else {
            System.out.println(bmi+" Underweight");
        }
    }
}
