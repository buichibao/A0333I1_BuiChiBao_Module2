package ss3_array_method.BaiTap;

import java.util.Scanner;

public class SumDiagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row;
        int col;
        int matrix[][];
        do{
            System.out.println("Nhập số hàng của ma trận");
            row =sc.nextInt();
            System.out.println("Nhập số cột của ma trận");
            col =sc.nextInt();
        }while (row!=col);
        matrix = new int[row][col];
        for (int i = 0; i < row ; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("matrix["+i+"]["+j+"] = ");
                matrix[i][j]=sc.nextInt();
            }
        }
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <col ; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        int sumDiagonal =0;
        for(int i = 0;i<row;i++){
            for (int j = 0; j <col ; j++) {
                if(i==j){
                    sumDiagonal+=matrix[i][j];
                }
            }
        }
        System.out.println("tổng của đường chéo chính "+sumDiagonal);
    }
}
