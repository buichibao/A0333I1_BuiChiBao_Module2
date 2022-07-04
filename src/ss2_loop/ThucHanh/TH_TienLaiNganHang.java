package ss2_loop.ThucHanh;

import java.util.Scanner;

public class TH_TienLaiNganHang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số tiền cần vay");
        double money = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập lãi suất hàng năm");
        double interestRate = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập số tháng vay");
        int month = Integer.parseInt(sc.nextLine());
        double totalInterest = 0;
        for(int i =0;i<month;i++){
            totalInterest+=money*(interestRate/100)/12*month;
        }
        System.out.println("Tổng số tiền lãi trả sau "+month+" tháng là "+totalInterest);
    }
}
