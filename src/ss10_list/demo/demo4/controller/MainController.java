package ss10_list.demo.demo4.controller;

import java.util.Scanner;

public class MainController {
    Scanner scanner = new Scanner(System.in);
    MenuXeMay menuXeMay= new MenuXeMay();
    MenuXeOto menuXeOto = new MenuXeOto();
    MenuXeTai menuXeTai = new MenuXeTai();
    public void chucNang() {
        int choose;
        do {
            System.out.println("CHÀO MỪNG BẠN ĐÉN VỚI CHỨC NĂNG QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG");
            System.out.println("1.Xe máy");
            System.out.println("2.Xe ô tô");
            System.out.println("3.Xe tải");
            System.out.println("4.Thoát khỏi chương trình");
            System.out.print("Nhập chức năng bạn muốn sử dụng : ");
            choose = Integer.parseInt(scanner.nextLine());
            if(choose<1||choose>4){
                System.out.println("Không có chức năng này mời bạn nhập lại");
                continue;
            }
            switch (choose){
                case 1:
                    menuXeMay.chucNangXeMay();
                    break;
                case 2:
                    menuXeOto.chucNangXeOto();
                    break;
                case 3:
                    menuXeTai.chucNangXeTai();
                    break;
                case 4:
                    System.exit(0);
            }

        } while (choose < 1 || choose > 4);
    }
}
