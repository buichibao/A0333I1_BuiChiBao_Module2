package ss3_array_method;

import java.util.Scanner;

public class BaiTap3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] Array1 = new int [5];
        int[] Array2 = new int [6];
        int[] Array3 = new int[Array1.length+Array2.length];


        System.out.println("Nhập mảng 1 :");
        for(int i = 0;i<Array1.length;i++){
            System.out.print("Array [ "+i+" ] = ");
            Array1[i]= scanner.nextInt();
        }


        System.out.println("Nhập mảng 2 :");
        for(int i = 0;i<Array2.length;i++){
            System.out.print("Array [ "+i+" ] = ");
            Array2[i]= scanner.nextInt();
        }


//        System.out.println("Gán mảng 1->mảng 3:");
        for(int i =0;i<Array1.length;i++){
            Array3[i]=Array1[i];
        }


//        System.out.println("Gán mảng 2->mảng 3:");
        for(int i =0;i<Array2.length;i++){
            Array3[i+Array1.length]=Array2[i];
        }

        System.out.println("Mảng 3 là:");
        for(int i =0;i<Array3.length;i++){
            System.out.print(Array3[i]+"\t");
        }
    }
}
