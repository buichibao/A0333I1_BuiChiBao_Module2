package ss3_array_method.ThucHanh;

import java.util.Arrays;
import java.util.Scanner;

public class SeachMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        int[] array;
        do {
            System.out.println("Nhập kích thước của mảng");
            size = Integer.parseInt(sc.nextLine());
            if (size < 0 || size > 20) {
                System.out.println(" kích thước sai ");
            }
        } while (size < 0 || size > 20);
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("array " + i + " = ");
            array[i] = sc.nextInt();
        }
        System.out.println("Mảng vừa nhập là");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        int maxArray = array[0];
        int j=0;
        for (int i = 0; i <array.length ; i++) {
            if(maxArray<array[i]){
                maxArray = array[i];
                j = i;
            }
        }
        System.out.println();
        System.out.println("Giá trị lớn nhất của array là "+maxArray+" ở địa chỉ thứ "+j);
    }

}
