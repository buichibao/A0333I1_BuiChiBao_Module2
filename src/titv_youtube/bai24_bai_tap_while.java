package titv_youtube;

import java.util.Scanner;

public class bai24_bai_tap_while {
    public static void main(String[] args) {
        int n ;
        String nhiPhan =" ";
        Scanner sc =  new Scanner(System.in);
        System.out.print("Nhập số cần chuyển đổi từ thâp phân thành nhị phận :");
        n = sc.nextInt();
        while (n>0){
            nhiPhan = (n%2)+ nhiPhan;
            n=n/2;
        }
        System.out.println("kết quả : "+nhiPhan);
    }
}
