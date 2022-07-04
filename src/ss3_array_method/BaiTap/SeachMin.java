package ss3_array_method.BaiTap;

import java.util.Scanner;

public class SeachMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr;
        int size;
        do{
            System.out.println("Nhập số lượng phần tử");
            size = sc.nextInt();
            if(size<0||size>100){
                System.out.println("Bạn đã vi phạm số lượng phần tử");
            }
        }while (size<0||size>100);
       arr = new int[size];

        System.out.println("Nhập giá tri của mảng ");
        for (int i = 0; i <arr.length ; i++) {
            System.out.print("arr["+i+"] = ");
            arr[i]=sc.nextInt();
        }
        System.out.println();
        System.out.println("Mảng vừa nhập là");
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println("\nGiá trị nhỏ nhất của mảng là "+seachMin(arr));
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

}
