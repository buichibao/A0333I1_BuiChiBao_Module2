package ss3_array_method;

import java.util.Scanner;

public class BaiTap8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "bui chi bao";
        int count = 0;
        System.out.println("Nhập từ cần đếm trong chuỗi");
        String word =scanner.nextLine();
        for(int i =0;i<str.length();i++){
            char wordInstr = str.charAt(i);
            if(Character.toString(wordInstr).equals(word)){
                count ++;
            }
        }
        System.out.println("Số kí tự "+word+" trong mảng str là "+count);
    }
}
