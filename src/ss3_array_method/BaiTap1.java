package ss3_array_method;

import java.util.Scanner;

public class BaiTap1 {
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

        //Nhập giá trị cần xóa
        System.out.print("\nNhập giá trị cần xóa :");
        int giaTri = scanner.nextInt();

        xoaMangTheoGiaTri(Array, giaTri);

        for (int j = 0; j < Array.length; j++) {
            System.out.print(Array[j] + "\t");
        }
    }

    public static void xoaMangTaiViTri(int arr[],int vi_tri){
           for(int k = vi_tri;k<arr.length-1;k++){
               arr[k]=arr[k+1];
           }
           arr[arr.length-1] = 0;
    }
    public static void xoaMangTheoGiaTri(int arr[],int gt){
            for (int k = 0; k < arr.length; k++) {
                if (arr[k] == gt) {
                    xoaMangTaiViTri(arr, k);
                }
            }
    }
}
