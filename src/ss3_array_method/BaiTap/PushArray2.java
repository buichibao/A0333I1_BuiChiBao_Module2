package ss3_array_method.BaiTap;

import java.util.Scanner;

public class PushArray2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array;
        int valuePush;
        System.out.println("Nhập số lượng phần tử");
        int size = sc.nextInt();
        array = new int[10];
        System.out.println("Nhập giá trị các phần tử");
        for (int i = 0; i < size; i++) {
            System.out.print("a[" + i + "] = ");
            array[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("Mảng vừa nhập là: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + "\t");
        }

        System.out.println();
        System.out.print("Nhập phần tử cần chèn:");
        valuePush= sc.nextInt();
        int indexPush ;
        do {
            System.out.print("Nhập ví trí cần chèn phần tử :");
            indexPush = sc.nextInt();
            if(indexPush<=-1||indexPush>=array.length-1){
                System.out.print("Ví trí không thõa mãn, mời bạn nhập lại!");
            }
        }while(indexPush<=-1||indexPush>=array.length-1);

        for (int i = array.length-1; i >indexPush ; i--) {
                  array[i]=array[i-1];
        }
        array[indexPush]=valuePush;
        for (int item:array) {
            System.out.print(item+" ");
        }
    }
}
