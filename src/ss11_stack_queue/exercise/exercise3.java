package ss11_stack_queue.exercise;

import java.util.*;

public class exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Character> queue = new LinkedList<>();
        Queue<Character> queue1 = new LinkedList<>();

        System.out.print("Nhập chuỗi cần kiểm tra : ");
        String str = scanner.nextLine();

        for (int i = 0; i < str.length()/2 ; i++) {
            queue.add(str.toLowerCase().charAt(i));
        }
        for (int i = str.length()-1; i >str.length()/2 ; i--) {
            queue1.add(str.toLowerCase().charAt(i));
        }
        boolean check = false;
        while (!queue.isEmpty()){
            if(queue.poll().equals(queue1.poll())){
                check=true;
            }else {
                check= false;
                break;
            }
        }
        if(check){
            System.out.println("Chuỗi "+str+" là chuỗi P");
        }else{
            System.out.println("Chuỗi "+str+" không phải là P");
        }
    }
}
