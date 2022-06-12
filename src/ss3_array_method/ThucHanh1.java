package ss3_array_method;

import java.util.Scanner;

public class ThucHanh1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] array ;
        int size;
        do{
            System.out.println("Enter size");
            size = scanner.nextInt();
            if(size>20)
                System.out.println("Size  dose  not  exceed 20");
        }while(size>20);
        //Nhập mảng
        array= new int[size];
        for(int i =0;i<array.length;i++){
            System.out.print("enter array ["+i+"] = ");
            array[i]= scanner.nextInt();
        }
        //Xuất Mảng
        System.out.println("Array");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+"\t");
        }
        //Đảo ngược mảng
        for (int i = 0; i <array.length/2 ; i++) {
              int temp = array[i];
              array[i]= array[array.length- i - 1];
              array[array.length-i-1]=temp;
        }
        System.out.println("\nReverse Array");
        for (int i = 0; i < array.length; i++) {
            System.out.print (array[i]+"\t");
        }
    }
}
