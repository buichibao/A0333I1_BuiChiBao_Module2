package ss10_list.demo.demo4.service.impl;

import ss10_list.demo.demo4.model.XeTai;
import ss10_list.demo.demo4.service.IPhuongTien;

import java.util.*;

public class XeTaiService implements IPhuongTien {
    Scanner scanner = new Scanner(System.in);
    static  List<XeTai> xeTaiList = new ArrayList<>();

    @Override
    public void them() {
        XeTai xeTai = nhapThuocTinhCuaXe();
        xeTaiList.add(xeTai);
        System.out.println("Thêm xe tải vào danh sách thành công");
    }

    @Override
    public void hienThi() {
      if(!xeTaiList.isEmpty()){
          for (XeTai xeTai:xeTaiList) {
              System.out.println(xeTai);
          }
      }
    }

    @Override
    public void xoa() {

    }

    @Override
    public void timXeTheoBienSo() {

    }

    @Override
    public XeTai nhapThuocTinhCuaXe() {
        System.out.print("Nhập biển số : ");
        String bienSo =scanner.nextLine();
        System.out.print("Nhập tên hãng sản xuất:");
        String tenHangSanXuat = scanner.nextLine();
        System.out.print("Nhập năm sản xuất :");
        int namSuatXuat = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập chủ sử hữu");
        String chuSoHuu = scanner.nextLine();
        System.out.print("Nhập trọng tải :");
        double trongTai = Double.parseDouble(scanner.nextLine());

        XeTai xeTai = new XeTai(bienSo,tenHangSanXuat,namSuatXuat,chuSoHuu,trongTai);
        return xeTai;
    }
}
