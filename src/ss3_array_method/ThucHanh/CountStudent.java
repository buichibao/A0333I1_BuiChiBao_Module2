package ss3_array_method.ThucHanh;

import java.util.Scanner;

public class CountStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size ;
        int []arr ;
        do{
            System.out.println("Enter a size ");
            size = sc.nextInt();
             if(size>30) {
                 System.out.println("Size should not exceed 30");
             }
        }while (size>30);
        arr = new int[size];
        for (int i = 0; i <arr.length ; i++) {
            System.out.print("arr["+i+"] = ");
            arr[i]=sc.nextInt();
        }
        System.out.println();
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
        int count = 0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>=5&&arr[i]<=10){
                count++;
            }
        }
        System.out.print("\n The number of students passing the exam is " + count);
    }

}
