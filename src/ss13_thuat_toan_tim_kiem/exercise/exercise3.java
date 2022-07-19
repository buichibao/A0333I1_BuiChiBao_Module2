package ss13_thuat_toan_tim_kiem.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("Nhập số lượng phần tử: ");
        n = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập mảng cần kiểm tra :");
        int arr [] = new int[n];
        for (int i = 0; i <n ; i++) {
            System.out.print("arr["+i+"] = ");
            arr[i]=Integer.parseInt(scanner.nextLine());
        }
        System.out.print("Mảng chưa được sắp xếp:");
        System.out.println(Arrays.toString(arr));


        System.out.print("Mảng đã sắp xếp :");
        sortArr(arr);
        System.out.println(Arrays.toString(arr));

        System.out.print("Nhập giá trị cần tìm :");
        int value = Integer.parseInt(scanner.nextLine());

        int result = binarySearch(arr,0,arr.length-1,value);
        if(result!=-1){
        System.out.println("Vị trí của "+value+" là "+result);
        }else {
            System.out.println("Không có giá trị này trong mảng");
        }
    }
    public static int binarySearch(int[] arr,int left , int right , int value) {

        if (left <= right) {

            int middle = (left + right) / 2;

            if (arr[middle] == value) {
                return middle;
            }
            if (arr[middle] > value) {
                return binarySearch(arr, left, middle - 1, value);
            }
            return binarySearch(arr, middle + 1, right, value);
        }
        return -1;
    }
    public static void sortArr(int arr[]){
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
}
