package ss2_loop.ThucHanh;

import java.util.Scanner;

public class TH_check_prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        int number = sc.nextInt();
        if(check(number)){
            System.out.println(number+" is prime");
        }else{
            System.out.println(number+" is not prime");
        }
    }
    public static boolean check(int number){
        if(number<=1){
            return false;
        } else {
            for(int i =2;i<=Math.sqrt(number);i++){
                 if(number%i==0){
                     return false;
                 }
            }
        }
        return  true;
    }
}
