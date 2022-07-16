package ss10_list.demo.demo3.service.impl;

import ss10_list.demo.demo3.model.XeMay;
import ss10_list.demo.demo3.service.IPhuongTien;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class XeMayService implements IPhuongTien {
    private static List<XeMay> xeMayList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    @Override
    public  void themXe() {
        XeMay xeMay = nhapThuocTinhXeMay();
        xeMayList.add(xeMay);
        System.out.println("Thêm xe máy thành công và danh sách");
    }

    @Override
    public void xoaXe() {
        boolean kiemTraBienSoXe = false;
        System.out.println("Nhập biển số xe cần xóa :");
        String bienSoXeCanXoa = scanner.nextLine();
        for (XeMay xeMay : xeMayList) {
            if (bienSoXeCanXoa == xeMay.getBienKiemSoat()) {
                System.out.println("Bạn có muốn xóa xe máy có biển số " + bienSoXeCanXoa + " này không ");
                System.out.println("1.Có");
                System.out.println("2.Không");
                int luaChon = Integer.parseInt(scanner.nextLine());
                if (luaChon == 1) {
                    xeMayList.remove(xeMay);
                    System.out.println("Xóa thành công");
                }
                kiemTraBienSoXe = true;
                break;
            }
            if (!kiemTraBienSoXe) {
                System.out.println("Không tìm thấy biển số xe này!!");
            }

        }
    }

    @Override
    public void hienThiDSXe() {
            for (XeMay xeMay : xeMayList) {
                System.out.println(xeMay);
            }
        }


    @Override
    public void timBienSoXe() {
        boolean kiemTraBienSoXe = false;
        System.out.println("Nhập biển số cần tìm :");
        String bienSoCanTim = scanner.nextLine();
        for (XeMay XM: xeMayList) {
            if(bienSoCanTim==XM.getBienKiemSoat()){
                System.out.println(XM);
                kiemTraBienSoXe=true;
                break;
            }
            if(!kiemTraBienSoXe){
                System.out.println("Không tìm thấy biển số bạn muốn!!");
            }
        }
    }

    public XeMay nhapThuocTinhXeMay() {
        System.out.println("Nhập biển số xe :");
        String bienKiemSoat = scanner.nextLine();
        System.out.println("Nhập tên hãng sản xuất :");
        String tenHang = scanner.nextLine();
        System.out.println("Nhập năm sản xuất :");
        int namSanXuat = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập chủ sở hữu :");
        String chuSoHuu = scanner.nextLine();
        System.out.println("Nhập công suất :");
        double congSuat = Double.parseDouble(scanner.nextLine());

        XeMay xeMay = new XeMay(bienKiemSoat, tenHang, namSanXuat, chuSoHuu, congSuat);
        return xeMay;
    }
    //String bienKiemSoat, String tenHang, int namSanXuat, String chuSoHuu, double congSuat)
}
