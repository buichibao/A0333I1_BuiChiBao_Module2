package ss3_array_method.BaiTap;

import java.util.Scanner;

public class SeachMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] arr;
        System.out.println("Nhập hàng của ma trận");
        int row = sc.nextInt();
        System.out.println("Nhập cột của ma trận");
        int col = sc.nextInt();
        arr = new int [row][col];
        System.out.println("Nhập mảng 2 chiều có "+row+"hàng và "+col+" cột");
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <col ; j++) {
                System.out.print("arr["+i+"]["+j+"] = ");
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println();
        System.out.println("Ma trận vừa nhập là:");
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <col ; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Giá trị lớn nhất của ma trận trên là "+Max(arr,row,col));
    }
    public static int Max(int arr[][], int m,int n){
        int max = arr[0][0];
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n ; j++) {
               if(arr[i][j]>max){
                   max = arr[i][j];
               }
            }
        }
        return max;
    }
}
