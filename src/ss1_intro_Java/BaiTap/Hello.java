package ss1_intro_Java.BaiTap;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name ;
        System.out.println("Enter name ");
        name = sc.nextLine();
        System.out.println("Hello "+name);
    }
}
