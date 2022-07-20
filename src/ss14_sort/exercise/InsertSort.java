package ss14_sort.exercise;

import java.util.Scanner;

public class InsertSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số phần tử trong mảng:");
        int size =Integer.parseInt(scanner.nextLine());
        int arr[] = new int [size];
        System.out.println("Nhập giá trị các phần tử của mảng :");
        for (int i = 0; i <size ; i++) {
            System.out.print("arr["+i+"] = ");
            arr[i]=Integer.parseInt(scanner.nextLine());
        }
        System.out.print("Mảng vừa nhập là :");
        for (Integer integer:arr) {
            System.out.print(integer+" ");
        }
        System.out.println();
        insertSort(arr);
        System.out.println("Mảng sau khi sắp xếp");
        for (Integer integer:arr) {
            System.out.print(integer+" ");
        }
    }
    public static  void insertSort(int []arr){
        for (int i = 1; i <arr.length ; i++) {
            int key = arr[i];
            int j;
            for (j = i-1; j>=0 && arr[j]>key ; j--) {
                arr[j+1]= arr[j];
            }
            arr[j+1]=key;
        }
    }
}
