package ss3_array_method;

import java.util.Scanner;

public class ThucHanh6 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int [] Array;
//        int size;
//        int count = 0;
//        do{
//            System.out.println("Nhập kích thước mảng");
//            size=scanner.nextInt();
//            if(size>30){
//                System.out.println("vướt quá kích thước 30");
//            }
//        }while(size>30);
//        Array = new int[size];
//        for(int i =1;i<=Array.length;i++){
//            System.out.println("Nhập điểm của sinh viên thứ "+i);
//            Array[i]= scanner.nextInt();
//        }
//        for (int j = 1; j <= Array.length; j++) {
//            if(10>=Array[j] && Array[j]>5){
//                count++;
//            }
//        }
//        System.out.println("Số sinh viên đã là"+count);
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size:");
            size = scanner.nextInt();
            if (size > 30)
                System.out.println("Size should not exceed 30");
        } while (size > 30);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter a mark for student " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
        int count = 0;
        System.out.print("List of mark: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
            if (array[j] >= 5 && array[j] <= 10)
                count++;
        }
        System.out.print("\n The number of students passing the exam is " + count);
    }
}
