package ss3_array_method.BaiTap;

import java.util.Arrays;
import java.util.Scanner;

public class CountChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "codegymee";
        String[] strings = str.split("");

        System.out.println("Nhập kí tự cần đếm");
        String c = sc.nextLine();
        int count=0;
        for(int i=0;i<strings.length;i++){
            if(strings[i].equals(c)){
                count++;
            }
        }
        System.out.println("Số kí tự "+c+" trong chuỗi là "+count);
    }
}
