package ss3_array_method.BaiTap;

import java.util.Scanner;

public class MegerArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] arrayA;
        System.out.print("Nhập kích thước mảng A:");
        int sizeA = sc.nextInt();
        arrayA = new int[sizeA];
        for (int i = 0; i <arrayA.length ; i++) {
            System.out.print("arrayA["+i+"] = ");
            arrayA[i]=sc.nextInt();
        }

        int [] arrayB;
        System.out.print("Nhập kích thước mảng B:");
        int sizeB = sc.nextInt();
        arrayB = new int[sizeB];
        for (int i = 0; i <arrayB.length ; i++) {
            System.out.print("arrayB["+i+"] = ");
            arrayB[i]=sc.nextInt();
        }

        int [] arrayC;
        int sizeC = sizeA+sizeB;
        arrayC = new int[sizeC];
        for(int i =0;i<arrayA.length;i++){
            arrayC[i]=arrayA[i];
        }
        int indexB = 0;
        for(int i = arrayA.length;i<arrayC.length;i++){
            arrayC[i]=arrayB[indexB++];
        }
        System.out.print("Mảng c là : ");
        for (int i =0;i<arrayC.length;i++){
            System.out.print(arrayC[i]+"\t");
        }


    }


}
