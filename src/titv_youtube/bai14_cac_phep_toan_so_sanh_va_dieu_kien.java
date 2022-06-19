package titv_youtube;

import java.util.Scanner;

public class bai14_cac_phep_toan_so_sanh_va_dieu_kien {
    //Các phép toán so sánh và điện kiện đều trả về kết quả  true hoặc false
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a ,b ;
        System.out.print("Nhập a = ");
        a = sc.nextInt();
        System.out.print("Nhập b = ");
        b = sc.nextInt();

        System.out.println(a+" == "+b+" : "+(a==b));
        System.out.println(a+" != "+b+" : "+(a!=b));
        System.out.println(a+" > "+b+" : "+ (a>b)) ;
        System.out.println(a+" < "+b+" : "+ (a<b)) ;
        System.out.println(a+" >= "+b+" : "+(a>=b));
        System.out.println(a+" <= "+b+" : "+(a<=b));

        System.out.println("Cả 2 số đều là số chẵn : "+((a%2==0)&&(b%2==0)));
        System.out.println("Có 1 số  là số chẵn : "+((a%2==0)||(b%2==0)));

    }

}
