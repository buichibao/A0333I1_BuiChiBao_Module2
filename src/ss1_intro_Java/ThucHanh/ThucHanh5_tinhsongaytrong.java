package ss1_intro_Java.ThucHanh;

import java.util.Scanner;

public class ThucHanh5_tinhsongaytrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month;
        System.out.println("Nhập số tháng cần đếm ngày");
        month = sc.nextInt();
        String day;
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                day = "31";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                day = "30";
                break;
            case 2:
                day = "28 or 29";
                break;
            default:
                day ="";
        }
        if(!day.equals("")){
            System.out.printf("Tháng %d có sống ngày là %s",month,day);
        }else{
            System.out.println("sai dữ liệu");
        }
    }
}
