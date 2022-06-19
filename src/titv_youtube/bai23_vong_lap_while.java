package titv_youtube;

import java.util.Scanner;

public class bai23_vong_lap_while {
    public static void main(String[] args) {
        int x = 1;
        Scanner scanner = new Scanner(System.in);
        while (x!=0){
            System.out.println("Nhập số bất kì để tiếp tục - nhập 0 để thoát");
            x = scanner.nextInt();
        }
        int i =0;
        while (true){
            System.out.println(i);
            i++;
            if (i == 10) {
                break;
            }
        }
    }
}
