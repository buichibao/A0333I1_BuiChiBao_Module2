package ss11_stack_queue.exercise;

import java.util.Scanner;
import java.util.Stack;

public class exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Character> bStack = new Stack<>();
        boolean check = false;
        System.out.println("Nhập biểu thức cần kiểm tra :");
        String str = scanner.nextLine();
        for (int i = 0; i < str.length() ; i++) {
            if(str.charAt(i)=='('){
                bStack.push(str.charAt(i));
            }
            else  if(str.charAt(i)==')'){
                if(bStack.isEmpty()){
                    check = true;
                    break;
                }else {
                    bStack.pop();
                }
            }
        }
        if(!check){
            System.out.println("Biểu thức đúng");
        }else{
            System.out.println("Biểu thức sai");
        }

    }
}


