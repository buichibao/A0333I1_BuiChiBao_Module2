package BaiTapThemHaiTT.QuanLyDienThoai.controller;

import java.util.Scanner;

public class DienThoaiController {
    private static Scanner scanner = new Scanner(System.in);
    public static  void menuController(){
        do {
            System.out.println("Chương trình quản lý điện thoại");
            System.out.println("Chọn chức năng theo số( để tiếp tục) :");
            System.out.println("1.Điện thoại chính hãng");
            System.out.println("2.Điện thoại xách tay");
            System.out.println("3.Thoát");
            int choose = Integer.parseInt(scanner.nextLine());
            if(choose<1||choose>5){
                System.out.print("Bạn nhập sai chức năng mời bạn nhập lại :");
                continue;
            }
            switch (choose){
                case 1:
                    DienThoaiChinhHangController.menuDienThoaiChinhHang();
                    break;
                case 2:
                    DienThoaiXachTayController.menuDienThoaiXachTay();
                    break;
                case 3:
                    System.exit(0);
            }
        }while (true);

    }
}
