package ss10_list.demo.demo3.controller;

import ss10_list.demo.demo3.service.impl.XeMayService;
import ss10_list.demo.demo3.service.impl.XeOtoService;
import ss10_list.demo.demo3.service.impl.XeTaiService;

import java.util.Scanner;

public class ThemController {
    Scanner scanner = new Scanner(System.in);
    XeMayService xeMayService = new XeMayService();
    XeOtoService xeOtoService = new XeOtoService();
    XeTaiService xeTaiService = new XeTaiService();
    public void themPhuongTien(){
        do{
            System.out.println("**************************************************************************");
            System.out.println("1.Thêm xe tải");
            System.out.println("2.Thêm ô tô");
            System.out.println("3.Thêm xe máy");
            System.out.println("4.Quay về màn hình chính");
            System.out.println("Mời bạn chọn loại xe để thêm : ");
            int luaChon = Integer.parseInt(scanner.nextLine());
            switch (luaChon){
                case 1:
                    xeTaiService.themXe();
                    break;
                case 2:
                    xeOtoService.themXe();
                    break;
                case 3:
                    xeMayService.themXe();
                    break;
                case 4:
                return;
            }
        }while(true);
    }
}

