package ss3_array_method;

import java.util.Scanner;

public class ThucHanh5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size ;
        int [] Array ;
        do{
            System.out.print("Enter size :");
            size = scanner.nextInt();
            if(size>20){
                System.out.println("Bạn đã nhập quá kích thước mảng là 20");
            }
        }while (size>20);
        Array = new int[size];
        int i = 0;
        while(i<Array.length){
            System.out.print("Element "+i+" :");
            Array[i]= scanner.nextInt();
            i++;
        }
        //Xuất mảng
        System.out.println("\nArray ");
        for(int j = 0;j<Array.length;j++){
            System.out.print(Array[j]+"\t");
        }
        //Tìm min
        System.out.println("\nGTNN của Array "+timMin(Array));
    }
    public static int timMin(int a[]){
        int min= a[0];
        for (int k = 0; k <a.length ; k++) {
            if(a[k]<min){
                min = a[k];
            }
        }
        return min;
    }
}
