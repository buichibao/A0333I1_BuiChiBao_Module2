package ss3_array_method;

import java.util.Scanner;

public class BaiTap4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [][]Array = new int [2][3];
        for(int i = 0;i<2;i++){
            for(int j = 0;j<3;j++){
                System.out.print("Arr["+i+"]["+j+"]" + " = ");
                Array[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Max của ma trận là "+timMax(Array));
    }
    public static int timMax(int a[][]){
        int max = a[0][0];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j <3 ; j++) {
                if(a[i][j]>max){
                    max = a[i][j];
                }
            }
        }
        return max;
    }
}
