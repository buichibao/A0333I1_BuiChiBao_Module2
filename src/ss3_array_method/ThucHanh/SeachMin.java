package ss3_array_method.ThucHanh;

import java.util.Scanner;

public class SeachMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {3,2,3,5,6,8,3,2,5,8,0};
        System.out.println("Min of arr :"+seachMin(arr));
        System.out.println("Index of min in arr:"+indexMin(arr));
    }
    public  static  int seachMin(int arr[]){
        int min = arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
    public static  int indexMin(int arr[]){
        int min = arr[0];
        int index = 0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]<min){
                min=arr[i];
                index=i;
            }
        }
        return index;
    }
}
