package ss10_list.demo.demo4.service.impl;

import ss10_list.demo.demo4.model.XeMay;
import ss10_list.demo.demo4.service.IPhuongTien;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class XeMayService implements IPhuongTien {
    Scanner scanner = new Scanner(System.in);
     static  List<XeMay> xeMayList = new ArrayList<>();

    @Override
    public void them() {
      XeMay xeMay = nhapThuocTinhCuaXe();
      xeMayList.add(xeMay);
      System.out.println("Thêm xe máy thành công");
    }

    @Override
    public void hienThi() {
      if(!xeMayList.isEmpty()){
          for (XeMay xeMay: xeMayList) {
              System.out.println(xeMay);
          }
      }else{
          System.out.println("Danh sách xe máy đang trống");
      }
    }

    @Override
    public void xoa() {
       boolean kiemTraBienSo = false;
        System.out.print("Nhập biển số cần tìm :");
        String bienSoCanTim = scanner.nextLine();
        for (XeMay xeMay:xeMayList) {
            if(bienSoCanTim.equals(xeMay.getBienSo())){
                System.out.println("Bạn có muốn xóa xe này không?? ");
                System.out.println("1.Có");
                System.out.println("2.Không");
                int choose = Integer.parseInt(scanner.nextLine());
                if(choose==1){
                    xeMayList.remove(xeMay);
                    System.out.println("Xóa thành công!!");
                }
                kiemTraBienSo=true;
                break;
            }
            if (!kiemTraBienSo){
                System.out.println("Không tìm thấy biển số");
            }
        }
    }

    @Override
    public void timXeTheoBienSo() {
      boolean timBienSo = false;
        System.out.print("Nhập biển số cần tìm:");
        String bienSoCanTim = scanner.nextLine();
        for (XeMay xeMay:xeMayList) {
            if(bienSoCanTim.equals(xeMay.getBienSo())){
                System.out.println("Tìm thấy");
                timBienSo = true;
                break;
            }
            if(!timBienSo){
                System.out.println("Không thấy");
            }
        }
    }

    @Override
    public XeMay nhapThuocTinhCuaXe() {
        System.out.print("Nhập biển số : ");
        String bienSo =scanner.nextLine();
        System.out.print("Nhập tên hãng sản xuất:");
        String tenHangSanXuat = scanner.nextLine();
        System.out.print("Nhập năm sản xuất :");
        int namSuatXuat = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập chủ sử hữu");
        String chuSoHuu = scanner.nextLine();
        System.out.print("Nhập công suất :");
        double congSuat =Double.parseDouble(scanner.nextLine());
        XeMay xeMay = new XeMay(bienSo,tenHangSanXuat,namSuatXuat,chuSoHuu,congSuat);

        return xeMay;

    }
    //String bienSo, String tenHangSanXuat, int namSanXuat, String chuSoHuu, double congSuat
}
