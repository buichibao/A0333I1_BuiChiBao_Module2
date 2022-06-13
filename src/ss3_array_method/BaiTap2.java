package ss3_array_method;

import java.util.Scanner;

public class BaiTap2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int[] Array;
        do {
            System.out.print("Nhập kích thước mảng :");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Kích thước mảng đã vượt quá 20");
            }
        } while (size > 20);
        Array = new int[size];
        int i = 0;


        //Nhập mảng
        while (i < Array.length) {
            System.out.print("Element " + i + " : ");
            Array[i] = scanner.nextInt();
            i++;
        }


        //Xuất mảng
        for (int j = 0; j < Array.length; j++) {
            System.out.print(Array[j] + "\t");
        }

        //Nhập giá trị và vị trí cần chèn
        System.out.println("\nNhập số cần chèn ");
        int number = scanner.nextInt();
        int vi_tri;
        do{
            System.out.println("Nhập vi trí cần chèn");
            vi_tri = scanner.nextInt();
        }while (vi_tri<=1||vi_tri>=Array.length-1);

        chenPhanTuVaoViTriK(Array,vi_tri,number);

        for (int j = 0; j < Array.length; j++) {
            System.out.print(Array[j] + "\t");
        }

    }
    public static void chenPhanTuVaoViTriK(int a[],int k,int m){
        for(int j = a.length-1;j>k;j--){
            a[j] = a[j-1];
        }
        a[k]=m;
    }

}

