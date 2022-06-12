package ss3_array_method;

import java.util.Scanner;

public class ThucHanh3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int [] Array;
        do{
            System.out.print("Enter size :");
            size= scanner.nextInt();
            if(size>20){
                System.out.println("Size should not exceed 20");
            }
        }while(size>20);
        Array = new int[size];
        int i = 0;
        while(i<Array.length){
            System.out.print("Enter element "+(i+1)+" :");
            Array[i] = scanner.nextInt();
            i++;
        }
        System.out.println("Array");
        for (int j = 0; j <Array.length ; j++) {
            System.out.print(Array[j]+" ");
        }
        int max = Array[0];
        int index = 1;
        for (int j = 0; j <Array.length ; j++) {
            if(Array[j]>max){
                max= Array[j];
                index = j;
            }

        }
        System.out.println("Max = "+max +" index = "+index);
    }

}
