package ss10_list.demo.demo3.service.impl;


import ss10_list.demo.demo3.model.XeOto;
import ss10_list.demo.demo3.service.IPhuongTien;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class XeOtoService implements IPhuongTien {
    Scanner scanner = new Scanner(System.in);
    static List<XeOto> xeOtoList = new ArrayList<>();

    @Override
    public void themXe() {
        XeOto xeOto = nhapThuocTinhXeOto();
        xeOtoList.add(xeOto);
        System.out.println("Thêm xe ô tô thành công và danh sách");
    }

    @Override
    public void xoaXe() {
        boolean kiemTraBienSoXe = false;
        System.out.println("Nhập biển số xe cần xóa :");
        String bienSoXeCanXoa = scanner.nextLine();
        for (XeOto xeOto : xeOtoList) {
            if (bienSoXeCanXoa == xeOto.getBienKiemSoat()) {
                System.out.println("Bạn có muốn xóa xe ô tô có biển số " + bienSoXeCanXoa + " này không ");
                System.out.println("1.Có");
                System.out.println("2.Không");
                int luaChon = Integer.parseInt(scanner.nextLine());
                if (luaChon == 1) {
                    xeOtoList.remove(xeOto);
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
        for (XeOto xeOto : xeOtoList) {
            System.out.println(xeOto);
        }
    }


    @Override
    public void timBienSoXe() {
        boolean kiemTraBienSoXe = false;
        System.out.println("Nhập biển số cần tìm :");
        String bienSoCanTim = scanner.nextLine();
        for (XeOto xeOto : xeOtoList) {
            if (bienSoCanTim == xeOto.getBienKiemSoat()) {
                System.out.println(xeOto);
                kiemTraBienSoXe = true;
                break;
            }
            if (!kiemTraBienSoXe) {
                System.out.println("Không tìm thấy biển số bạn muốn!!");
            }
        }
    }

    public XeOto nhapThuocTinhXeOto() {
        System.out.println("Nhập biển số xe :");
        String bienKiemSoat = scanner.nextLine();
        System.out.println("Nhập tên hãng sản xuất :");
        String tenHang = scanner.nextLine();
        System.out.println("Nhập năm sản xuất :");
        int namSanXuat = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập chủ sở hữu :");
        String chuSoHuu = scanner.nextLine();
        System.out.println("Nhập chỗ ngồi :");
        int choNgoi = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập kiểu xe :");
        String kieuXe = scanner.nextLine();
        XeOto xeOto = new XeOto(bienKiemSoat, tenHang, namSanXuat, chuSoHuu, choNgoi, kieuXe);
        return xeOto;
    }
}

