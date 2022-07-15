package ss11_stack_queue.exercise;

import java.util.Scanner;
import java.util.Stack;

public class exercise1a {
    public static void main(String[] args) {
        Stack<Integer> integerStack = new Stack<>();
        Stack<Integer> integerStack1 = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử của mảng :");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n ; i++) {
            System.out.println("Nhập phần tử thứ "+(i+1)+" : ");
            integerStack.push(Integer.parseInt(scanner.nextLine()));
        }
        System.out.println(integerStack);

        for (int i = 0; i <n ; i++) {
            integerStack1.push(integerStack.pop());
        }

        System.out.println(integerStack1);

    }
}
