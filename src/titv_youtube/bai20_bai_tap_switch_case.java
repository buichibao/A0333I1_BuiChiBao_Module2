package titv_youtube;

import java.util.Scanner;

public class bai20_bai_tap_switch_case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tháng cần kiểm tra :");
        int month = sc.nextInt();
        int year ;
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Tháng "+month+" có 31 ngày");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Tháng "+ month + " có 30 ngày");
                break;
            case 2:
                System.out.print("Nhập năm cần kiểm tra :");
                year = sc.nextInt();
                if((year%4==0&&year%100!=0)||(year%100==0&&year==0)){
                    System.out.println("Tháng "+month+" có 29 ngày");
                }else {
                    System.out.println("Tháng "+month+" có 28 ngày");
                }
                break;
            default:
                System.out.println("Bạn nhập sai rồi");
        }
    }
}
