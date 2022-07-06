package ss3_array_method.Demo;

import java.util.Scanner;

public class TestPrime {
    public static void main(String[] args) {
        TestPrime testPrime = new TestPrime();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập a: ");
         int a = sc.nextInt();
         if(testPrime.checkPrime(a)){
             System.out.println(a+" là số nguyên tố");
         }else {
             System.out.println(a+" không phải là số nguyên tố");
         }
         //đếm số nguyên tố trong mảng
        int count = 0;
         int []arr ={1,2,3,4,5};
        for (int item:arr) {
            if(testPrime.checkPrime(item)){
                count++;
            }
        }
        System.out.println("Số lượng số nguyên tố là "+ count);
    }
    boolean checkPrime(int number) {
          if(number<2){
              return false;
          }
          for(int i =2;i<=Math.sqrt(number);i++){
              if(number%i==0){
                  return false;
              }
          }
          return true;
    }
}
