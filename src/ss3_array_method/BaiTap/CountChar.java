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
        countChar(strings,c);

    }
    static void countChar(String str[],String c){
        int count=0;
        for(int i=0;i<str.length;i++){
            if(str[i].equals(c)){
                count++;
            }
        }
        if(count==0){
            System.out.println("Không tìm thấy phần tử");
        }else {
            System.out.println("Số kí tự "+c+" trong chuỗi là "+count);
        }

    }
}
