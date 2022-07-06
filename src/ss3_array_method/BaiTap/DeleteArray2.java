package ss3_array_method.BaiTap;

import java.util.Scanner;

public class DeleteArray2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array;
        int valueDelete;
        System.out.println("Nhập số lượng phần tử");
        int size = sc.nextInt();
        array = new int[size];
        System.out.println("Nhập giá trị các phần tử");
        for (int i = 0; i < array.length; i++) {
            System.out.print("a[" + i + "] = ");
            array[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("Mảng vừa nhập là: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }

        System.out.println();
        System.out.print("Nhập phần tử cần xóa :");
        valueDelete = sc.nextInt();
        //xóa thì xử lý tại vị trí, thêm thì xử lý từ cuối
        for(int index = 0;index<array.length;index++){
            if(array[index]==valueDelete){
                for (int i = index; i <array.length ; i++) {
                    if(i==array.length-1){
                        array[i]=0;
                    }else{
                        array[i]=array[i+1];
                    }
                }
                index--;
            }
        }

        System.out.print("Mảng sau khi xóa :");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }



    }
}
