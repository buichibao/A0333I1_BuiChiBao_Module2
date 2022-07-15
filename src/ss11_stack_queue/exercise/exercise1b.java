package ss11_stack_queue.exercise;

import java.util.Scanner;
import java.util.Stack;

public class exercise1b {
    public static void main(String[] args) {
        Stack<String> stringStack = new Stack<>();
        Stack<String> stringStack1 = new Stack<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào 1 chuỗi : ");
        String str = scanner.nextLine();
        String [] strings = str.split("");

        for(int i = 0;i<strings.length;i++){
            stringStack.push(strings[i]);
        }

        System.out.println(stringStack);

        for (int i = 0; i <strings.length ; i++) {
            stringStack1.push(stringStack.pop());
        }
        System.out.print("Đảo ngược mảng :");
        System.out.println(stringStack1);
    }
}
