package ss10_list.demo.demo4.controller;

import ss10_list.demo.demo4.model.XeMay;
import ss10_list.demo.demo4.service.impl.XeMayService;

import java.util.Scanner;

public class MenuXeMay {
    XeMayService xeMayService = new XeMayService();
    Scanner scanner = new Scanner(System.in);
    int choose;
    public void chucNangXeMay(){
        do {
            System.out.println("==============================Quản lý xe máy==================================");
            System.out.println("1.Thêm xe máy mới");
            System.out.println("2.Hiển thị danh sách xe máy");
            System.out.println("3.Xóa xe máy");
            System.out.println("4.Tìm xe máy theo biển kiểm soát");
            System.out.println("5.Quay về các chức năng chính");
            choose = Integer.parseInt(scanner.nextLine());
            if(choose<1||choose>5){
                System.out.println("Không có chức năng này mời bạn, chọn lại");
                    continue;
            }
            switch (choose){
                case 1:
                    xeMayService.them();
                    break;
                case 2:
                    xeMayService.hienThi();
                    break;
                case 3:
                    xeMayService.xoa();
                    break;
                case 4:
                    xeMayService.timXeTheoBienSo();
                case 5:
                    return;
            }
        }while ((choose<1||choose>5));
    }
}
