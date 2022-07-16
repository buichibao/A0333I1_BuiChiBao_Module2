package ss10_list.demo.demo3.controller;

import ss10_list.demo.demo3.service.impl.XeMayService;
import ss10_list.demo.demo3.service.impl.XeOtoService;
import ss10_list.demo.demo3.service.impl.XeTaiService;

import java.util.Scanner;

public class XoaController {
    Scanner scanner = new Scanner(System.in);
    XeMayService xeMayService = new XeMayService();
    XeOtoService xeOtoService = new XeOtoService();
    XeTaiService xeTaiService = new XeTaiService();
    public void xoaPhuongTien(){
        do{
            System.out.println("**************************************************************************");
            System.out.println("1.Xóa xe tải");
            System.out.println("2.Xóa ô tô");
            System.out.println("3.Xóa xe máy");
            System.out.println("4.Quay về màn hình chính");
            System.out.println("Mời bạn chọn loại xe để xóa : ");
            int luaChon = Integer.parseInt(scanner.nextLine());
            switch (luaChon){
                case 1:
                    xeTaiService.xoaXe();
                    break;
                case 2:
                    xeOtoService.xoaXe();
                case 3:
                    xeMayService.xoaXe();
                    break;
                case 4:
                    return;
            }
        }while(true);
    }
}
