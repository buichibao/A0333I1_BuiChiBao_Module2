package ss3_array_method;

import java.util.Scanner;

public class BaiTap6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [][] Array;
        System.out.print("Nhập số hàng của ma trận : ");
        int m = scanner.nextInt();
        System.out.print("Nhập số cột của ma trận : ");
        int n = scanner.nextInt();
        Array = new int[m][n];

        //Nhập mảng
        for (int i = 0; i < m ; i++) {
            for (int j = 0; j <  n; j++) {
                System.out.print("A["+i+"]["+j+"] = ");
                Array[i][j]=scanner.nextInt();
            }
        }
        //Xuất Mảng
        for (int i = 0; i < m ; i++) {
            for (int j = 0; j <  n; j++) {
                System.out.print(Array[i][j] +" ");
            }
            System.out.println("\n");
        }
        //Nhập chỉ số cột cần tính tổng
        int indexCot;
        do{
            System.out.print("Nhập cột cần tính : " );
            indexCot = scanner.nextInt();
        }while(indexCot > n || indexCot < 0);

        int sumCot=0;
        for(int i =0;i<m;i++){
            sumCot+=Array[i][indexCot];
        }
        System.out.println("Tổng các số ở cột "+indexCot+" : "+sumCot);

    }
}

