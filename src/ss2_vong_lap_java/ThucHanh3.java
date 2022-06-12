package ss2_vong_lap_java;

import java.util.Scanner;

public class ThucHanh3 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter a");
        int a = scanner.nextInt();
        System.out.println("Enter b");
        int b = scanner.nextInt();
        if(a==0||b==0){
            System.out.println("Không thể có ước chung");
        }else{
            while (a!=b){
                if(a>b){
                    a=a-b;
                }else{
                    b=b-a;
                }
            }
            System.out.println("Ước lớn nhất là "+a);
        }
    }
}
