package ss10_list.demo.demo3.controller;

import ss10_list.demo.demo3.service.impl.XeMayService;
import ss10_list.demo.demo3.service.impl.XeOtoService;
import ss10_list.demo.demo3.service.impl.XeTaiService;

import java.util.Scanner;

public class HienThiController {
    Scanner scanner = new Scanner(System.in);
    XeMayService xeMayService = new XeMayService();
    XeOtoService xeOtoService = new XeOtoService();
    XeTaiService xeTaiService = new XeTaiService();
    public void hienThi(){
        do{
            System.out.println("**************************************************************************");
            System.out.println("1.Hiển thị danh sách xe tải");
            System.out.println("2.Hiển thị danh sách ô tô");
            System.out.println("3.Hiển thị danh sách xe máy");
            System.out.println("4.Quay về màn hình chính");
            System.out.println("Mời bạn chọn loại xe để hiển thị");
            int luaChon = Integer.parseInt(scanner.nextLine());
            switch (luaChon){
                case 1:
                    xeTaiService.hienThiDSXe();
                    break;
                case 2:
                    xeOtoService.hienThiDSXe();
                    break;
                case 3:
                    xeMayService.hienThiDSXe();
                    break;
                case 4:
                return;
            }
        }while(true);
    }
}
