package ss2_loop.ViDu;

import java.util.Scanner;

public class ViDu_nhappass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pass;
        do{
            System.out.println("Nhập mật khẩu");
            pass=sc.nextLine();
        }while(!pass.equals("vung oi mo ra"));
        System.out.println("Chào mừng bạn ");
    }
}
