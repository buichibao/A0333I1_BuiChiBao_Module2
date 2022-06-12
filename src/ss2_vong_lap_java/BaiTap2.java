package ss2_vong_lap_java;

import java.util.Scanner;

public class BaiTap2 {
        public static boolean  isPrimeNumber (int n){
            if(n<2){
                return false;
            }
            int squareRoot = (int)Math.sqrt(n);
            for(int i =2 ;i<=squareRoot;i++){
                if(n%i==0){
                    return false;
                }
            }
            return true;
        }
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng số nguyên tố cần in ra");
        int numbers = scanner.nextInt();
        int count = 0;
        int i = 2;
        while(count<numbers){
            if(isPrimeNumber(i)){
                System.out.println(i+" ");
                count++;
            }
            i++;
        }
    }
}