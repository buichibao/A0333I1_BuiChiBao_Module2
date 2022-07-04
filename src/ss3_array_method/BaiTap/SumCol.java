package ss3_array_method.BaiTap;

import java.util.Arrays;
import java.util.Scanner;

public class SumCol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][]arr;
        System.out.println("Nhập số hàng của ma trận");
        int row = sc.nextInt();
        System.out.println("Nhập số cột của ma trận");
        int col = sc.nextInt();
        arr = new int[row][col];
//        int[][] matrix= {{1,2,3},{4,5,6}};
//        System.out.println("tổng của cột "+col+" là "+sumCol(matrix,2,3,col));
        System.out.println("Nhập các phần tử trong ma trận ");
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <col ; j++) {
                System.out.println("arr["+i+"]["+j+"]= ");
                arr[i][j]= sc.nextInt();
            }
        }

        System.out.println("Nhập cột cần tính");
        int colSum = sc.nextInt();

        System.out.println("Tổng của cột "+colSum+" là "+sumCol(arr,row,col,colSum));
    }
    public static  int sumCol(int arr[][],int row,int col,int indexCol){
        int sum = 0;
        for (int i = 0;i<row;i++){
            sum+=arr[i][indexCol];
        }
        return sum;
    }
}
