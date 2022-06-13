package ss3_array_method;

import java.util.Scanner;

public class BaiTap5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int []Array;
        int size;
        do{
            System.out.println("Nhập kích thước mảng");
            size = scanner.nextInt();
            if(size>30){
                System.out.println("Kích thước vượt quá 30");
            }
        }while (size>30);
        Array = new int [size];
        for (int i = 0; i <Array.length ; i++) {
            System.out.print("Nhập phần tử thứ "+i+" : ");
            Array[i] = scanner.nextInt();
        }
        int min = Array[0];
        for (int j = 0;j<Array.length;j++){
            if(Array[j]<min){
                min = Array[j];
            }
        }
        System.out.println("Min của mảng là "+min);
    }
}
