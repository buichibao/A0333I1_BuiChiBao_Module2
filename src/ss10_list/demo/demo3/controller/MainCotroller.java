package ss10_list.demo.demo3.controller;

import java.util.Scanner;

public class MainCotroller {
    Scanner scanner = new Scanner(System.in);
    HienThiController hienThiController = new HienThiController();
    ThemController themController = new ThemController();
    TimBienSoController timBienSoController = new TimBienSoController();
    XoaController xoaController = new XoaController();
        public void chucNang(){
            do{
            System.out.println("CHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN GIA THÔNG ");
            System.out.println("1.Thêm mới phương tiện giao thông ");
            System.out.println("2.Hiển thị phương tiện giao thông");
            System.out.println("3.Xóa phương tiện ");
            System.out.println("4.Tìm kiếm theo biển kiểm xóa");
            System.out.println("5.Thoát");
            System.out.println("Mời bạn chịn chức năng: ");
            int luaChon = Integer.parseInt(scanner.nextLine());
            switch (luaChon){
                case 1:
                    themController.themPhuongTien();
                    break;
                case 2:
                    hienThiController.hienThi();
                    break;
                case 3:
                    xoaController.xoaPhuongTien();
                    break;
                case 4:
                    timBienSoController.timBienSo();
                    break;
                case 5:
                    System.exit(0);
            }

        }while(true);
    }

}
