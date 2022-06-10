package ss2_vong_lap_java;

import java.util.Scanner;

public class ViDu8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password;
        do{
            System.out.println("Mời bạn nhập mật khẩu");
            password = scanner.nextLine();
        }while(!password.equals("ABC"));
        System.out.println("Wellcome");
    }
}
