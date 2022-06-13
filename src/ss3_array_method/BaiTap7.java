package ss3_array_method;

import java.util.Scanner;

public class BaiTap7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [][] Array ;
        int m ;
        int n ;
        do {
            System.out.print("Nhập số hàng : ");
            m= scanner.nextInt();
            System.out.print("Nhập số cột : ");
            n= scanner.nextInt();
        }while(m!=n);
        Array = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n ; j++) {
                System.out.print("Array ["+i+"]["+j+"] = ");
                Array[i][j]=scanner.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n ; j++) {
                System.out.print(Array[i][j]+" ");
            }
            System.out.println("\n");
        }
        int sumCheo = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n ; j++) {
                if(i==j){
                    sumCheo+=Array[i][j];
                }
            }
        }
        System.out.print("Tổng của đường chéo "+sumCheo);
    }
}

