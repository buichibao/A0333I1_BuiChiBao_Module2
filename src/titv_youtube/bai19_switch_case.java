package titv_youtube;

import java.util.Scanner;

public class bai19_switch_case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số 2->8 rồi in ra thứ tương ứng :");
        int thu = sc.nextInt();
        switch (thu){
            case 2:
                System.out.println("Thứ 2");
                break;
            case 3:
                System.out.println("Thứ 3");
                break;
            case 4:
                System.out.println("Thứ 4");
                break;
            case 5:
                System.out.println("Thứ 5");
                break;
            case 6:
                System.out.println("Thứ 6");
                break;
            case 7:
                System.out.println("Thứ 7");
                break;
            case 8:
                System.out.println("Chủ nhật");
                break;
            default:
                System.out.println("Bạn nhập không đúng");
        }

    }
}
