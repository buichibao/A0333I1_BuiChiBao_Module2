package ss11_stack_queue.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi cần kiểm tra");
        String str = scanner.nextLine();
        String [] arr = str.toLowerCase().split(" ");
        System.out.println(Arrays.toString(arr));

    }
}
