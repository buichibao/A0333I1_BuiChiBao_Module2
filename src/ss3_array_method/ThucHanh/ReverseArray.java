package ss3_array_method.ThucHanh;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        int [] array;
        do{
            System.out.println("Nhập kích thước của mảng");
            size=Integer.parseInt(sc.nextLine());
            if(size<0||size>20){
                System.out.println(" kích thước sai ");
            }
        }while (size<0||size>20);
        array = new int[size];
        for(int i =0;i<array.length;i++){
            System.out.print("array "+i+" = ");
            array[i]=sc.nextInt();
        }
        System.out.println("Mảng vừa nhập là");
        for(int i =0;i<array.length;i++){
            System.out.print(array[i]+ " ");
        }
        for(int i =0;i<array.length/2;i++){
            int temp = array[i];
            array[i]= array[array.length-i-1];
            array[array.length-i-1] = temp;
        }
        System.out.println();
        System.out.println("Mảng đảo ngược");
        for(int i =0;i<array.length;i++){
            System.out.print(array[i]+ " ");
        }
    }
}
