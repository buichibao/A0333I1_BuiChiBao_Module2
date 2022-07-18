package ss10_list.demo.demo4.controller;

import ss10_list.demo.demo4.model.XeMay;
import ss10_list.demo.demo4.service.impl.XeOtoService;

import java.util.Scanner;

public class MenuXeOto {
    XeOtoService xeOtoService = new XeOtoService();
    Scanner scanner = new Scanner(System.in);
    int choose;
    public void chucNangXeOto(){
        do {
            System.out.println("==============================Quản lý xe ô tô==================================");
            System.out.println("1.Thêm xe ô tô mới");
            System.out.println("2.Hiển thị danh sách ô tô");
            System.out.println("3.Xóa xe ô tô");
            System.out.println("4.Tìm xe ô tô theo biển kiểm soát");
            System.out.println("5.Quay về các chức năng chính");
            choose = Integer.parseInt(scanner.nextLine());
            if(choose<1||choose>5){
                System.out.println("Không có chức năng này mời bạn, chọn lại");
                continue;
            }
            switch (choose){
                case 1:
                    xeOtoService.them();
                    break;
                case 2:
                    xeOtoService.hienThi();
                    break;
                case 3:
                case 4:
                case 5:
                    return;
            }
        }while ((choose<1||choose>5));
    }
}
