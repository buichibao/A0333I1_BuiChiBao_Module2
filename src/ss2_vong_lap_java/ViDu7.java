package ss2_vong_lap_java;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class ViDu7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập mật khẩu");
        String password = scanner.nextLine();

        while (!password.equals("ABC")){
            System.out.println("Sai mật khẩu");
            password = scanner.nextLine();
        }
        System.out.println("Bạn đã nhập đúng");
    }
}
