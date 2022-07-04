package ss2_loop.ViDu;

import java.util.Scanner;

public class ViDu4_vonglapdowwhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum =0;
        int number;
        do{
            System.out.println("Enter number");
            number=sc.nextInt();
            sum+=number;
            System.out.println("Sum = "+sum);
        }while(sum!=0);
    }
}
