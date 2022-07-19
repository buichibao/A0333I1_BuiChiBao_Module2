package ss12.controller;

import ss12.model.Product;
import ss12.service.impl.ProductManager;

import java.util.ArrayList;
import java.util.Scanner;

public  class MainController {
     ProductManager productManager = new ProductManager();
     public  void disPlay(){
         Scanner scanner = new Scanner(System.in);
         int choose;
         do{
             System.out.println("CHỨC NĂNG QUẢN LÝ SẢN PHẨM");
             System.out.println("1.Thêm sản phẩm ");
             System.out.println("2.Xóa sản phẩm");
             System.out.println("3.Hiển thị danh sách");
             System.out.println("4.Tìm phần tử bằng tên");
             System.out.println("5.Chỉnh sửa thông tin theo id");
             System.out.println("Nhập lựa chọn của bạn");
             choose = Integer.parseInt(scanner.nextLine());
             switch (choose){
                 case 1:
                     productManager.addSP();
                     break;
                 case 2:
                     productManager.removeSP();
                     break;
                 case 3:
                     productManager.displayAll();
                     break;
                 case 4:
                     productManager.find();
                     break;
                 case 5:
                     productManager.set();
                     break;
             }
         }while (choose>=1&&choose<=5);
     }
}
