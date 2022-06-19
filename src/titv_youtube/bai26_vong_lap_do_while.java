package titv_youtube;

import java.util.Scanner;

public class bai26_vong_lap_do_while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n ;
        do {
            System.out.println("Nhập số bất kì để tiếp tục _ nhập 0 để thoát :");
            n = sc.nextInt();
        }while(n!=0);
    }
}
