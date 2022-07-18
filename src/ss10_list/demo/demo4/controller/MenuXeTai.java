package ss10_list.demo.demo4.controller;

import ss10_list.demo.demo4.service.impl.XeTaiService;

import java.util.Scanner;

public class MenuXeTai {
    Scanner scanner = new Scanner(System.in);
    XeTaiService xeTaiService = new XeTaiService();
    int choose;
    public void chucNangXeTai(){
        do {
            System.out.println("==============================Quản lý xe tải==================================");
            System.out.println("1.Thêm xe tải mới");
            System.out.println("2.Hiển thị danh sách xe tải");
            System.out.println("3.Xóa xe tải");
            System.out.println("4.Tìm xe tải theo biển kiểm soát");
            System.out.println("5.Quay về các chức năng chính");
            choose = Integer.parseInt(scanner.nextLine());
            if(choose<1||choose>5){
                System.out.println("Không có chức năng này mời bạn, chọn lại");
                continue;
            }
            switch (choose){
                case 1:
                    xeTaiService.them();
                    break;
                case 2:
                    xeTaiService.hienThi();
                    break;
                case 3:
                case 4:
                case 5:
                    return;
            }
        }while ((choose<1||choose>5));
    }
}
