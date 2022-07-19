package ss11_stack_queue.exercise;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class exercise5 {
    public static void main(String[] args) {
        Map<String,Integer> stringMap = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi cần kiểm tra");
        String str = scanner.nextLine();
        String [] arr = str.toLowerCase().split(" ");
        System.out.println(Arrays.toString(arr));

        for (String Array:arr) {
            if(!stringMap.containsKey(Array)){
                stringMap.put(Array,1);
            }else {
                int count = stringMap.get(Array);// lấy ra value
                stringMap.replace(Array,count+1);
            }
        }
        System.out.println(stringMap);
    }
}
