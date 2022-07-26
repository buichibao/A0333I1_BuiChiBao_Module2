package BaiTapThemHaiTT.QuanLyDienThoai.controller;

import BaiTapThemHaiTT.QuanLyDienThoai.service.impl.DienThoaiXachTayService;

import java.util.Scanner;

public class DienThoaiXachTayController {

    public static  void menuDienThoaiXachTay(){
        DienThoaiXachTayService dienThoaiXachTayService = new DienThoaiXachTayService();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Chương trình quản lý điện thoại xách tay");
            System.out.println("Chọn chức năng theo số( để tiếp tục) :");
            System.out.println("1.Thêm mới");
            System.out.println("2.Xóa");
            System.out.println("3.Xem danh sách điện thoại");
            System.out.println("4.Tìm kiếm");
            System.out.println("5.Thoát");
            System.out.print("Chọn chức năng :");
            int choose = Integer.parseInt(scanner.nextLine());
            if(choose<1||choose>5){
                System.out.print("Bạn nhập sai chức năng mời bạn nhập lại :");
                continue;
            }
            switch (choose){
                case 1:
                    dienThoaiXachTayService.them();
                    break;
                case 2:
                case 3:
                case 4:
                case 5:
                    return;
            }
        }while (true);
    }
}
