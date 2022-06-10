package ss2_vong_lap_java;

import java.util.Scanner;

public class ThucHanh1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if(number<2){
            System.out.println(number+" not is prime");
        }else {
            int i = 2;
            boolean check = true;
            while (i<=Math.sqrt(number)){
                if(number%i==0){
                    check = false;
                    break;//tiết kiệm thời gian lặp
                }
                i++;
            }
            if(check==true){
                System.out.println(number+" is prime");
            }else{
                System.out.println(number+" is not prime");
            }
        }
    }
}
