package ss2_loop.ThucHanh;

import java.util.Scanner;

public class TH_check_prime2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int number = Integer.parseInt(sc.nextLine());
        boolean check = true;
        if(number<2){
            check = false;
        }
        else{
            int i = 2;
            while(i<=Math.sqrt(number)){
                if(number%i==0){
                    check = false;
                    break;
                }
                i++;
            }
        }
        if(check){
            System.out.println(number+" is prime ");
        }else{
            System.out.println(number+" is not prime ");
        }
    }
}
