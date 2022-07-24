package ss15_exception_debug.pratice.ArrayIndexOfBoundsException;

import java.util.Random;

public class ArrayExample {
    public ArrayExample(){

    }
    public static Integer[] createRandom(){
        Random random = new Random();
        Integer[] arr = new Integer[100];
        System.out.println("Danh sách phần tử của mảng : ");
        for (int i = 0; i <100 ; i++) {
            arr[i]= random.nextInt(100);
            System.out.println(arr[i]+ " ");
        }
        return arr;
    }
}
