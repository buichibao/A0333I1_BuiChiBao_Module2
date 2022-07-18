package ss10_list.demo.demo4.service.impl;

import ss10_list.demo.demo4.model.XeOto;
import ss10_list.demo.demo4.service.IPhuongTien;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class XeOtoService implements IPhuongTien {
    Scanner scanner = new Scanner(System.in);
    static List<XeOto> xeOtoList = new ArrayList<>();

    @Override
    public void them() {
      XeOto xeOto = nhapThuocTinhCuaXe();
      xeOtoList.add(xeOto);
        System.out.println("Thêm thành công xe ô tô");
    }

    @Override
    public void hienThi() {
      if(!xeOtoList.isEmpty()){
          for (XeOto xeOto:xeOtoList) {
              System.out.println(xeOto);
          }
      }else{
          System.out.println("Danh sách ô tô đang trống");
      }
    }

    @Override
    public void xoa() {

    }

    @Override
    public void timXeTheoBienSo() {

    }

    @Override
    public XeOto nhapThuocTinhCuaXe() {
        System.out.print("Nhập biển số : ");
        String bienSo =scanner.nextLine();
        System.out.print("Nhập tên hãng sản xuất:");
        String tenHangSanXuat = scanner.nextLine();
        System.out.print("Nhập năm sản xuất :");
        int namSuatXuat = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập chủ sử hữu :");
        String chuSoHuu = scanner.nextLine();
        System.out.print("Nhập số chổ ngồi:");
        int choNgoi = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập kiểu xe :");
        String kieuXe = scanner.nextLine();
         XeOto xeOto = new XeOto(bienSo,tenHangSanXuat,namSuatXuat,chuSoHuu,choNgoi,kieuXe);
         return xeOto;
    }
}
