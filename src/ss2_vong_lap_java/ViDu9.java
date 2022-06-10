package ss2_vong_lap_java;

import java.util.Scanner;

public class ViDu9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập kí tự");
        String charater = scanner.nextLine();
        for (int i =0;i<10;i++){
            System.out.println(charater);
        }
    }
}
