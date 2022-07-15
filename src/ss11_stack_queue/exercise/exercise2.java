package ss11_stack_queue.exercise;

import java.util.Scanner;
import java.util.Stack;

public class exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> integerStack = new Stack<>();
        int number;

        System.out.println("Nhập số cần chuyển qua :");
        number = Integer.parseInt(scanner.nextLine());


        do {
            integerStack.push((number % 2));
            number = number / 2;
        } while (number != 0);
        if (!integerStack.isEmpty()) {
            int size = integerStack.size();
            for (int i = 0; i < size; i++) {
                System.out.print(integerStack.pop());
            }
        }

    }

}
